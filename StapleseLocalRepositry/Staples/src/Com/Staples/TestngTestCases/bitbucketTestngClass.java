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
import Com.Staples.ProjectSpecificLib.bitbucket;
import Com.Staples.ProjectSpecificLib.cams;
import Com.Staples.ProjectSpecificLib.cej;
import Com.Staples.ProjectSpecificLib.clarity;
import Com.Staples.ProjectSpecificLib.mangus;
import Com.Staples.ProjectSpecificLib.staplesBibs;
import Com.Staples.ProjectSpecificLib.staples_AMH;
import Com.Staples.Utilites.screenShot;
 


public class bitbucketTestngClass

{
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;	
	CommonLibs cLib;
	bitbucket pLibbit;
	ExcelLib elib;
	
	static String actularesult="Authentication Failed";
	static String expectedresult="Authentication Failed";
		
@BeforeMethod
public void Login()
	{
	
	    Baseclass.driver.manage().window().maximize();
		cLib=new CommonLibs();
		pLibbit= new bitbucket();
		elib=new ExcelLib();
	}

@BeforeTest
public void startReport(){
	

	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	extent = new ExtentReports ();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Application Name", "BITBUCKET");
	extent.setSystemInfo("Environment", "QA");
	htmlReporter.config().setDocumentTitle("Extent Report");
	htmlReporter.config().setReportName("Bitbucket Suite");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.STANDARD);
	
}
	

@Test()
public void bitbucketLoginTestWithValidCredentials() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("bitbucketLoginTestWithValidCredentials");	
	String Username=ExcelLib.getExcelData("BITBUCKET", "USERNAME", 2);
	String Password=ExcelLib.getExcelData("BITBUCKET", "PASSWORD", 2);
	pLibbit.staplesLoginTest(Username, Password);
	
	logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is bitbucketLoginTestWithValidCredentials", ExtentColor.GREEN));
}

@Test()
public void bitbucketloginTestwithInvalidPassword() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("bitbucketloginTestwithInvalidPassword");	
	String Username=ExcelLib.getExcelData("BITBUCKET", "USERNAME", 3);
	String Password=ExcelLib.getExcelData("BITBUCKET", "PASSWORD", 3);
	pLibbit.testAuthenticationInvalidPassword(Username, Password);
	
	
	try
    {
		
    Assert.assertEquals(actularesult,expectedresult);   
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is bitbucketloginTestwithInvalidPassword", ExtentColor.GREEN));
   
}
	
	catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is bitbucketloginTestwithInvalidPassword", ExtentColor.RED));
        
    }
}
    
@Test()
void bitbucketloginTestwithInvalidUsername() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("bitbucketloginTestwithInvalidUsername");
	String Username=ExcelLib.getExcelData("BITBUCKET", "USERNAME", 4);
	String Password=ExcelLib.getExcelData("BITBUCKET", "PASSWORD", 4);
	pLibbit.testAuthenticationInvalidUsername(Username, Password);
    
    try
    
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is bitbucketloginTestwithInvalidUsername", ExtentColor.GREEN));
    }
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is bitbucketloginTestwithInvalidUsername", ExtentColor.RED));
        
    }
    
    
}
@Test()
void bitbucketloginTestwithBlankCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("bitbucketloginTestwithBlankCredentials");
	String Username=ExcelLib.getExcelData("BITBUCKET", "USERNAME", 5);
	String Password=ExcelLib.getExcelData("BITBUCKET", "PASSWORD", 5);
	
	pLibbit.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is bitbucketloginTestwithBlankCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is bitbucketloginTestwithBlankCredentials", ExtentColor.RED));
        
    }    
}
    
@Test()
void bitbucketloginTestwithEmptyPasswordField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("bitbucketloginTestwithEmptyPasswordField");
	String Username=ExcelLib.getExcelData("BITBUCKET", "USERNAME", 6);
	String Password=ExcelLib.getExcelData("BITBUCKET", "PASSWORD", 6);
	pLibbit.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is bitbucketloginTestwithEmptyPasswordField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is bitbucketloginTestwithEmptyPasswordField", ExtentColor.RED));
        
    } 
}
    
    
@Test()
void bitbucketloginTestwithEmptyUserNameField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("bitbucketloginTestwithEmptyUserNameField");
	String Username=ExcelLib.getExcelData("BITBUCKET", "USERNAME", 7);
	String Password=ExcelLib.getExcelData("BITBUCKET", "PASSWORD", 7);
	pLibbit.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is bitbucketloginTestwithEmptyUserNameField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is bitbucketloginTestwithEmptyUserNameField", ExtentColor.RED));
        
    } 
}
    
@Test()
void bitbucketloginTestwithInvalidCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("bitbucketloginTestwithInvalidCredentials");
	String Username=ExcelLib.getExcelData("BITBUCKET", "USERNAME", 8);
	String Password=ExcelLib.getExcelData("BITBUCKET", "PASSWORD", 8);
	pLibbit.testAuthenticationInvalidUsername(Username, Password);
    
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is bitbucketloginTestwithInvalidCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is bitbucketloginTestwithInvalidCredentials", ExtentColor.RED));
       
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


 
