package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class NavigationalMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("");

        // driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
      // URL ur  = new URL("https://opensource-demo.orangehrmlive.com/");
       //  driver.navigate().to(url);


        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.navigate().to("https://practice.expandtesting.com/");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



    }
}
