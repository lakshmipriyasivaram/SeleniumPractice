package Seitchcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Simplecode {
    public static void main(String[] args) {
           String WebBrowser = "Open WebBrowser";
                       switch (WebBrowser)
                {
            case "ChromeDriver":
                System.out.println("Open ChromeDriver");
            case "EdgeDriver":
                System.out.println("Open EdgeDriver");
                    default:
                        System.out.println("Open FireFox");
                        break;

        }
    }
}
