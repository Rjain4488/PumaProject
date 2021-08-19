package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import commonLibs.implementations.CommonDriver;
import pageObjects.FinalPage;
import pageObjects.FlightsPage;
import pageObjects.HomePage;
import pageObjects.UserInfoPage;

public class BaseScenario {
	
	public CommonDriver cmnDriver;
	public FlightsPage ftPage;
	public HomePage hmPage;
	public UserInfoPage uiPage;
	public FinalPage fnPage;
	private WebDriver driver;
	
	public String url;
	
	@BeforeClass
	public void invokeBrowser() {
		try {
			cmnDriver = new CommonDriver("Chrome");
			cmnDriver.setPageLoadTimeout(90L);
			cmnDriver.setElementDetectionTimeout(10L);
			cmnDriver.openBroswerAndNavigateToURL("https://blazedemo.com/");
			driver = cmnDriver.getDriver();
			ftPage = new FlightsPage(driver);
			hmPage = new HomePage(driver);
			uiPage = new UserInfoPage(driver);
			fnPage = new FinalPage(driver);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@AfterClass
	public void cleanUp() {
		try {
			cmnDriver.closeAllBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
