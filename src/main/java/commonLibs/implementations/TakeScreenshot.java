package commonLibs.implementations;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import commonLibs.contracts.ITakeScreenshot;

public class TakeScreenshot implements ITakeScreenshot{
	
	private WebDriver driver;
	
	public TakeScreenshot(WebDriver driver) {
		this.driver=driver;
	}

	@Override
	public void captureAndSaveScreenshot(String fileName) throws Exception {
		fileName=fileName.trim();
		
		File imgFile, tmpFile;
		
		imgFile= new File(fileName);
		
		if(imgFile.exists()) {
			throw new Exception("Duplicate File Name");
		}
		
		tmpFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(imgFile, tmpFile);
		
	}
	
	

}
