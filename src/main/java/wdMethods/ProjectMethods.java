package wdMethods;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

public class ProjectMethods  extends SeMethods{
	@Parameters({"url","uName","Pwd"})
	@BeforeMethod
	public void login(String url , String uName,String Pwd) {
	//public void login() {
		startApp("chrome",url);
		//startApp("chrome", "http://leaftaps.com/opentaps");
		//takeSnap();

		WebElement userName = locateElement("username");
		type(userName, uName);
		//type(userName, "DemoSalesManager");


		WebElement password = locateElement("password");
		type(password,Pwd);
		//type(password, "crmsfa");

		//takeSnap();

		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);

		//takeSnap();

		WebElement crmfsa = locateElement("link", "CRM/SFA");
		click(crmfsa);
		 

		//startApp("chrome", "http://leaftaps.com/opentaps");

		/*WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");

		WebElement password = locateElement("password");
		type(password, "crmsfa");

		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		WebElement crmfsa = locateElement("link", "CRM/SFA");
		click(crmfsa);
*/
	}
	@AfterMethod
	public void closeApp() {
		closeBrowser() ;
	}

}
