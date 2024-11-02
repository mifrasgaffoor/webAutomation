package handleWebElemets.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        // locate the select element
        WebElement slct = driver.findElement(By.xpath("//select[@id='country]"));
        Select select = new Select(slct);

        // Example of interacting with the dropdown
        select.selectByVisibleText("Canada");  // Select an option by visible text
        select.selectByValue("france");           // Select an option by value attribute
        select.selectByIndex(0);              // Select an option by index (0-based)



    }
}
