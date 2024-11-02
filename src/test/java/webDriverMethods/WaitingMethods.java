package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class WaitingMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        // Explicit Wait
        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));


        driver.get("https://practice.expandtesting.com/");
        Thread.sleep(5000);

        // FluentWait
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))  // Maximum wait time
                .pollingEvery(Duration.ofSeconds(2))  // Check every 2 seconds
                .ignoring(NoSuchElementException.class);  // Ignore if element not found initially

        // Using Fluent Wait to wait for an element
        WebElement searchInput = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("search-input"));
            }
        });

        // Interact with the element once it is found
        searchInput.sendKeys("testing");


        driver.findElement(By.id("search-input")).sendKeys("testing");

        WebElement navbarBrand = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("navbar-brand")));
        System.out.println("Element found: " + navbarBrand.isDisplayed());



    }
}
