import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class WebdriverSettings {
    public WebDriver driver;
    @BeforeMethod
    public void SetUp() {
        driver = new FirefoxDriver();
        driver.get("https://catalog.onliner.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void Close() {
        driver.close();
    }
}
