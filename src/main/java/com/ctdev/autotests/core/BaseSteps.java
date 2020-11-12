package com.ctdev.autotests.core;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.Before;

public class BaseSteps {

    @Before
    public void setUp() {
        if (!WebDriverRunner.hasWebDriverStarted()) {
            BrowserConfiguration.configureBrowser();
        }
    }
}