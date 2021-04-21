package models;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailModel extends Driver {

    WebDriverWait wait;
    Actions actions;
    public  DetailModel() {
        PageFactory.initElements(webDriver, this);
        wait = new WebDriverWait(webDriver, 10);
        actions = new Actions(webDriver);
    }

    @FindBy(className="open-tooltip")
    public WebElement btnCalculationDetail;

    @FindBy(xpath="//div[@class='tabs-content oran active'][@id='content-1']")
    public WebElement chkCost;

    @FindBy(xpath="//div[@class='tabs-content plan active jspScrollable'][@id='content-2']")
    public WebElement chkPayment;

    @FindBy(id="accordion2")
    public WebElement btnPayment;

    @FindBy(className="jspDrag")
    public WebElement jspDrag;

    public void clickCalculationDetail() {
        btnCalculationDetail.click();
    }

    public boolean checkPlan(String key) {
        switch (key) {
            case "Masraf ve Maliyet Oranları":
                return chkCost.isDisplayed();
            case "Ödeme Planı":
                return chkPayment.isDisplayed();
            default:
                return false;
        }
    }

    public void clickPayment() {
        btnPayment.click();
    }

    public void scrollToLastElement(){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", chkPayment);
        actions.dragAndDropBy(jspDrag,0,300).build().perform();
    }
}
