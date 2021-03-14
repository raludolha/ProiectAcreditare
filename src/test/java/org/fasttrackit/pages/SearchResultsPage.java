package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultsPage extends PageObject {
    @FindBy(css = ".post-740 h2")
    public WebElementFacade productHoodie;


    public void verifyIfProductIsDisplayed(String text){
        productHoodie.shouldContainText(text);
    }
}
