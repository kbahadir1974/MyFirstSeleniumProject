package Assigment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class NegativeTesting {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");


        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.id("prependedInput")).sendKeys("user180");

        driver.findElement(By.id("prependedInput2")).sendKeys("Useruser123");

        driver.findElement(By.id("_submit")).click();

        String expectedTitle ="Dashbord";

        String actualTitle = "Invalid username or password";

        BrowserUtils.wait(5);

        if (expectedTitle.equals(actualTitle)){


        System.out.println("Pass");
    } else
        System.out.println("Invalid username or password" );
        System.out.println("Fail");

        driver.close();
   }
 }
