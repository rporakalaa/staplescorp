package Com.Staples.CommonLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonLibs {

	

		public void waitForPageToLoad(WebDriver driver){
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		public void waitForLinkPresent(WebDriver driver , String linkName){
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.presenceOfElementLocated
					                        (By.linkText(linkName)));
			
		}
		
		public void waitForclassname(WebDriver driver , String classname){
			FluentWait<WebDriver> wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.presenceOfElementLocated
					                        (By.className(classname)));
			
		}
		public void waitForcssselector(WebDriver driver , String cssselectior){
			FluentWait<WebDriver> wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.presenceOfElementLocated
					                        (By.className(cssselectior)));
			
		}
		
		
		public void waitForXpathPresent(WebDriver driver , String wbXpath){
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.presenceOfElementLocated
					                                    (By.xpath(wbXpath)));
			
		}
		public void aceptAlert(WebDriver driver){
			Alert alt = driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
			
		}

}
