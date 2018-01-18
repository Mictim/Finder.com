package com.finder.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Importance extends BasePage{

    private SelenideElement importanceLocator = $(By.name("looking_for"));

    public void selectOptionByText (String importance){
        importanceLocator.selectOption(importance);
    }

    public String getOptionByValue (){
        return importanceLocator.getSelectedValue();
    }

}
