package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vaisakh on 10/06/17.
 */
public class TraverseElements {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//vaisakh//Downloads//geckodriver");
        WebDriver ff = new FirefoxDriver();
        ff.get("http://www.qaclickacademy.com/interview.php");

        /*bytext*/
        ff.findElement(By.xpath("//li[text()=' Selenium ']")).click();

        /*traverse sibling element*/
        ff.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

        /*traverse parent from sibling*/
        System.out.println(ff.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));

        /*css*/

        ff.findElement(By.cssSelector("[class = 'navbar-brand']")).click();


    }
}
