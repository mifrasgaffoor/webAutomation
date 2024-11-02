package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();


        // way 01
        Set<String> ids = driver.getWindowHandles();
        List<String> idsList =new  ArrayList(ids);
//        String parentID = idsList.get(0);
//        String childID = idsList.get(1);
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(childID);
//        System.out.println(driver.getTitle());




        // way 2
        for (String id :idsList){
            String n = driver.switchTo().window(id).getTitle();
        if (n.equals("Human Resources Management Software | OrangeHRM")){
            System.out.println(driver.getCurrentUrl());
        }
        }
    }
}
