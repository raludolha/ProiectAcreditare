package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = "[name=login]")
    private WebElementFacade loginButton;
    @FindBy (css = ".woocommerce-error")
    private WebElementFacade passwordError;


    public void setEmailField(String userName){
        typeInto(emailField,userName);
    }
    public void setPasswordField(String password){ typeInto(passwordField,password);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }
    public void verifyIfPasswordErrorMessageIsDisplayed(String text){
        passwordError.shouldContainText(text);
    }

}
