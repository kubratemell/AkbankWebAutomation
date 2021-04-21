package tests;

import com.thoughtworks.gauge.Step;
import models.CreditModel;
import models.DetailModel;

public class DetailTest {

    DetailModel model;

    public  DetailTest() {
        model = new DetailModel();
    }

    @Step("Click 'Hesaplama Detayları'")
    public void clickCalculationDetail() {
        model.clickCalculationDetail();
    }

    @Step("Check <key> is opened")
    public void checkPlan(String key) {
        model.checkPlan(key);
    }

    @Step("Click 'Ödeme Planı'")
    public void clickPayment() {
        model.clickPayment();
    }

    @Step("Scroll down on the 'Ödeme Planı' page until 20th is seen")
    public void scrollToElement() {
        model.scrollToLastElement();
    }
}
