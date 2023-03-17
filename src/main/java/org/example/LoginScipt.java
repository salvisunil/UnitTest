//package org.example;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class LoginScipt {
//
//    @Test(dataProvider = "credentials")
//    public void verifyLoginCredentials(String scenario, String username, String password){
//
//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunil.Salvi\\Downloads\\chromedriver.exe");
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//
//        if(scenario.equals("bothcorrect"))
//        {
//            WebElement login = driver.findElement(By.xpath("//div[@class='oxd-grid-3 orangehrm-dashboard-grid']"));
//            Assert.assertTrue(login.isDisplayed(),"Login not success");
//        }
//        else if(scenario.equals("bothwrong") && scenario.equals("correctusername") && scenario.equals("correctpassword"));
//        {
//            String Invalidcredentials = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
//            Assert.assertEquals(Invalidcredentials, "Invalid credentials");
////        } else if (scenario.equals("correctusername")) {
////            String Invalidcredentials = driver.findElement(By.className("oxd-text oxd-text--p oxd-alert-content-text")).getText();
////            Assert.assertEquals(Invalidcredentials,"Invalid credentials");
////        } else {
////            String Invalidcredentials = driver.findElement(By.className("oxd-text oxd-text--p oxd-alert-content-text")).getText();
////            Assert.assertEquals(Invalidcredentials,"Invalid credentials");
////        }
//        }
//    }
//    @DataProvider(name ="credentials")
//    public Object[][] getData(){
//        return new Object[][]{
//                {"bothcorrect","Admin","admin123"},
//                {"bothwrong","sunil","adminpassword"},
//                {"correctusername","Admin","adminpassword"},
//                {"correctpassword","sunil","admin123"},
//        };
//    }
//}
