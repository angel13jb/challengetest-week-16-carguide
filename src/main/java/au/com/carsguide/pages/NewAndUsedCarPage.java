package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());

    public NewAndUsedCarPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement newAndUsedCarText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makesBox;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement modelsBox;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement locationsBox;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceBox;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarTab;

    public String getNewAndUsedCarText(){
        log.info("Get new and used car text :"+newAndUsedCarText.toString());
        return newAndUsedCarText.getText();
    }
    public void selectCarMakesBox(String makes) {
        selectByVisibleTextFromDropDown(makesBox, makes);
        log.info("Select car makes :"+makes);
    }

    public void selectCarModelsBox(String models) {
        selectByVisibleTextFromDropDown(modelsBox, models);
        log.info("Select car models :"+models);
    }

    public void selectLocations(String locations) throws InterruptedException {
        Thread.sleep(3000);
        selectByVisibleTextFromDropDown(locationsBox, locations);
        log.info("Select car locations :"+locations);
    }

    public void selectPriceBox(String price) {
        selectByVisibleTextFromDropDown(priceBox, price);
        log.info("Select car price :"+price);
    }

    public void clickOnFindMyNextCarTab() {
        clickOnElement(findMyNextCarTab);
        log.info("Clicking on find my next car tab :"+findMyNextCarTab.toString());
    }
}
