package assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement path = driver.findElementByXPath("//div[@class = 'example']/select");
		Select sd = new Select(path);
		List<WebElement> allChoices =  sd.getOptions();
		int count = allChoices.size();
		sd.selectByIndex(count-2);
		WebElement path2 =  driver.findElementByXPath("(//div[@class = 'example'])[2]/select");
		Select sd1 = new Select(path2);
		List<WebElement> allChoices2 =  sd1.getOptions();
		int count1 = allChoices2.size();
		sd1.selectByIndex(count1-2);
	}

}
