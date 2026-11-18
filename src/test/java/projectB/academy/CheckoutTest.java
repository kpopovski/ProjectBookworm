package projectB.academy;

import projectB.CategoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends MainClasses {

  @Test
public void addBookToCartAndPlaceOrder() throws InterruptedException {

    CategoryPage categoryPage = new CategoryPage(driver);

    categoryPage.addBookToCart();
    categoryPage.navigateToCart();
    categoryPage.checkoutFormAndPlacingOrder();

    Assert.assertTrue(
        categoryPage.isOrderSuccessfully(),
        "There is no order received"
    );
}
