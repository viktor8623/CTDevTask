package com.ctdev.autotests.steps.vacancies;

import com.ctdev.autotests.screens.VacanciesPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VacanciesSteps {

    private VacanciesPage vacanciesPage = new VacanciesPage();

    @When("^open vacancy with title \"([^\"]*)\"$")
    public void openVacancy(String vacancyTitle) {
        vacanciesPage.openVacancy(vacancyTitle);
    }

    @Then("^verify that paragraph under Professional skills and qualification: contains exactly (\\d+) skills$")
    public void verifyProfessionalSkills(int skills) {
        vacanciesPage.verifyProfessionalSkills(skills);
    }
}