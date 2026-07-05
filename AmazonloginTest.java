package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AmazonloginTest {
	 @Test
     public static void loginWithValidCred() throws InterruptedException 
     {
             ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");           
driver.manage().window().maximize();
             Thread.sleep(3000);
             WebElement e1=        driver.findElement(By.xpath("//input[@name='email']"));
             e1.sendKeys("7989351968");
             
             WebElement e2=        driver.findElement(By.xpath("//input[@type='submit']"));
             e2.click();
             Thread.sleep(3000);

             WebElement e3=        driver.findElement(By.xpath("//input[@type='password']"));
                                                                                                                                                                                                                     e3.sendKeys("@2703");
                                                                                                                                                                                                                     Thread.sleep(3000);

             WebElement e4=        driver.findElement(By.xpath("//input[@id='signInSubmit']"));
             e4.click();
             
             WebElement e5=        driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
             Actions a1=new Actions(driver);
             a1.moveToElement(e5).perform();
             
             WebElement e8=                driver.findElement(By.xpath("//span[text()='Sign Out']"));                
             e8.click();
             WebElement e7=        driver.findElement(By.xpath("//div[@class='a-section a-spacing-none']/h1"));
             String text=        e7.getText();
             Assertion a6=new Assertion();
             a6.assertEquals(text, "Sign in or create account");
             //        Assert.assertEquals(text, "Sign in or create account");
//     /        Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
     }
}
