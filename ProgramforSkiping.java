package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgramforSkiping {
@Test
public void login() throws InterruptedException {
	ChromeDriver d = new ChromeDriver();
	d.get("https://sellercentral.amazon.com/ap/signin?clientContext=131-0133890-7439673&openid.pape.preferred_auth_policies=Policy15&openid.pape.max_auth_age=300&openid.return_to=https%3A%2F%2Fsellercentral.amazon.com%2Fgp%2Fhomepage.html&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=sc_na_amazon_v2&openid.mode=checkid_setup&intercept=false&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=sc_amazon_v3_unified&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ssoResponse=eyJ6aXAiOiJERUYiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiQTI1NktXIn0.pCUo7xfJwqsS6XDt5ROIulXHvodLhgXF3XEIVZJoVN6lo4z6CBrasQ.62GXglCtLW_5VUWl.fLYYcHHR3lvnaaxNDDMStZsqsT91i9yyKUVHKo_HK0Mm-_KsHHd9XUkdR4Kee5BXSuUDbj0lorLaCI_V1f01nnT9r51TswDkLVAkfEhljZgUY5_OXbgnk12nX9oEKZZXKa7IwbkKJPrL3YmRcZTUPAGiYPOhWLHZgvmmHNnXNhjkPQXy04-LApL2DM11hvgworsihc7k-w.4DJ0RF3nJtWRI5viEVuJRw");
	d.manage().window().maximize();
	Thread.sleep(3000);
}
@Test(dependsOnMethods ="login" )
public void logout() {
	
}
}
