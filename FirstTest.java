package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ScreenshotListenerlogic.class)
public class FirstTest extends Base {
	
	@Test(retryAnalyzer = RetryLogic.class)
	public void SearchProduct() throws InterruptedException {
		Reporter.log("Browser and Url launch successfully");
		Thread.sleep(3000);
 WebElement ele1= d.findElement(By.id("twotabsearchtextbox"));
 ele1.sendKeys("toys"+ Keys.ENTER);
 Reporter.log("search product successfully");
	}

}



