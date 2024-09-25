package second;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

/*
 1) Login --> @BeforeMethod
 2) Search --> @Test
 3) Logout --> @AfterMethod
 4) Login
 5) Advanced search
 6) Logout
 */
public class AnnotaionsDemo1
{
    @BeforeMethod
    void login()
    {
        System.out.println("Login complete!");
    }
    @Test
    void search()
    {
        System.out.println("Search done!");
    }
    @Test(priority = 1)
    void advance_search()
    {
        System.out.println("Advance search done!");
    }
    @AfterMethod
    void logout()
    {
        System.out.println("Logout complete");
    }
}
