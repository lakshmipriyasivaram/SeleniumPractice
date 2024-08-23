package Automationteststore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mouseaction {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.get("https://demo.automationtesting.in/Register.html");
        //WebElement Goto = driver.findElement(By.xpath("//select[@placeholder='Month']"));
        //Actions actions = new Actions(driver);
        //actions.click(Goto).build().perform();
         driver.get("https://the-internet.herokuapp.com/drag_and_drop");
         WebElement A = driver.findElement(By.xpath("//div[@id='column-a']"));
         WebElement B = driver.findElement(By.xpath("//div[@id='column-b']"));
         Actions a = new Actions(driver);
         a.dragAndDrop(A ,B).build().perform();
        //driver.quit();
        WebElement source = driver.findElement(By.xpath("(//div[@id='column-a'])"));
        WebElement target = driver.findElement(By.xpath("(//div[@id='column-b'])"));
        a.moveToElement(source).clickAndHold(source).moveToElement(target).release(target)
                .build().perform();

    }

}
