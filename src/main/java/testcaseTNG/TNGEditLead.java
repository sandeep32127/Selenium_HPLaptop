package testcaseTNG;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class TNGEditLead extends ProjectMethods{
	@Test
	public void testngcheckedit() throws InterruptedException {
		click(locateElement("xpath", "//a[@href = '/crmsfa/control/leadsMain']"));

		click(locateElement("xpath", "//a[text() = 'Satya']"));

		WebElement edit = locateElement("link", "Edit");
		click(edit);

		type(locateElement("updateLeadForm_companyName"),"TechM");

		type(locateElement("updateLeadForm_firstName"),"Bhano");

		click(locateElement("xpath", "//img[@src = '/images/fieldlookup.gif']"));

		switchToWindow(1);

		type(locateElement("xpath", "//div[@class = 'x-form-element']/input"),"10");

		click(locateElement("xpath", "//button[@class = 'x-btn-text']"));

		Thread.sleep(3000);

		click(locateElement("link", "10375"));

		switchToWindow(0);

		click(locateElement("name", "submitButton"));


	}

}
