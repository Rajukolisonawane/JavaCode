package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut=4000)
public void login()  {
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.amazon.in");
		d.manage().window().maximize();
		WebElement text = d.findElement(By.xpath("//div[@id='nav-link-accountList']"));
		
		Actions s=new Actions(d);
		s.moveToElement(text).perform();
	
		d.close();
}
}
