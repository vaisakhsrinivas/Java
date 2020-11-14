package FireFox;

import jdk.internal.cmm.SystemResourcePressureImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * Created by vaisakh on 08/06/17.
 */
public class FireFox {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","//Users//vaisakh//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.qaclickacademy.com");
        //driver.wait(2000);
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
