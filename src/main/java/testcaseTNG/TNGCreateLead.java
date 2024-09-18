package testcaseTNG;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testCases.Excelread;
import wdMethods.ProjectMethods;
//import wdMethods.SeMethods;

public class TNGCreateLead  extends ProjectMethods{

	@Test(dataProvider = "fetchRead")
	public void testngcheckcreate(String CName, String firstName, String lastName) {

		//login();
		//click(locateElement("class", "decorativeSubmit"));
		
		WebElement link = locateElement("link", "Create Lead");
		click(link);
		
		type( locateElement("createLeadForm_companyName"), CName);
		
		
		type(locateElement("createLeadForm_firstName"), firstName);
		
		type(locateElement("createLeadForm_lastName"),lastName);
		
		
		selectDropDownUsingText(locateElement("createLeadForm_dataSourceId"), "Direct Mail");
		
		click(locateElement("class", "smallSubmit"));
		
		//closeBrowser();
	}
	@DataProvider(name = "fetchRead")
	public Object[][] readexcel() throws IOException {
		Excelread exc = new Excelread();
		 Object[][] data = exc.readExcel();
		return data;
	}

}
