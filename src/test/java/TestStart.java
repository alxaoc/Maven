import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestStart {
    public String baseUrl = "https://www.google.com/";
    public WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
//      driver = new FirefoxDriver();
//      driver = new EdgeDriver();
//      driver = new SafariDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyGooglePageTitle() {
        driver.get(baseUrl);
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000); // затримка на 2 секунди
        driver.quit();
    }
}
