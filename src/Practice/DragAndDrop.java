package Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);

        WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));

        WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag, drop).perform();

        //how to get screenShot
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file, new File("src/Practice/screenShot.png"));


        Thread.sleep(90000);
        driver.close();
    }
}
