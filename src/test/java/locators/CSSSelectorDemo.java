package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/");
        driver.manage().window().maximize();


        Thread.sleep(5000);
        // Tag ID
        driver.findElement(By.cssSelector("input#search-input")).sendKeys("web");
        driver.findElement(By.cssSelector("#search-input")).sendKeys("web");

        // Tag ClassName
        String element =   driver.findElement(By.cssSelector("p.card-text")).getText();
        System.out.println(element);

        // Tag Attribute  tag[attribute="value"]
        driver.findElement(By.cssSelector("input[placeholder=\"Search an example...\"]"));

        // tag.className[attribute="value"]
        driver.findElement(By.cssSelector("input.form-control[placeholder=\"Search an example...\"]"));



    }



}
