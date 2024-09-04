package Automationteststore;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PromtAlert {
    public static void main(String[] args) {
        CommonAction commonAction = new CommonAction();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(("https://the-internet.herokuapp.com/javascript_alerts"));
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        commonAction.waitFor(2);
        Alert alert= driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.sendKeys("hi Lakshmi");
        commonAction.waitFor(2);
        alert.accept();
        //driver.quit();
    }
}
