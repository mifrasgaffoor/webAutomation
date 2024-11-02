package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ClosingSpecificBrwserWindow {
    public static void main(String[] args) {
        WebDriver driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> wids = driver.getWindowHandles();
        List<String> widList = new ArrayList(wids);
        for (String urlId:widList) {

            String title = driver.switchTo().window(urlId).getTitle();
            if (title.equals("Human Resources Management Software | OrangeHRM")){
                driver.close();
            }

        }




    }
}
