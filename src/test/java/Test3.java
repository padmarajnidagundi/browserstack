//Code for how to integrate mobile and pc browser - to the browserstack

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Test3 {

        //browser stack login details

    public static final String USERNAME = "padmarajnidagund1";
    public static final String AUTOMATE_KEY = "s1dMwJ6ZxyKxJ7otBVhs";
    public static final String URL = "https://padmarajnidagund1:s1dMwJ6ZxyKxJ7otBVhs@hub-cloud.browserstack.com/wd/hub";


         //public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {


        DesiredCapabilities caps = new DesiredCapabilities();

        //mobile - Samsung Galaxy S7

        caps.setCapability("device", "Samsung Galaxy S7");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "6.0");

        // Test - open google and search for the string Padmaraj Nidagundi

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Padmaraj Nidagundi");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();

        //Logs
        caps.setCapability("browserstack.debug", "true");


    }
}