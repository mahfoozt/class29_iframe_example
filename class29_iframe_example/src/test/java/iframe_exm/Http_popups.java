package iframe_exm;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Http_popups {

	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		//BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

		//page = context.newPage();
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setHttpCredentials("postman", "password"));
		
		Page page = context.newPage();
		page.navigate("https://postman-echo.com/basic-auth");
		

	}

}
