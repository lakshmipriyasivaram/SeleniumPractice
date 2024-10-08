package Automationteststore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Downloads {
    public static void main(String[] args) {
        CommonAction commonAction = new CommonAction();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[normalize-space()='sample1.pdf']"))
                .click();
        System.out.println("File is downloading!!!");
        commonAction.waitFor(5);
        driver.quit();
    }

}
