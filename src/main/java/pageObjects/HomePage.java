package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.implementations.DropdownControl;
import commonLibs.implementations.TextBoxControl;

public class HomePage {
	
	@FindBy(name = "fromPort")
	private WebElement fromCity;
	
	@FindBy(name = "toPort")
	private WebElement toCity;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement findFlightButton;
	
	private DropdownControl dropDown;
	private TextBoxControl textbox;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		textbox = new TextBoxControl();
		dropDown = new DropdownControl();
		
	}
	
	public void searchFlight(String from, String to) throws Exception{
		
		try {
			dropDown.selectViaVisibleText(fromCity, from);
			dropDown.selectViaVisibleText(toCity, to);
			textbox.click(findFlightButton);
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
		
	}
	
	

}
