package WaitMechanisms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicitwait {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "admin123";
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement inputUsername = driver.findElement(By.name("username"));
        inputUsername.click();
        inputUsername.sendKeys(username);
        WebElement inputPassword = driver.findElement(By.cssSelector("input[type='Password']"));
        inputPassword.sendKeys(password);
        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


            }
}
