package others;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerDemo implements IRetryAnalyzer
{
    int count = 0;
    int time = 3;
    public boolean retry(ITestResult var1) // Implement
    {
        if(count<time)
        {
            count++;
            return true;
        }
        else
        {
            return false;
        }
    }
}
