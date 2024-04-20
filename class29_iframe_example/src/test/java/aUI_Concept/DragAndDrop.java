 package aUI_Concept;

import java.io.IOException;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));			
		Page page = browser.newPage();
		//page.navigate("https://the-internet.herokuapp.com/javascript_alerts");	
		page.navigate("https://jqueryui.com");	
		Thread.sleep(2000);
//click Drop able button outside the frame
		page.locator("//a[text()='Droppable']").click();
//switching to frame
		//((Object) page).switchTo().frame(0);
//Drag and Drop Variable's XPATH saving in src1 and dest1 		
		//WebElement src1 = driver.findElementByXPath("//p[text()='Drag me to my target']");
		//WebElement dest1 = driver.findElementByXPath("//div[@id='droppable']");		
		Thread.sleep(1500);		
		//Actions action = new Actions(page);
//Drag And Drop action code is performing 
		//action.dragAndDrop(src1, dest1).perform();
//switch back to main frame
		//page.switchTo().parentFrame();
//click Sort able button outside the frame 
		page.locator("//a[text()='Sortable']").click();
//Verification of the title page
		System.out.println(page.title());
		//String Title1= driver.getTitle();
		if ("Droppable | jQuery UI".contains(page.title())) {
			System.out.println("Sortable | jQuery UI------Title Match-------------");
		}else {
			System.out.println("-----Title Not Match----------");
		}
//Again take the Screen Shot 
//		 File src = driver.getScreenshotAs(OutputType.FILE);
//		 File dest = new File("./Snap_AUI_Concept/DragAndDrop_image.png");
//		 FileUtils.copyFile(src, dest);	
//			
		//driver.close();
	}
}
