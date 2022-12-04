package android;

import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test {
	static AppiumDriver<MobileElement> appiumDriver;
	public WebDriverWait driverWait;
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String APK = PROJECT_PATH + "/src/test/resources/apk/saucelabs.apk";

	//choose product 
	
	 @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
	    List<WebElement> listProducts;

	    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/colorIV")
		static  List<WebElement> listProductColors;

	    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
	    WebElement btnPlusQty;

	    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
	    WebElement btnAddToCart;
	    
	//end choose product
	
	//checkout 
	
	@AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameET")
    static MobileElement inpFullName;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/address1ET")
    WebElement inputAddress1;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cityET")
    WebElement inputCity;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/zipET")
    WebElement inputZipCode;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/countryET")
    WebElement inputCountry;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/paymentBtn")
    WebElement btnPayment;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    WebElement inputFullNameCard;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cardNumberET")
    WebElement inputCardNumber;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/expirationDateET")
    WebElement inpExpirationDate;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/securityCodeET")
    WebElement inpSecurityCode;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/paymentBtn")
    WebElement btnReviewOrder;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/completeTV")
    WebElement checkoutCompleteBanner;
	//end checkout
    
	@AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/loginBtn")
	static WebElement btnLogin;

	@AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
	static WebElement inpUsername;

	@AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
	static WebElement inpPassword;

	public static void main(String[] args) throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability(MobileCapabilityType.APP, APK);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platFormVersion", "9");
		cap.setCapability("appPackage", "com.saucelabs.mydemoapp.android");
		cap.setCapability("appWaitPackage", "com.saucelabs.mydemoapp.android");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		appiumDriver = new AppiumDriver<MobileElement>(url, cap);
		
		checkout();
//		andLogin();
	}
     
	static void checkout() {
        inpFullName.sendKeys("test");
	}
	
	static void inputUsername() {
		inpUsername.sendKeys("bod@example.com");
	}

	static void inputPassword() {
		inpPassword.sendKeys("10203040");
	}

	static void andLogin() {
		btnLogin.click();
	}

}