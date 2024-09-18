package project_day1;

import org.junit.Test;
import org.openqa.selenium.Keys;

import wdMethods.SeMethods;

public class StateResolved extends SeMethods{
	@Test
	public void stateResolved() throws InterruptedException {

		startApp("chrome", "https://dev49407.service-now.com/");
		Thread.sleep(4000);

		switchToFrame(locateElement("gsft_main"));

		type(locateElement("name", "user_name"), "admin");

		type(locateElement("user_password"),"Sandeep@32127");

		click(locateElement("sysverb_login"));

		switchOutToFrame();

		Thread.sleep(4000);

		type(locateElement("xpath", "//input[@ng-focus='openNavigator(true)']"), "incident");

		Thread.sleep(5000);

		click(locateElement("link", "Assigned to me"));

		Thread.sleep(2000);


		switchToFrame(locateElement("gsft_main"));

		Thread.sleep(3000);

		click(locateElement("xpath", "//a[@class = 'list_filter_toggle icon-filter btn btn-icon']"));

		Thread.sleep(3000);

		click(locateElement("xpath", "//td[@class = 'sn-filter-top condition-row__remove-cell']/button"));

		Thread.sleep(3000);

		click(locateElement("xpath", "//button[@class = 'filerTableAction btn btn-default deleteButton']"));

		Thread.sleep(3000);

		click(locateElement("xpath", "(//button[text() = 'Run'])[2]"));

		Thread.sleep(3000);

		type(locateElement("xpath", "//input[@class = 'form-control']"), "INC0010065",Keys.ENTER);

		Thread.sleep(3000);

		click(locateElement("link", "INC0010065"));

		switchOutToFrame();

		Thread.sleep(3000);

		switchToFrame(locateElement("gsft_main"));

		Thread.sleep(3000);

		selectDropDownUsingText(locateElement("id", "incident.state"), "Resolved");

		Thread.sleep(3000);
		
		click(locateElement("xpath", "//span[text() = 'Resolution Information']"));
		
		Thread.sleep(2000);
		
		selectDropDownUsingText(locateElement("id", "incident.close_code"), "Solved Remotely (Work Around)");

		Thread.sleep(2000);
		
		type(locateElement("id", "incident.close_notes"), "I m Sandeep");
		
		click(locateElement("xpath", "(//button[@id = 'sysverb_update'])[2]"));

		Thread.sleep(2000);
		
		System.out.println("The text in the alert box is : "+getAlertText());
		
		acceptAlert();
		

		//switchOutToFrame();

	}

}
