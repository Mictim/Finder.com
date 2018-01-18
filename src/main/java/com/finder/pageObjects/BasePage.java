package com.finder.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    private SelenideElement searchButton = $(By.cssSelector("button.luna-button--action"));

    public SearchResultsPage submitRequest(){
        searchButton.shouldHave(Condition.text("Search Policies")).click();
        return new SearchResultsPage();
    }
}
