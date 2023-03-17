package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunil.Salvi\\Downloads\\chromedriver.exe");
        driver.navigate().to("https://www.saucedemo.com/");

        //locate  username by id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //locate password by name
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //locate login by class
        driver.findElement(By.className("submit-button")).click();

        //switch product page , productPage windowHandle
        String currentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);

        //locate to Sauce Labs Bolt T-Shirt
       // driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
        driver.findElement(By.partialLinkText("Sauce")).click();




//        driver.findElement(By.cssSelector("input[id=user-name]")).sendKeys("standard_user");
//        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
//        driver.findElement(By.cssSelector("#login-button")).click();
//        nth-child


    }

}
