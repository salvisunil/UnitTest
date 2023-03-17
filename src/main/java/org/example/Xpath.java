package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();//object
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunil.Salvi\\Downloads\\chromedriver.exe");//path
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
        System.out.println(e);}

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id ='login-button']")).click();
        //contains
        driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
        // both are blank null for start-with
        driver.findElement(By.xpath("//span[starts-with(@class,'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message')]"));
        //XPath Text() Function
        driver.findElement(By.xpath("//span[text()='Products']"));


//        driver.get("https://www.mycarhelpline.com/");
//        driver.findElement(By.xpath("//div[@id='bluemenu']/child::ul[1]/child::li[5]/child::a[1]")).click();
//        driver.findElement(By.xpath("//div[@id='bodycontainer-innerpage']/child::div[1]/child::div[1]/child::table[1]/descendant::img[1]")).click();

    }
}
