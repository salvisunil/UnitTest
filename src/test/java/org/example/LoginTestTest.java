package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;


public class LoginTestTest {
    @Test(dataProvider = "credentials")
    public void testng(String scenario , String username , String password) {

        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Sunil.Salvi\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }

       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();





        if (scenario.equals("Both_Correct"))
        {
/*            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
//            System.out.println("Login Successfully");
            WebElement login = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
            //String url = (driver.getCurrentUrl());
            //Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index","Success");
            Assert.assertTrue(login.isDisplayed(), "login success");

        }
        else if (scenario.equals("Both_Wrong") && scenario.equals("Correct_Username") && scenario.equals("Correct_Password"))
        {
            String errorMessage = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
            Assert.assertEquals(errorMessage, "Invalid credentials");
        }

//        else if (scenario.equals("Correct_Username")) {
//            String errorMessage = driver.findElement(By.xpath("///p[text()='Invalid credentials']")).getText();
//            Assert.assertEquals(errorMessage, "Invalid credentials");
//
//        } else if (scenario.equals("Correct_Password")) {
//            String errorMessage = driver.findElement(By.xpath("///p[text()='Invalid credentials']")).getText();
//            Assert.assertEquals(errorMessage, "Invalid credentials");
//        }

        else if (scenario.equals("Null")) {
            String  errorMessage = driver.findElement(By.xpath("//input[@name='username']//parent::div//following-sibling::span")).getText();
            Assert.assertEquals(errorMessage,"Required");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }
    }
    @DataProvider(name = "credentials")
    public Object[][] getData() {
        return new Object[][] {
                {"Both_Correct","Admin","admin123"},
                {"Both_Wrong","sunil","adminpassword"},
                {"Correct_Username","Admin","adminpassword"},
                {"Correct_Password","sunil","admin123"},
                {"Nul","",""},
        };
    }
}
