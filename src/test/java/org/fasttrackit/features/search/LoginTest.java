package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import utils.BaseTest;
import utils.EnvironmentConstants;


public class LoginTest extends BaseTest {

    @Steps
    public LoginSteps loginSteps;

    @Test
    public void validCredentialsLoginTest() {
        loginSteps.navigateToLogin();
        loginSteps.setEmail(EnvironmentConstants.USER_NAME);
        loginSteps.setPassword(EnvironmentConstants.USER_PASSWORD);
        loginSteps.clickLoginButton();
        loginSteps.verifyAccountMessage("ralutest");

    }

    @Test
    public void verifyLoginWithoutPasswordTest(){
        loginSteps.navigateToLogin();
        loginSteps.setEmail(EnvironmentConstants.USER_NAME);
        loginSteps.setPassword("");
        loginSteps.clickLoginButton();
        loginSteps.verifyIfPasswordErrorIsDisplayed("ERROR: The password field is empty.");


    }

}
