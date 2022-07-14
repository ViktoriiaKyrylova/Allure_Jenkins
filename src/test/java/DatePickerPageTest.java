import base.Test_Base;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class DatePickerPageTest extends Test_Base {

    @Before
    public void beforeMethod() throws InterruptedException, AWTException {
        initialization();
        datePickerPage.openDatePickerPageLink();
    }

    @Test
    public void testCheckShowedDateMatchesCurrentDate() {
        Assert.assertEquals(datePickerPage.getShowedDate(), datePickerPage.getCurrentDate());
    }

    @Test
    public void testNextMonthCanBeSelected() {
        datePickerPage.openCalendar();
        String currentMonth = datePickerPage.getShowedMonth();
        datePickerPage.clickNextMonthButton();
        String changedMonth = datePickerPage.getShowedMonth();
        Assert.assertNotEquals(changedMonth, currentMonth);
    }

    @Test
    public void testPreviousMonthCanBeSelected() {
        datePickerPage.openCalendar();
        String currentMonth = datePickerPage.getShowedMonth();
        datePickerPage.clickPreviousMonthButton();
        String changedMonth = datePickerPage.getShowedMonth();
        Assert.assertNotEquals(changedMonth, currentMonth);
    }

    @Test
    public void testNextYearCanBeSelected() {
        datePickerPage.openCalendar();
        datePickerPage.clickMonthButton();
        String currentYear = datePickerPage.getShowedYear();
        datePickerPage.clickNextYearButton();
        String changedYear = datePickerPage.getShowedYear();
        Assert.assertNotEquals(currentYear, changedYear);
    }

    @Test
    public void testPreviousYearCanBeSelected() {
        datePickerPage.openCalendar();
        datePickerPage.clickMonthButton();
        String currentYear = datePickerPage.getShowedYear();
        datePickerPage.clickPreviousYearButton();
        String changedYear = datePickerPage.getShowedYear();
        Assert.assertNotEquals(currentYear, changedYear);
    }

    @Test
    public void testNextYearsCanBeSelected() {
        datePickerPage.openCalendar();
        datePickerPage.clickMonthButton();
        datePickerPage.clickYearButton();
        String currentYears = datePickerPage.getShowedYears();
        datePickerPage.clickNextYearsButton();
        String changedYears = datePickerPage.getShowedYears();
        Assert.assertNotEquals(currentYears, changedYears);
    }

    @Test
    public void testPreviousYearsCanBeSelected() {
        datePickerPage.openCalendar();
        datePickerPage.clickMonthButton();
        datePickerPage.clickYearButton();
        String currentYears = datePickerPage.getShowedYears();
        datePickerPage.clickPreviousYearsButton();
        String changedYears = datePickerPage.getShowedYears();
        Assert.assertNotEquals(currentYears, changedYears);
    }

    @Test
    public void testDateIsChanged() {

        datePickerPage.openCalendar();
        datePickerPage.selectNewDate();
        Assert.assertNotEquals(datePickerPage.getShowedDate(), datePickerPage.getCurrentDate());
    }

    @After
    public void afterMethod() {
        disable();
    }
}
