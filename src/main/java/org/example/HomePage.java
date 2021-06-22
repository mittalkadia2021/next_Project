package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _woman = By.xpath("(//span[contains(text(), 'WOMEN')])[1]");

    public void click_On_Woman() {
        //click on woman category
        clickOnElement(_woman);
        //print output
        System.out.println("Click on woman category");
    }
}
