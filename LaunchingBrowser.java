package testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LaunchingBrowser {
@Test
public void launchChrome() throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	  d.get("https://www.google.com/");
	  d.manage().window().maximize();
	  SoftAssert s=new SoftAssert();
	 WebElement e1 = d.findElement(By.name("q"));
	 s.assertTrue(e1.isDisplayed()== false);
	  e1.sendKeys("India");
	  
	  Thread.sleep(3000);
	 List<WebElement> LIST = d.findElements(By.xpath("//ul[@class='G43f7e']//li"));
	 LIST.get(6).click();
}}
