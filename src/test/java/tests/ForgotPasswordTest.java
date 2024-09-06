package tests;

import Automationteststore.CommonAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPage;

import java.time.Duration;

public class ForgotPasswordTest {
    public static void main(String[] args) {
        String username= "admin";
        String password = "admin@123";
        String username1 = "admin";
        String password1 = "admin123";
        CommonAction commonAction = new CommonAction();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickForgotPassword();
        commonAction.waitFor(2);
        loginPage.clickResetPassword();
        WebElement inputSearch =driver.findElement(By.cssSelector("input[placeholder='username']"));
        inputSearch.sendKeys("admin");
        WebElement inputButton =driver.findElement(By.xpath("//button[normalize-space()='Reset Password']"));
        inputButton.click();
        commonAction.waitFor(5);
        driver.quit();
    }
}
