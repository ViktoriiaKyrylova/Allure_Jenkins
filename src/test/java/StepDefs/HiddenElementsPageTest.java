package StepDefs;

import base.Test_Base;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.*;

public class HiddenElementsPageTest extends Test_Base {

    @BeforeMethod
    public void beforeMethod() throws InterruptedException, AWTException {

        initialization();
        hiddenElementsPage.openHiddenElementPageLink();
    }

    @Test
    public void testNotDisplayedButton() {

        hiddenElementsPage.tryToReachNotDisplayedButton();
        hiddenElementsPage.clickNotDisplayedButton();
        Assert.assertEquals(hiddenElementsPage.getNotDisplayedButtonPopup(), "×\n" +
                "Congratulations!");
        hiddenElementsPage.closeNotDisplayedButtonPopup();
    }

    @Test
    public void testVisibilityHiddenButton() {

        hiddenElementsPage.tryToReachVisibilityHiddenButton();
        hiddenElementsPage.clickVisibilityHiddenButton();
        Assert.assertEquals(hiddenElementsPage.getVisibilityHiddenButtonPopup(), "×\n" +
                "It’s that Easy!! Well I think it is.....");
        hiddenElementsPage.closeVisibilityHiddenButtonPopup();
    }

    @Test
    public void testZeroOpacityButton() {

        hiddenElementsPage.tryToReachZeroOpacityButton();
        hiddenElementsPage.getZeroOpacityButtonPopup();
        Assert.assertEquals(hiddenElementsPage.getZeroOpacityButtonPopup(), "×\n" +
                "Well done! the Action Move & Click can become very useful!");
        hiddenElementsPage.closeZeroOpacityButtonPopup();
    }

    @AfterMethod
    public void afterMethod() {

        disable();
    }
}
