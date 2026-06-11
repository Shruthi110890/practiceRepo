package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyser implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		boolean retry=false;
		int retry_count=0;
		int Max_retry_limit=2;
		if(retry_count<2)
		{
			retry_count++;
			System.out.println(" result is "+ result.getName());
			retry=true;
		}
		return false;
	}

}
