package com.finder.pageObjects;

import static com.codeborne.selenide.Condition.visible;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Postcode extends BasePage {
    private SelenideElement postcode = $(By.cssSelector("input.react-autosuggest__input"));

    public void setPostcode(String sPostcode){
        postcode.setValue(sPostcode.split(" ")[0]);
        $(By.xpath("//li[@role='option']/span[contains(text(),'$')]".replace("$", sPostcode.split(" ")[1])))
                .waitUntil(visible, 5000).click();
    }

}
