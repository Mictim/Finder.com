package com.finder.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Coverage extends BasePage{
    private SelenideElement singleFemale = $(By.xpath("//label[@for='single_female']"));
    private SelenideElement singleMale = $(By.xpath("i//label[@for='single_male']"));
    private SelenideElement couple= $(By.xpath("//label[@for='couple']"));
    private SelenideElement family = $(By.xpath("//label[@for='family']"));
    private SelenideElement singleParent = $(By.xpath("//label[@for='single_parent']"));
    private SelenideElement hospitalExtras = $(By.xpath("//label[@for='combined']"));
    private SelenideElement hospital = $(By.xpath("//label[@for='hospital']"));
    private SelenideElement extras = $(By.xpath("//label[@for='extras']"));
    private SelenideElement currentChoiceCoverage;
    private SelenideElement currentChoiceCoverageType;

    public void selectCoverage(String coverage){
        switch(coverage){
            case("Single Female"):
                currentChoiceCoverage = singleFemale;
                singleFemale.click();
                break;
            case("Single Male"):
                currentChoiceCoverage = singleMale;
                singleMale.click();
                break;
            case("Couple"):
                currentChoiceCoverage = couple;
                couple.click();
                break;
            case("Single Parent"):
                currentChoiceCoverage = singleParent;
                singleParent.click();
                break;
            default:
                currentChoiceCoverage = family;
                family.click();
                break;
        }

    }

    public void selectCoverageType(String coverageType){
        switch(coverageType) {
            case ("Hospital & Extras"):
                currentChoiceCoverageType = hospitalExtras;
                hospitalExtras.click();
                break;
            case ("Extras Only"):
                currentChoiceCoverage = extras;
                extras.click();
                break;
            default:
                currentChoiceCoverageType = hospital;
                hospital.click();
                break;
        }
    }
}
