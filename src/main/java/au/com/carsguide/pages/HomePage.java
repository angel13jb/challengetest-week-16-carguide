package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@data-gtm-label='top nav car buy and sell']")
    WebElement buyAndSellTab;
    @CacheLookup
    @FindBy(xpath = "//a[@data-gtm-label='sub nav search cars']")
    WebElement searchCarLink;
    @CacheLookup
    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement usedLink;

    public void mouseHoverOnBuyAndSellTab() throws InterruptedException {
        Thread.sleep(5000);
        mouseHoverToElement(buyAndSellTab);
        log.info("MouseHover ON buy+sell tab :"+buyAndSellTab.toString());
    }
    public void clickOnSearchCarLink() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(searchCarLink);
        log.info("Clicking on search car :"+searchCarLink.toString());
    }
    public void clickOnUsedLink(){
        clickOnElement(usedLink);
        log.info("Clicking on used link :"+usedLink.toString());
    }
}
