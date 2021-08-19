package commonLibs.implementations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonLibs.contracts.Driver;

public class CommonDriver implements Driver {
	
	private WebDriver Driver;
	private long pageLoadTimeout;
	private long elementDetectionTimeout;
	
	public WebDriver getDriver() {
		return Driver;
	}
	
	public void setPageLoadTimeout(long pageLoadTimeout) {
		this.pageLoadTimeout = pageLoadTimeout;
	}
	
	public void setElementDetectionTimeout(long elementDetectionTimeout) {
		this.elementDetectionTimeout=elementDetectionTimeout;
	}
	
	public CommonDriver(String BrowserType) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\RJ\\softwares\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		elementDetectionTimeout = 20l;
		pageLoadTimeout = 60l;
		
	}

	@Override
	public void openBroswerAndNavigateToURL(String url) throws Exception {
		url = url.trim();
		if(url.isEmpty()) {
			url = "about:blank";
		}
		
		Driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);
		Driver.get(url);
	}

	@Override
	public String getTitle() throws Exception {
		return Driver.getTitle();
	}

	@Override
	public void navigateToUrl(String url) throws Exception {
		Driver.navigate().to(url);
	}

	@Override
	public void closeBrowser() throws Exception {
		Driver.close();
	}

	@Override
	public void closeAllBrowser() throws Exception {
		Driver.quit();
	}

}
