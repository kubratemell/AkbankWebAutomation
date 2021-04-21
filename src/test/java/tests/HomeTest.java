package tests;

import com.thoughtworks.gauge.Step;
import models.HomeModel;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class HomeTest {

    HomeModel model;

    public  HomeTest() {
        model = new HomeModel();
    }

    @Step("Enter Akbank Home Page; <key>")
    public  void getUrl(String key){
        model.getUrl(key);
    }

    @Step("Scroll down to the bottom of the page")
    public  void scrollDown(){
        model.scrollDown();
    }
}
