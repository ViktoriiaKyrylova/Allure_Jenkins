import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class PageObjectModelPageTest extends Test_Base {

    @Before
    public void beforeMethod() throws InterruptedException, AWTException {
        initialization();
        pageObjectModelPage.openPageObjectModelLink();
    }

    @Test
    public void checkCarouselArrows() {
        pageObjectModelPage.clickCarouselControlLeftArrow();
        pageObjectModelPage.clickCarouselControlRightArrow();
    }

    @Test
    public void checkFindOutMore() {

        pageObjectModelPage.clickFindOutMoreButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "Welcome to webdriveruniversity.com");
        pageObjectModelPage.closeModalPopup();
    }

    @Test
    public void checkOurProductsSpecialOffers() {
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickSpecialOffers();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    @Test
    public void checkOurProductsCamera() {
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnCameraButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    @Test
    public void checkOurProductsNewLaptop() {
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnNewLaptopButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    @Test
    public void checkOurProductsUsedLaptop() {
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnUsedLaptopButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    @Test
    public void checkOurProductsGameConsole() {
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnGameConsoleButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    @Test
    public void checkOurProductsComponents() {
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnComponentsButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    @Test
    public void checkOurProductsDesktopSystems() {
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnDesktopSystemsButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    @Test
    public void checkOurProductsAudio() {
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnAudioButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    @Test
    public void testContactUsButtonSubmitVersion() {

        pageObjectModelPage.openContactUsPage();
        pageObjectModelPage.workWithContactUsPageSubmitVersion();
        Assert.assertEquals(contactUsPage.getSuccessText(), "Thank You for your Message!");
    }

    @Test
    public void testContactUsButtonResetVersion() {

        pageObjectModelPage.openContactUsPage();
        pageObjectModelPage.workWithContactUsPageResetVersion();
        Assert.assertTrue(contactUsPage.verifyFieldsIsEmpty().isEmpty());
    }

    @After
    public void afterMethod() {
        disable();
    }
}
