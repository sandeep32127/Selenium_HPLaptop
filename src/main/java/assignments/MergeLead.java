package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("(//div[@class = 'x-panel-header'])[2]/a").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//img[@src = '/images/fieldlookup.gif']").click();
		String winHandle = driver.getWindowHandle();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		/*Set<String> allWind = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(allWind);
		int count = list.size();
		driver.switchTo().window(list.get(count-1));*/
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("//div[@class = 'x-form-element']/input").sendKeys("10");
		//driver.close();
		/*driver.findElementByXPath("//button[@class = 'x-btn-text']").click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("10047"))).click();
		driver.switchTo().window(list.get(0));
		driver.findElementByXPath("(//img[@src = '/images/fieldlookup.gif'])[2]").click();
		Set<String> allWind1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>();
		list1.addAll(allWind1);
		driver.switchTo().window(list1.get(1));
		driver.findElementByXPath("//div[@class = 'x-form-element']/input").sendKeys("10");
		driver.findElementByXPath("//button[@class = 'x-btn-text']").click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("10053"))).click();
		driver.switchTo().window(list1.get(0));
		driver.findElementByXPath("//a[text() = 'Merge']").click();
		driver.switchTo().alert().accept();
		driver.findElementByXPath("//a[@href = '/crmsfa/control/findLeads']").click();
		driver.findElementByXPath("(//div[@class = 'x-form-element'])[18]/input").sendKeys("10047");
		driver.findElementByXPath("(//button[@class = 'x-btn-text'])[7]").click();
		*//*driver.findElementByXPath("//button[@class = 'x-btn-text']").click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("10039"))).click();
		driver.switchTo().window(list.get(0));
		Set<String> allWind1 = driver.getWindowHandles();
		list.addAll(allWind1);
		driver.switchTo().window(list.get(1));
*/	}

}
