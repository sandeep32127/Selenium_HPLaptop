package week1day1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//img[@src = '/images/fieldlookup.gif']").click();
		//driver.switchTo().window(arg0);
		Set<String> allwin = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(allwin);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("//input[@name = 'accountName']").sendKeys("a");
		driver.findElementByXPath("//button[text() = 'Find Accounts']").click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a"))).click();
		/*driver.findElementById("createLead;Form_companyName").sendKeys("Tata Consultancy Services");
		driver.findElementById("createLeadForm_firstName").sendKeys("Chandan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Sugalwad");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		dd.selectByVisibleText("Existing Customer");
		WebElement campaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(campaign);
		List<WebElement> allChoices =  dd1.getOptions();
		int count = allChoices.size();
		//System.out.println(count-2);
		dd1.selectByIndex(count-2);
		Thread.sleep(3000);
		//driver.findElementByName("submitButton").click();
		driver.quit();
		driver.findElementByClassName("linktext").click();
		driver.findElementByClassName("decorativeSubmit").click();
*/	}

}
