package StepDefs;

import base.Test_Base;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.*;

public class FileUploadPageTest extends Test_Base {

        @BeforeMethod
        public void beforeMethod() throws InterruptedException, AWTException {
            initialization();
            fileUploadPage.openFileUploadPageLink();
        }
        @Test
        public void testName() throws InterruptedException {
            fileUploadPage.selectFile();
            Assert.assertEquals(fileUploadPage.verifyChosenFile(), "C:\\fakepath\\file");
            fileUploadPage.uploadFile();
            Assert.assertEquals(fileUploadPage.verifyFileIsUploaded(), "");
        }
        @AfterMethod
        public void afterMethod() {
            disable();
        }
}
