package Automationteststore;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.msn.com/?pc=W099&ocid=MSNHP_W099");
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("firefox.png");
        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot saved!!!");
        driver.quit();
    }
}
