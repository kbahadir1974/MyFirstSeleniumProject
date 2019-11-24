package day03;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;



    public class NavigationPractice {

        public static void main(String[] args) {
            WebDriver driver= BrowserFactory.getDriver("chrome");
            driver.manage().window().maximize(); // to maximize window
            driver.get("http://google.com");
            driver.navigate().to("http://amazon.com");
            //navigate back to google (previus URL
            driver.navigate().forward();
            driver.navigate().refresh();
            driver.quit();
        }
}
