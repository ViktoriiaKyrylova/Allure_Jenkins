package StepDefs;

import base.Test_Base;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.awt.*;

public class ContactUsTest extends Test_Base {

    @BeforeMethod
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

    @AfterMethod
    public void afterMethod() {
        disable();
    }
}
