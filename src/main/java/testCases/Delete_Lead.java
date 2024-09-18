package testCases;

//import org.junit.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class Delete_Lead extends ProjectMethods {
	@Test
	public void deletelead() throws InterruptedException {
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		WebElement crmfsa = locateElement("link", "CRM/SFA");
		click(crmfsa);*/

		WebElement link = locateElement("link", "Create Lead");
		click(link);
		
		click(locateElement("xpath", "//a[@href = '/crmsfa/control/findLeads']"));
		
		type(locateElement("xpath", "(//div[@class = 'x-form-element'])[18]/input"),"10");
		
		click(locateElement("xpath", "(//button[text() = 'Find Leads'])[1]"));
		
		Thread.sleep(3000);
		
		click(locateElement("link", "10354"));
		
		click(locateElement("link", "Delete"));
		
	}

}
