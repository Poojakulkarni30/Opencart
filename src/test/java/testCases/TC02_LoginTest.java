package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC02_LoginTest extends BaseClass{

	@Test
	public void test_Login()
	{
		logger.info("Starting TC_002_LoginTest");
		
	//	try
//{				
			HomePage hp=new HomePage(driver);
			
			hp.clickMyAccount();
						
			hp.clickLogin();
			
			LoginPage lp=new LoginPage(driver);
			
			logger.info("Enter email TC_002_LoginTest");
			
			lp.setEmail(rb.getString("email")); // valid email, get it from properties file
			logger.info("Enter password TC_002_LoginTest");
			lp.setPassword(rb.getString("password")); // valid password, get it from properties file
			logger.info("Click on login button TC_002_LoginTest");
			lp.clickLogin();
			
			/*	MyAccountPage macc=new MyAccountPage(driver);
			
			boolean targetpage=macc.isMyAccountPageExists();
						
			Assert.assertEquals(targetpage, true);
			
		}	
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info(" Finished TC_002_LoginTest");
		
	}
	*/
	
}
}