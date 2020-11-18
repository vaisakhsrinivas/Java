package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * Created by vaisakh on 17/11/20.
 */
public class NegativeTestCase {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//vaisakh//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fortinet.com/");
        Thread.sleep(1000);
        driver.findElement(By.className("site-search--submit")).click();
        driver.findElement(By.className("site-search--input")).sendKeys(" ");
        driver.findElement(By.className("site-search--submit")).click();
        Thread.sleep(1000);
        String s = driver.findElement(By.className("call-out-note")).getText();
        Assert.assertTrue(true,s);
        driver.close();
    }
}
