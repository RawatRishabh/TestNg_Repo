package others;

import org.testng.annotations.Test;

public class Invocation_Count
{
    // InvocationCount is an attribute in @TEST
    // In which, we set the number of times a test method will execute
    @Test(invocationCount = 0) // 0 means no execution
    void display()
    {
        System.out.println("No Repeat!");
    }
    @Test(invocationCount = 4)
    void go()
    {
        System.out.println("Repeat!");
    }
}
