package AsiaClass;

import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FirstAssigment {
    public static void main(String[] args) {

        WebDriver driver= BrowserFactory.getDriver("chrome");

        driver.get("http://qa2.vytrack.com/user/login");

        WebElement username = driver.findElement(By.id("prependedInput"));

        username.sendKeys("user1");

        WebElement password = driver.findElement(By.name("_password"));

        password.sendKeys("UserUser123");

        WebElement login = driver.findElement(By.id("_submit"));

        login.click();

        String expectedTitle = "Dashboard";

        String actualTitle = driver.getTitle();

        BrowserUtils.wait(3);

        if (actualTitle.equals(expectedTitle))
        {
        System.out.println("LOGIN SUCCESFULL");
        }
       else
            System.out.println("LOGIN FAILED");
            driver.close();
        }
    }

