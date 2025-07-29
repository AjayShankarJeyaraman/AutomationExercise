package base;

import java.util.Properties;
import config.ConfigReader;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    public WebDriver driver;
    public Properties prop;
    public DriverFactory driverFactory;
    public ConfigReader configReader;

    public WebDriver initTestBase() {
        configReader = new ConfigReader();
        prop = configReader.init_prop();
        driverFactory = new DriverFactory();
        driver = driverFactory.init_driver(prop);
        return driver;
    }
}
