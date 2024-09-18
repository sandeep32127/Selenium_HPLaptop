package week1day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[@href = '/crmsfa/control/leadsMain']").click();
		driver.findElementByXPath("//a[text() = 'Find Leads']").click();
		driver.findElementByXPath("(//input[@name=\"firstName\"])[3]").sendKeys("chandan");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement first = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		first.click();
		/*Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class = 'subMenuButton'])[3]").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").clear();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("patni");
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();*/
	}

}

