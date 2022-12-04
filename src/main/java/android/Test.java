package android;
import constant.Constants;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Platform;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test {
  String PROJECT_PATH = System.getProperty("user.dir");
String APK = PROJECT_PATH + "/src/test/resources/apk/saucelabs.apk";

	public static AndroidDriver<AndroidElement> initialize() throws IOException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability(MobileCapabilityType.APP, Constants.APK);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platFormVersion", "9");
		cap.setCapability("appPackage", "com.saucelabs.mydemoapp.android");
		cap.setCapability("appWaitPackage", "com.saucelabs.mydemoapp.android");

		AndroidDriver<AndroidElement> androidDriver = fillAndroidDriver(cap);
		androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return androidDriver;
	}
	private static AndroidDriver<AndroidElement> fillAndroidDriver(DesiredCapabilities cap) throws MalformedURLException {
		AndroidDriver<AndroidElement> androidDriver;
		androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return androidDriver;
	}
}

