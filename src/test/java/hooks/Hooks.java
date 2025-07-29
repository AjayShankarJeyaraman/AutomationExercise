package hooks;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Hooks {
    private BaseTest base;
    private WebDriver driver;

    @Before
    public void setUp() {
        base = new BaseTest();
        driver = base.initTestBase();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take screenshot
            TakesScreenshot ts = (TakesScreenshot) DriverFactory.getDriver();
            File src = ts.getScreenshotAs(OutputType.FILE);
            String screenshotName = "target/screenshots/" + scenario.getName().replaceAll(" ", "_") + ".png";
            try {
                FileUtils.copyFile(src, new File(screenshotName));
                System.out.println("Screenshot taken: " + screenshotName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        DriverFactory.getDriver().quit();
    }
}
