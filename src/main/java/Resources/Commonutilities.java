package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Commonutilities {

	       //This is commmon method for dropdoen handle
	
		public static void dropdownHandle(WebElement dropdownxpath,int dropdownvalue ) {
		
		Select s= new Select(dropdownxpath);
		s.selectByIndex(dropdownvalue);
		
		}
	
	
	public static void Handleassertions(String expected, String Actual) {
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(Actual,expected);
	
		assertion.assertAll();  //this is mandatory line
	}
		
	
	}

