package five;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Reports implements ITestListener
{
    public ExtentSparkReporter sparkReporter; // UI of the report
    public ExtentReports extent; // Populate common info on the report
    public ExtentTest test; // creating test case entries in the report and update status of the test methods

    public void onStart(ITestContext context)
    {
        /*
        "/reports/myReport.html" --> (myReport.html is a name of report)

        When we give hardcoded name to report where test results will be store,
        so history of reports are not able to maintain because everytime we do some modification,
        and generate it the new report which basically override the previous one report.

        solution : create file name with timestamp that will separate him and avoid overriding test results.
         */

        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html");
        sparkReporter.config().setDocumentTitle("Automation Report"); // Title of report
        sparkReporter.config().setReportName("Functional Testing"); // Name of the report
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter); // Attach the reports together

        /*
           Below data should not be hardcoded, it will come in run time
           because common info among test cases may be changes a/q to requirements
         */

        extent.setSystemInfo("Computer Name","LocalHost");
        extent.setSystemInfo("Environment","QA");
        extent.setSystemInfo("Tester Name","Rishabh");
        extent.setSystemInfo("O.S","Windows 11");
        extent.setSystemInfo("Browser Name","Chrome");
    }
    public void onTestSuccess(ITestResult result)  // result contains test methods info
    {
        test = extent.createTest(result.getName()); // Create a new entry in the report / return name of the test method
        test.log(Status.PASS,"Test case Passed is : "+ result.getName()); // Update status pass/fail/skip

    }

    public void onTestFailure(ITestResult result)
    {
        test = extent.createTest(result.getName());
        test.log(Status.FAIL,"Test case Failed is: "+ result.getName());
        test.log(Status.FAIL,"Test case Failed cause is "+ result.getThrowable()); // getThrowable(), return error message
       /*
         Screenshot should be provided in the report, which helps other tester and developer
         to give further info about error
        */
    }

    public void onTestSkipped(ITestResult result)
    {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP,"Test case Skipped is : "+result.getName());
    }

    public  void onFinish(ITestContext context)
    {
        extent.flush(); // Responsible for write all test information in report (Mandatory Statement)
    }
}
