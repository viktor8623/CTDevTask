package com.ctdev.autotests.screens;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;

public class MainMenu {

    private ElementsCollection sections = $$x("//ul[@id='menu-main']/li");
    private ElementsCollection subsections = $$x("//ul[@id='menu-main']//li/ul//li");

    public void navigateToSubmenu(String section, String subsection) {
        sections.findBy(text(section)).click();
        subsections.findBy(text(subsection)).click();
    }
}
