import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class iebrowser {

public static void main(String[] args) {  

		System.setProperty("webdriver.ie.driver", "C:/Users/bamaddu/Downloads/IEDriverServer.exe");
		DesiredCapabilities capabilitiesIE = DesiredCapabilities.internetExplorer();
		capabilitiesIE.setCapability(
				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilitiesIE);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	   
		driver.navigate().to("https://stagecir.deloitteresources.com/qlikview/");	
		
		
   }
}