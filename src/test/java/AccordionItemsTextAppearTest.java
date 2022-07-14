import base.Test_Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;


public class AccordionItemsTextAppearTest extends Test_Base {

    @Before
    public void beforeMethod() throws InterruptedException, AWTException {
        initialization();
        accordionItemsTextAppearPage.openAccordionItemsTextAppearLink();
    }

    @Test
    public void testManualTestingButtonClick() {

        accordionItemsTextAppearPage.manualTestingButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.manualTestingGetDescription().contains("Manual testing"));
    }

    @Test
    public void testCucumberButtonClick() {
        accordionItemsTextAppearPage.cucumberButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.cucumberGetDescription().contains("Cucumber (BDD)"));
    }

    @Test
    public void testAutomationTestingButtonClick() {
        accordionItemsTextAppearPage.automationTestingButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.automationTestingGetDescription().contains("Automation testing"));
    }

    @Test
    public void testKeepClickingButtonClick() {
        accordionItemsTextAppearPage.keepClickingButtonClick();
        WebElement loadingBox = driver.findElement(By.xpath("//*[@id='text-appear-box']"));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(loadingBox, "LOADING COMPLETE."));
        accordionItemsTextAppearPage.keepClickingButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.keepClickingGetDescription().contains("This text has appeared after 5 seconds!"));
    }


    @After
    public void afterMethod() {
        disable();
    }
}
