import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;

public class FileUploadPageTest extends Test_Base {

        @Before
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
        @After
        public void afterMethod() {
            disable();
        }
}
