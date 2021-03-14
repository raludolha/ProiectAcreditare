package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.ShopSteps;
import org.junit.Test;
import utils.BaseTest;
import utils.EnvironmentConstants;

import javax.swing.*;

public class ShopTest extends BaseTest {
    @Steps
    private ShopSteps shopSteps;
    @Steps
    private LoginSteps loginSteps;


    @Test
    public void isShopPageDisplayingProducts(){
        loginSteps.login(EnvironmentConstants.USER_NAME,EnvironmentConstants.USER_PASSWORD);
        shopSteps.navigateToShop();
        shopSteps.verifyAreProductsDisplayed("Beanie");

    }


}
