package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import java.awt.*;

public class Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        List<WebElement> tags = driver.findElements(By.tagName("a"));

        for (WebElement list: tags){
           String linkList = list.getAttribute("href");
            System.out.println(linkList);


        }


//        System.out.println(tags);
    }
}
