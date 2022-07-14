import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.awt.*;

public class AjaxLoaderTest extends Test_Base {


        @Before
        public void beforeMethod() throws InterruptedException, AWTException {
            initialization();
            ajaxLoaderPage.openAjaxLoaderLink();
        }
        @Test
        public void witButtonToBeClickable(){

            ajaxLoaderPage.waitForClickMeButton();
            ajaxLoaderPage.clickMeButtonClick();
            ajaxLoaderPage.getPopupMessage();
            Assert.assertEquals(ajaxLoaderPage.getPopupMessage(), "Well Done For Waiting....!!!");
            ajaxLoaderPage.closePopupMessage();
        }
        @After
        public void afterMethod() {
            disable();
        }
}
