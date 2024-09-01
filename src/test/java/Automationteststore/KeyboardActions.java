package Automationteststore;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class KeyboardActions {
    public static void main(String[] args) {
        CommonAction commonAction = new CommonAction();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com/intl/en/inputtools/try/");
        WebElement Textarea = driver.findElement(By.xpath("//textarea[@id='demobox']"));
        Textarea.sendKeys("I am Lakshmi Priya");
        commonAction.waitFor(1);
        Textarea.sendKeys(Keys.ENTER);
        commonAction.waitFor(1);
        Textarea.sendKeys(Keys.chord(Keys.CONTROL, "a")); // select all
        commonAction.waitFor(3);
        driver.quit();
    }
}
