package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class AbsoluteXpathTest {
    //    helpdesk59@cybertekschool.com
//            UserUser
    public static void main(String[] args) {
        //getDriver() method returns object of webdriver
        //we need webdriver object to send commands to the brwoser
        //left side is a reference variable to reuse this object
        //object can be created and used without reference variable,
        //but it's gonna be impossible to use that object more than once.
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //go to bitrix

        driver.get("https://login1.nextbasecrm.com/?login=yes");
        //enter email
        //WebElement email = driver,findElement("");
        //email.sendKeys("email@email.com");

        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("UserUser");
        //click to log in button
        driver.findElement(By.xpath("//input[starts-with(@value, 'Log')]")).click();
        BrowserUtils.wait(5);
        driver.quit();

    }
}
