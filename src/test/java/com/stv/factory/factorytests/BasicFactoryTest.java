package com.stv.factory.factorytests;

import com.stv.framework.core.drivers.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;
import static com.stv.framework.core.lib.WigglePageURLs.START_URL_USA;

public class BasicFactoryTest {
    public static WebDriver getDriver() {
        return Driver.getDriver();
    }
   public void setDriver(WebDriver driver){
        Driver.setDriver(driver);
    }

    @BeforeClass(description = "Start browser")
    public void setUp() {
        WebDriver driver = getDriver();
        driver.get(START_URL_USA);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() throws Exception {
       getDriver().quit();
    }


}
