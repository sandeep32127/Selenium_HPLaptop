package week2Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text() = 'Try it']").click();
		/*driver.switchTo().alert().*/
		driver.switchTo().alert().sendKeys("Hi Sandeep , it's iframe");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String path = driver.findElementById("demo").getText();
		//driver.switchTo().defaultContent();
		if(path.contains("Sandeep")) {
			System.out.println("U r right");
		}
	}
}
