package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import utils.BaseTest;
import utils.EnvironmentConstants;

public class CartTest extends BaseTest{
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;

    @Test
    public void isProductInCart(){
        loginSteps.login(EnvironmentConstants.USER_NAME, EnvironmentConstants.USER_PASSWORD);
        cartSteps.addProductInCart();
        cartSteps.verifyIfProductPriceIsDisplayed("18,00 lei");
        cartSteps.verifyIfProductTitleIsDisplayed("Beanie");
    }
}
