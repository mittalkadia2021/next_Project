package org.example;

import org.openqa.selenium.By;

public class Utils extends BasePage{
    // method for click on element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
}
