package qa.skillsup.searchcoach;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasePage extends TestCase{
    protected static WebDriver driver;
    private String baseUrl = "http://skillsup.ua/about/our-team.aspx#";

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }
}
