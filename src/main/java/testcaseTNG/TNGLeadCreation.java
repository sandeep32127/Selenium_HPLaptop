package testcaseTNG;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testCases.Excelread;
import wdMethods.ProjectMethods;
//import wdMethods.SeMethods;

public class TNGLeadCreation  extends ProjectMethods{

	@Test()
	public void testngcheckcreate() {

		//login();
		//click(locateElement("class", "decorativeSubmit"));
		
		WebElement link = locateElement("link", "Create Lead");
		click(link);
		
		type( locateElement("createLeadForm_companyName"), "TCS");
		
		
		type(locateElement("createLeadForm_firstName"), "Sandeep");
		
		type(locateElement("createLeadForm_lastName"),"Dalei");
		
		
		selectDropDownUsingText(locateElement("createLeadForm_dataSourceId"), "Direct Mail");
		
		click(locateElement("class", "smallSubmit"));
		
		//closeBrowser();
	}
	

}
