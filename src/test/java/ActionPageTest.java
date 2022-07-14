import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class ActionPageTest extends Test_Base {

    @Before
    public void beforeMethod() throws InterruptedException, AWTException {
        initialization();
        actionPage.openActionLink();
    }

    @Test
    public void dragAndDrop() {

        actionPage.moveItem();
        Assert.assertEquals(actionPage.getPlaceColour(), "rgba(244, 89, 80, 1)");
    }

    @Test
    public void doubleClick() {

        actionPage.doubleClick();
        Assert.assertEquals(actionPage.getButtonColor(), "rgba(147, 203, 90, 1)");
    }

    @Test
    public void hoverButtons() {

        actionPage.hoverFirstButton();
        actionPage.hoverSecondButton();
        actionPage.hoverThirdButton();
    }

    @Test
    public void clickAndHold() {

        actionPage.clickAndHold();
    }

    @After
    public void afterMethod() {
        disable();
    }
}
