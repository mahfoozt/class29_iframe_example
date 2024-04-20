package aUI_Concept;

import java.io.IOException;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RightClick {      

	public static void main(String[] args) throws InterruptedException, IOException {
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));			
		Page page = browser.newPage();
//Launch the URL Address	
		page.locator("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//Maximize the window
//select Right Click Me Element and store it in a variable
		//WebElement right click = page.locator("//span[text()='right click me']");
		Thread.sleep(2000);
//create object of Actions Class and pass the driver
		//Actions action = new Actions(driver);
//perform Right Click action 
		//action.contextClick(right click).perform();
//Click the Delete or any button
		page.locator("//span[text()='Delete']").click();
//wait for 3 sec
		Thread.sleep(3000); 
//switch to Alert and print alert text 
		// String alertext = driver.switchTo().alert().getText();
		// System.out.println(alertext);
		 Thread.sleep(2000);
		// driver.switchTo().alert().accept();
//verification of the alert text 
//		 if ("clicked: delete".equals(alertext)) {
//			System.out.println("clicked: delete--Alert text Match--------");
//		} else {
//			System.out.println("clicked: delete----Alert text not match--");
//		}
//perform Right Click action and keep doing same steps for other button
		//action.contextClick(right click).perform();
//Click the Cut or any button
		page.locator("//span[text()='Cut']").click();
//wait for 3 sec
		Thread.sleep(3000);
//switch to Alert and print alert text 
		//String alerttext1 =  page).alerttext1();
		//System.out.println(alerttext1);
//accept the alert 
//		/driver.switchTo().alert().accept();
//		if ("clicked: cut".equals(alerttext1)) {
//			System.out.println("clicked: cut ----Alert Text Match--------");
//		} else {
//			System.out.println("clicked: cut ----Alert Text  Not Match---");
//		}
//Again take the Screen Shot 
	}

}
