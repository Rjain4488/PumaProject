package commonLibs.implementations;

import org.openqa.selenium.WebElement;

import commonLibs.contracts.Icheckbox;

public class CheckboxControl implements Icheckbox{

	@Override
	public void changeCheckBoxStatus(WebElement element, boolean status) throws Exception {
		if((element.isSelected() && !status) || (element.isSelected() && status)) {
			element.click();
		}
	}
	

}
