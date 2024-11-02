package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethodsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // get()
        //driver.get("https://practice.expandtesting.com/");

        // getTitle()
        //String title = driver.getTitle();
        //System.out.println(title);

        // getSourceCode()
//        System.out.println(driver.getPageSource());

        // getCurrentUrl()
       // String url = driver.getCurrentUrl();
        //System.out.println(url);

        // getWindowHandle()
        //System.out.println(driver.getWindowHandle());


        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> ids= driver.getWindowHandles();
        System.out.println(ids);






    }
}
