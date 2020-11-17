package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vaisakh on 16/11/20.
 */
public class AutomatedTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//vaisakh//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://s3.amazonaws.com/co.tulip.cdn/memtracking/index.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().refresh();
        String before_selection = driver.findElement(By.id("statNumCrashes")).getText();
        System.out.print(before_selection);
        driver.findElement(By.id("filterPageData")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        String after_selection = driver.findElement(By.id("statNumCrashes")).getText();
        System.out.print(after_selection);
        if (before_selection.equals(after_selection)){
            System.out.print("No update");
        }
        else
        {
            System.out.print("updated stats" + after_selection);
        }
        driver.findElement(By.id("filterPageAnalytics")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String after_analytics = driver.findElement(By.id("statNumCrashes")).getText();
        System.out.print(after_analytics);
        driver.close();
    }
}
