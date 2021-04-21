package models;

import driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditModel extends Driver {

    Actions actions;

    public  CreditModel() {

        PageFactory.initElements(webDriver, this);
        actions = new Actions(webDriver);
    }

    @FindBy(id="ctl00_ucFooterMenu_rptMain_ctl02_rptChild_ctl00_linkChild")
    public WebElement btnCreditCalculation;

    @FindBy(id="t-credit-price")
    public WebElement txtCreditPrice;

    @FindBy(className="multiple-module-head")
    public WebElement tblCreditCalculation;

    @FindBy(xpath="//label[@for='insuredType2']")
    public WebElement btnUninsured;

    @FindBy(xpath="//label[@for='insuredType1']")
    public WebElement btnInsured;

    @FindBy(className="ui-slider-range-min")
    public WebElement rangeBall;

    public void clickCreditCalculation(){
        btnCreditCalculation.click();
    }

    public void setCreditPrice(String price) {
        txtCreditPrice.clear();
        txtCreditPrice.sendKeys(price);
    }

    public void chooseInsurance(String key){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", tblCreditCalculation);
        switch (key) {
            case "SİGORTASIZ":
                btnUninsured.click();
                break;
            case "SİGORTALI":
                btnInsured.click();
                break;
            default:
                System.out.println("Default value");
        }
    }

    public void setMaturity(String key) {
        if (key.equals("20AY")) {
            actions.dragAndDropBy(rangeBall, 10, 0).build().perform();
        } else {
            System.out.println("Default value");
        }
    }
}
