package Com.Staples.TestngTestCases;



import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Com.Stapels.ExcelLib.ExcelLib;
import Com.Staples.CommonLib.Baseclass;
import Com.Staples.CommonLib.*;
import Com.Staples.ProjectSpecificLib.edsMedallia;
import Com.Staples.Utilites.screenShot;
 


public class EDSMedalliaTestngClass

{
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;	
	CommonLibs cLib;
	edsMedallia pLibEDS;
	ExcelLib elib;
	
	static String actularesult="Authentication Failed";
	static String expectedresult="Authentication Failed";
		
@BeforeMethod
public void Login()
	{
	
	    Baseclass.driver.manage().window().maximize();
		cLib=new CommonLibs();
		pLibEDS= new edsMedallia();	
		elib=new ExcelLib();
	}

@BeforeTest
public void startReport(){
	

	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	extent = new ExtentReports ();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Application Name", "EDSMedallia");
	extent.setSystemInfo("Environment", "PREF");
	htmlReporter.config().setDocumentTitle("Extent Report");
	htmlReporter.config().setReportName("EDSMedallia Suite");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.STANDARD);
	
}
	

@Test()
public void EDSMedalliaLoginTestWithValidCredentials() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("EDSMedalliaLoginTestWithValidCredentials");	
	String Username=ExcelLib.getExcelData("EDSMedallia", "USERNAME", 2);
	String Password=ExcelLib.getExcelData("EDSMedallia", "PASSWORD", 2);
	pLibEDS.staplesLoginTest(Username, Password);
	logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is EDSMedalliaLoginTestWithValidCredentials", ExtentColor.GREEN));
}

@Test()
public void EDSMedallialoginTestwithInvalidPassword() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("EDSMedallialoginTestwithInvalidPassword");	
	String Username=ExcelLib.getExcelData("EDSMedallia", "USERNAME", 3);
	String Password=ExcelLib.getExcelData("EDSMedallia", "PASSWORD", 3);
	pLibEDS.testAuthenticationInvalidPassword(Username, Password);
	
	
	try
    {
		
    Assert.assertEquals(actularesult,expectedresult);   
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is EDSMedallialoginTestwithInvalidPassword", ExtentColor.GREEN));
   
}
	
	catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is EDSMedallialoginTestwithInvalidPassword", ExtentColor.RED));
        
    }
}
    
@Test()
void EDSMedallialoginTestwithInvalidUsername() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("EDSMedallialoginTestwithInvalidUsername");
	String Username=ExcelLib.getExcelData("EDSMedallia", "USERNAME", 4);
	String Password=ExcelLib.getExcelData("EDSMedallia", "PASSWORD", 4);
	pLibEDS.testAuthenticationInvalidUsername(Username, Password);
    
    try
    
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is EDSMedallialoginTestwithInvalidUsername", ExtentColor.GREEN));
    }
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is EDSMedallialoginTestwithInvalidUsername", ExtentColor.RED));
        
    }
    
    
}
@Test()
void EDSMedallialoginTestwithBlankCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("EDSMedallialoginTestwithBlankCredentials");
	String Username=ExcelLib.getExcelData("EDSMedallia", "USERNAME", 5);
	String Password=ExcelLib.getExcelData("EDSMedallia", "PASSWORD", 5);
	
	pLibEDS.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is EDSMedallialoginTestwithBlankCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is EDSMedallialoginTestwithBlankCredentials", ExtentColor.RED));
        
    }    
}
    
@Test()
void EDSMedallialoginTestwithEmptyPasswordField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("EDSMedallialoginTestwithEmptyPasswordField");
	String Username=ExcelLib.getExcelData("EDSMedallia", "USERNAME", 6);
	String Password=ExcelLib.getExcelData("EDSMedallia", "PASSWORD", 6);
	pLibEDS.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is EDSMedallialoginTestwithEmptyPasswordField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is EDSMedallialoginTestwithEmptyPasswordField", ExtentColor.RED));
        
    } 
}
    
    
@Test()
void EDSMedallialoginTestwithEmptyUserNameField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("EDSMedallialoginTestwithEmptyUserNameField");
	String Username=ExcelLib.getExcelData("EDSMedallia", "USERNAME", 7);
	String Password=ExcelLib.getExcelData("EDSMedallia", "PASSWORD", 7);
	pLibEDS.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is EDSMedallialoginTestwithEmptyUserNameField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is EDSMedallialoginTestwithEmptyUserNameField", ExtentColor.RED));
        
    } 
}
    
@Test()
void EDSMedallialoginTestwithInvalidCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("EDSMedallialoginTestwithInvalidCredentials");
	String Username=ExcelLib.getExcelData("EDSMedallia", "USERNAME", 8);
	String Password=ExcelLib.getExcelData("EDSMedallia", "PASSWORD", 8);
	pLibEDS.testAuthenticationInvalidUsername(Username, Password);
    
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is EDSMedallialoginTestwithInvalidCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is EDSMedallialoginTestwithInvalidCredentials", ExtentColor.RED));
       
    } 
} 


@AfterMethod

public void tearDown(ITestResult result)
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		screenShot.captureScreenshot(Baseclass.driver, result.getName());
	}		
}

public void getResult(ITestResult result)
{
	if(result.getStatus() == ITestResult.FAILURE)
	{
		
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
	}
	
	else if(result.getStatus() == ITestResult.SKIP)
	{
		
		logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));	
	}
}

@AfterTest
public void extentReport()

{
	
	extent.flush();
	Baseclass.driver.quit();

}

}


 
