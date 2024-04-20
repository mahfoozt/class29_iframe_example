package aUI_Concept;

import java.io.IOException;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException, IOException {
//Launch Playwright and  browser
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));			
		Page page = browser.newPage();
		//page.navigate("https://the-internet.herokuapp.com/javascript_alerts");	
		//page.navigate("https://jqueryui.com");	
		page.navigate("http://mrbool.com/");
//Maximize the window
//Select Content element and store it in a variable
		//WebElement Content = page.locator("//a[@class='menulink']");
//create object of Actions Class and pass the driver
		//Actions action = new Actions(driver);
//perform Move To Element (mouse hoover on) action 
		//action.moveToElement(Content).perform();
//Then click the Articles Element 
		page.locator("//a[text()='Articles']").click();
		Thread.sleep(2000);
//print Title on Console 
		System.out.println(page.title());
//verification of the title page by using if else loop
		if ("Search Results - Mr.Bool".equals(page.title())) {
			System.out.println("Search Results - Mr.Bool-----Title Match----------");
		}else {
			System.out.println("Search Results - Mr.Bool-----Title Not Match----------");
		}
//Again take the Screen Shot 
//		File src = driver.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./Snap_AUI_Concept/MoveToElement_image.png");
//		FileUtils.copyFile(src, dest);	
		
		//page.close();	
		
	}
	

}
