package Com.Staples.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverLaunch {
	
	public static WebDriver d;

	public static WebDriver getDriver(String browser){
		if(browser.equals("firefox"))
		d=new FirefoxDriver();
		else if(browser.equals("ie")){
			
			d=new InternetExplorerDriver();
		}else{
			d=new ChromeDriver();
		}
		return d;
	}

}
