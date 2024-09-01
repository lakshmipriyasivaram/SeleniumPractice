package Automationteststore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Webelements {
    public static void main(String[] args) {
        String loginname = "LakshmiPriya";
        String password = "Siva@123";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://automationteststore.com/index.php?rt=account/login");
        //driver.findElement(By.cssSelector("#Skincare")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Skincare']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

