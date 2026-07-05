package testngpackage;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base extends ScreenshotListenerlogic{
	
@Parameters("browser")
	@BeforeMethod
	public void lauch(String nameofthebroser  ) throws InterruptedException {
		if(nameofthebroser.equals("chrome")) {
			d=new ChromeDriver();
		  
	}
		if(nameofthebroser.equals("edge")){
			d=new EdgeDriver();}
		
			  d.get("https://www.amazon.in/");
			  d.manage().window().maximize();
}
@AfterMethod
public void quit() throws InterruptedException {
	Thread.sleep(3000);
	d.quit();
}
}