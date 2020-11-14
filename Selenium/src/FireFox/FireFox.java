package FireFox;

import jdk.internal.cmm.SystemResourcePressureImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.concurrent.TimeUnit;

/**
 * Created by vaisakh on 08/06/17.
 */
public class FireFox {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","//Users//vaisakh//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.qaclickacademy.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String pagesource = driver.getPageSource();
        System.out.println(title);
        System.out.println(url);
        System.out.println(pagesource);
        //firefox.findElement(By.xpath(".//*[@id='homepage']/section[2]/div/a")).click();
        //firefox.findElement(By.linkText("View all Courses")).click();
        //driver.findElement(By.linkText("Courses")).click();
        driver.close();
    }
}
