package tests;

import com.thoughtworks.gauge.Step;
import models.CreditModel;
import models.HomeModel;

public class CreditTest {

    CreditModel model;

    public  CreditTest() {
        model = new CreditModel();
    }

    @Step("Click on 'Kredi Hesaplama'")
    public void clickCreditCalculation() {
        model.clickCreditCalculation();
    }

    @Step("Enter <key> TL in 'TUTAR' field")
    public void setCreditPrice(String price) {
        model.setCreditPrice(price);
    }

    @Step("Choose <key>")
    public void chooseInsurance(String key) {
        model.chooseInsurance(key);
    }

    @Step("Set 'VADE' as <key>")
    public void setMaturity(String key) {
        model.setMaturity(key);
    }
}
