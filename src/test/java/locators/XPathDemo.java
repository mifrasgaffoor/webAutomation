package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/");
        driver.manage().window().maximize();



        // /html[1]/body[1]/header[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]
           //     /html[1]/body[1]/header[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]
        // html[1]/body[1]/div[1]/header[1]/nav[1]/a[1]
           //     /html[1]/body[1]/header[1]/nav[1]/a[1]
        // /html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]
        //input[@id='search-input']




    }
}
