package Com.Staples.Utilites;



import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class screenShot {
	
	public static void captureScreenshot(WebDriver driver,String screenshotName) 
	{
	try
	
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File soureFile=	ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(soureFile, new File("./ScreenShots/"+screenshotName+".jpg"));
	} 

	
	catch(IOException ex)
	{
		ex.printStackTrace();
	}
	}
	
	

}
