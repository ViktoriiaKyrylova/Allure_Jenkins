import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;

public class LoginPortalTest extends Test_Base {

    @Before
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

    @After
    public void afterMethod() {
        disable();
    }
}
