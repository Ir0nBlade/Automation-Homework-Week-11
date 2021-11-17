package xpathhomework;

import homework.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NopCommerce extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/gift-cards";

    @Before
    public void setUP() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyNopCommerceGiftCardPage() {
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search store' or @data=dashlane-rid='d5b0c76432a53017']")).sendKeys("Gift");
        driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 search-box-button']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//select[contains(@id, 'products-orderby')]")).click();
        driver.findElement(By.xpath("//img[starts-with(@alt, 'Picture of $50')]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']//a[@class='ico-register']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@placeholder='Enter your email here...']")).sendKeys("abc@prime.com");
        driver.findElement(By.xpath("//button[@id='newsletter-subscribe-button']")).click();
        driver.findElement(By.xpath("//select[starts-with(@id, 'products') and @name='products-pagesize']")).click();

        String expectedMessage="Gift Cards";
        WebElement messag = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualmessage = messag.getText();
        Assert.assertEquals("Error, message not displayed", expectedMessage,actualmessage);

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
