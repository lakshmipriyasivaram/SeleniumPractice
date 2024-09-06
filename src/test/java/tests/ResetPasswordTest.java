package tests;

import Automationteststore.CommonAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPage;

import java.time.Duration;

public class ResetPasswordTest {
    public static void main(String[] args) {

        String username = "admin";
        String password = "admin123";
        CommonAction commonAction = new CommonAction();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickResetPassword();
        WebElement inputSearch =driver.findElement(By.cssSelector("input[placeholder='Username']"));
        inputSearch.sendKeys("admin");
        WebElement inputPassword =driver.findElement(By.cssSelector("input[placeholder='Password']"));
        inputPassword.sendKeys("admin123");
        WebElement inputButton =driver.findElement(By.cssSelector("button[type='submit']"));
        inputButton.click();
        commonAction.waitFor(3);
        //driver.quit();
    }
}

