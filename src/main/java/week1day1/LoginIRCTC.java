package week1day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginIRCTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("ranju",Keys.TAB);
		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:password").sendKeys("Sandeep32127",Keys.TAB);
		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Sandeep32127",Keys.TAB);
		WebElement security =  driver.findElementById("userRegistrationForm:securityQ");
		Select dd = new Select(security);
		dd.selectByIndex(2);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("key");
		WebElement language = driver.findElementById("userRegistrationForm:prelan");
		Select dd1 = new Select(language);
		dd1.selectByValue("en");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Chandan");
		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Patni");
		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:lastName").sendKeys("sugli");
		WebElement date = driver.findElementById("userRegistrationForm:dobDay");
		Select dd2 = new Select(date);
		dd2.selectByIndex(3);
		WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
		Select dd3 = new Select(month);
		dd3.selectByValue("04");
		WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dd4 = new Select(year);
		dd4.selectByVisibleText("1993");
		Thread.sleep(3000);
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select dd5 = new Select(occupation);
		dd5.selectByVisibleText("Professional");
		driver.findElementByName("userRegistrationForm:uidno").sendKeys("BKAPD7984B",Keys.TAB);
		driver.findElementByName("userRegistrationForm:idno").sendKeys("BVHF589",Keys.TAB);
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select dd6 = new Select(country);
		dd6.selectByValue("94");
		driver.findElementById("userRegistrationForm:email").sendKeys("sandeep32127@yahoo.com");
		driver.findElementByName("userRegistrationForm:mobile").sendKeys("7418834252");
		Thread.sleep(3000);
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select dd7 = new Select(nationality);
		List<WebElement> allChoices = dd7.getOptions();
		int count = allChoices.size();
		dd7.selectByIndex(count-2);
	}

}
