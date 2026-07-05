package testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Three {
	@Test
	public void method3() throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		  d.get("https://www.google.com/");
		  d.manage().window().maximize();
		 WebElement e1 = d.findElement(By.name("q"));
		  e1.sendKeys("India");
		  Thread.sleep(3000);
		 List<WebElement> LIST = d.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		 LIST.get(6).click();
	}

}
