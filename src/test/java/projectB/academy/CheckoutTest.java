package projectB.academy;

import projectB.CategoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends MainClasses {
    CategoryPage categoryPage = new CategoryPage(driver);

    @Test
    public void  addBookToCartAndPlaceOrder() throws InterruptedException {
        categoryPage.addBookToCart();
        categoryPage.navigateToCart();
        categoryPage.checkoutFormAndPlacingOrder();
        Assert.assertTrue(categoryPage.isOrderSuccessfully(),"There is no order received");
    }
}
