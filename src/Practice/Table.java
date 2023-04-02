package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class Table {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/table-search-filter-demo.php");
        List<WebElement> tableName = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));

        for (WebElement getNum : tableName) {

            if(getNum.equals("in progress"))
            System.out.println(getNum.getText());


        }


        Thread.sleep(50000);
        driver.close();

    }
}
