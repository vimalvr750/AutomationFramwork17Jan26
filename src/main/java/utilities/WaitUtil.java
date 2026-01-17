package utilities;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	public static void waitForPageLoad(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(webDriver -> 
				((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState")
				.equals("complete")
				);
		
		 try {
		        Thread.sleep(3000);
		    } catch (InterruptedException e) {}
	}
}
