package TestCases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Testcase1 {
      public static void main(String[] args) throws Exception {
            // TODO Auto-generated method stub
    	  
    		System.setProperty("webdriver.gecko.driver", "C:/Users/bamaddu/Desktop/geckodriver.exe");
//    		//Now you can Initialize marionette driver to launch firefox
    		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    		capabilities.setCapability("marionette", true);
    		WebDriver Driver = new MarionetteDriver(capabilities);
    		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	  
    	  
//            WebDriver Driver;
            
            //DesiredCapabilities capab = DesiredCapabilities.internetExplorer();
            //capab.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            //System.setProperty("webdriver.ie.driver","./IEDriverServer.exe");
            //Driver = new InternetExplorerDriver(capab);
//            Driver = new FirefoxDriver();
            WebDriverWait wait = new WebDriverWait(Driver,120);
            Driver.manage().window().maximize();
            Driver.get("https://stagecir.deloitteresources.com/qvajaxzfc/opendoc.htm?document=Public/GCI-CIR%20s3.qvw");
            //Thread.sleep(20000);
            //Driver.findElement(By.name("firstName")).sendKeys("Swamy");
            //Driver.findElement(By.id("lastName-xr")).sendKeys("Harsha");
            //Driver.findElement(By.className("populate_loy_postalCode")).sendKeys("516309");
            //WebElement element  = Driver.findElement(By.xpath("//font[contains(text(), 'PERIOD 10')]"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//font[contains(text(), 'PERIOD 10')]")));
            List<WebElement> element  = Driver.findElements(By.xpath("//font[contains(text(), 'PERIOD 10')]"));
            if (element.size()>=1){
                  
            }else{
                  
            }
            
            String strtext = Driver.findElement(By.xpath("//font[contains(text(), 'PERIOD 10')]")).getText();
            if (strtext.equalsIgnoreCase("PERIOD 10 DATA IS NOW AVAILABLE AND IT INCLUDES MONGOLIA!")){
                  
            }
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td [text() ='Access Details']")));
            WebElement element1  =Driver.findElement(By.xpath("//td [text() ='Access Details']"));
            element1.click();
            
            WebElement selectedvalue  =Driver.findElement(By.xpath("//div[@class='QvSelected']")); 
            String strselectedvaluetext = selectedvalue.getAttribute("title");
            System.out.println("Selected Value"+strselectedvaluetext);
            
            List<WebElement> notselectedvalue = Driver.findElements(By.xpath("//div[@class='QvExcluded']"));
            for (int i=0; i<notselectedvalue.size();i++){
                  String strtext1 = notselectedvalue.get(i).getAttribute("title");
                  System.out.println("Non Selected values :"+strtext1);
            }
            
            
            
            
            //Driver.findElement(By.xpath("//label[@for='u_newsletter']/parent::label")).click();
            //Driver.findElement(By.className("Q")).sendKeys("516309");
            //Driver.findElement(By.xpath("//input[@data-placeholder='Password']")).sendKeys("Srinivas");
            //Driver.findElement(By.xpath("//input[@data-placeholder='Confirm password']")).sendKeys("Srinivas Chaparla");
            //Thread.sleep(4000);
            //Driver.findElement(By.xpath("//label[@for='u_newsletter']/parent::label")).click();
      }
}
