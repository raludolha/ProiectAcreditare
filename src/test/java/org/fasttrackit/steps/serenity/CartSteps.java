package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;

public class CartSteps {
    private HomePage homePage;
    private ShopPage shopPage;
    private ProductPage productPage;
    private CartPage cartPage;

    @Step
    public void navigateToCart(){
    homePage.clickCartLink();}

    @Step
    public void addProductInCart(){
        homePage.clickShopLink();
        shopPage.clickProductLink();
        productPage.clickAddButton();
//        cartPage.clickCheckoutButton();
    }
    @Step
    public void verifyIfProductTitleIsDisplayed(String title){
        cartPage.verifyIfProductTitleIsDisplayed(title);
    }
    @Step
    public void verifyIfProductPriceIsDisplayed(String price){
        cartPage.verifyIfProductPriceIsDisplayed(price);
    }
}
