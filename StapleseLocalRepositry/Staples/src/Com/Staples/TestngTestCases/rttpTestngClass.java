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
import Com.Staples.ProjectSpecificLib.cams;
import Com.Staples.ProjectSpecificLib.cej;
import Com.Staples.ProjectSpecificLib.clarity;
import Com.Staples.ProjectSpecificLib.mangus;
import Com.Staples.ProjectSpecificLib.rttp;
import Com.Staples.ProjectSpecificLib.staplesBibs;
import Com.Staples.ProjectSpecificLib.staples_AMH;
import Com.Staples.Utilites.screenShot;
 


public class rttpTestngClass

{
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;	
	CommonLibs cLib;
	rttp pLibrttp;
	ExcelLib elib;
	
	static String actularesult="Authentication Failed";
	static String expectedresult="Authentication Failed";
		
@BeforeMethod
public void Login()
	{
	
	    Baseclass.driver.manage().window().maximize();
		cLib=new CommonLibs();
		pLibrttp= new rttp();
		elib=new ExcelLib();
	}

@BeforeTest
public void startReport(){
	

	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	extent = new ExtentReports ();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Application Name", "RTTP_SUPPORT");
	extent.setSystemInfo("Environment", "QA");
	htmlReporter.config().setDocumentTitle("Extent Report");
	htmlReporter.config().setReportName("Rttp_Support Suite");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.STANDARD);
	
}
	

@Test()
public void rttp_supportLoginTestWithValidCredentials() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("rttp_supportLoginTestWithValidCredentials");	
	String Username=ExcelLib.getExcelData("RTTP", "USERNAME", 2);
	String Password=ExcelLib.getExcelData("RTTP", "PASSWORD", 2);
	pLibrttp.staplesLoginTest(Username, Password);
	
	logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is rttp_supportLoginTestWithValidCredentials", ExtentColor.GREEN));
}

@Test()
public void rttp_supportTestwithInvalidPassword() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("rttp_supportTestwithInvalidPassword");	
	String Username=ExcelLib.getExcelData("RTTP", "USERNAME", 3);
	String Password=ExcelLib.getExcelData("RTTP", "PASSWORD", 3);
	pLibrttp.testAuthenticationInvalidPassword(Username, Password);
	
	
	try
    {
		
    Assert.assertEquals(actularesult,expectedresult);   
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is rttp_supportTestwithInvalidPassword", ExtentColor.GREEN));
   
}
	
	catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is rttp_supportTestwithInvalidPassword", ExtentColor.RED));
        
    }
}
    
@Test()
void rttp_supportTestwithInvalidUsername() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("rttp_supportTestwithInvalidUsername");
	String Username=ExcelLib.getExcelData("RTTP", "USERNAME", 4);
	String Password=ExcelLib.getExcelData("RTTP", "PASSWORD", 4);
	pLibrttp.testAuthenticationInvalidUsername(Username, Password);
    
    try
    
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is rttp_supportTestwithInvalidUsername", ExtentColor.GREEN));
    }
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is rttp_supportTestwithInvalidUsername", ExtentColor.RED));
        
    }
    
    
}
@Test()
void rttp_supportTestwithBlankCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("rttp_supportTestwithBlankCredentials");
	String Username=ExcelLib.getExcelData("RTTP", "USERNAME", 5);
	String Password=ExcelLib.getExcelData("RTTP", "PASSWORD", 5);
	
	pLibrttp.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is rttp_supportTestwithBlankCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is rttp_supportTestwithBlankCredentials", ExtentColor.RED));
        
    }    
}
    
@Test()
void rttp_supportTestwithEmptyPasswordField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("rttp_supportTestwithEmptyPasswordField");
	String Username=ExcelLib.getExcelData("RTTP", "USERNAME", 6);
	String Password=ExcelLib.getExcelData("RTTP", "PASSWORD", 6);
	pLibrttp.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is rttp_supportTestwithEmptyPasswordField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is rttp_supportTestwithEmptyPasswordField", ExtentColor.RED));
        
    } 
}
    
    
@Test()
void rttp_supportloginTestwithEmptyUserNameField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("rttp_supportloginTestwithEmptyUserNameField");
	String Username=ExcelLib.getExcelData("RTTP", "USERNAME", 7);
	String Password=ExcelLib.getExcelData("RTTP", "PASSWORD", 7);
	pLibrttp.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is rttp_supportloginTestwithEmptyUserNameField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is rttp_supportloginTestwithEmptyUserNameField", ExtentColor.RED));
        
    } 
}
    
@Test()
void rttp_supportloginTestwithInvalidCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("rttp_supportloginTestwithInvalidCredentials");
	String Username=ExcelLib.getExcelData("RTTP", "USERNAME", 8);
	String Password=ExcelLib.getExcelData("RTTP", "PASSWORD", 8);
	pLibrttp.testAuthenticationInvalidUsername(Username, Password);
    
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is rttp_supportloginTestwithInvalidCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is rttp_supportloginTestwithInvalidCredentials", ExtentColor.RED));
       
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
	Baseclass.driver.close();
}

}


 
