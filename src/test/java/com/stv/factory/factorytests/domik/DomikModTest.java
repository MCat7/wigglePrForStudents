package com.stv.factory.factorytests.domik;

import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;



public class DomikModTest {
    final String START_URL = "https://www.domikmod.by/shop/cart/";
    public static WebDriver getDriver() {
        return Driver.getDriver();
    }

    @BeforeClass(description = "Start browser")
    public void setUp() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() throws Exception {
       // getDriver().quit();
    }
}
