package iframe_exm;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Iframe_W3 {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));			
		Page page = browser.newPage();
		//page.navigate("https://the-internet.herokuapp.com/javascript_alerts");	
		page.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		//https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get
		Thread.sleep(2000);
//click try it button inside the frame
		//page.locator("//iframe[@name='iframeResult']").click();
		page.frameLocator("//iframe[@name='iframeResult']").locator("body > button").click();
		
		Thread.sleep(2000);
		page.locator("//a[@id='getwebsitebtn']").click();
		Thread.sleep(1000);
		//page.goBack();
		Thread.sleep(1000);
		page.navigate("https://www.w3schools.com/spaces/index.php");
		Thread.sleep(1000);
	
		page.locator("//*[@id=\"subtopnav\"]/a[6]").click();
		Thread.sleep(1000);
		page.locator("//*[@id=\"subtopnav\"]/a[15]").click();
		
	}

}
   