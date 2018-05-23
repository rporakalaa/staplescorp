package Com.Staples.ProjectSpecificLib;



import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import Com.Stapels.ExcelLib.ExcelLib;
import Com.Staples.CommonLib.*;
import Com.Staples.PageObjectModel.stapelsLogin;




public class csrRewards extends CommonLibs

{
	

	static String actularesult="Authentication Failed";
	static String expectedresult="Authentication Failed";
	
	public void staplesLoginTest(String Username, String Password) throws InterruptedException, InvalidFormatException, IOException
	{
		
		stapelsLogin login=PageFactory.initElements(Baseclass.driver, stapelsLogin.class);	
	    Baseclass.driver.get(ExcelLib.getExcelData("CSRREWARDS", "URL", 2));	   
		waitForPageToLoad(Baseclass.driver);
		login.getUserName().sendKeys(Username);
		Thread.sleep(2000);
		login.getPassword().sendKeys(Password);
		Thread.sleep(2000);
		login.getSubmit().click();
		//waitForclassname(Baseclass.driver, "steps-header");
		//waitForcssselector(Baseclass.driver, "body > center > table > tbody > tr:nth-child(2) > td > div > h2");
		waitForPageToLoad(Baseclass.driver);
		login.getCsrRewardslogoutclick().click();
		Thread.sleep(3000);
		login.getCsrRewardsalertclick().click();
		Thread.sleep(2000);
		Baseclass.driver.manage().deleteAllCookies();
		
	}

public void testAuthenticationInvalidPassword(String Username,String Password) throws InterruptedException, InvalidFormatException, IOException
	{
	
		stapelsLogin login= PageFactory.initElements(Baseclass.driver, stapelsLogin.class);
		Baseclass.driver.get(ExcelLib.getExcelData("CSRREWARDS", "URL", 2));
		waitForPageToLoad(Baseclass.driver);
		login.getUserName().sendKeys(Username);		
		Thread.sleep(2000);
		login.getPassword().sendKeys(Password);
		Thread.sleep(2000);
		login.getSubmit().click();
		Thread.sleep(2000);
		Baseclass.driver.manage().deleteAllCookies();
		
	}

public void testAuthenticationInvalidUsername(String Username,String Password) throws InterruptedException, InvalidFormatException, IOException
{
	
	stapelsLogin login= PageFactory.initElements(Baseclass.driver, stapelsLogin.class);
	Baseclass.driver.get(ExcelLib.getExcelData("CSRREWARDS", "URL", 2));
	waitForPageToLoad(Baseclass.driver);
	login.getUserName().sendKeys(Username);
	Thread.sleep(2000);
	login.getPassword().sendKeys(Password);
	Thread.sleep(2000);
	login.getSubmit().click();
	Thread.sleep(2000);
	Baseclass.driver.manage().deleteAllCookies();
	
}
public void testAuthenticationBlankcredentials(String Username,String Password) throws InterruptedException, InvalidFormatException, IOException
{
	stapelsLogin login= PageFactory.initElements(Baseclass.driver, stapelsLogin.class);
	Baseclass.driver.get(ExcelLib.getExcelData("CSRREWARDS", "URL", 2));
	waitForPageToLoad(Baseclass.driver);
	login.getUserName().sendKeys(Username);
	Thread.sleep(2000);
	login.getPassword().sendKeys(Password);
	Thread.sleep(2000);
	login.getSubmit().click();
	Thread.sleep(2000);
	Baseclass.driver.manage().deleteAllCookies();
	
}
public void testAuthenticationwithEmptyPasswordField(String Username,String Password) throws InterruptedException, InvalidFormatException, IOException
{
	stapelsLogin login= PageFactory.initElements(Baseclass.driver, stapelsLogin.class);
	Baseclass.driver.get(ExcelLib.getExcelData("CSRREWARDS", "URL", 2));
	waitForPageToLoad(Baseclass.driver);
	login.getUserName().sendKeys(Username);
	Thread.sleep(2000);
	login.getPassword().sendKeys(Password);
	Thread.sleep(2000);
	login.getSubmit().click();
	Thread.sleep(2000);
	Baseclass.driver.manage().deleteAllCookies();
}
public void testAuthenticationwithEmptyUserField(String Username,String Password) throws InterruptedException, InvalidFormatException, IOException
{

	stapelsLogin login= PageFactory.initElements(Baseclass.driver, stapelsLogin.class);
	Baseclass.driver.get(ExcelLib.getExcelData("CSRREWARDS", "URL", 2));
	waitForPageToLoad(Baseclass.driver);
	login.getUserName().sendKeys(Username);	
	Thread.sleep(2000);
	login.getPassword().sendKeys(Password);
	Thread.sleep(2000);
	login.getSubmit().click();
	Thread.sleep(2000);
	Baseclass.driver.manage().deleteAllCookies();
}
public void testAuthenticationwithInvalidCredentials(String Username,String Password) throws InterruptedException, InvalidFormatException, IOException
{
    
	stapelsLogin login= PageFactory.initElements(Baseclass.driver, stapelsLogin.class);
	Baseclass.driver.get(ExcelLib.getExcelData("CSRREWARDS", "URL", 2));
	waitForPageToLoad(Baseclass.driver);
	login.getUserName().sendKeys(Username);
	Thread.sleep(2000);
	login.getPassword().sendKeys(Password);
	Thread.sleep(2000);
	login.getSubmit().click();
	Thread.sleep(2000);
	Baseclass.driver.manage().deleteAllCookies();

}
}
