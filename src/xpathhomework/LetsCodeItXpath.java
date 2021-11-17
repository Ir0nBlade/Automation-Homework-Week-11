package xpathhomework;

import homework.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LetsCodeItXpath extends BaseTest {

    String baseUrl="https://learn.letskodeit.com/p/practice";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyLetsCodeItCoursePage(){
        //driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//a[text()='https://courses.letskodeit.com/practice']")).click();
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email Address' or @data-dashlane-rid='13a8060a8a653331']")).sendKeys("abc@prime.com");
        driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']")).sendKeys("abc123");
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@class='inputs' and @placeholder='Enter Your Name']")).sendKeys("Vimal");
        //driver.findElement(By.xpath("//input[@class='btn-style' and @ value='Confirm']")).click();
        driver.findElement(By.xpath("//input[contains(@id, 'displayed-text')]")).sendKeys("Prime");
        driver.findElement(By.xpath("//input[starts-with(@id, 'enabled-example')]")).sendKeys("Testing");
        driver.findElement(By.xpath("//a[contains(text(),'ALL COURSES')]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@class='container']//input[@id='bmwradio']")).click();
        driver.findElement(By.xpath("//input[@id='hondacheck']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Orange')]")).click();

        String expectedMessage = "Practice Page";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Practice Page')]"));
        String acutalmessage = message.getText();
        Assert.assertEquals("Error message not displayed", expectedMessage,acutalmessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
