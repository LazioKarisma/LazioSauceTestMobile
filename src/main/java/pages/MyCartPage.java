package pages;

import Context.ContextClass;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MyCartPage extends BasePage {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    WebElement btnProceedToCheckout;

    public MyCartPage(ContextClass context) {
        super(context);
    }

    public void clickProceedToCheckoutButton() {
        btnProceedToCheckout.click();
    }
}
