package xpathhomework;

import homework.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Xcart extends BaseTest {

    String baseUrl = "https://demostore.x-cart.com/shipping";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyXcartShippingPage(){

        driver.findElement(By.xpath("//input[@placeholder='Enter email address' and @type='text']")).sendKeys("abc@prime.com");
        driver.findElement(By.xpath("//span[contains(text(),'Subscribe')]")).click();
        driver.findElement(By.xpath("//span[@class='currency-indicator' or @text()='GBP']")).click();
        driver.findElement(By.xpath("//a[starts-with(text(),'Privacy policy')]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@class='container']//a[contains(text(),'Contact us')]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//span[contains(text(),'Fashion')]")).click();
        driver.findElement(By.xpath("//ul[@class='flyout-menu catalog-categories catalog-categories-tree']//a[@title='Beauty & Health']")).click();
        driver.findElement(By.xpath("//a[@href='electronics/' and @title='Electronics']")).click();
        driver.findElement(By.xpath("//img[@alt='Apple Watch Series 3 (GPS, 38mm)' and @data-max-width='240']")).click();
        driver.findElement(By.xpath("//input[@name='substring' and @placeholder='Search items...']")).sendKeys("mobile");
        driver.findElement(By.xpath("//input[@name='substring' and @placeholder='Search items...']")).sendKeys(Keys.ENTER);

        String expectedMessage="Filters";
        WebElement messag = driver.findElement(By.xpath("//h3[contains(text(),'Filters')]"));
        String actualmessage = messag.getText();
        Assert.assertEquals("Error, message not displayed", expectedMessage,actualmessage);
    }
}
