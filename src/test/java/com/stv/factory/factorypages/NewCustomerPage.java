package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPage extends FactoryPage {
    @FindBy(id = "customer-contact-pannel")
    private WebElement loginContainer;

    public boolean isNewCustomerContainerDisplayed(){
        return loginContainer.isDisplayed();
    }
}
