package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils{
    BrowserSelector browserSelector=new BrowserSelector();

    @BeforeMethod
    public void OpenBrowser(){
        //open browser
        browserSelector.openBrowser();
        //open URL
        driver.get("https://www.next.co.uk/");


    }
    @AfterMethod
    public void closeBrowser(){
        //close browser
        driver.quit();
    }
}
