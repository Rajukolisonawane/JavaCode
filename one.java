package testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class one {
	WebDriver d;
@Parameters("browser")
	@Test
	public void method1(String nameofthebroser  ) throws InterruptedException {
		if(nameofthebroser.equals("chrome")) {
			d=new ChromeDriver();
		  
	}
		if(nameofthebroser.equals("edge")){
			d=new EdgeDriver();
			  d.get("https://grotechminds.com/drag-and-drop/");
			  d.manage().window().maximize();
			  
			  
	WebElement drag = d.findElement(By.xpath("//img[@id='drag2']"));
	WebElement drop = d.findElement(By.xpath("//div[@id='div2']"));
	Thread.sleep(3000);
	Actions a=new Actions(d);
	a.dragAndDrop(drag, drop).perform(); 
		}
		
	}

}
