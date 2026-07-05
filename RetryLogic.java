package testngpackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{
int initialCount=0;
int retryCout=2;
	@Override
	public boolean retry(ITestResult result) {
		if(initialCount<retryCout)
		{
			initialCount++;   //initialcount=0 & initialcount =1
			return true;   //return true means  retry
		}
		return false;  //return false means dont retry
	}

}
