package Com.Staples.CommonLib;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Baseclass {
	
public static WebDriver driver;
	
	
	
	@Test
	@Parameters("browser")
	public void testCasesExecutionStarted(@Optional String browserName) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\DriversPath\\geckodriver.exe");
		
		System.out.println("Browser Started " +browserName);
		if(browserName.equalsIgnoreCase("firefox"))
		{   
			System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\DriversPath\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Staples\\Staples\\DriversPath\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Staples\\Staples\\DriversPath\\IEDriverServer.exe");
			//System.setProperty("webdriver.ie.bin","C:\\Program Files\\internet explorer\\iexplore.exe");
			driver=new InternetExplorerDriver();
		}	
		
	}

	

}
