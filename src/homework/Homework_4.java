package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework_4 extends BaseTest{

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyTheText(){

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.cssSelector("#btnLogin")).click();
        String expectedMessage = "Welcome Paul";
        WebElement message = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
        String acutalmessage = message.getText();
        Assert.assertEquals("Welcome message not displayed", expectedMessage,acutalmessage);
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

        String expectedMessage1 = "LOGIN Panel";
        WebElement message1 = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
        String acutalmessage1 = message1.getText();
        Assert.assertEquals("LOGIN Panel message not displayed", expectedMessage1,acutalmessage1);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}

