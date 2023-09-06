package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Properties;
import java.util.Set;

public class Test_Base {
    public static WebDriver driver;
    public static Properties prop;
    public static Actions action;
    public static Robot robot;
    public static WebDriverWait webDriverWait;
    public static JavascriptExecutor js;
    public static LocalDate date;
    public static Alert alert;

    protected static ContactUsPage contactUsPage;
    protected static LoginPortalPage loginPortalPage;
    protected static ClickButtonPage clickButtonPage;
    protected static ToDoListPage toDoListPage;
    protected static AccordionItemsTextAppearPage accordionItemsTextAppearPage;
    protected static DropdownMenuCheckboxRadioButtonPage dropdownMenuCheckboxRadioButtonPage;
    protected static AjaxLoaderPage ajaxLoaderPage;
    protected static ActionPage actionPage;
    protected static PopupAlertPage popupAlertPage;
    protected static HiddenElementsPage hiddenElementsPage;
    protected static PageObjectModelPage pageObjectModelPage;
    protected static IFramePage iFramePage;
    protected static ScrollingPage scrollingPage;
    protected static FileUploadPage fileUploadPage;
    protected static DatePickerPage datePickerPage;
    protected static AutocompletePage autocompletePage;

    public Test_Base() {

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") +
                    "/src/main/java/config/config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() throws AWTException, InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        action = new Actions(driver);
        robot = new Robot();
        date = LocalDate.now();
        js = (JavascriptExecutor) driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(1600, 1200));
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        initObjects();
    }

    private static void initObjects() {

        contactUsPage = new ContactUsPage();
        loginPortalPage = new LoginPortalPage();
        clickButtonPage = new ClickButtonPage();
        toDoListPage = new ToDoListPage();
        accordionItemsTextAppearPage = new AccordionItemsTextAppearPage();
        dropdownMenuCheckboxRadioButtonPage = new DropdownMenuCheckboxRadioButtonPage();
        ajaxLoaderPage = new AjaxLoaderPage();
        actionPage = new ActionPage();
        popupAlertPage = new PopupAlertPage();
        hiddenElementsPage = new HiddenElementsPage();
        pageObjectModelPage = new PageObjectModelPage();
        iFramePage = new IFramePage();
        scrollingPage = new ScrollingPage();
        fileUploadPage = new FileUploadPage();
        datePickerPage = new DatePickerPage();
        autocompletePage = new AutocompletePage();
    }

    public static void changeTab() throws NoSuchWindowException {

        Set<String> handles = driver.getWindowHandles();
        String current = driver.getWindowHandle();
        if (handles.size() > 1) {
            handles.remove(current);
        }
        String newTab = handles.iterator().next();
        driver.switchTo().window(newTab);
    }

    public CharSequence selectPathToTheFile(){
        return new File(prop.getProperty("path")).getAbsolutePath();
    }

    public static void disable() {

        driver.quit();
    }

    public void getAlert(){
        alert = driver.switchTo().alert();
    }

    public static WebElement element(By ByElement) {

        return driver.findElement(ByElement);
    }
}
