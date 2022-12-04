package pages;

import Context.ContextClass;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameET")
    WebElement inputFullName;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/address1ET")
    WebElement inputAddressLineOne;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cityET")
    WebElement inputCity;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/zipET")
    WebElement inputZipCode;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/countryET")
    WebElement inputCountry;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/paymentBtn")
    WebElement btnToPayment;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    WebElement inputFullNameCard;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cardNumberET")
    WebElement inputCardNumber;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/expirationDateET")
    WebElement inputExpirationDate;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/securityCodeET")
    WebElement inputSecurityCode;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/paymentBtn")
    WebElement btnReviewOrder;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/completeTV")
    WebElement checkoutCompleteBanner;

    public CheckoutPage(ContextClass context) {
        super(context);
    }

    public CheckoutPage inputFullName() {
        inputFullName.sendKeys(faker.name().fullName());
        return this;
    }

    public CheckoutPage inputAddressLineOne() {
        inputAddressLineOne.sendKeys(faker.address().fullAddress());
        return this;
    }

    public CheckoutPage inputCityName() {
        inputCity.sendKeys(faker.address().cityName());
        return this;
    }

    public CheckoutPage inputZipCode() {
        inputZipCode.sendKeys(faker.address().zipCode());
        return this;
    }

    public CheckoutPage inputCountryName() {
        inputCountry.sendKeys(faker.address().country());
        return this;
    }

    public CheckoutPage inputFullNameCard() {
        inputFullNameCard.sendKeys(faker.name().fullName());
        return this;
    }

    public CheckoutPage inputCardNumber() {
        inputCardNumber.sendKeys(faker.finance().creditCard());
        return this;
    }

    public CheckoutPage inputExpirationDate() {
        inputExpirationDate.sendKeys("1130");
        return this;
    }

    public CheckoutPage inputSecurityCode() {
        inputSecurityCode.sendKeys(faker.number().digits(3));
        return this;
    }

    public void andClickReviewOrderButton() {
        btnReviewOrder.click();
    }

    public void andClickToPaymentButton() {
        btnToPayment.click();
    }

    public void clickPlaceOrderButton() {
        btnReviewOrder.click();
    }

    public boolean isCheckoutCompleteBannerDisplayed() {
        return checkoutCompleteBanner.isDisplayed();
    }
}
