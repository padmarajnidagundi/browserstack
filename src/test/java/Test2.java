import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Test2 {

    public static final String USERNAME = "padmarajnidagund1";
    public static final String AUTOMATE_KEY = "s1dMwJ6ZxyKxJ7otBVhs";
    public static final String URL = "https://padmarajnidagund1:s1dMwJ6ZxyKxJ7otBVhs@hub-cloud.browserstack.com/wd/hub";

//hh
    //public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "7.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "XP");
        caps.setCapability("browserstack.debug", "true");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Padmaraj Nidagundi");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();

    }
}