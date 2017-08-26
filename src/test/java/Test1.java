import java.util.concurrent.TimeUnit;
import junit.framework.TestCase;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 extends TestCase {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        // Download chromedriver (http://code.google.com/p/chromedriver/downloads/list)
        System.setProperty("webdriver.chrome.driver",
                "chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.youtube.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("masthead-search-term")).sendKeys("india");
        driver.findElement(By.id("appbar-guide-button")).click();
        driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.id("appbar-guide-button")).click();
        driver.findElement(By.linkText("Music")).click();
        driver.get(baseUrl + "www.india.com");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}