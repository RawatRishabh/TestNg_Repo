package third;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 1) open app
 2) login
 3) search
 4) advance search
 5) logout
 */
// Dependency Methods are saving execution time of program.

public class DependencyMethods
{
    @Test(priority = 1)
    void open_app()
    {
        Assert.assertTrue(true);
    }
    @Test(priority = 2,dependsOnMethods = {"open_app"})
    void login()
    {
        Assert.assertTrue(true);
    }
    @Test(priority = 3,dependsOnMethods = {"login"})
    void search()
    {
        Assert.assertTrue(false);
    }
    @Test(priority = 4, dependsOnMethods = {"login","search"}) // both should be successfully pass otherwise its skip this method.
    void advance_search()
    {
        Assert.assertTrue(true);
    }
    @Test(priority = 5,dependsOnMethods = {"login"})
    void logout()
    {
        Assert.assertTrue(true);
    }
}
