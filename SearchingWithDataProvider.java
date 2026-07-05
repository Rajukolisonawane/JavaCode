package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchingWithDataProvider {
@DataProvider
public Object searchParameter() {
Object[][]d1=new Object[6][1];
d1[0][0]="Shoes";
d1[1][0]="bags";
d1[2][0]="soap";
d1[3][0]="Cars";
d1[4][0]="mobiles";
d1[5][0]="Laptops";
return d1;
}
	@Test (dataProvider="searchParameter")
	public void searchproduct(String input) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(3000);
		Reporter.log("Browser and Url launch successfully");
		 WebElement ele1= d.findElement(By.id("twotabsearchtextbox"));
		 ele1.sendKeys(input +Keys.ENTER);
	}
}
