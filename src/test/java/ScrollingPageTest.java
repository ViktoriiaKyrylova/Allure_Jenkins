import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class ScrollingPageTest extends Test_Base {

    @Before
    public void beforeMethod() throws InterruptedException, AWTException {
        initialization();
        scrollingPage.openScrollingPageLink();
    }

    @Test
    public void testScrollToFirstField() {
        scrollingPage.scrollToFirstField();
        Assert.assertEquals(scrollingPage.getColourOfField(), "background: rgb(26, 255, 26); font-size: 24px; text-align: center;");
    }

    @Test
    public void testScrollToLeftScrollCounter() {
        scrollingPage.scrollToLeftScrollCounter();
        Assert.assertEquals(scrollingPage.getAmountForEntriesToLeftScrollCounter(), "1 Entries");
    }

    @Test
    public void testScrollToRightScrollCounter() {
        scrollingPage.scrollToRightScrollCounter();
        Assert.assertEquals(scrollingPage.getAmountForEntriesToRightScrollCounter(), "1 Entries");
    }

    @Test
    public void testScrollToCoordinatesField() {
        scrollingPage.scrollToCoordinatesField();
       Assert.assertEquals(scrollingPage.getCoordinatesFromField(), "X: 744Y: 816");
    }

    @After
    public void afterMethod() {
        disable();
    }
}
