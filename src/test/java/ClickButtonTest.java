import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class ClickButtonTest extends Test_Base {

    @Before
    public void beforeMethod() throws AWTException, InterruptedException {
        initialization();
        clickButtonPage.openButtonClickLink();
    }

    @Test
    public void clickButtonClick() {
        clickButtonPage.webElementButtonClick();
        Assert.assertEquals(clickButtonPage.getWebElementButtonClickPopup(), "×\n" +
                "Congratulations!");
        clickButtonPage.closeWebElementButtonClickPopup();
    }

    @Test
    public void clickJavascriptButtonClick() {
        clickButtonPage.javascriptButtonClick();
        Assert.assertEquals(clickButtonPage.getJavascriptButtonClickPopup(), "×\n" +
                "It’s that Easy!! Well I think it is.....");
        clickButtonPage.closeJavascriptButtonClickPopup();
    }

    @Test
    public void clickActionButtonClick() {
        clickButtonPage.actionMoveEndClick();
        Assert.assertEquals(clickButtonPage.getActionButtonClickPopup(), "×\n" +
                "Well done! the Action Move & Click can become very useful!");
        clickButtonPage.closeActionButtonClickPopup();
    }

    @After
    public void afterMethod() {
        disable();
    }
}
