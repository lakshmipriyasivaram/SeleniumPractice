package Automationteststore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Multielements {
        public static void main(String[] args) {
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get("https://automationteststore.com/index.php?rt=account/login");
            driver.findElement(By.xpath("//input[@name='loginname']")).sendKeys("Hello");
           List<WebElement>multipleInputs = driver.findElements(By.xpath("//input"));
           System.out.println(multipleInputs.isEmpty());
           System.out.println(multipleInputs.size());
        }
}
