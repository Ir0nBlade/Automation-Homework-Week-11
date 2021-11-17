package homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.Random;

public class Homework_2 extends BaseTest{

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void register(){
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vimal");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patel");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("1");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("January");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1990");

        driver.findElement(By.id("Email")).click();
        Random randomEmail = new Random();
        int randomInt = randomEmail. nextInt(1000);
        driver.findElement(By.id("Email")).sendKeys("username"+ randomInt +"@gmail.com");

       // driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc@primetesting.com");
        driver.findElement(By.id("Company")).sendKeys("Prime Inc.");
        driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Abc123$");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Abc123$");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();


    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
