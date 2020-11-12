package com.ctdev.autotests.steps.navigation;

import com.ctdev.autotests.screens.MainMenu;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class NavigationSteps {

    private MainMenu mainMenu = new MainMenu();

    @Given("^open \"([^\"]*)\" page$")
    public void openDirectLink(String link) {
        open(link);
    }

    @When("^navigate to \"([^\"]*)\" -> \"([^\"]*)\" page$")
    public void navigateToSubsection(String section, String subsection) {
        mainMenu.navigateToSubmenu(section, subsection);
    }
}
