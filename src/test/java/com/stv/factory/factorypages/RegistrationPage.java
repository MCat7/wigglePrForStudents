package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends FactoryPage {
    @FindBy(id = "divRegisterFirstName")
    private WebElement registrationContainer;

    public boolean isRegistrationContainerDisplayed(){
        return registrationContainer.isDisplayed();
    }
}
