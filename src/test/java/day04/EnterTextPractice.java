package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class EnterTextPractice {

        public static void main(String[] args) {
            WebDriver driver= BrowserFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/forgot_password");

            WebElement inputBox = driver.findElement(By.name("email"));

            inputBox.sendKeys("random@email.com");
            WebElement button = driver.findElement(By.name("form_submit"));
            button.click();
            String expectedUrl ="http://practice.cybertekschool.com/email_sent";
            String actualUrl = driver.getCurrentUrl();
            if (expectedUrl.equals(actualUrl)){
                System.out.println("Test Passeed");

            }else{
                System.out.println("Test Failed");
            }


            BrowserUtils.wait(2);
            driver.close();

        }
}
