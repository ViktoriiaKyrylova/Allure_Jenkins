package pages;

import base.Test_Base;
import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;


public class IFramePage extends Test_Base {
    public IFramePage() {
        PageFactory.initElements(driver, this);
    }

    public void openIFrameLink() {
        element(MainPageLocators.iframe).click();
        changeTab();
    }

    public void switchToIFrame() {
        driver.switchTo().frame("frame");
    }

    public void workWithPageObjectModelPageCheckFindOutMore(){

        pageObjectModelPage.clickFindOutMoreButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "Welcome to webdriveruniversity.com");
        pageObjectModelPage.closeModalPopup();
    }

    public void workWithPageObjectModelCheckOurProductsSpecialOffers(){
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickSpecialOffers();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    public void workWithPageObjectModelCheckOurProductsCamera(){
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnCameraButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    public void workWithPageObjectModelCheckOurProductsNewLaptop(){
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnNewLaptopButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    public void workWithPageObjectModelCheckOurProductsUsedLaptop(){
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnUsedLaptopButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    public void workWithPageObjectModelCheckOurProductsGameConsole(){
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnGameConsoleButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    public void workWithPageObjectModelCheckOurProductsComponents(){
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnComponentsButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    public void workWithPageObjectModelCheckOurProductsDesktopSystems(){
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnDesktopSystemsButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }

    public void workWithPageObjectModelCheckOurProductsAudio(){
        pageObjectModelPage.openOurProductsPage();
        pageObjectModelPage.clickOnAudioButton();
        Assert.assertEquals(pageObjectModelPage.getPopupMessage(), "×\n" +
                "SPECIAL OFFER! - GET 30% OFF YOUR FIRST ORDER AT WEBDRIVERUNIVERSITY.COM");
        pageObjectModelPage.closeModalPopup();
    }
}
