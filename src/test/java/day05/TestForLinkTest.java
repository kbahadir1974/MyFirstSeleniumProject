package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

      class TestsForLinkTest {

    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = BrowserFactory.getDriver("chrome");

       driver.get("http://practice.cybertekschool.com/");
       driver.findElement(By.linkText("Autocomplete")).click();
       Thread.sleep(3000);

       driver.quit();

    }
}
