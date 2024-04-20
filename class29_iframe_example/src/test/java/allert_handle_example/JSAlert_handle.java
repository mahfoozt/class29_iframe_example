package allert_handle_example;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class JSAlert_handle {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));			
		Page page = browser.newPage();
		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");	
//--------For JS Alert-------------------------------- 	
		page.onceDialog(dialog ->{	//Lambda function 		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Accept the alert 
			dialog.accept();
			//dialog.dismiss();
			System.out.println("Alert Dialog is: "+dialog.message());
		});	
		//screen shot
				Thread.sleep(1000);
				page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./target/Snap_Shot_Folder/JSAlert_Page.png")));
				Thread.sleep(1000);
		page.locator("text=Click for JS Alert").click();		
//--------For JS Confirm Alert-------------------------------- 	
		page.onceDialog(dialog ->{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}	
			//Accept the alert 
			dialog.accept();
			//dialog.dismiss();
			System.out.println("Alert Dialog is: "+dialog.message());
		});	
		//screen shot
				Thread.sleep(1000);
				page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./target/Snap_Shot_Folder/JSConfirm_Page.png")));
				Thread.sleep(1000);
		Thread.sleep(3000);
		page.locator("text=Click for JS Confirm").click();		
//--------For JS Confirm Alert-------------------------------- 				
		page.onceDialog(dialog ->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			//Accept the alert 
			dialog.accept("I am a human not robot, GoodBye");	
			System.out.println("Alert Dialog is: "+dialog.message());
		});	
		//screen shot
		Thread.sleep(1000);
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./target/Snap_Shot_Folder/JSPrompt_Page.png")));
		Thread.sleep(1000);
		Thread.sleep(3000);
		page.locator("text=Click for JS Prompt").click();	
	}
			
}
