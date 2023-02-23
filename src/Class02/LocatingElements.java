package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("akram.farrhad@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Mafg1987!");
//        driver.findElement(By.name("login")).click();
//        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.partialLinkText("password")).click();



    }
}
