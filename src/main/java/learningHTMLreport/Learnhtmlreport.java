package learningHTMLreport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Learnhtmlreport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentHtmlReporter html = new ExtentHtmlReporter("./Reporter/result.html");
		html.setAppendExisting(true);
		ExtentReports test = new ExtentReports();
		test.attachReporter(html);
		ExtentTest createTest = test.createTest("TC_01_Edit_Lead", "You have successfully edited the lead");
		createTest.assignAuthor("Sandeep");
		createTest.assignCategory("Functional testing");
		createTest.pass("The testcase executed successfully" , MediaEntityBuilder.createScreenCaptureFromPath("./../snap/img2.png").build());
		test.flush();
		System.out.println("Executed successfully");
		
	}
	

}
