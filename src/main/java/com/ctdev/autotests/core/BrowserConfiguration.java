package com.ctdev.autotests.core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserConfiguration {

    /**
     * Initialize browser configurations
     */
    public static void configureBrowser() {
        Configuration.browser = WebDriverRunner.CHROME;
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.browserCapabilities = getChromeDesiredCapabilities();
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
        Configuration.startMaximized = false;
        Configuration.timeout = 10000;
    }

    /**
     * Get chrome driver desired capabilities
     *
     * @return {@link DesiredCapabilities}
     */
    private static DesiredCapabilities getChromeDesiredCapabilities() {
        DesiredCapabilities dc = new DesiredCapabilities();
        ChromeOptions options = getChromeOptions();
        dc.setCapability(ChromeOptions.CAPABILITY, options);
        return dc;
    }

    /**
     * Get chrome options values
     *
     * @return {@link ChromeOptions}
     */
    private static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-gpu");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        return options;
    }
}