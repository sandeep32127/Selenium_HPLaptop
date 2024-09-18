package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MergingOfLead extends SeMethods{
	@Test
	public void mergelead() throws InterruptedException {
		
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
		
		click(locateElement("link", "Merge Leads"));
		
		click(locateElement("xpath", "//img[@src = '/images/fieldlookup.gif']"));
		
		switchToWindow(1);
		
		type(locateElement("xpath", "//div[@class = 'x-form-element']/input"), "10");
		
		click(locateElement("xpath", "//button[@class = 'x-btn-text']"));
		
		Thread.sleep(3000);
		
		click(locateElement("link", "10403"));
		
		switchToWindow(0);
		
		click(locateElement("xpath", "(//img[@src = '/images/fieldlookup.gif'])[2]"));
		
		switchToWindow(1);
		
		type(locateElement("xpath", "//div[@class = 'x-form-element']/input"), "10");
		
		click(locateElement("xpath", "//button[@class = 'x-btn-text']"));
		
		Thread.sleep(3000);
		
		click(locateElement("link", "10406"));
		
		switchToWindow(0);
		
		click(locateElement("xpath", "//a[text() = 'Merge']"));
		
		String text = getAlertText();
		System.out.println("The text in the alert window is " +text);
		acceptAlert();
		
		click(locateElement("xpath", "//a[@href = '/crmsfa/control/findLeads']"));
		
		type(locateElement("xpath", "(//div[@class = 'x-form-element'])[18]/input"), "10403");
		
		click(locateElement("xpath", "(//button[@class = 'x-btn-text'])[7]"));
	}

}
