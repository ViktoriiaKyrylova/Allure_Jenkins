import base.Test_Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.awt.*;

public class AutocompletePageTest extends Test_Base {

    @Before
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

    @After
    public void afterMethod() {
        disable();
    }
}
