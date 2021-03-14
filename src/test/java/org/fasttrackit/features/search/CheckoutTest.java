package org.fasttrackit.features.search;

import io.cucumber.java.StepDefinitionAnnotation;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import utils.BaseTest;
import utils.EnvironmentConstants;

public class CheckoutTest extends BaseTest {
    @Steps
    private CheckoutSteps checkoutSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
        public void succesfullOrderTest(){
        loginSteps.login(EnvironmentConstants.USER_NAME, EnvironmentConstants.USER_PASSWORD);
        cartSteps.addProductInCart();
        checkoutSteps.placeOrder("Dolha","Uca", "Romania", "baba", "Cluj", "34567","13344555", "rralu@yahoo.com");
        checkoutSteps.verifySuccessMessage();
        }
    }

