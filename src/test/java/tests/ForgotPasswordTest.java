package tests;

import Automationteststore.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPage;

import java.time.Duration;

public class ForgotPasswordTest {
    public static void main(String[] args) {
        String username= "admin";
        String password = "admin@123";
        CommonAction commonAction = new CommonAction();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickForgotPassword();
        loginPage.clickResetPassword();
        commonAction.waitFor(3);
        driver.quit();
    }
}
