package Basic_Navigation_Homework;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TitleVerification {
    public static void main(String[] args) {

       WebDriver driver = BrowserFactory.getDriver("chrome");
       driver.manage().window().maximize();
       BrowserUtils.wait(3);
       driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
       BrowserUtils.wait(3);
       driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
       BrowserUtils.wait(3);
       driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        BrowserUtils.wait(10);


       driver.close();



    }
}
