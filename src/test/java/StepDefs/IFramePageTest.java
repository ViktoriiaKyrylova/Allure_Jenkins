package StepDefs;

import base.Test_Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class IFramePageTest extends Test_Base {


    @BeforeMethod
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

    @AfterMethod
    public void afterMethod() {
        disable();
    }
}
