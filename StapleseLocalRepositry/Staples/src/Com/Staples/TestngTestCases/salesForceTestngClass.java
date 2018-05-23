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
import Com.Staples.ProjectSpecificLib.staplesSalesforce;
import Com.Staples.Utilites.screenShot;
 


public class salesForceTestngClass

{
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;	
	CommonLibs cLib;
	staplesSalesforce pLibSalesForce;
	ExcelLib elib;
	
	static String actularesult="Authentication Failed";
	static String expectedresult="Authentication Failed";
		
@BeforeMethod
public void Login()
	{
	
	    Baseclass.driver.manage().window().maximize();
		cLib=new CommonLibs();
		pLibSalesForce=new staplesSalesforce();
		elib=new ExcelLib();
	}

@BeforeTest
public void startReport(){
	

	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	extent = new ExtentReports ();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Application Name", "Salesforce");
	extent.setSystemInfo("Environment", "QA");
	htmlReporter.config().setDocumentTitle("Extent Report");
	htmlReporter.config().setReportName("Salesforce Suite");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.STANDARD);
	
}
	
@Test(priority=1)
public void salesForceLoginTestwithValidCredentials() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("SalesForceLoginTestwithValidCredentials");	
	String Username=ExcelLib.getExcelData("SALESFORCE", "USERNAME", 2);
	String Password=ExcelLib.getExcelData("SALESFORCE", "PASSWORD", 2);
	pLibSalesForce.staplesLoginTest(Username, Password);
	logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is SalesForceLoginTestwithValidCredentials", ExtentColor.GREEN));
}

@Test(priority=2)
public void salesForceloginTestwithInvalidPassword() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("SalesForceloginTestwithInvalidPassword");	
	String Username=ExcelLib.getExcelData("SALESFORCE", "USERNAME", 3);
	String Password=ExcelLib.getExcelData("SALESFORCE", "PASSWORD", 3);
	pLibSalesForce.testAuthenticationInvalidPassword(Username, Password);
	
	
	try
    {
		
    Assert.assertEquals(actularesult,expectedresult);   
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is SalesForceloginTestwithInvalidPassword", ExtentColor.GREEN));
   
}
	
	catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is SalesForceloginTestwithInvalidPassword", ExtentColor.RED));
        
    }
}
    
@Test(priority=3)
void salesForceloginTestwithInvalidUsername() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("salesForceloginTestwithInvalidUsername");
	String Username=ExcelLib.getExcelData("SALESFORCE", "USERNAME", 4);
	String Password=ExcelLib.getExcelData("SALESFORCE", "PASSWORD", 4);
    pLibSalesForce.testAuthenticationInvalidUsername(Username, Password);
    
    try
    
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is salesForceloginTestwithInvalidUsername", ExtentColor.GREEN));
    }
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is salesForceloginTestwithInvalidUsername", ExtentColor.RED));
        
    }
    
    
}
@Test(priority=4)
void salesForceloginTestwithBlankCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("salesForceloginTestwithBlankCredentials");
	String Username=ExcelLib.getExcelData("SALESFORCE", "USERNAME", 5);
	String Password=ExcelLib.getExcelData("SALESFORCE", "PASSWORD", 5);
	
    pLibSalesForce.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is salesForceloginTestwithBlankCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is salesForceloginTestwithBlankCredentials", ExtentColor.RED));
        
    }    
}
    
@Test(priority=5)
void salesForceloginTestwithEmptyPasswordField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("salesForceloginTestwithEmptyPasswordField");
	String Username=ExcelLib.getExcelData("SALESFORCE", "USERNAME", 6);
	String Password=ExcelLib.getExcelData("SALESFORCE", "PASSWORD", 6);
    pLibSalesForce.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is salesForceloginTestwithEmptyPasswordField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is salesForceloginTestwithEmptyPasswordField", ExtentColor.RED));
        
    } 
}
    
    
@Test(priority=6)
void salesForceloginTestwithEmptyUserNameField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("salesForceloginTestwithEmptyUserNameField");
	String Username=ExcelLib.getExcelData("SALESFORCE", "USERNAME", 7);
	String Password=ExcelLib.getExcelData("SALESFORCE", "PASSWORD", 7);
    pLibSalesForce.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is salesForceloginTestwithEmptyUserNameField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is salesForceloginTestwithEmptyUserNameField", ExtentColor.RED));
        
    } 
}
    
@Test(priority=7)
void salesForceloginTestwithInvalidCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("salesForceloginTestwithInvalidCredentials");
	String Username=ExcelLib.getExcelData("SALESFORCE", "USERNAME", 8);
	String Password=ExcelLib.getExcelData("SALESFORCE", "PASSWORD", 8);
    pLibSalesForce.testAuthenticationInvalidUsername(Username, Password);
    
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is salesForceloginTestwithInvalidCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is salesForceloginTestwithInvalidCredentials", ExtentColor.RED));
       
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


 
