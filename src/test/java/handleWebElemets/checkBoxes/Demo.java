package handleWebElemets.checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Select Specific checkBox
        driver.findElement(By.id("sunday")).click();

        // Select all check boxes

        List<WebElement> els = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//        for (int i = 0; i <els.size() ; i++) {
//            els.get(i).click();
//        }
//
//        for (WebElement element:els){
//            element.click();
//        }


        // select last 03 checkboxes

        for (int i = 4; i <els.size() ; i++) {
            els.get(i).click();
        }




    }
}
