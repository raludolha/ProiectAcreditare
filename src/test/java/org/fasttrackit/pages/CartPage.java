package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {
    @FindBy(css = ".product-name a")
    private WebElementFacade productTitleCart;
    @FindBy(css = ".product-price span.amount")
    private WebElementFacade productPriceCart;
    @FindBy (css = ".checkout-button")
    private WebElementFacade  checkoutButton;
    {

    }


    public void verifyIfProductTitleIsDisplayed(String title){
        productTitleCart.shouldContainText(title);
    }
    public void verifyIfProductPriceIsDisplayed(String price){
        productPriceCart.shouldContainText(price);
    }
    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }
    }
