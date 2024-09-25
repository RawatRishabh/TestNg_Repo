package second;

import org.testng.annotations.*;

public class AllAnnotaions
{
    @BeforeSuite
    void a1()
    {
        System.out.println("Before suite");
    }
    @AfterSuite
    void a2()
    {
        System.out.println("After suite");
    }
    @BeforeTest
    void b1()
    {
        System.out.println("Before test");
    }
    @AfterTest
    void b2()
    {
        System.out.println("After test");
    }
    @BeforeClass
    void c1()
    {
        System.out.println("Before class");
    }
    @AfterClass
    void c2()
    {
        System.out.println("After class");
    }
    @BeforeMethod
    void e1()
    {
        System.out.println("Before method");
    }
    @AfterMethod
    void e2()
    {
        System.out.println("After method");
    }
    @Test
    void f1()
    {
        System.out.println("I am test1");
    }
    @Test
    void f2()
    {
        System.out.println("I am test2");
    }


}
