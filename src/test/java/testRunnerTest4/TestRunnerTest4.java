package testRunnerTest4;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import utilityTest4.BaseClassTest4;


@CucumberOptions(features= {"src/test/resources/featureFolderTest4"},
//plugin={"json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
glue="stepDefinationTest4",tags= "@LoginTest4" 

		)


public class TestRunnerTest4 extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	 
	 public void setup()throws IOException {
		 
		BaseClassTest4 test = new BaseClassTest4();
		 
		 test.test4browserinit();
	 }
		 
		 @AfterTest
		 
		 public void closerURL() throws IOException, Exception{
			 
			 BaseClassTest4 test = new BaseClassTest4();
			 
			 Thread.sleep(5000);
			 
			 test.driver.quit();
			 
			
		 
	 }
	 


}


	

