package btm;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import listeners.Utility;

public class Result implements ITestListener {
static int passcount; int failCount; int skipCount;
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+"is pass ",true);
		passcount++;
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
      String name=result.getName();
      Reporter.log("Test:"+name+"is Fail ",true);
      failCount++;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+"is Skipped ",true);
		skipCount++;
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
      		Reporter.log("pass:"+passcount,true);
      		Reporter.log("Fail:"+failCount,true);
      		Reporter.log("Skip:"+skipCount,true);
      		Utility.writeResultToExcel("./result/Summary.xlsx", passcount, failCount, skipCount);
	}

}
