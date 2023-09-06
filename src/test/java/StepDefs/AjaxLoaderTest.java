package StepDefs;

import base.Test_Base;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.awt.*;

public class AjaxLoaderTest extends Test_Base {


        @BeforeMethod
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
        @AfterMethod
        public void afterMethod() {
            disable();
        }
}
