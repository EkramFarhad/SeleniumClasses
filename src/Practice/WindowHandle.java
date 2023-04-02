package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S654576683%3A1678260351100912&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHcobSRS2FTmvReT50QTvvpCk9VfjYLHb5hdwZRiDLYCIzP2xkCxw37sPLGRAdaq0WuaMJKG");
        driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/ul/li[3]/a")).click();

//        String parentW = driver.getWindowHandle();
//        System.out.println(parentW);

        Set<String> windowH = driver.getWindowHandles();

        for (String set : windowH) {
            System.out.println(set);

        }


    }


}
