package StepDefs;

import base.Test_Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.awt.*;

public class AutocompletePageTest extends Test_Base {

    @BeforeMethod
    public void beforeMethod() throws InterruptedException, AWTException {
        initialization();
        autocompletePage.openAutocompletePage();
    }

    @Test
    public void checkSearchField(){
        autocompletePage.enterSymbol();
        autocompletePage.verifyAllElementsAfterEntering();
        autocompletePage.selectItemFromList();
    }

    @AfterMethod
    public void afterMethod() {
        disable();
    }
}
