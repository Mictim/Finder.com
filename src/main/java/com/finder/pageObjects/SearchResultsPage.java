package com.finder.pageObjects;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    private ElementsCollection searchResults = $$(By.cssSelector("div.comparison-table__item"));

    public ElementsCollection getSearchResults() {
        return searchResults;
    }
}
