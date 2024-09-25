package first;

import org.testng.annotations.Test;

/*
 1) Open app
 2) Login
 3) Logout
* */
public class FirstTestCase
{
   @Test
   void openapp()
   {
       System.out.println("Opening Application...");
   }
   @Test(priority = 1)
   void login()
   {
       System.out.println("Login to Application...");
   }
   @Test(priority = 1)
   void logout()
   {
       System.out.println("Logout to Application...");
   }
}
