package testngpackage;



import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
@Test
public static void SearchingProduct() throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	Thread.sleep(3000);
	SoftAssert s3=new SoftAssert();
	WebElement e1 = d.findElement(By.xpath("//input[@role='searchbox']"));
	e1.sendKeys("Shoes"+Keys.ENTER);
	List<WebElement> e2 = d.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	e2.get(0).click();
	String title = d.getTitle();
	System.out.println(title);
	s3.assertEquals(title, "Amazon.in : Shoes");
//	Assertion k=new Assertion();
//	k.assertEquals(e2.size()<50, true,"Sorry test case is faild");
	Set<String> w = d.getWindowHandles();
	System.out.println(w);
	s3.assertEquals(w.size(),2);
	Iterator<String> id = w.iterator();
String parent = id.next();
String child = id.next();
d.switchTo().window(child);
Thread.sleep(3000);
	s3.assertAll();
	d.close();
}
}
