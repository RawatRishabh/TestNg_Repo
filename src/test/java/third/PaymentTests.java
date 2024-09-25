package third;

import org.testng.annotations.Test;

public class PaymentTests
{
    @Test(priority = 1,groups = {"sanity"})
    void paymentinRupees()
    {
        System.out.println("Rupees");
    }

    @Test(priority = 2,groups = {"sanity","regression","functional"})
    void paymentinDollars()
    {
        System.out.println("Dollar");
    }
}
