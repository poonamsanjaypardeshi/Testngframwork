package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageModelObject.LoginPageObjects;
import Resources.BaseClass;
import Resources.Commonutilities;
import Resources.Testcasedata;

public class Verifylogintestcase  extends BaseClass {
	
	        @Test
	public void login() throws IOException {
        	
        	
        	LoginPageObjects LPO = new LoginPageObjects(driver);
        	LPO.Enterusername().sendKeys(Testcasedata.username);
        	LPO.Enterpassword().sendKeys(Testcasedata.password);
        	LPO.clicklogin().click();
        	
        	
     	
        	String Actualcode = driver.findElement(By.xpath("//div[@id='error']")).getText();
        	String  expectedpassword= Testcasedata.expectedpassword;
        	
        	
        	Commonutilities.Handleassertions(expectedpassword, Actualcode);
	       
	    	
        		
        	}
		
}

