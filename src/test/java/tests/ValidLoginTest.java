package tests;

import Automationteststore.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPage;

import java.time.Duration;

public class ValidLoginTest {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin123";
        CommonAction commonAction = new CommonAction();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        System.out.println(driver.getCurrentUrl());
        commonAction.waitFor(3);
        driver.quit();
    }
}
