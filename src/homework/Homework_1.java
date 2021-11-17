package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Homework_1 extends BaseTest {
    String baseUrl = "https://www.google.co.uk/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
        driver.findElement(By.id("L2AGLb")).click();
        WebElement input = driver.findElement(By.xpath("//input[@name='q']"));
        input.sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[contains(text(),'nopCommerce demo store')]")).click();

    }

    @Test
    public void navigateToComputer() {

        driver.findElement(By.linkText("Computers")).click();
        String expectedMessage = "Computers";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Computers page is not displayed", expectedMessage, actualMessage);
    }

    @Test
    public void navigateToElectronics(){

        driver.findElement(By.linkText("Electronics")).click();
        String expectedMessage = "Electronics";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Electronics page is not displayed", expectedMessage, actualMessage);
    }

    @Test
    public void navigateToApparel(){

        driver.findElement(By.linkText("Apparel")).click();
        String expectedMessage = "Apparel";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Apparel page is not displayed", expectedMessage, actualMessage);
    }

    @Test
    public void navigateToDigitalDownloads(){

        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedMessage = "Digital downloads";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String acutalmessage = message.getText();
        Assert.assertEquals("Digital downloads page is not displayed", expectedMessage,acutalmessage);
    }

    @Test
    public void navigateToBooks(){

        driver.findElement(By.linkText("Books")).click();
        String expectedMessage = "Books";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String acutalmessage = message.getText();
        Assert.assertEquals("Books page is not displayed", expectedMessage,acutalmessage);
    }

    @Test
    public void navigateToJewelry(){

        driver.findElement(By.linkText("Jewelry")).click();
        String expectedMessage = "Jewelry";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String acutalmessage = message.getText();
        Assert.assertEquals("Jewelry page is not displayed", expectedMessage,acutalmessage);
    }

    @Test
    public void navigateToGiftCards(){

        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedMessage = "Gift Cards";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String acutalmessage = message.getText();
        Assert.assertEquals("Gift Cards page is not displayed", expectedMessage,acutalmessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
