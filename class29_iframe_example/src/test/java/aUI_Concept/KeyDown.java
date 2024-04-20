package aUI_Concept;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
 
public class KeyDown {

	public static void main(String[] args) throws InterruptedException {
//Launch Playwright, browser and load url
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));			
		Page page = browser.newPage();	
		page.navigate("https://jqueryui.com");
		
//click Select able button outside the frame 
		page.locator("//a[text()='Selectable']").click();
//switching to frame
		page.frameLocator("#content > iframe").locator("#selectable > li:nth-child(1)").click();
		
//click the item numbers 
		//page.locator("//ol[@id='selectable']/li[1]").click();
		Thread.sleep(2000);
		page.frameLocator("#content > iframe").locator("//ol[@id='selectable']/li[2]").click();
		Thread.sleep(2000);
		page.frameLocator("#content > iframe").locator("//ol[@id='selectable']/li[3]").click();
		Thread.sleep(2000);
		page.frameLocator("#content > iframe").locator("//ol[@id='selectable']/li[4]").click();
		Thread.sleep(2000);
		page.frameLocator("#content > iframe").locator("//ol[@id='selectable']/li[5]").click();
		Thread.sleep(2000);
		page.frameLocator("#content > iframe").locator("//ol[@id='selectable']/li[6]").click();
		Thread.sleep(2000);
		page.frameLocator("#content > iframe").locator("//ol[@id='selectable']/li[7]").click();
//switch back to main frame
		//driver.switchTo().parentFrame();
//click Demos button out side the iframe		
		page.locator("//a[contains(text(),'Demos')]").click();
//Verification of the title page using IfElse Loop
		System.out.println(page.title());
		if ("jQuery UI Demos | jQuery UI".equals(page.title())) {
			System.out.println("jQuery UI Demos | jQuery UI------Title Match");
		
		}else {
			System.out.println("------Title Not Match------------------");
		}
		
//Again take the Screen Shot 
//		File src = driver.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./Snap_AUI_Concept/KeyDown_image.png");
//		FileUtils.copyFile(src, dest);	
//		
//		driver.close();
//			
	}
}


