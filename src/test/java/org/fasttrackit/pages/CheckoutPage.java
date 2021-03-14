package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {
    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNameField;
    @FindBy(id = "billing_last_name")
    private WebElementFacade lastNameField;
    @FindBy(id = "billing_address_1")
    private WebElementFacade adressField;
    @FindBy(id = "billing_city")
    private WebElementFacade cityField;
    @FindBy(id = "billing_postcode")
    private WebElementFacade postcodeField;
    @FindBy (id = "billing_phone")
    private WebElementFacade phoneField;
    @FindBy (id = "billing_email")
    private WebElementFacade emailField;
    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;
    @FindBy(css = ".woocommerce-thankyou-order-received")
    private WebElementFacade successMessage;


    public void setFirstNameField(String firstName){ typeInto(firstNameField, firstName); }
    public void setLastNameField(String lastname){
        typeInto(lastNameField,lastname);
    }
    public void setAdressField(String adressfield){
        typeInto(adressField, adressfield);
    }
    public void setCityField(String cityfield){
        typeInto(cityField, cityfield);
    }
    public void setPostcodeField(String postcodefield){
        typeInto(postcodeField, postcodefield);
    }
    public void setPhoneField(String phonefield){
        typeInto(phoneField, phonefield);
    }
    public void setEmailField(String emailfield){
        typeInto(emailField, emailfield);
    }
    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }
    public void verifySuccessMessage(){
        successMessage.shouldContainText("Thank you. Your order has been received.");

    }
    }

