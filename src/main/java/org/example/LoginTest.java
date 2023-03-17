//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//public class LoginTest {
//
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunil.Salvi\\Downloads\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//
//        try {
//            Thread.sleep(12000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//
//        String actualUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//        String expectedUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//        // driver.findElement(By.xpath("//*/ul/li/ul/li[4]/a")).click();
//        //  driver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]")).click();
//        //Linktext// driver.findElement(By.linkText("Logout")).click();
//
//        if (actualUrl.contentEquals(expectedUrl)) {
//            System.out.println("Test Passed! ");
//        } else {
//            System.out.println("Test Failed");
//        }
//        driver.close();
//
//
//    }
//}
