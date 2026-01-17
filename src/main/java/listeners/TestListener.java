package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import base.BaseTest;
import utilities.ScreenshotUtil;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		BaseTest testClass = (BaseTest) result.getInstance();
		
		ScreenshotUtil.capture(testClass.driver, result.getName());
	}
}
