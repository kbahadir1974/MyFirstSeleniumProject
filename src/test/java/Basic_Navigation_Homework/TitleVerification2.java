package Basic_Navigation_Homework;

import org.openqa.selenium.WebDriver;

import utils.BrowserFactory;
import utils.BrowserUtils;

public class TitleVerification2 {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        BrowserUtils.wait(3);
        driver.get("https://lulugandgeorgia.com");
        BrowserUtils.wait(3);
        driver.get("https://wayfair.com/");
        BrowserUtils.wait(3);
        driver.get("https://walmart.com");
        BrowserUtils.wait(3);
        driver.get("https://westelm.com/");
        BrowserUtils.wait(10);
        driver.close();

    }
}
