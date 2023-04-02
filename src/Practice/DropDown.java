package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));
        Select select = new Select(dropDown);
        select.selectByValue("Sunday");
        Thread.sleep(1000);
        select.selectByIndex(3);
        Thread.sleep(1000);
        select.isMultiple();
        Thread.sleep(1000);
        select.selectByVisibleText("Friday");
        Thread.sleep(2000);



    }
}
