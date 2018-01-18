package com.finder.pageObjects;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Fund extends BasePage {
    private ElementsCollection fundDropdown = $$(By.cssSelector("div.luna-dropdown__action label.luna-label"));

    public void selectFund (String fundName){
        $(By.cssSelector("div.luna-dropdown")).click();
        fundDropdown.find(Condition.text(fundName)).click();
        $(By.cssSelector("button.luna-select")).click();
    }
}
