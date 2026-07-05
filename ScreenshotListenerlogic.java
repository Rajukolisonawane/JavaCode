package testngpackage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class ScreenshotListenerlogic implements ITestListener {
	
	
	        public static WebDriver d;
static void takescreenshot(String status) {
	Date dt=new Date();
	System.out.println(dt.getTime());
	Date dt1=new Date(dt.getTime());
	System.out.println(dt1);
	String dateformate = dt1.toString();
	String month = dateformate.substring(4, 7);
	String day = dateformate.substring(8, 10);
	String hour = dateformate.substring(11, 13);
	String min = dateformate.substring(14, 16);
	String sec=dateformate.substring(17, 19);
	String newdateformate = ("M-")+month.concat("D-").concat(day).concat("H-").concat(hour).concat("min-").concat(min).concat("sec-").concat(sec);
	System.out.println(newdateformate);
	TakesScreenshot scrn=(TakesScreenshot) d;
    File src = scrn.getScreenshotAs(OutputType.FILE);
    File dest= new File("D:\\Selenium Workspace\\Selenium_Start\\test-output\\screenshots\\"+status+"\\"+"testcase-"+newdateformate+".png");
    try {
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	        @Override
	        public void onTestSuccess(ITestResult result) 
	        {
	                ITestListener.super.onTestSuccess(result);
	                Reporter.log("Test Case is Pass");
	                
	                takescreenshot("Pass");   // folder name
	                
	        
	        }

	        @Override
	        public void onTestFailure(ITestResult result) {
	                
	                ITestListener.super.onTestFailure(result);
	                Reporter.log("Test Case is Fail");
	                takescreenshot("Fail");// folder name
					}
	        }
	        
	        

	

