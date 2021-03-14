package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


    @DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
    public class RegisterPage extends PageObject {

        @FindBy(id = "reg_email")
        private WebElementFacade emailField;

        @FindBy(id = "reg_password")
        private WebElementFacade passwordField;

        @FindBy(css = "[name=register]")
        private WebElementFacade registerButton;
        @FindBy (css = ".woocommerce-error li")
        private WebElementFacade errorPasswordMessage;
        @FindBy (css = ".woocommerce-error")
        private WebElementFacade errorEmailMessage;

        public void setEmailField(String userName){
            typeInto(emailField,userName);
        }
        public void setPasswordField(String password){ typeInto(passwordField,password);
        }
        public void clickRegisterButton(){
            clickOn(registerButton);
        }
        public void verifyErrorMessage(String text){
            errorPasswordMessage.shouldContainText(text);
        }
        public void verifyEmailErrorMessage(String text){
            errorEmailMessage.shouldContainText(text);
        }

    }

