package com.stv.factory.factorytests.domik;

import com.stv.factory.factorypages.DomikPage;
import org.testng.annotations.Test;

public class MainDomikModTest extends DomikModTest{
    DomikPage domikPage = new DomikPage();
    @Test(description = "")
    public void assertAccountIconIsDisplayed() {
        domikPage.clickTextArea();
     //   Assert.assertEquals(actualResult, true, "Account link isn't visible");

    }
}
