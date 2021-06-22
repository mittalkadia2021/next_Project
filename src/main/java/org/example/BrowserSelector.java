package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class BrowserSelector extends Utils {

    LoadProperty loadProperty = new LoadProperty();
//

    public void openBrowser() {
        //store variable
        String browserName = loadProperty.getProperty("browserName");
        //applying browser condition
        switch (browserName) {

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("browser :" + browserName + " " + "is invalid, launching Chrome as browser of choice ");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

        }

        //maximize the browser window
        driver.manage().window().maximize();
        //Apply implicitlyWait to driver object
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}
