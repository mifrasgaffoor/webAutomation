package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocatorDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();


        // id
        boolean b =  driver.findElement(By.id("logo")).isDisplayed();

        // name
        driver.findElement(By.name("search")).click();


        // linkText
        WebElement element = driver.findElement(By.linkText("Click Here"));

        // partialLinkText
        WebElement element3 = driver.findElement(By.partialLinkText("Click"));


        // tagName
        WebElement element2 = driver.findElement(By.tagName("input"));

        // className
        WebElement element4 = driver.findElement(By.className("className"));
    }

}
