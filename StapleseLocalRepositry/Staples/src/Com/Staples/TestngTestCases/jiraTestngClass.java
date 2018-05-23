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
import Com.Staples.ProjectSpecificLib.jira;
import Com.Staples.ProjectSpecificLib.mangus;
import Com.Staples.ProjectSpecificLib.staplesBibs;
import Com.Staples.ProjectSpecificLib.staples_AMH;
import Com.Staples.Utilites.screenShot;
 


public class jiraTestngClass

{
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;	
	CommonLibs cLib;
	jira pLibjira;
	ExcelLib elib;
	
	static String actularesult="Authentication Failed";
	static String expectedresult="Authentication Failed";
		
@BeforeMethod
public void Login()
	{
	
	    Baseclass.driver.manage().window().maximize();
		cLib=new CommonLibs();
		pLibjira= new jira();
		elib=new ExcelLib();
	}

@BeforeTest
public void startReport(){
	

	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	extent = new ExtentReports ();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Application Name", "JIRA");
	extent.setSystemInfo("Environment", "PERF");
	htmlReporter.config().setDocumentTitle("Extent Report");
	htmlReporter.config().setReportName("Jira Suite");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.STANDARD);
	
}
	

@Test()
public void jiraLoginTestWithValidCredentials() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("jiraLoginTestWithValidCredentials");	
	String Username=ExcelLib.getExcelData("JIRA", "USERNAME", 2);
	String Password=ExcelLib.getExcelData("JIRA", "PASSWORD", 2);
	pLibjira.staplesLoginTest(Username, Password);
	
	logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is jiraLoginTestWithValidCredentials", ExtentColor.GREEN));
}

@Test()
public void jiraloginTestwithInvalidPassword() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("jiraloginTestwithInvalidPassword");	
	String Username=ExcelLib.getExcelData("JIRA", "USERNAME", 3);
	String Password=ExcelLib.getExcelData("JIRA", "PASSWORD", 3);
	pLibjira.testAuthenticationInvalidPassword(Username, Password);
	
	
	try
    {
		
    Assert.assertEquals(actularesult,expectedresult);   
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is jiraloginTestwithInvalidPassword", ExtentColor.GREEN));
   
}
	
	catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is jiraloginTestwithInvalidPassword", ExtentColor.RED));
        
    }
}
    
@Test()
void jiraloginTestwithInvalidUsername() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("jiraloginTestwithInvalidUsername");
	String Username=ExcelLib.getExcelData("JIRA", "USERNAME", 4);
	String Password=ExcelLib.getExcelData("JIRA", "PASSWORD", 4);
	pLibjira.testAuthenticationInvalidUsername(Username, Password);
    
    try
    
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is jiraloginTestwithInvalidUsername", ExtentColor.GREEN));
    }
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is jiraloginTestwithInvalidUsername", ExtentColor.RED));
        
    }
    
    
}
@Test()
void jiraloginTestwithBlankCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("jiraloginTestwithBlankCredentials");
	String Username=ExcelLib.getExcelData("JIRA", "USERNAME", 5);
	String Password=ExcelLib.getExcelData("JIRA", "PASSWORD", 5);
	
	pLibjira.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is jiraloginTestwithBlankCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is jiraloginTestwithBlankCredentials", ExtentColor.RED));
        
    }    
}
    
@Test()
void jiraloginTestwithEmptyPasswordField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("jiraloginTestwithEmptyPasswordField");
	String Username=ExcelLib.getExcelData("JIRA", "USERNAME", 6);
	String Password=ExcelLib.getExcelData("JIRA", "PASSWORD", 6);
	pLibjira.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is jiraloginTestwithEmptyPasswordField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is jiraloginTestwithEmptyPasswordField", ExtentColor.RED));
        
    } 
}
    
    
@Test()
void jiraloginTestwithEmptyUserNameField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("jiraloginTestwithEmptyUserNameField");
	String Username=ExcelLib.getExcelData("JIRA", "USERNAME", 7);
	String Password=ExcelLib.getExcelData("JIRA", "PASSWORD", 7);
	pLibjira.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is jiraloginTestwithEmptyUserNameField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is jiraloginTestwithEmptyUserNameField", ExtentColor.RED));
        
    } 
}
    
@Test()
void jiraloginTestwithInvalidCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("jiraloginTestwithInvalidCredentials");
	String Username=ExcelLib.getExcelData("JIRA", "USERNAME", 8);
	String Password=ExcelLib.getExcelData("JIRA", "PASSWORD", 8);
	pLibjira.testAuthenticationInvalidUsername(Username, Password);
    
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is jiraloginTestwithInvalidCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is jiraloginTestwithInvalidCredentials", ExtentColor.RED));
       
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


 
