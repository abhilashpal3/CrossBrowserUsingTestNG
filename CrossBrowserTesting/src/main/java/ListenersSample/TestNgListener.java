package ListenersSample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases Execution Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases Execution Failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
