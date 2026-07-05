package testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ScreenshotListenerlogic.class)
public class SecondTest extends Base {
	@Test
	public void SearchProductclick1() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.log("Browser and Url launch successfully");
 WebElement ele1= d.findElement(By.id("twotabsearchtextbox"));
 ele1.sendKeys("shoe"+ Keys.ENTER);
 Reporter.log("Search Product successfully");
 List<WebElement> ele2 = d.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
 ele2.get(1).click();
 Reporter.log("clicking on product successfully");
	}
}
