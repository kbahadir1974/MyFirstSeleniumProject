package day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfigReaderTest {

    private System ConfigurationReader;

    @Test
    public void test1(){
        /*
         # BROWSER TYPE | it's a comment
         #key=value, It's like a Map in Java
         browser=chrome
         #URL of our web Application
         url=https://qa2.vytrack.com/
         #Credentials
         user_name=storemanager91
         password=UserUser123
         */
        String expectedBrowser = "chrome";
        // we write keys in  "key" as a string
        // as a return, you will get value
        //key=value
        // property name = value
        // we don't change property names, we change values
        // the idea is change in the one place, and affect entire framework
        // let's say every class will read browser type from properties file
        // and to perform cross-browsing
        String actualBrowser = ConfigurationReader.getProperty("browser");
        Assert.assertEquals(actualBrowser, expectedBrowser);
        // read value of url property
        System.out.println("URL:" +ConfigurationReader.getProperty("url"));
        // read value of user_name property
        System.out.println("username: "+ System.getProperty("user_name"));
        // read value of password property
        String password = ConfigurationReader.getProperty("password");
        System.out.println("password: "+password );
    }

}
