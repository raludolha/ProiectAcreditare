package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.ShopPage;

public class ProductSteps {
    private HomePage homePage;
    private ShopPage shopPage;
    private ProductPage productPage;

    @Step
    public void navigateToProduct(){
        homePage.clickShopLink();
        shopPage.clickProductLink();
    }
    @Step
    public void verifyProductTitle(String title){
        productPage.verifyProductTitle(title);

    }
    @Step
    public void verifyProductPrice(String price){
        productPage.verifyProductPrice(price);
    }


}
