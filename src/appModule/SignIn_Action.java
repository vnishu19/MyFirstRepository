package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import utility.ExcelUtils;
import utility.Log;

public class SignIn_Action {
	
	//Pass Arguments Username & Password as String
	
	public static void Execute(WebDriver driver)
	{
		
		//This is to get the values from Excel sheet, passing parameters( Row Num & Col Num
		
		String sUsername = ExcelUtils.getCellData(1, 1);
		
		Log.info("Username picked from Excel is " + sUsername);
		
		String sPassword = ExcelUtils.getCellData(1, 2);
		
		Log.info("Password picked from Excel is "+ sPassword);
		
		HomePage.lnk_MyAccount(driver).click();
		
		Log.info("Click action is performed on My Account link");
		
		//Enter sUsername and sPassword variable in place of hardcorded value
		
		LoginPage.txtbx_UserName(driver).sendKeys(sUsername);
		
		Log.info("Username is entered in Username text box");
		
		LoginPage.txtbx_UserName(driver).sendKeys(sPassword);
		
		Log.info("Password is entered in Password text box");
		
		LoginPage.btn_LogIn(driver).click();
		
		Log.info("CLick action performed on Login button");
	}

}
