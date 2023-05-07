package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public WebDriver browserlaunch() throws IOException {  
		
	// this will help us toread data.properties file
  FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		  prop =new Properties();
		  
		  prop.load(fis);
		  
		  ChromeOptions options =new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		  
		  String browsername= prop.getProperty("browser");
		  		  		  
		  if(browsername.equalsIgnoreCase("chrome")) {
			  
			//  WebDriverManager.chromedriver().setup();     //this will for latest version of your chrome driver
			 // driver=new ChromeDriver();
			  
			  System.setProperty("webdriver.chrome.driver",	"C:\\Users\\I\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
			  
			  driver = new ChromeDriver(options);
		  }
			  else if (browsername.equalsIgnoreCase("firefox")) {
				  // code of firefox
			  }
		  
			  else if (browsername.equalsIgnoreCase("edge")) {
				  // code of firefox
			  }
			  else {
				  System.out.println("please select valid browser");
			  }
		  return driver;
		  
		  }
	           @BeforeMethod
	      public  void launchbrowser() throws IOException {
	        	   browserlaunch();
	        	      
	      		    // this driver have scope
	           	driver.get(prop.getProperty("url"));
	           	
	    	  
	      }   
	           @AfterMethod
	           public void endbrowser() {
	    	  driver.quit();
	      }

}
