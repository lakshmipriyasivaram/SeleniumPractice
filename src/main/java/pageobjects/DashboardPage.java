package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    WebDriver ldriver;

    By SEARCH = By.xpath("//input[@placeholder='Search']");
    public DashboardPage(WebDriver rdriver) {
        ldriver = rdriver;
    }
    public void search(String query) {
        ldriver.findElement(SEARCH).click();
        ldriver.findElement(SEARCH).sendKeys(query);
    }

}
