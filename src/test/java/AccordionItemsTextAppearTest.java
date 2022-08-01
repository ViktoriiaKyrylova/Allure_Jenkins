import base.Test_Base;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.awt.*;
import java.io.ByteArrayInputStream;


public class AccordionItemsTextAppearTest extends Test_Base {

    @Before
    public void beforeMethod() throws InterruptedException, AWTException {
        initialization();
        accordionItemsTextAppearPage.openAccordionItemsTextAppearLink();
        Allure.addAttachment("Result", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }
    @DisplayName("Manual testing")
    @Description("Must show text about manual testing")
    @Test
    public void testManualTestingButtonClick() {

        accordionItemsTextAppearPage.manualTestingButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.manualTestingGetDescription().contains("Manual testing"));
        Allure.addAttachment("Result", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Test
    public void testCucumberButtonClick() {
        accordionItemsTextAppearPage.cucumberButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.cucumberGetDescription().contains("Cucumber (BDD)"));
        Allure.addAttachment("Result", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Test
    public void testAutomationTestingButtonClick() {
        accordionItemsTextAppearPage.automationTestingButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.automationTestingGetDescription().contains("Automation testing"));
        Allure.addAttachment("Result", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Test
    public void testKeepClickingButtonClick() {
        accordionItemsTextAppearPage.keepClickingButtonClick();
        WebElement loadingBox = driver.findElement(By.xpath("//*[@id='text-appear-box']"));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(loadingBox, "LOADING COMPLETE."));
        accordionItemsTextAppearPage.keepClickingButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.keepClickingGetDescription().contains("This text has appeared after 5 seconds!"));
        Allure.addAttachment("Result", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    @After
    public void afterMethod() {
        disable();
    }
}
