package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


    public class ShopPage extends PageObject {

        @FindBy(css = "[href=\"http://qa4.fasttrackit.org:8008/?product=beanie\"]")
        private WebElementFacade productField;
        @FindBy(css = "[href=\"http://qa4.fasttrackit.org:8008/?product=beanie\"] h2")
        private WebElementFacade productName;
        @FindBy(css = "[src=\"//qa4.fasttrackit.org:8008/wp-content/uploads/2018/04/beanie-2-300x300.jpg\"]")
        private WebElementFacade productLink;




        public void clickProductButton(){
            clickOn(productField);}

    public void areProductsDisplayed(String text){ productName.shouldContainText(text);}
    public void clickProductLink(){
            clickOn(productLink);
    }
    }
