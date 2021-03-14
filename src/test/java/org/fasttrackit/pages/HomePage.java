package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = ".menu-item-122")
    private WebElementFacade MyAccountLink;
    @FindBy(css = ".menu-item-123")
    private WebElementFacade ShopLink;
    @FindBy(css = ".menu-item-124")
    private WebElementFacade CartLink;
    @FindBy(css = ".menu-item-125")
    private WebElementFacade CheckoutLink;
    @FindBy(css =".fa-search" )
    private WebElementFacade searchIcon;
    @FindBy(css = ".search-field")
    private WebElementFacade searchField;
    @FindBy(css = "[type=submit]")
    private WebElementFacade searchButton;


    public void clickMyAccountLink(){
        clickOn(MyAccountLink);
    }

    public void clickShopLink(){
        clickOn(ShopLink);
    }

    public void clickCartLink() {clickOn(CartLink);}

    public void clickCheckoutLink(){clickOn(CheckoutLink);}

    public void clickSearchIcon(){clickOn(searchIcon);}
    public void setSearchField(String text){
        typeInto(searchField, text);
    }
    public void clickSearchButton(){clickOn(searchButton);}


}
