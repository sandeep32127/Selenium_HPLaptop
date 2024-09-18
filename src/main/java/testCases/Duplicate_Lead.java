package testCases;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Duplicate_Lead extends SeMethods{
	@Test(invocationCount=3)
	public void duplicateLead() {
		
		startApp("chrome", "http://leaftaps.com/opentaps");

		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");

		WebElement password = locateElement("password");
		type(password, "crmsfa");

		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		WebElement crmfsa = locateElement("link", "CRM/SFA");
		click(crmfsa);
		
		click(locateElement("link", "Leads"));
		
		click(locateElement("link", "10262"));
		
		click(locateElement("link", "Duplicate Lead"));
		
		selectDropDownUsingText(locateElement("createLeadForm_dataSourceId"), "Existing Customer");
		
		type(locateElement("createLeadForm_companyName"), "Raju");
		
		click(locateElement("class", "smallSubmit"));


	}

}
