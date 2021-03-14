package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


    public class ProductPage extends PageObject {
        @FindBy(css = ".product_title")
        private WebElementFacade productTitle;
        @FindBy(css = "p.price")
        private WebElementFacade productPrice;
        @FindBy(css = ".single_add_to_cart_button")
        private WebElementFacade productAddButton;

        public void verifyProductTitle(String title){
            productTitle.shouldContainText(title);}
            public void verifyProductPrice(String price){
            productPrice.shouldContainText((price));
            }
            public void clickAddButton(){
            clickOn(productAddButton);
            }

        }
