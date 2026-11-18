package projectB.academy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projectB.CategoryPage;

public class WishlistTest extends MainClasses {

    private CategoryPage categoryPage;

    @Override
    @BeforeMethod
    public void setUp() {
        super.setUp();
        categoryPage = new CategoryPage(driver);
    }

    @Test
    public void addBookToWishlist() throws InterruptedException {
        categoryPage.addBookToWishlist();
        categoryPage.navigateToWishlist();
        Assert.assertTrue(categoryPage.isBookInWishlist(), "Book was not added to the wishlist!");

        String newTitle = "My Favorite Books";
        categoryPage.editWishlistTitle(newTitle);
        Assert.assertTrue(categoryPage.isWishlistTitleUpdated(newTitle), "Wishlist title was not updated!");
    }
}
