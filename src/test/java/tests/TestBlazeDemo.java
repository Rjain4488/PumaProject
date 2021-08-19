package tests;


import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestBlazeDemo extends BaseScenario{
	
	@Test(priority = 1)
	public void verifyTitleOfHomePage() {
		try {
			String expectedTitle = "BlazeDemo";
			String actualTitle = cmnDriver.getDriver().getTitle();
						
			Assert.assertEquals(actualTitle, expectedTitle);
		} catch (Exception e) {
			fail();
			e.printStackTrace();
		}
		
	}
	
	@Test(priority = 4)
	public void verifyFlightBooking() {
		try {
			hmPage.searchFlight("Paris", "Rome");
			ftPage.chooseFlight();
			uiPage.enterName("Rishabh");
			uiPage.enterAddress("test address");
			uiPage.enterCity("pune");
			uiPage.enterState("goa");
			uiPage.enterZipcode("123456");
			uiPage.enterCardType("Visa");
			uiPage.enterCardnumber("2233445566778899");
			uiPage.enterCardMonth("11");
			uiPage.enterCardYear("2020");
			uiPage.enterNameOnCard("Rishabh Jain");
			uiPage.selectCheckbox();
			uiPage.clickOnPurchaseFlight();
			
			String expectedTitle = "Thank you for your purchase today!";
			String actualTitle = fnPage.getHeading();
						
			Assert.assertEquals(actualTitle, expectedTitle);
			
		} catch (Exception e) {
			fail();
			e.printStackTrace();
		}
	}

}
