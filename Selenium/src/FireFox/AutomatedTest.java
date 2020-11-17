package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by vaisakh on 16/11/20.
 */
public class AutomatedTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//vaisakh//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://s3.amazonaws.com/co.tulip.cdn/memtracking/index.html");
        Thread.sleep(2000);
        String before_selection = driver.findElement(By.id("statNumCrashes")).getText();
        System.out.println(before_selection); //check to see if value is being picked correctly
        driver.findElement(By.id("filterPageData")).click();
        Thread.sleep(2000);
        String after_selection = driver.findElement(By.id("statNumCrashes")).getText();
        System.out.println(after_selection); //check to see if value is being picked correctly
        Assert.assertTrue(after_selection != before_selection);
        driver.findElement(By.id("filterPageAnalytics")).click();
        Thread.sleep(2000);
        String after_analytics = driver.findElement(By.id("statNumCrashes")).getText();
        Assert.assertTrue(after_selection != after_analytics);
        System.out.println(after_analytics); //check to see if value is being picked correctly
        driver.close();
    }
}
