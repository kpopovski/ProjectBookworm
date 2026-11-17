package projectB.academy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class MainClasses {
    WebDriver driver = new ChromeDriver();



    @BeforeMethod
    public void setUp() {
        driver.navigate().to("https://bookworm.madrasthemes.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.id("menu-item-170")).click();
    }

    @AfterMethod
    public void tearDown() {

        driver.close();
    }
}