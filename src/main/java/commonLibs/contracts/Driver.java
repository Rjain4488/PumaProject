package commonLibs.contracts;

public interface Driver {
	
	public void openBroswerAndNavigateToURL(String url) throws Exception;
	
	public String getTitle() throws Exception;
	
	public void navigateToUrl(String url) throws Exception;
	
	public void closeBrowser() throws Exception;
	
	public void closeAllBrowser() throws Exception;
	
	

}
