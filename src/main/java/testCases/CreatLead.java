package testCases;

import java.util.NoSuchElementException;

//import org.junit.Test;
//import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class CreatLead extends ProjectMethods{
	@Test
	public void creatlead() throws InterruptedException {
		
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		
		//takeSnap();
		
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		
		//takeSnap();
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		//takeSnap();
		
		WebElement crmfsa = locateElement("link", "CRM/SFA");
		click(crmfsa);*/
		
		//takeSnap();

		WebElement link = locateElement("link", "Create Lead");
		click(link);
		
		//takeSnap();
		
		//Thread.sleep(3000);
		
		WebElement companyName = locateElement("createLeadForm_companyName");
		type(companyName, "radis");
		
		WebElement firstName = locateElement("createLeadForm_firstName");
		type(firstName, "blue");
		
		type(locateElement("createLeadForm_lastName"),"ran");
		
		WebElement source = locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingText(source, "Direct Mail");
		
		click(locateElement("class", "smallSubmit"));
		
		//closeBrowser();
		
		//takeSnap();
		/*click(locateElement("xpath", "(//a[@class = 'subMenuButton'])[3]"));
		
		type(locateElement("updateLeadForm_firstName"), "Ranju");
		
		click(locateElement("class", "smallSubmit"));
*/	}
}
