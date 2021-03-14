package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;

public class CheckoutSteps {
    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private CartPage cartPage;

    @Step
    public void setFirstName(String firstName){ checkoutPage.setFirstNameField(firstName); }
    @Step
    public void setLastName(String lastName){
        checkoutPage.setLastNameField(lastName);
    }
    @Step
    public void setadress(String adress){
        checkoutPage.setAdressField(adress);
    }
    @Step
    public void setcity(String city){
        checkoutPage.setCityField(city);
    }
    @Step
    public void setpostcode(String postcode){
        checkoutPage.setPostcodeField(postcode);
    }
    @Step
    public void setphone(String phone){
        checkoutPage.setPhoneField(phone);
    }
    @Step
    public void setemail(String email){
        checkoutPage.setEmailField(email);
    }
    @Step
    public void clickPlaceOrderButton(){
        checkoutPage.clickPlaceOrderButton();
    }
    @Step
    public void clickCheckoutButton(){
        cartPage.clickCheckoutButton();
    }
    @Step
    public void navigateToCheckout(){
        homePage.clickCheckoutLink();
    }

    @Step
    public void placeOrder(String firstName, String lastName, String country, String adress, String city, String postcode, String phone, String email ){
        navigateToCheckout();
        setFirstName(firstName);
        setLastName(lastName);
        setadress(adress);
        setcity(city);
        setpostcode(postcode);
        setphone(phone);
        setemail(email);
        clickPlaceOrderButton();


    }
    @Step
    public void verifySuccessMessage(){
        checkoutPage.verifySuccessMessage();
    }

}
