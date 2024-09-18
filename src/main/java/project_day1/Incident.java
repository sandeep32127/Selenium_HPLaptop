package project_day1;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Incident extends SeMethods {
	
	@Test
	public void createIncident() throws InterruptedException{
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
		
		click(locateElement("xpath", "//div[text() = 'Create New']"));
		
		Thread.sleep(3000);
		
		switchToFrame(locateElement("gsft_main"));
		
		//switchToFrameString("gsft_main");
		
		Thread.sleep(3000);
		
		//String text = GetAttribute(locateElement("name","incident.number"), "value");
		WebElement text = locateElement("id", "incident.number");
		String valueText = text.getAttribute("value");
		System.out.println(valueText);
		
		//System.out.println("The number in the field is : " +text);
		
		selectDropDownUsingText(locateElement("id", "incident.category"), "Network");
		
		Thread.sleep(2000);
		
		selectDropDownUsingText(locateElement("id", "incident.subcategory"), "DNS");
		
		Thread.sleep(2000);
		
		selectDropDownUsingText(locateElement("id", "incident.impact"), "2 - Medium");
		
		selectDropDownUsingText(locateElement("id", "incident.urgency"), "2 - Medium");
		
		
		WebElement elem = locateElement("id", "sys_display.incident.caller_id");
		
		type(elem,"iti",Keys.TAB);
		
		type(locateElement("id", "incident.short_description"), "This is sandeg58 Rameez545f");
		
		type(locateElement("id", "incident.work_notes"), "From TCS and Accenture");
		
		click(locateElement("xpath","(//button[@id = 'sysverb_insert'])[2]"));
		
		try {
			Thread.sleep(3000);
			acceptAlert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		
		switchOutToFrame();
		
		switchToFrame(locateElement("gsft_main"));
		
		type(locateElement("xpath", "//input[@class = 'form-control']"), valueText,Keys.ENTER);
		
		Thread.sleep(3000);
		
		verifyPartialText(locateElement("xpath", "//a[@class = 'linked formlink']"),valueText);
		//String text2 = locateElement("class", "form-control").getText();
		//verifyExactAttribute(ele, attribute, value);
		
		}
		
	}

	

