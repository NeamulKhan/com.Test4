package test4PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityTest4.BaseClassTest4;

public class HomePageLocatorTest4 extends BaseClassTest4{
	
	public HomePageLocatorTest4() {
		
		PageFactory.initElements(driver, this);
		
		}

	@FindBy (id="nava")
	public WebElement title;
	
}
