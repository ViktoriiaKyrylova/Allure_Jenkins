package locators;

import org.openqa.selenium.By;

public class PageObjectModelPageLocators {

    public static By carouselControlLeftArrow = By.xpath("//a[@class='left carousel-control']");
    public static By carouselControlRightArrow = By.xpath("//a[@class='right carousel-control']");

    public static By navOurProductsBarButton = By.xpath("//*[@id='div-main-nav']//ul/li[2]");
    public static By navContactUsBarButton = By.xpath("//*[@id='div-main-nav']//ul/li[3]");

    public static By buttonToFindOutMore = By.xpath("//*[@id='button-find-out-more']");

    public static By specialOffersButton = By.xpath("//*[@id='container-special-offers']");
    public static By camerasButton = By.xpath("//*[@id='container-product1']");
    public static By newLaptopsButton = By.xpath("//*[@id='container-product2']");
    public static By usedLaptopsButton = By.xpath("//*[@id='container-product3']");
    public static By gameConsolesButton = By.xpath("//*[@id='container-product4']");
    public static By componentsButton = By.xpath("//*[@id='container-product5']");
    public static By desktopSystemsButton = By.xpath("//*[@id='container-product6']");
    public static By audioButton = By.xpath("//*[@id='container-product7']");

    public static By modalPopup =  By.xpath("//*[@id='myModal']//div[@class='modal-content']");
    public static By modalPopupHeader =  By.xpath("//div[@class='modal-content']/div[@class='modal-header']");
    public static By modalPopupCloseButton =  By.xpath("//*[@id='myModal']//button[2]");
}
