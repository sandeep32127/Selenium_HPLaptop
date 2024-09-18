package testCases;



import org.junit.Test;
import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class EditLead extends SeMethods {
	@Test
	public void Editlead() throws InterruptedException {
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		WebElement crmfsa = locateElement("link", "CRM/SFA");
		click(crmfsa);

		WebElement link = locateElement("link", "Create Lead");
		click(link);
		
		//Thread.sleep(3000);
		
		WebElement companyName = locateElement("createLeadForm_companyName");
		type(companyName, "Accenture");
		
		WebElement firstName = locateElement("createLeadForm_firstName");
		type(firstName, "Rekha");
		
		type(locateElement("createLeadForm_lastName"),"Bharati");
		
		WebElement source = locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingText(source, "Employee");
		
		click(locateElement("class", "smallSubmit"));
		
		WebElement edit = locateElement("link", "Edit");
		click(edit);
		
		type(locateElement("updateLeadForm_companyName"),"TechM");
		
		type(locateElement("updateLeadForm_firstName"),"Bhano");
		
		click(locateElement("xpath", "//img[@src = '/images/fieldlookup.gif']"));
		
		switchToWindow(1);
		
		type(locateElement("xpath", "//div[@class = 'x-form-element']/input"),"10");
		
		click(locateElement("xpath", "//button[@class = 'x-btn-text']"));
		
		Thread.sleep(3000);
		
		click(locateElement("link", "10655"));
		
		switchToWindow(0);
		
		click(locateElement("name", "submitButton"));
		
	}

}
