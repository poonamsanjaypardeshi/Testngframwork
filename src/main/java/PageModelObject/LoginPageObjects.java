package PageModelObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
   
	public WebDriver driver;  // this driver dont have scope
	
	// this is code line for git purpose
     
	// driver.findelements(By.xpath("").sendkeys();
	// we have achived Encapsulation
	private  By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By LoginButton = By.xpath("//input[@id='Login']");
	private By TryforFree = By.xpath("//a[@id='signup_link']");

	public LoginPageObjects(WebDriver driver2) {
	this.driver= driver2;
	}
	public WebElement Enterusername() {

		return driver.findElement(username);
	}
	public WebElement Enterpassword() {

		return driver.findElement(password);
	}
	public WebElement clicklogin() {

		return driver.findElement(LoginButton);
	}
	public WebElement clickontryforfree() {

		return driver.findElement(TryforFree);
	}
}
