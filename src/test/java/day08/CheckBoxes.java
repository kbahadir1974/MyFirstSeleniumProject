package day08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;

import java.util.List;
public class CheckBoxes {
    // command + option + L - to organize code for Mac
    // control + alt + L - to organize code for windows
    private WebDriver driver;
    //private because it will be used only in this class
    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
//        <a href="/checkboxes">Checkboxes</a>
        driver.findElement(By.linkText("Checkboxes")).click();
    }
    @Test
    public void test1(){
        //find all checkboxes
        //any checkbox will have [type='checkbox']
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type='checkbox']"));
        int index =1;
       for (WebElement checbox : checkboxes){
           if (checbox.isEnabled() && !checbox.isSelected() ){
               checbox.click();
               System.out.println("Checkbox clicked: "+index);
           }else{
               System.out.println("Checkbox was not clicked: "+index);
           }
           index++;


       }
       }
    @AfterMethod
    public void teardown() {
        driver.quit();
    }


}
