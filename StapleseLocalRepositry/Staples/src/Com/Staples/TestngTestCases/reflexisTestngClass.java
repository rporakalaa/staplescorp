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
import Com.Staples.ProjectSpecificLib.Reflexis;
import Com.Staples.ProjectSpecificLib.edsMedallia;
import Com.Staples.ProjectSpecificLib.staplesBibs;
import Com.Staples.Utilites.screenShot;
 


public class reflexisTestngClass

{
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;	
	CommonLibs cLib;
	Reflexis pLibrf;
	ExcelLib elib;
	
	static String actularesult="Authentication Failed";
	static String expectedresult="Authentication Failed";
		
@BeforeMethod
public void Login()
	{
	
	    Baseclass.driver.manage().window().maximize();
		cLib=new CommonLibs();
		pLibrf= new Reflexis();	
		elib=new ExcelLib();
	}

@BeforeTest
public void startReport(){
	

	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	extent = new ExtentReports ();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Application Name", "Reflexis");
	extent.setSystemInfo("Environment", "PREF");
	htmlReporter.config().setDocumentTitle("Extent Report");
	htmlReporter.config().setReportName("Reflexis Suite");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.STANDARD);
	
}
	

@Test()
public void reflexisLoginTestWithValidCredentials() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("ReflexisLoginTestWithValidCredentials");	
	String Username=ExcelLib.getExcelData("Reflexis", "USERNAME", 2);
	String Password=ExcelLib.getExcelData("Reflexis", "PASSWORD", 2);
	pLibrf.staplesLoginTest(Username, Password);
	
	logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is ReflexisLoginTestWithValidCredentials", ExtentColor.GREEN));
}

@Test()
public void reflexisloginTestwithInvalidPassword() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("ReflexisloginTestwithInvalidPassword");	
	String Username=ExcelLib.getExcelData("Reflexis", "USERNAME", 3);
	String Password=ExcelLib.getExcelData("Reflexis", "PASSWORD", 3);
	pLibrf.testAuthenticationInvalidPassword(Username, Password);
	
	
	try
    {
		
    Assert.assertEquals(actularesult,expectedresult);   
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is ReflexisloginTestwithInvalidPassword", ExtentColor.GREEN));
   
}
	
	catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is ReflexisloginTestwithInvalidPassword", ExtentColor.RED));
        
    }
}
    
@Test()
void reflexisloginTestwithInvalidUsername() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("ReflexisloginTestwithInvalidUsername");
	String Username=ExcelLib.getExcelData("Reflexis", "USERNAME", 4);
	String Password=ExcelLib.getExcelData("Reflexis", "PASSWORD", 4);
	pLibrf.testAuthenticationInvalidUsername(Username, Password);
    
    try
    
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is ReflexisloginTestwithInvalidUsername", ExtentColor.GREEN));
    }
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is ReflexisloginTestwithInvalidUsername", ExtentColor.RED));
        
    }
    
    
}
@Test()
void reflexisloginTestwithBlankCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("reflexisloginTestwithBlankCredentials");
	String Username=ExcelLib.getExcelData("Reflexis", "USERNAME", 5);
	String Password=ExcelLib.getExcelData("Reflexis", "PASSWORD", 5);
	
	pLibrf.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is reflexisloginTestwithBlankCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is reflexisloginTestwithBlankCredentials", ExtentColor.RED));
        
    }    
}
    
@Test()
void reflexisloginTestwithEmptyPasswordField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("reflexisloginTestwithEmptyPasswordField");
	String Username=ExcelLib.getExcelData("Reflexis", "USERNAME", 6);
	String Password=ExcelLib.getExcelData("Reflexis", "PASSWORD", 6);
	pLibrf.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is reflexisloginTestwithEmptyPasswordField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is reflexisloginTestwithEmptyPasswordField", ExtentColor.RED));
        
    } 
}
    
    
@Test()
void reflexisloginTestwithEmptyUserNameField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("reflexisloginTestwithEmptyUserNameField");
	String Username=ExcelLib.getExcelData("Reflexis", "USERNAME", 7);
	String Password=ExcelLib.getExcelData("Reflexis", "PASSWORD", 7);
	pLibrf.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is reflexisloginTestwithEmptyUserNameField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is reflexisloginTestwithEmptyUserNameField", ExtentColor.RED));
        
    } 
}
    
@Test()
void reflexisloginTestwithInvalidCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("reflexisloginTestwithInvalidCredentials");
	String Username=ExcelLib.getExcelData("Reflexis", "USERNAME", 8);
	String Password=ExcelLib.getExcelData("Reflexis", "PASSWORD", 8);
	pLibrf.testAuthenticationInvalidUsername(Username, Password);
    
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is reflexisloginTestwithInvalidCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is reflexisloginTestwithInvalidCredentials", ExtentColor.RED));
       
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


 
