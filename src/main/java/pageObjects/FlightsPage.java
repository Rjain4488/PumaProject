package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.implementations.TextBoxControl;

public class FlightsPage {
	
	@FindBy(xpath = "//tr[1]//td[1]//input")
	private WebElement ChooseFlight;
	
	private TextBoxControl textbox;
	
	public FlightsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		textbox = new TextBoxControl();
	}
	
	public void chooseFlight() throws Exception {
		textbox.click(ChooseFlight);
	}

}
