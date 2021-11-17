package homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework_3 extends BaseTest{

    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test

    public void signIn(){

        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("#passwd")).sendKeys("123abc$");
        driver.findElement(By.id("SubmitLogin")).click();
        String expectedMessage = "There is 1 error";
        WebElement message = driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        String acutalmessage = message.getText();
        Assert.assertEquals("Error message not displayed", expectedMessage,acutalmessage);
    }
}

