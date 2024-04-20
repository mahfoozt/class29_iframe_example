package allert_handle_example;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Java_Alert {

	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));			
		Page page = browser.newPage();
		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");	
		//page.navigate("https://www.walmart.com/");
	
		
	
	//Absolute XPATH--	//*[@id="yui_3_17_2_1_1698896167102_73"]

	}

}
