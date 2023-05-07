package PageModelObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {
	
	public WebDriver driver;
	
	 private By firstname = By.xpath("//input[@name='UserFirstName']");
	 private By lastnamename = By.xpath("//input[@name='UserLastName']");
	 
	  private By JobTitle =By.xpath("//select[@name='UserTitle']");
	  private By Employees = By.xpath("//select[@name='CompanyEmployees']");
	
	public SignupPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement Enterfirstname() {
		return driver.findElement(firstname);
	}
	public WebElement Selectonjobtitle() {
		return driver.findElement(JobTitle);
	}
	public WebElement Enterlastname() {
		return driver.findElement( lastnamename);
	}
	public WebElement Selectemployee() {
		return driver.findElement(Employees);
	}
}

