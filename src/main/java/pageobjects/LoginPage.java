package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

        WebDriver driver;
        By USERNAME = By.cssSelector("input[placeholder='Username']");
        By PASSWORD = By.cssSelector("input[placeholder='Password']");
        By LOGIN_BUTTON = By.cssSelector("button[type='submit']");
        By FORGOT_PASSWORD = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
        By CANCEL_BUTTON = By.cssSelector("button[type='button']");
        By RESET_PASSWORD = By.cssSelector("button[type='submit']");

                public LoginPage(WebDriver rdriver)
        {
            driver = rdriver;
        }
        public void enterUsername(String Username) {
            WebElement inputUsername = driver.findElement(USERNAME);
            inputUsername.click();
            inputUsername.sendKeys(Username);
        }

        public void enterInvalidUsername(String Username) {
            WebElement inputUsername = driver.findElement(USERNAME);
            inputUsername.click();
            inputUsername.sendKeys(Username);
        }

        public void enterPassword(String Password) {

            WebElement inputPassword = driver.findElement(PASSWORD);
            inputPassword.click();
            inputPassword.sendKeys(Password);
        }

        public void clickLogin() {

            WebElement loginButton = driver.findElement(LOGIN_BUTTON);
            loginButton.click();
        }

        public void clickForgotPassword(){
            driver.findElement(FORGOT_PASSWORD).click();
        }
        public void resetPassword(String Username) {

        WebElement inputPassword = driver.findElement(USERNAME);
        inputPassword.click();
        inputPassword.sendKeys(Username);
    }
        public void clickCancelButton()
        {
            WebElement cancelButton = driver.findElement(CANCEL_BUTTON);
                    cancelButton.click();
        }
        public void clickResetPassword()
        {
            driver.findElement(RESET_PASSWORD).click();
        }
    }



