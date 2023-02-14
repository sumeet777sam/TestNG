package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.baseclass;
import pageObjectModel.LoginPageObjects;

public class verifyLogin extends baseclass {
	
	@Test
	public void login() throws IOException {
		
		driverInitilize();
		driver.get("https://login.salesforce.com/");
		
		LoginPageObjects obj=new LoginPageObjects(driver);
		
		obj.enterUsername().sendKeys("rahul");
		
		obj.enterPassword().sendKeys("test");
		
		obj.clickOnLogin().click();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
