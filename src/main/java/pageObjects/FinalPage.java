package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage {
			
		@FindBy(xpath = "//div[@class='container hero-unit']//h1")
		private WebElement heading;
		
		
		public FinalPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		public String getHeading() throws Exception {
			return (heading.getText());
		}

}
