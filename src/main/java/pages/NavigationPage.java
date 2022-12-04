package pages;

import Context.ContextClass;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NavigationPage extends BasePage {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    WebElement cartIcon;

    public NavigationPage(ContextClass context) {
        super(context);
    }

    public void clickCart() {
        cartIcon.click();
    }

    public boolean isCartDisplayed() {
        return cartIcon.isDisplayed();
    }
}
