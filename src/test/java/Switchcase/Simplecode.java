package Switchcase;

import Automationteststore.CommonAction;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.time.Duration;

public class Simplecode {

            public static void main(String[] args) {
                CommonAction commonAction = new CommonAction();
                    WebDriver driver = null;
            String browser = "firefox";
                String loginname = "LakshmiPriya";
                String password = "Siva@123";
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    driver.get("https://automationteststore.com/index.php?rt=account/login");
                    WebElement inputloginname= driver.findElement(By.name("loginname"));
                    inputloginname.click();
                    inputloginname.sendKeys(loginname);
                    WebElement inputpassword = driver.findElement(By.name("password"));
                    inputpassword.sendKeys(password);
                    inputpassword.click();
                    WebElement loginButton = driver.findElement(By.cssSelector("button[title='Login']"));
                    loginButton.click();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    driver.get("https://www.google.com/");
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    WebElement inputSearch =driver.findElement(By.tagName("textarea"));
                    inputSearch.sendKeys("Google Gravity");
                    WebElement inputButton =driver.findElement(By.xpath("//input[@id='gbqfbb']"));
                    inputButton.click();
                    break;
        }
    }
}
