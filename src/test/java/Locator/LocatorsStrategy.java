package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsStrategy {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            WebElement inputSearch =driver.findElement(By.tagName("textarea"));
            inputSearch.sendKeys("Google Water");
            WebElement inputButton =driver.findElement(By.name(("btnI")));


        inputButton.click();



    }
}
