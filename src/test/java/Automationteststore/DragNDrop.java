package Automationteststore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragNDrop {
    public static void main(String[] args) {
        CommonAction commonAction = new CommonAction();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.lambdatest.com/selenium-playground/drag-and-drop-demo");
        Actions a = new Actions(driver);
        WebElement Source = driver.findElement(By.xpath("//span[normalize-space()='Draggable 1']"));
        WebElement Target = driver.findElement(By.xpath("//div[@id='mydropzone']"));
        WebElement Source1 = driver.findElement(By.xpath("//span[normalize-space()='Draggable 2']"));
        WebElement Target1 = driver.findElement(By.xpath("//div[@id='mydropzone']"));
        a.moveToElement(Source1).clickAndHold(Source1).moveToElement(Target1).release(Target1).build().perform();
        a.moveToElement(Source).clickAndHold(Source).moveToElement(Target).release(Target).build().perform();
        commonAction.waitFor(5);
    }

}
