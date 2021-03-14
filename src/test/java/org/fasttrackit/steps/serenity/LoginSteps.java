package org.fasttrackit.steps.serenity;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.junit.Assert;

public class LoginSteps{

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void navigateToLogin(){
        homePage.open();
        homePage.clickMyAccountLink();

    }
    @Step
    public void setEmail(String email){
        loginPage.setEmailField(email);
    }
    @Step
    public void setPassword(String password){
        loginPage.setPasswordField(password);
    }
    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }
    @Step
    public void login(String username, String password){
        navigateToLogin();
        setEmail(username);
        setPassword(password);
        clickLoginButton();
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
    public void verifyIfPasswordErrorIsDisplayed(String text) {
        loginPage.verifyIfPasswordErrorMessageIsDisplayed(text);{
        }
    }}
