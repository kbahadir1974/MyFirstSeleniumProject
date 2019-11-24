package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

        public static void main(String[] args) {

            WebDriverManager.chromedriver().setup();

            ChromeDriver driver = new ChromeDriver();

            driver.get("http://google.com");

            driver.manage().window().maximize();
            driver.get("http://google.com");

            driver.navigate().to("http://amazon.com");

            driver.navigate().back();
            String url = driver.getCurrentUrl();
            System.out.println(url);

            // selenium cannot close the browser automatically
            // that's why we use close method
            driver.close();
        }
    }
