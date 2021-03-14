package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultsPage;

public class SearchSteps {
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void clickSearchIcon(){
        homePage.clickSearchIcon();
    }
    @Step
    public void setSearchField(String text){
        homePage.setSearchField(text);
    }
    @Step
    public void clickSearchButton(){
        homePage.clickSearchButton();
    }
    @Step
    public void search(String text){
        clickSearchIcon();
        setSearchField(text);
        clickSearchButton();
    }
    @Step
    public void verifyIfProductIsDisplayed(String text){
        searchResultsPage.verifyIfProductIsDisplayed(text);
    }


    }

