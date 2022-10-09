package com.stv.factory.factorypages;

import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DomikPage extends FactoryPage{
    @FindBy(id = "message")
    private WebElement msg;
    public void clickTextArea(){
        msg.click();
        msg.sendKeys("Some Sample Text Here");

        Actions action = new Actions(Driver.getDriver());
        action.dragAndDropBy(msg,0,200);
        action.moveToElement(msg, msg.getSize().width, msg.getSize().height); //moves to bottom right corner
        action.clickAndHold();
        action.moveByOffset(msg.getSize().width+100, msg.getSize().height);
        action.release();
        action.perform();
    }
}
