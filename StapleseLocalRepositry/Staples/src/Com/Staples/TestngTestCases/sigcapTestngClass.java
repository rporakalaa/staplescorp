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
import Com.Staples.ProjectSpecificLib.clarity;
import Com.Staples.ProjectSpecificLib.mangus;
import Com.Staples.ProjectSpecificLib.sigcap;
import Com.Staples.ProjectSpecificLib.staplesBibs;
import Com.Staples.ProjectSpecificLib.staples_AMH;
import Com.Staples.Utilites.screenShot;
 


public class sigcapTestngClass

{
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;	
	CommonLibs cLib;
	sigcap pLibsigcap;
	ExcelLib elib;
	
	static String actularesult="Authentication Failed";
	static String expectedresult="Authentication Failed";
		
@BeforeMethod
public void Login()
	{
	
	    Baseclass.driver.manage().window().maximize();
		cLib=new CommonLibs();
		pLibsigcap= new sigcap();
		elib=new ExcelLib();
	}

@BeforeTest
public void startReport(){
	

	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	extent = new ExtentReports ();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Application Name", "SIGCAP");
	extent.setSystemInfo("Environment", "QA");
	htmlReporter.config().setDocumentTitle("Extent Report");
	htmlReporter.config().setReportName("Sigcap Suite");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.STANDARD);
	
}
	

@Test()
public void sigcapLoginTestWithValidCredentials() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("sigcapLoginTestWithValidCredentials");	
	String Username=ExcelLib.getExcelData("SIGCAP", "USERNAME", 2);
	String Password=ExcelLib.getExcelData("SIGCAP", "PASSWORD", 2);
	pLibsigcap.staplesLoginTest(Username, Password);
	
	logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is sigcapLoginTestWithValidCredentials", ExtentColor.GREEN));
}

@Test()
public void sigcaploginTestwithInvalidPassword() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("sigcaploginTestwithInvalidPassword");	
	String Username=ExcelLib.getExcelData("SIGCAP", "USERNAME", 3);
	String Password=ExcelLib.getExcelData("SIGCAP", "PASSWORD", 3);
	pLibsigcap.testAuthenticationInvalidPassword(Username, Password);
	
	
	try
    {
		
    Assert.assertEquals(actularesult,expectedresult);   
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is sigcaploginTestwithInvalidPassword", ExtentColor.GREEN));
   
}
	
	catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is sigcaploginTestwithInvalidPassword", ExtentColor.RED));
        
    }
}
    
@Test()
void sigcaploginTestwithInvalidUsername() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("sigcaploginTestwithInvalidUsername");
	String Username=ExcelLib.getExcelData("SIGCAP", "USERNAME", 4);
	String Password=ExcelLib.getExcelData("SIGCAP", "PASSWORD", 4);
	pLibsigcap.testAuthenticationInvalidUsername(Username, Password);
    
    try
    
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is sigcaploginTestwithInvalidUsername", ExtentColor.GREEN));
    }
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is sigcaploginTestwithInvalidUsername", ExtentColor.RED));
        
    }
    
    
}
@Test()
void sigcaploginTestwithBlankCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("sigcaploginTestwithBlankCredentials");
	String Username=ExcelLib.getExcelData("SIGCAP", "USERNAME", 5);
	String Password=ExcelLib.getExcelData("SIGCAP", "PASSWORD", 5);
	
	pLibsigcap.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is sigcaploginTestwithBlankCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is sigcaploginTestwithBlankCredentials", ExtentColor.RED));
        
    }    
}
    
@Test()
void sigcaploginTestwithEmptyPasswordField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("sigcaploginTestwithEmptyPasswordField");
	String Username=ExcelLib.getExcelData("SIGCAP", "USERNAME", 6);
	String Password=ExcelLib.getExcelData("SIGCAP", "PASSWORD", 6);
	pLibsigcap.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is sigcaploginTestwithEmptyPasswordField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is sigcaploginTestwithEmptyPasswordField", ExtentColor.RED));
        
    } 
}
    
    
@Test()
void sigcaploginTestwithEmptyUserNameField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("sigcaploginTestwithEmptyUserNameField");
	String Username=ExcelLib.getExcelData("SIGCAP", "USERNAME", 7);
	String Password=ExcelLib.getExcelData("SIGCAP", "PASSWORD", 7);
	pLibsigcap.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is sigcaploginTestwithEmptyUserNameField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is sigcaploginTestwithEmptyUserNameField", ExtentColor.RED));
        
    } 
}
    
@Test()
void sigcaploginTestwithInvalidCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("sigcaploginTestwithInvalidCredentials");
	String Username=ExcelLib.getExcelData("SIGCAP", "USERNAME", 8);
	String Password=ExcelLib.getExcelData("SIGCAP", "PASSWORD", 8);
	pLibsigcap.testAuthenticationInvalidUsername(Username, Password);
    
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is sigcaploginTestwithInvalidCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is sigcaploginTestwithInvalidCredentials", ExtentColor.RED));
       
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


 
