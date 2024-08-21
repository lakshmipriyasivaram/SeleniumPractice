package Automationteststore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Performaction {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://automationteststore.com/index.php?rt=account/login");
       // List<WebElement> carOptions = driver.findElements(By.xpath("//select[@id='cars']/option"));
        //System.out.println(carOptions.size());
        //for(int i=0; i<carOptions.size(); i++) {
          //  WebElement ithoption = carOptions.get(i);
            //System.out.println(ithoption.getText());
        List<WebElement> sortOption = driver.findElements(By.xpath("//select[@name='sort']"));
        System.out.println(sortOption.size());
        for(int i=0; i<sortOption.size(); i++)
        {
            WebElement ithoption = sortOption.get(i);
            System.out.println(ithoption.getText());
        }
    }

}
