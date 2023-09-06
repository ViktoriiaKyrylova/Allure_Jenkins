package StepDefs;

import base.Test_Base;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.*;

public class LoginPortalTest extends Test_Base {

    @BeforeMethod
    public void beforeMethode() throws AWTException, InterruptedException {
        initialization();
        loginPortalPage.clickOnLoginPortalLink();
    }

    @Test
    public void loginTest() {

        loginPortalPage.insertUsername();
        loginPortalPage.insertPassword();
        loginPortalPage.clickLoginButton();
        getAlert();
        Assert.assertEquals(loginPortalPage.checkAlertMessage(), "validation failed");
        loginPortalPage.acceptAlert();
    }

    @AfterMethod
    public void afterMethod() {
        disable();
    }
}
