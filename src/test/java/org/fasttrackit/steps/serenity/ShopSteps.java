package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ShopPage;
import org.junit.Assert;

public class ShopSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ShopPage shopPage;

    @Step
    public void navigateToShop(){
        homePage.open();
        homePage.clickShopLink();

    }

    @Step
    public void verifyAreProductsDisplayed(String text){
        shopPage.areProductsDisplayed(text);



    }
}



