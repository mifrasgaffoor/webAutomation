package launchBrowserFirstTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hi");

        // lauhch Chrome
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        if (driver.getTitle().equals("Google")){
            System.out.println("Test Pass");
        }
        else {
            System.out.println("Test Failed");
        }



        //
    }
}
