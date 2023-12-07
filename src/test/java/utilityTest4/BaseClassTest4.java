package utilityTest4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClassTest4 {
	
	
	public static Properties test4_prop;
	public static WebDriver driver;

  public BaseClassTest4(){
	  	
				
		try {
			FileInputStream file = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\com\\Test4\\config\\com.Test4.Properties");	
				
			test4_prop = new Properties();
			test4_prop.load(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		}
		
		public void test4browserinit() {
			
		String browser = test4_prop.getProperty("Browser1");
		
		if (browser.equalsIgnoreCase("Chrome")) {
			
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\webDriverTest4\\chromedriver.exe");	
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDataTest4.implicitywait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestDataTest4.pageLoadwait));
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
				
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			
			}
			
		}
		public static void test4launchURL(String URL) {
			
			driver.get(test4_prop.getProperty("URL"));
		}
	

  }




