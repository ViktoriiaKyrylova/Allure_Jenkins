import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;

public class HiddenElementsPageTest extends Test_Base {

    @Before
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

    @After
    public void afterMethod() {

        disable();
    }
}
