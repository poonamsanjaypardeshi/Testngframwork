package Testcase;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageModelObject.LoginPageObjects;
import PageModelObject.SignupPageObjects;
import Resources.BaseClass;
import Resources.Commonutilities;
import Resources.Testcasedata;

public class VeryfySignUp extends BaseClass {
	
	@Test
	public void signup () throws IOException, InterruptedException {
		
		
    	LoginPageObjects LPO = new LoginPageObjects(driver);
		 LPO.clickontryforfree().click();
		 Thread.sleep(1000);
		 
		  String ActualTile= driver.getTitle();
		  String expectedTitle=Testcasedata.expectedTiltle;
		  
		  Commonutilities.Handleassertions(ActualTile, expectedTitle);
		  
		 SignupPageObjects SOP = new  SignupPageObjects(driver);
		 SOP.Enterfirstname().sendKeys(Testcasedata.firstname);
		 
		 Thread.sleep(1000);
		 SOP.Enterlastname().sendKeys(Testcasedata.lastname);
		 
		 Thread.sleep(1000);
		 
		 Commonutilities.dropdownHandle(SOP.Selectonjobtitle(),1);
		 Commonutilities.dropdownHandle(SOP.Selectemployee(),3);
		 
		 
		 
		/* Select s= new Select(SOP.Selectonjobtitle());// this is for to select individual select 
				s.selectByIndex(1);
				
				Select p = new Select(SOP.Selectemployee());
				p.selectByIndex(1);       */
	}

}
