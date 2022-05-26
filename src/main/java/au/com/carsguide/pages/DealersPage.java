package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DealersPage extends Utility {
    private static final Logger log= LogManager.getLogger(DealersPage.class.getName());
    public DealersPage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement findDealerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']/child::a")
    List<WebElement> dealerNameList;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextButton;

    public void clickOnFindDealerLink(){
        clickOnElement(findDealerLink);
        log.info("Clicking on Find Dealer Link"+findDealerLink.toString());
    }
    public String getDealerName(String name){
        log.info("Get dealer name :"+dealerNameList.toString());
        for(WebElement element:dealerNameList){
            String str=element.getText();
            if(str.equalsIgnoreCase(name)){
                return str;
            }
        }
        return null;
    }
    public void clickOnNextButton(){
        clickOnElement(nextButton);
        log.info("Clicking on Next Button"+nextButton.toString());
    }

}

