package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;

    @Step
    public void navigateToRegister(){
        homePage.open();
        homePage.clickMyAccountLink();

    }
    @Step
    public void setEmail(String email){
        registerPage.setEmailField(email);
    }
    @Step
    public void setPassword(String password){
        registerPage.setPasswordField(password);
    }
    @Step
    public void clickRegisterButton(){ registerPage.clickRegisterButton();
    }
    @Step
    public void register(String username, String password){
        navigateToRegister();
        setEmail(username);
        setPassword(password);
        clickRegisterButton();
    }
    @Step
    public void verifyAccountMessage(String userName){
        accountPage.verifyHelloMessage(userName);
    }
    @Step
    public void verifyIfMessageIsDisplayed(){
        Assert.assertTrue(accountPage.returnIfHelloMsgIsDisplayed());
    }
    @Step
    public void verifyIfPasswordErrorMessageIsDisplayed(String text){
        registerPage.verifyErrorMessage(text);
    }
    @Step
    public void verifyIfEmailErrorIsDisplayed(String text){
        registerPage.verifyEmailErrorMessage(text);
    }
}
