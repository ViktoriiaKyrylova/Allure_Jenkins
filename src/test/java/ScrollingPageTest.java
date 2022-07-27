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
    public void testScrollToFirstField() throws InterruptedException {
        scrollingPage.scrollToFirstField();
        Assert.assertEquals(scrollingPage.getColourOfField(), "background: rgb(26, 255, 26); font-size: 24px; text-align: center;");
    }

    @Test
    public void testScrollToLeftScrollCounter() throws InterruptedException {
        scrollingPage.scrollToLeftScrollCounter();
        Assert.assertEquals(scrollingPage.getAmountForEntriesToLeftScrollCounter(), "1 Entries");
    }

    @Test
    public void testScrollToRightScrollCounter() throws InterruptedException {
        scrollingPage.scrollToRightScrollCounter();
        Assert.assertEquals(scrollingPage.getAmountForEntriesToRightScrollCounter(), "1 Entries");
    }

    @Test
    public void testScrollToCoordinatesField() throws InterruptedException {
        scrollingPage.scrollToCoordinatesField();
       Assert.assertEquals(scrollingPage.getCoordinatesFromField(), "X: 488Y: 916");
    }

    @After
    public void afterMethod() {
        disable();
    }
}
