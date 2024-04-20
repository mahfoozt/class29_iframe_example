package aUI_Concept;

import java.io.IOException;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Resizable {

	public static void main(String[] args) throws InterruptedException, IOException {
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));			
		Page page = browser.newPage();
		page.navigate("https://jqueryui.com");	
		Thread.sleep(2000);
//click Resize able button outside the frame
		page.locator("//a[text()='Resizable']").click();
////switching to frame
//		driver.switchTo().frame(0);
		page.frameLocator("#content > iframe").locator("#resizable").click();
////Drag and Drop Variable's XPATH saving in src1 and dest1 		
//		WebElement src1 = driver.findElementByXPath("//div[@class='ui-resizable-handle ui-resizable-s']");
//		WebElement dest1 = driver.findElementByXPath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']");
//		//WebElement dest1 = driver.findElementByXPath("//div[@id='resizable']");
//
//		Thread.sleep(1500);		
//		Actions action = new Actions(driver);
////Drag And Drop action code is performing 
//		action.dragAndDrop(src1, dest1).perform();
//		Thread.sleep(2000);
//	
////switch back to main frame
//		driver.switchTo().parentFrame();
//click Sort able button outside the frame 
		page.locator("//a[text()='Resizable']").click();
//Verification of the title page
		System.out.println(page.title());
		//String Title1= driver.getTitle();
		if ("Resizable | jQuery UI".contains(page.title())) {
			System.out.println("Resizable | jQuery UI------Title Match-------------");
		}else {
			System.out.println("-----Title Not Match----------");
		}
////Again take the Screen Shot 
//		File src = driver.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./Snap_AUI_Concept/Resizable_image.png");
//		FileUtils.copyFile(src, dest);	
//			
		//page.close();
		
		
	}

}
