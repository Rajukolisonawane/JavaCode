package testngpackage;

import org.testng.annotations.Test;

public class Manytestcases {
@Test(priority=2)
public void login() {
	
}
@Test(invocationCount=5, priority=-2)
public void logout() {
	
}
@Test(enabled=true)
public void Registration() {
	
}
@Test(priority=1)
public void Test() {
	
}
}
