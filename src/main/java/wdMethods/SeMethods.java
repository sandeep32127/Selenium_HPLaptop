package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeMethods implements WdMethods{

	public RemoteWebDriver driver;
	int i =0;


	public void startApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"./drivers/chromedriver.exe");		
			driver = new ChromeDriver();			
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"./drivers/geckodriver.exe");		
			driver = new FirefoxDriver();		
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);		
		System.out.println("The Browser "+browser+" launched Successfully");
	}


	public WebElement locateElement(String locator, String locValue) {

		switch(locator) {		
		case "id": return driver.findElementById(locValue);
		case "name": return driver.findElementByName(locValue);
		case "link": return driver.findElementByLinkText(locValue);
		case "class": return driver.findElementByClassName(locValue);
		case "xpath": return driver.findElementByXPath(locValue);		
		}		
		return null;
	}


	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);	
	}


	public void type(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		System.out.println("The Element "+ele+" is entered with "+data);		
	}


	public void click(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
		System.out.println("The Element "+ele+" is clicked");

	}


	public void clickWithoutSnap(WebElement ele) {
		// TODO Auto-generated method stub

	}


	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return ele.getText();

	}




	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
		System.out.println("The dropdown " + value + " has been selected");
	}


	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}


	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}


	public void verifyExactText(WebElement ele, String expectedText) {


	}


	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		System.out.println(text);
		if(text.contains(expectedText) ){
			
			System.out.println("Your instance has been successfully verified");
		}
		else {

			System.out.println("Instance has not been created successfully");
		}
	}

		public void verifyExactAttribute(WebElement ele, String attribute, String value) {
			// TODO Auto-generated method stub

		}

		/*public String GetAttribute(WebElement ele, String attribute) {
		return ele.getAttribute(attribute);
	}*/



		public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
			// TODO Auto-generated method stub

		}


		public void verifySelected(WebElement ele) {
			// TODO Auto-generated method stub

		}


		public void verifyDisplayed(WebElement ele) {
			// TODO Auto-generated method stub

		}


		public void switchToWindow(int index) {
			// TODO Auto-generated method stub
			Set<String> allWin = driver.getWindowHandles();
			List<String> list = new ArrayList<String>();
			list.addAll(allWin);
			driver.switchTo().window(list.get(index));

		}


		public void switchToFrame(WebElement ele) {
			// TODO Auto-generated method stub

			driver.switchTo().frame(ele);
			System.out.println("Enter into frame");

		}
		public void switchOutToFrame() {
			// TODO Auto-generated method stub

			driver.switchTo().defaultContent();

		}

		
		public void acceptAlert() {
			// TODO Auto-generated method stub
			driver.switchTo().alert().accept();

		}

		
		public void dismissAlert() {
			// TODO Auto-generated method stub
			driver.switchTo().alert().dismiss();
		}

		
		public String getAlertText() {
			// TODO Auto-generated method stub
			String text= driver.switchTo().alert().getText();;
			return text;
		}

		
		public void takeSnap() {
			// TODO Auto-generated method stub
			File src = driver.getScreenshotAs(OutputType.FILE);
			File desc = new File("./snap/img" +i+ ".png");
			try {
				FileUtils.copyFile(src, desc);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}

		
		public void closeBrowser() {
			// TODO Auto-generated method stub
			driver.close();

		}

		
		public void closeAllBrowsers() {
			// TODO Auto-generated method stub
			driver.quit();
		}

		public void type(WebElement elem, String string, Keys tab) {
			// TODO Auto-generated method stub
			elem.clear();
			elem.sendKeys(string,tab);
		}



	}
