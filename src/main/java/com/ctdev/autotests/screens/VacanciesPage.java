package com.ctdev.autotests.screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class VacanciesPage {

    private ElementsCollection vacanciesList = $$x("//ul[@id='menu-main-1']/li");
    private ElementsCollection professionalSkills = $$x("//div[contains(@class, 'active')]//p[contains(., 'Professional skills')]/following-sibling::ul[1]/li");
    private SelenideElement vacancyName = $x("//div[contains(@class, 'vacancies-second-contents') and contains(@class, 'active')]//h1");

    public void openVacancy(String vacancyTitle) {
        vacanciesList.findBy(text(vacancyTitle)).click();
        vacancyName.shouldHave(text(vacancyTitle));
    }

    public void verifyProfessionalSkills(int skills) {
        professionalSkills.shouldHave(size(skills));
    }
}