package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto amazon
        driver.get("http://amazon.com");

        WebElement text = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));

        Actions actions = new Actions(driver);
        actions.moveToElement(text).perform();

        Thread.sleep(90000);
        driver.close();
    }
}
