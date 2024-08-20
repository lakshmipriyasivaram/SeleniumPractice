package Automationteststore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator {
    public static void main(String[] args) {
        String loginname = "LakshmiPriya";
        String password = "Siva@123";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://automationteststore.com/index.php?rt=account/login");
        WebElement inputloginname= driver.findElement(By.name("loginname"));
        inputloginname.click();
        inputloginname.sendKeys(loginname);
        WebElement inputpassword = driver.findElement(By.name("password"));
        inputpassword.sendKeys(password);
        inputpassword.click();
        WebElement loginButton = driver.findElement(By.cssSelector("button[title='Login']"));
        loginButton.click();

    }
}
