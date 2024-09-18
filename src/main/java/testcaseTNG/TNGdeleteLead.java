package testcaseTNG;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class TNGdeleteLead extends ProjectMethods{
	@Test()
	public void deleteLead() {
	click(locateElement("link", "Leads"));
	
	click(locateElement("link", "Find Leads"));
	
	type(locateElement("xpath", "(//div[@class = 'x-form-element'])[19]/input"),"Sandeep");
	
	click(locateElement("xpath", "(//button[@class = 'x-btn-text'])[7]"));
	
	click(locateElement("xpath", "//a[text() = 'Sandeep']"));
	
	click(locateElement("class", "subMenuButtonDangerous"));

}
}
