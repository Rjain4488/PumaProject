package commonLibs.implementations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonLibs.contracts.Idropdown;

public class DropdownControl implements Idropdown{
	
	private Select getDropDown(WebElement element) {
		Select dropdown = new Select(element);
		return dropdown;
	}

	@Override
	public void selectViaVisibleText(WebElement element, String visibleText) throws Exception {
		getDropDown(element).selectByVisibleText(visibleText);
	}

}
