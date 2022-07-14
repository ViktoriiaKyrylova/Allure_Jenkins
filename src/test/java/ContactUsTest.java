import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.awt.*;

public class ContactUsTest extends Test_Base {

    @Before
    public void beforeMethod() throws AWTException, InterruptedException {
        initialization();
        contactUsPage.clickOnContactUsLink();
    }

    @Test
    public void testWithResetButton() {
        contactUsPage.insertFirstName();
        contactUsPage.insertLastName();
        contactUsPage.insertEmail();
        contactUsPage.insertMessage();
        contactUsPage.clickResetButton();
        Assert.assertTrue(contactUsPage.verifyFieldsIsEmpty().isEmpty());
    }

    @Test
    public void testWithSubmitButton() {
        contactUsPage.insertFirstName();
        contactUsPage.insertLastName();
        contactUsPage.insertEmail();
        contactUsPage.insertMessage();
        contactUsPage.clickSubmitButton();
        Assert.assertEquals(contactUsPage.getSuccessText(), "Thank You for your Message!");
    }

    @After
    public void afterMethod() {
        disable();
    }
}
