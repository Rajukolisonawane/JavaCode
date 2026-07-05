package testngpackage;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListenerlogic.class)
public class LoginToAmazone extends Base{
	@Test(retryAnalyzer = RetryLogic.class)
	public void test3() throws InterruptedException, IOException {
		Thread.sleep(3000);
		Reporter.log("Browser and Url launch successfully");
	WebElement text = d.findElement(By.xpath("//div[@id='nav-link-accountList']"));
String g = text.getText();
	System.out.println(g);
	Actions s=new Actions(d);
	s.moveToElement(text).perform();
	Reporter.log("Mouse Hover");
	Thread.sleep(3000);
	d.findElement(By.xpath("//a[@class='nav-action-signin-button']")).click();
	
	Reporter.log("Clicking on signin button");
	
	WebElement username = d.findElement(By.id("ap_email_login"));
	username.sendKeys("rajukoli6789@gmail.com");
	Reporter.log(" enter username successfully");
	WebElement continuebutton = d.findElement(By.id("continue"));
	continuebutton.click();
	
	
}
}