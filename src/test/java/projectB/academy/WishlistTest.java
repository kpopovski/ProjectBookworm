package projectB.academy;

import projectB.CategoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishlistTest extends MainClasses {

    CategoryPage categoryPage = new CategoryPage(driver);


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

