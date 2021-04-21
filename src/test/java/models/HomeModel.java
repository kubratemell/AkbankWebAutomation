package models;

import driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class HomeModel extends Driver {

    public void getUrl(String url) {
        webDriver.get(url);
    }

    public void scrollDown() {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
