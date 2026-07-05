package testngpackage;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="smoke")
public void testcase1() {
	
}
	@Test(groups="smoke")
public void testcase2() {
	
}
	@Test(groups={"smoke","regression"})
public void testcase3() {
	
}
	@Test(groups="regression")
public void testcase4() {
	
}
	@Test(groups="smoke")
public void testcase5() {
	
}
	@Test(groups="regression")
public void testcase6() {
	
}
}
