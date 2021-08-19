package commonLibs.implementations;

import org.openqa.selenium.WebElement;

import commonLibs.contracts.Itextbox;

public class TextBoxControl implements Itextbox{

	@Override
	public void setText(WebElement element, String textToSet) throws Exception {
		element.sendKeys(textToSet);
	}

	@Override
	public void click(WebElement element) throws Exception {
		element.click();
		
	}
	

}
