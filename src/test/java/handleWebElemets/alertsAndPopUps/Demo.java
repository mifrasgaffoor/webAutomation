package handleWebElemets.alertsAndPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Simple Alert
        driver.findElement(By.id("alertBtn")).click();
        Alert simpleAler = driver.switchTo().alert();
        simpleAler.accept();

        // Confirmation Alert
        driver.findElement(By.id("confirmBtn")).click();
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();


        // Prompt Alert
        driver.findElement(By.id("promptBtn")).click();
        Alert promptBtnAlert = driver.switchTo().alert();
        promptBtnAlert.sendKeys("Hi there");


        //handle alerts using an Explicit Wait

    }
}
