package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args) {
        //launch chrome driver browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunil.Salvi\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //launch google webpage
        driver.navigate().to("https://www.google.co.in/");

        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("DDU");

        //capture title of webpage and print
        String title = driver.getTitle();
        System.out.println("page title : " + title);

        //capture  url of the webpage
        System.out.println("URL: " + driver.getCurrentUrl());

        //capture page source
        System.out.println("Page source: " + driver.getPageSource());

    }
}
