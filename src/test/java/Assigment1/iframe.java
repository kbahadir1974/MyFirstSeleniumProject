package Assigment1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.BrowserFactory;

public class iframe {

  @Test
    public  void  setup(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/hovers");


    }




    }
