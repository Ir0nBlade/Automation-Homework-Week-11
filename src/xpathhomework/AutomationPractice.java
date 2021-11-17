package xpathhomework;

import homework.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class AutomationPractice extends BaseTest {

    String baseUrl= "http://automationpractice.com/index.php?id_category=8&controller=category";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyAutomationPracticePage(){

        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("summer dresses");
        driver.findElement(By.xpath("//button[@type='submit' and @name='submit_search']")).click();
        driver.findElement(By.xpath("//a[starts-with(@title,'Log in to')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
        driver.findElement(By.xpath("//body[@id='password']//input[@name='email']")).sendKeys("abc@prime.com");
        driver.findElement(By.xpath("//a[text()='Contact us']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart' or @title='View my shopping cart']")).click();
        driver.findElement(By.xpath("//a[@class='bullet' or @title='My orders']")).click();
        driver.findElement(By.xpath("//li[contains(@class,'twitter')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Terms and conditions of use')]")).click();

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
