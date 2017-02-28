import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Sample {
   @SuppressWarnings("deprecation")
public static void main(String[] args) {  

	System.setProperty("webdriver.gecko.driver", "C:/Users/bamaddu/Desktop/geckodriver.exe");

	   //Now you can Initialize marionette driver to launch firefox
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability("marionette", true);
	WebDriver driver = new MarionetteDriver(capabilities);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("http://www.aviso.com");
   }
}