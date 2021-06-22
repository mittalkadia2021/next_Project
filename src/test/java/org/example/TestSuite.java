package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void user_Should_Be_Click_On_Woman_Successfully() {
        homePage.click_On_Woman();

    }
}
