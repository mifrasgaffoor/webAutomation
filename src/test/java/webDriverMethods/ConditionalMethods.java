package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        Thread.sleep(5000);
        WebElement isText = driver.findElement(By.className("oxd-text--h5"));
        System.out.println(isText.isDisplayed());

        WebElement inputUserName = driver.findElement(By.xpath("//*[@placeholder='Username']"));
        System.out.println(inputUserName.isEnabled());

        // isSelected







    }
}
