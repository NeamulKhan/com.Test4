package test4PageAction;

import org.testng.Assert;

import test4PageLocator.HomePageLocatorTest4;
import utilityTest4.BaseClassTest4;

public class HomePageActionTest4 extends BaseClassTest4{
	
	HomePageLocatorTest4 homePageLocatorTest4 = new HomePageLocatorTest4();
	
	public void verifyHomePageTitle() {
		
		boolean verifyTitle = homePageLocatorTest4.title.isDisplayed();
		
		Assert.assertTrue(verifyTitle);
	}

}
