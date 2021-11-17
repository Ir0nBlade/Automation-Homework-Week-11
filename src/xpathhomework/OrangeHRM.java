package xpathhomework;

import homework.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class OrangeHRM extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyHRManagementPortal(){

        driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
        //driver.navigate().back();
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
        driver.findElement(By.xpath("//input[starts-with(@value,'Type for ')]")).sendKeys("Lisa Brian");
        driver.findElement(By.xpath("//input[@maxlength='40' and @name='systemUser[userName]']")).sendKeys("prime21");
        driver.findElement(By.xpath("//input[@class='formInputText password' and @name='systemUser[password]']")).sendKeys("Prime$21");
        driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword'='a22af2bb6e397a39' or @data-form-type='password,confirmation']")).sendKeys("Prime$21");
        driver.findElement(By.xpath("//div[@class='inner']//input[@name='btnCancel']")).click();

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
