package handleWebElemets.framesAndiFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        // Locate frame 1 and switch to it
        WebElement frameElement1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frameElement1);

        // Interact with the input field inside the frame
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("mytext1");

        // Switch back to the main content after you're done
        driver.switchTo().defaultContent();
       /* -----------------------------------------Frame--------------------------------------------------------------------- */

        // Locate frame 2 and switch to it
        WebElement frameElement2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frameElement2);

        // Interact with the input field inside the frame
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("mytext2");
        // Switch back to the main content after you're done
        driver.switchTo().defaultContent();

        /* ----------------------------------------Frame--------------------------------------------------------------------- */

        // Locate frame 4 and switch to it
        WebElement frameElement4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
        driver.switchTo().frame(frameElement4);

        // Interact with the input field inside the frame
        driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("mytext4");
        // Switch back to the main content after you're done
        driver.switchTo().defaultContent();



        /* ----------------------------------------IFrame--------------------------------------------------------------------- */

        WebElement frameElement3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frameElement3);

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//span[normalize-space()='Web Testing']")).click();


        /* ----------------------------------------IFrame--------------------------------------------------------------------- */

        driver.switchTo().defaultContent();

        WebElement frameElement5= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frameElement5);

        driver.findElement(By.linkText("https://a9t9.com")).click();
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.id("logo")).isDisplayed());










//        // Close the browser after execution
//        driver.quit();
    }
}
