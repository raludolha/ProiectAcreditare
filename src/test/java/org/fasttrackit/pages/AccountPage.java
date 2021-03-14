package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class AccountPage extends PageObject {

    @FindBy(css = ".woocommerce-MyAccount-content")
    private WebElementFacade helloMsg;

    public void verifyHelloMessage(String userName){ helloMsg.shouldContainText(userName);
    }
    public boolean returnIfHelloMsgIsDisplayed(){
        return helloMsg.isDisplayed();
    }
}
