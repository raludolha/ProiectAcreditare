package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.ProductSteps;
import org.jsoup.Connection;
import org.junit.Test;
import utils.BaseTest;
import utils.EnvironmentConstants;

public class ProductTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private ProductSteps productSteps;

    @Test
    public void verifiyProductTitleAndPrice(){
        loginSteps.login(EnvironmentConstants.USER_NAME, EnvironmentConstants.USER_PASSWORD);
        productSteps.navigateToProduct();
        productSteps.verifyProductPrice("20,00 lei 18,00 lei");
        productSteps.verifyProductTitle("BEANIE");
    }



}
