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
import Com.Staples.ProjectSpecificLib.csrRewards;
import Com.Staples.Utilites.screenShot;
 


public class csrRewardTestngClass

{
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;	
	CommonLibs cLib;
	csrRewards pLibCSRRewards;
	ExcelLib elib;
	
	static String actularesult="Authentication Failed";
	static String expectedresult="Authentication Failed";
		
@BeforeMethod
public void Login()
	{
	
	    Baseclass.driver.manage().window().maximize();
		cLib=new CommonLibs();
		pLibCSRRewards= new csrRewards();		
		elib=new ExcelLib();
	}

@BeforeTest
public void startReport(){
	

	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	extent = new ExtentReports ();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Application Name", "Csrrewards");
	extent.setSystemInfo("Environment", "QA");
	htmlReporter.config().setDocumentTitle("Extent Report");
	htmlReporter.config().setReportName("Csrrewards Suite");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.STANDARD);
	
}
	

@Test(priority=1)
public void cSRRewardsLoginTestwithValidCredentials() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("cSRRewardsLoginwithTestValidCredentials");	
	String Username=ExcelLib.getExcelData("CSRREWARDS", "USERNAME", 2);
	String Password=ExcelLib.getExcelData("CSRREWARDS", "PASSWORD", 2);
	pLibCSRRewards.staplesLoginTest(Username, Password);
	
	
	
	logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is cSRRewardsLoginTestWithValidCredentials", ExtentColor.GREEN));
}
@Test(priority=2)
public void cSRRewardsLoginTestwithInvalidPassword() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("cSRRewardsLoginTestwithInvalidPassword");	
	String Username=ExcelLib.getExcelData("CSRREWARDS", "USERNAME", 3);
	String Password=ExcelLib.getExcelData("CSRREWARDS", "PASSWORD", 3);
	pLibCSRRewards.testAuthenticationInvalidPassword(Username, Password);
	
	
	try
    {
		
    Assert.assertEquals(actularesult,expectedresult);   
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is cSRRewardsLoginTestwithInvalidPassword", ExtentColor.GREEN));
   
}
	
	catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is cSRRewardsLoginTestwithInvalidPassword", ExtentColor.RED));
        
    }
}
    
@Test(priority=3)
void cSRRewardsLoginTestwithInvalidUsername() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("cSRRewardsTestwithInvalidUsername");
	String Username=ExcelLib.getExcelData("CSRREWARDS", "USERNAME", 4);
	String Password=ExcelLib.getExcelData("CSRREWARDS", "PASSWORD", 4);
	pLibCSRRewards.testAuthenticationInvalidUsername(Username, Password);
    
    try
    
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is cSRRewardsLoginTestwithInvalidUsername", ExtentColor.GREEN));
    }
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is cSRRewardsLoginTestwithInvalidUsername", ExtentColor.RED));
        
    }
    
    
}
@Test(priority=4)
void cSRRewardloginTestwithBlankCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("cSRRewardloginTestwithBlankCredentials");
	String Username=ExcelLib.getExcelData("CSRREWARDS", "USERNAME", 5);
	String Password=ExcelLib.getExcelData("CSRREWARDS", "PASSWORD", 5);
	
	pLibCSRRewards.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is cSRRewardloginTestwithBlankCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is cSRRewardloginTestwithBlankCredentials", ExtentColor.RED));
        
    }    
}
    
@Test(priority=5)
void cSRRewardloginTestwithEmptyPasswordField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("cSRRewardloginTestwithEmptyPasswordField");
	String Username=ExcelLib.getExcelData("CSRREWARDS", "USERNAME", 6);
	String Password=ExcelLib.getExcelData("CSRREWARDS", "PASSWORD", 6);
	pLibCSRRewards.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is cSRRewardloginTestwithEmptyPasswordField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is cSRRewardloginTestwithEmptyPasswordField", ExtentColor.RED));
        
    } 
}
    
    
@Test(priority=6)
void cSRRewardloginTestwithEmptyUserNameField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("cSRRewardloginTestwithEmptyUserNameField");
	String Username=ExcelLib.getExcelData("CSRREWARDS", "USERNAME", 7);
	String Password=ExcelLib.getExcelData("CSRREWARDS", "PASSWORD", 7);
	pLibCSRRewards.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is cSRRewardloginTestwithEmptyUserNameField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is cSRRewardloginTestwithEmptyUserNameField", ExtentColor.RED));
        
    } 
}
    
@Test(priority=7)
void cSRRewardloginTestwithInvalidCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("cSRRewardloginTestwithInvalidCredentials");
	String Username=ExcelLib.getExcelData("CSRREWARDS", "USERNAME", 8);
	String Password=ExcelLib.getExcelData("CSRREWARDS", "PASSWORD", 8);
	pLibCSRRewards.testAuthenticationInvalidUsername(Username, Password);
    
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is cSRRewardloginTestwithInvalidCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is cSRRewardloginTestwithInvalidCredentials", ExtentColor.RED));
       
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


 
