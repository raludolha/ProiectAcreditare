package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Test;
import utils.BaseTest;
import utils.EnvironmentConstants;

public class RegisterTest  extends BaseTest {
    @Steps
    public RegisterSteps registerSteps;

    @Test
    public void validCredentialsRegisterTest() {
        registerSteps.navigateToRegister();
        registerSteps.setEmail(EnvironmentConstants.USER_NAME);
        registerSteps.setPassword(EnvironmentConstants.USER_PASSWORD);
        registerSteps.clickRegisterButton();
        registerSteps.verifyAccountMessage("ralutest123");
    }


    @Test
    public void registerWithoutPasswordTest(){
        registerSteps.navigateToRegister();
        registerSteps.setEmail("ra@yahoo.com");
        registerSteps.setPassword("");
        registerSteps.clickRegisterButton();
        registerSteps.verifyIfPasswordErrorMessageIsDisplayed("Error: Please enter an account password.");
    }

    @Test
    public void registerWithoutEmailTest(){
        registerSteps.navigateToRegister();
        registerSteps.setEmail("");
        registerSteps.setPassword("213123456Youtrf!!");
        registerSteps.clickRegisterButton();
        registerSteps.verifyIfEmailErrorIsDisplayed("Error: Please provide a valid email address.");
    }
}