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
import Com.Staples.ProjectSpecificLib.staples_SolutionBuilder;
import Com.Staples.Utilites.screenShot;
 


public class solutionBuilderTestngClass

{
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;	
	CommonLibs cLib;
	staples_SolutionBuilder pLibsb;
	ExcelLib elib;
	
	static String actularesult="Authentication Failed";
	static String expectedresult="Authentication Failed";
		
@BeforeMethod
public void Login()
	{
	
	    Baseclass.driver.manage().window().maximize();
		cLib=new CommonLibs();
		pLibsb= new staples_SolutionBuilder();	
		elib=new ExcelLib();
	}

@BeforeTest
public void startReport(){
	

	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	extent = new ExtentReports ();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Application Name", "SolutionBuilder");
	extent.setSystemInfo("Environment", "QA");
	htmlReporter.config().setDocumentTitle("Extent Report");
	htmlReporter.config().setReportName("SolutionBuilder Suite");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.STANDARD);
	
}
	

@Test()
public void solutionBuilderLoginTestWithValidCredentials() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("solutionBuilderLoginTestWithValidCredentials");	
	String Username=ExcelLib.getExcelData("SolutionBuilder", "USERNAME", 2);
	String Password=ExcelLib.getExcelData("SolutionBuilder", "PASSWORD", 2);
	pLibsb.staplesLoginTest(Username, Password);
	
	logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is solutionBuilderLoginTestWithValidCredentials", ExtentColor.GREEN));
}

@Test()
public void solutionBuilderloginTestwithInvalidPassword() throws InvalidFormatException, IOException, InterruptedException
{
	
	logger = extent.createTest("solutionBuilderloginTestwithInvalidPassword");	
	String Username=ExcelLib.getExcelData("DIG", "USERNAME", 3);
	String Password=ExcelLib.getExcelData("DIG", "PASSWORD", 3);
	pLibsb.testAuthenticationInvalidPassword(Username, Password);
	
	
	try
    {
		
    Assert.assertEquals(actularesult,expectedresult);   
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is solutionBuilderloginTestwithInvalidPassword", ExtentColor.GREEN));
   
}
	
	catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is solutionBuilderloginTestwithInvalidPassword", ExtentColor.RED));
        
    }
}
    
@Test()
void solutionBuilderloginTestwithInvalidUsername() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("solutionBuilderloginTestwithInvalidUsername");
	String Username=ExcelLib.getExcelData("SolutionBuilder", "USERNAME", 4);
	String Password=ExcelLib.getExcelData("SolutionBuilder", "PASSWORD", 4);
	pLibsb.testAuthenticationInvalidUsername(Username, Password);
    
    try
    
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is solutionBuilderloginTestwithInvalidUsername", ExtentColor.GREEN));
    }
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is solutionBuilderloginTestwithInvalidUsername", ExtentColor.RED));
        
    }
    
    
}
@Test()
void solutionBuilderloginTestwithBlankCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("solutionBuilderloginTestwithBlankCredentials");
	String Username=ExcelLib.getExcelData("SolutionBuilder", "USERNAME", 5);
	String Password=ExcelLib.getExcelData("SolutionBuilder", "PASSWORD", 5);
	
	pLibsb.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is solutionBuilderloginTestwithBlankCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is solutionBuilderloginTestwithBlankCredentials", ExtentColor.RED));
        
    }    
}
    
@Test()
void solutionBuilderloginTestwithEmptyPasswordField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("solutionBuilderloginTestwithEmptyPasswordField");
	String Username=ExcelLib.getExcelData("SolutionBuilder", "USERNAME", 6);
	String Password=ExcelLib.getExcelData("SolutionBuilder", "PASSWORD", 6);
	pLibsb.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    	Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is solutionBuilderloginTestwithEmptyPasswordField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is solutionBuilderloginTestwithEmptyPasswordField", ExtentColor.RED));
        
    } 
}
    
    
@Test()
void solutionBuilderloginTestwithEmptyUserNameField() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("solutionBuilderloginTestwithEmptyUserNameField");
	String Username=ExcelLib.getExcelData("SolutionBuilder", "USERNAME", 7);
	String Password=ExcelLib.getExcelData("SolutionBuilder", "PASSWORD", 7);
	pLibsb.testAuthenticationInvalidUsername(Username, Password);
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is solutionBuilderloginTestwithEmptyUserNameField", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is solutionBuilderloginTestwithEmptyUserNameField", ExtentColor.RED));
        
    } 
}
    
@Test()
void solutionBuilderloginTestwithInvalidCredentials() throws InterruptedException, InvalidFormatException, IOException
{
	logger = extent.createTest("solutionBuilderloginTestwithInvalidCredentials");
	String Username=ExcelLib.getExcelData("SolutionBuilder", "USERNAME", 8);
	String Password=ExcelLib.getExcelData("SolutionBuilder", "PASSWORD", 8);
	pLibsb.testAuthenticationInvalidUsername(Username, Password);
    
    try
    {
    Assert.assertEquals(actularesult, expectedresult);
    logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is solutionBuilderloginTestwithInvalidCredentials", ExtentColor.GREEN));
}
    catch(AssertionError ex)
    {
    	logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is solutionBuilderloginTestwithInvalidCredentials", ExtentColor.RED));
       
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


 
