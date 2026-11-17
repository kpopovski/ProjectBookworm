package projectB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class CategoryPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }
    public void addBookToWishlist() throws InterruptedException {
        WebElement book = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link' and contains(text(), 'Blindside')]")));
        actions.moveToElement(book).perform();
        WebElement wishlistButton = book.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/main/div[3]/ul/li[2]/div[1]/div/div/div[3]/div/div"));
        wait.until(ExpectedConditions.elementToBeClickable(wishlistButton)).click();
        Thread.sleep(2000);
    }
    public void navigateToWishlist() {
        WebElement wishlistIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://bookworm.madrasthemes.com/wishlist/' and contains(@class, 'nav-link')]")));
        wishlistIcon.click();
    }
    public void editWishlistTitle(String newTitle) {
        WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[2]/div/form/div[1]/div[1]/a")));
        editButton.click();
        WebElement titleField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='wishlist_name']")));
        titleField.clear();
        titleField.sendKeys("My Favorite Books");
        WebElement checkButton = driver.findElement(By.id("yith-wcwl-icon-check"));
        checkButton.click();
    }
    public boolean isBookInWishlist() {
        WebElement bookInWishlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://bookworm.madrasthemes.com/product/blindside-michael-bennett-book-12/']")));
        return bookInWishlist.isDisplayed();
    }

    public boolean isWishlistTitleUpdated(String expectedTitle) {
        WebElement wishlistTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'My Favorite Books')]")));
        return wishlistTitle.getText().equals(expectedTitle);
    }

    public void addBookToCart() throws InterruptedException {
        WebElement book = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link' and contains(text(), 'Blindside')]")));
        actions.moveToElement(book).perform();
        WebElement addToCartButton = book.findElement(By.xpath("//span[@class='product__add-to-cart' and text()='Add to cart']"));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
        Thread.sleep(2000);
    }
    public void navigateToCart() {
        WebElement wishlistIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i.flaticon-icon-126515.font-size-3")));
        wishlistIcon.click();
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://bookworm.madrasthemes.com/checkout/' and contains(@class, 'btn-dark')]")));
        checkoutButton.click();
    }
    public void checkoutFormAndPlacingOrder() {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String uniqueEmail = "testing12" + timestamp + "@example.com";

        driver.findElement(By.id("billing_first_name")).sendKeys("Kristijan");
        driver.findElement(By.id("billing_last_name")).sendKeys("Popovski");
        driver.findElement(By.id("billing_email")).sendKeys(uniqueEmail);
        driver.findElement(By.id("billing_phone")).sendKeys("1403854852");
        driver.findElement(By.id("billing_address_1")).sendKeys("Str. Main");
        driver.findElement(By.id("billing_city")).sendKeys("Michigan");
        driver.findElement(By.id("billing_postcode")).sendKeys("10055");
        Select countryDropdown = new Select(driver.findElement(By.id("billing_country")));
        countryDropdown.selectByVisibleText("United States (US)");
        Select stateDropdown = new Select(driver.findElement(By.id("billing_state")));
        stateDropdown.selectByVisibleText("Michigan");
        WebElement paymentMethod = wait.until(ExpectedConditions.elementToBeClickable(By.id("payment_method_cod")));
        paymentMethod.click();

        WebElement placeOrderButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("place_order")));
        placeOrderButton.click();
    }
    public boolean isOrderSuccessfully() {
        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div/div[2]/div/div/div/div/div/h6")));
        System.out.println("Order placed successfully: " + confirmationMessage.getText());
        return confirmationMessage.isDisplayed();
    }

}
