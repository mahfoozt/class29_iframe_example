package aUI_Concept;

import java.io.IOException;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Draggable {

	public static void main(String[] args) throws InterruptedException, IOException {
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));			
		Page page = browser.newPage();
		//page.navigate("https://the-internet.herokuapp.com/javascript_alerts");	
		page.navigate("https://jqueryui.com");
		
		Thread.sleep(2000);
//click Drag able button outside the frame 
		page.locator("//a[contains(text(),'Draggable')]").click();
//switching to frame
		//driver.switchTo().frame(0);
//Drag and pull variable's XPATH saving in src and dest
		//WebElement src1 = driver.findElementByXPath("//p[text()='Drag me around']");
		//WebElement dest1 = driver.findElementByXPath("//div[@id='draggable']");
		
		Thread.sleep(1500);
//create Actions class object
		//Actions action = new Actions(driver);
//Drag and Pull action code is performing 
		//action.dragAndDrop(src1, dest1).perform();
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
//	 File src = driver.getScreenshotAs(OutputType.FILE);
//	 File dest = new File("./Snap_AUI_Concept/Draggable_image.png");
//	 FileUtils.copyFile(src, dest);	
//		
		//driver.close();	
		
	}

}
