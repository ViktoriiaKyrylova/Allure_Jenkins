import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;

public class PopupAlertPageTest extends Test_Base {

    @Before
    public void beforeMethod() throws InterruptedException, AWTException {
        initialization();
        popupAlertPage.openPopupAlertLink();

    }

    @Test
    public void testJavaScriptAlertClickMeButton() {
        popupAlertPage.clickJavaScriptAlertClickMeButton();
        getAlert();
        Assert.assertEquals(popupAlertPage.getJavaScriptAlert(), "I am an alert box!");
        popupAlertPage.closeJavaScriptAlert();

    }

    @Test
    public void testModalPopupClickMeButton() {
        popupAlertPage.clickModalPopupClickMeButton();
        Assert.assertEquals(popupAlertPage.getModalPopup(), "×\n" +
                "It’s that Easy!! Well I think it is.....\n" +
                "We can inject and use JavaScript code if all else fails! Remember always try to use WebDriver Library method(s) first such as WebElement.click(). (The Selenium development team have spent allot of time developing WebDriver functions etc).\n" +
                "Close");
        popupAlertPage.closeModalPopup();
    }

    @Test
    public void testAjaxLoaderClickMeButton(){

        popupAlertPage.clickLinkToAjaxLoaderButton();
        popupAlertPage.workWithAjaxLoaderPage();
    }

    @Test
    public void testJavaScriptConfirmBox(){

        popupAlertPage.clickJavaScriptConfirmBoxButton();
        getAlert();
        popupAlertPage.javaScriptConfirmBoxAccept();
        Assert.assertEquals(popupAlertPage.getMessageAfterConfirmBoxButtonClick(), "You pressed OK!");
    }

    @After
    public void afterMethod() {
        disable();
    }
}
