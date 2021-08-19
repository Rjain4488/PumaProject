package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.implementations.CheckboxControl;
import commonLibs.implementations.DropdownControl;
import commonLibs.implementations.TextBoxControl;

public class UserInfoPage {

	@FindBy(id = "inputName")
	private WebElement firstName;

	@FindBy(id = "address")
	private WebElement userAddress;

	@FindBy(id = "city")
	private WebElement userCity;

	@FindBy(id = "state")
	private WebElement userState;

	@FindBy(id = "zipCode")
	private WebElement userZipcode;

	@FindBy(id = "cardType")
	private WebElement userCardType;


	@FindBy(id = "creditCardNumber")
	private WebElement userCreditCardNumber;


	@FindBy(id = "creditCardMonth")
	private WebElement userCreditCardMonth;

	@FindBy(id = "creditCardYear")
	private WebElement userCreditCardYear;


	@FindBy(id = "nameOnCard")
	private WebElement userNameOnCard;


	@FindBy(id = "rememberMe")
	private WebElement rememberMeCheckBox;


	@FindBy(xpath = "//input[@value='Purchase Flight']")
	private WebElement PurchaseFlight;



	private DropdownControl dropDown;
	private TextBoxControl textbox;
	private CheckboxControl checkbox;

	public UserInfoPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		textbox = new TextBoxControl();
		dropDown = new DropdownControl();
		checkbox = new CheckboxControl();
		

	}
	
	public void enterName(String name) throws Exception {
		textbox.setText(firstName, name);
	}
	
	public void enterAddress(String address) throws Exception {
		textbox.setText(userAddress, address);
	}
	
	public void enterCity(String city) throws Exception {
		textbox.setText(userCity, city);
	}
	
	public void enterState(String state) throws Exception {
		textbox.setText(userState, state);
	}
	
	public void enterZipcode(String zipcode) throws Exception {
		textbox.setText(userZipcode, zipcode);
	}
	
	public void enterCardType(String cardtype) throws Exception {
		dropDown.selectViaVisibleText(userCardType, cardtype);
	}
	
	public void enterCardnumber(String cardnumber) throws Exception {
		textbox.setText(userCreditCardNumber, cardnumber);
	}
	
	public void enterCardMonth(String month) throws Exception {
		textbox.setText(userCreditCardMonth, month);
	}
	
	public void enterCardYear(String year) throws Exception {
		textbox.setText(userCreditCardYear, year);
	}
	
	public void enterNameOnCard(String nameoncard) throws Exception {
		textbox.setText(userNameOnCard, nameoncard);
	}
	
	public void selectCheckbox() throws Exception {
		checkbox.changeCheckBoxStatus(rememberMeCheckBox, true);
	}
	
	public void clickOnPurchaseFlight() throws Exception {
		textbox.click(PurchaseFlight);
	}

}
