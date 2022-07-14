import base.Test_Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class IFramePageTest extends Test_Base {


    @Before
    public void beforeMethod() throws InterruptedException, AWTException {
        initialization();
        iFramePage.openIFrameLink();
        iFramePage.switchToIFrame();
    }

    @Test
    public void testPageObjectModelPage() {
        iFramePage.workWithPageObjectModelPageCheckFindOutMore();
        iFramePage.workWithPageObjectModelCheckOurProductsSpecialOffers();
        iFramePage.workWithPageObjectModelCheckOurProductsCamera();
        iFramePage.workWithPageObjectModelCheckOurProductsNewLaptop();
        iFramePage.workWithPageObjectModelCheckOurProductsUsedLaptop();
        iFramePage.workWithPageObjectModelCheckOurProductsGameConsole();
        iFramePage.workWithPageObjectModelCheckOurProductsComponents();
        iFramePage.workWithPageObjectModelCheckOurProductsDesktopSystems();
        iFramePage.workWithPageObjectModelCheckOurProductsAudio();
    }

    @After
    public void afterMethod() {
        disable();
    }
}
