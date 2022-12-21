package hooks;

import Context.ContextClass;
import android.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class HookCucumber {
    private AndroidDriver<AndroidElement> androidDriver;
    private final ContextClass context;

    public HookCucumber(ContextClass context) {
        this.context = context;
    }

    @Before
    public void before() throws IOException {
        androidDriver = Test.initialize();
        context.androidDriver = androidDriver;
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        scenario.attach(((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.BYTES),
                "image/png", "evidence-test");
    }

    @After
    public void after(Scenario scenario) {
        scenario.attach(((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.BYTES),
                "image/png", "evidence-test");
        androidDriver.quit();
    }
}
