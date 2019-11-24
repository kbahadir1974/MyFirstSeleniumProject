package Assigment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestCase1 {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.id("<a href=\"/basic_auth\">Basic Auth</a>")).sendKeys("admin");

        driver.findElement(By.id("<a href=\"/basic_auth\">Basic Auth</a>")).sendKeys("admin");
        BrowserUtils.wait(6);
        driver.findElement(By.id("submit"));
        String expectedTitle = "Congratulations! You have the proper credentials";
        String actualTitle = "Thank you for signin up";

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Invalid username or password" );
        } else {


            System.out.println("Pass");
            System.out.println("Fail");


        driver.quit();
    }
    }





}
