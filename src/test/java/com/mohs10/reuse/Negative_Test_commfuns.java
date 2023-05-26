package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.Negative_Test_OR;

public class Negative_Test_commfuns 
{
	public Action aDriver;
	public WebDriver driver;
	
	public Negative_Test_commfuns()
	{
		aDriver = new Action();
		driver = StartBrowser.driver;
	}
	
	    //Registration Method
			public void Register(String rfname, String rlname, String raddress, String rcity, String rstate, String rzipcode, String rphone, String rssn, String rusername, String rpwd, String rconpwd) throws Exception
			{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("Register parabank");
				aDriver.navigateToApplication("https://parabank.parasoft.com/parabank/index.htm");
				aDriver.click(Negative_Test_OR.lnkRegister, "Register link");
				aDriver.type(Negative_Test_OR.registerfName,rfname, "Register First Name");
				aDriver.type(Negative_Test_OR.registerlname,rlname, "Register Last Name");
				aDriver.type(Negative_Test_OR.registeraddress,raddress, "Register Address");
				aDriver.type(Negative_Test_OR.registercity,rcity, "Register City");
				aDriver.type(Negative_Test_OR.registerstate,rstate, "Register state");
				aDriver.type(Negative_Test_OR.registerzipcode,rzipcode, "Register zipcode");
				aDriver.type(Negative_Test_OR.registerphone,rphone, "Register phone");
				aDriver.type(Negative_Test_OR.registerssn,rssn, "Register ssn");
				aDriver.type(Negative_Test_OR.registerusername,rusername, "Register Username");
				aDriver.type(Negative_Test_OR.registerPassword,rpwd, "Register password");
				aDriver.type(Negative_Test_OR.registerConfirmpassword,rconpwd, "Register confirm password");
				aDriver.click(Negative_Test_OR.btnRegister, "Register Button");
			}
			
		//Login Method
			public void logIn(String Username, String password) throws Exception
			{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to parabank application");
				aDriver.navigateToApplication("https://parabank.parasoft.com/parabank/index.htm");
				aDriver.type(Negative_Test_OR.username, Username, "Login Username");
				aDriver.type(Negative_Test_OR.txtpwd, password, "User passsword");
				aDriver.click(Negative_Test_OR.btnlogin, "Login link");
				//aDriver.click(Negative_Test_OR.lnkLogout, "Logout link");
			}
			
		//Logout Method	
			public void logout() throws Exception
			{
				
				aDriver.click(Negative_Test_OR.lnkLogout, "Logout link");
			}
			
		//Forget Password Method
			public void ForgetPassword(String fpfname, String fplname, String fpaddress, String fpcity, String fpstate, String fpzipcode, String fpssn) throws Throwable
			{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("forget password parabank");
				aDriver.navigateToApplication("https://parabank.parasoft.com/parabank/index.htm");
				
				aDriver.click(Negative_Test_OR.forgetlogininfolink, "Forget Password link"); 
				aDriver.type(Negative_Test_OR.forgetfname,fpfname, "Forget password First Name");
				aDriver.type(Negative_Test_OR.forgetlname,fplname, "Forget password Last Name");
				aDriver.type(Negative_Test_OR.forgetaddress,fpaddress, "Forget Address textbox");
				aDriver.type(Negative_Test_OR.forgetcity,fpcity, "Forget city textbox");
				aDriver.type(Negative_Test_OR.forgetstate,fpstate, "Forget state textbox");
				aDriver.type(Negative_Test_OR.forgetzipcode,fpzipcode, "Forget zipcode");
				aDriver.type(Negative_Test_OR.forgetssn,fpssn, "Forget ssn");
				aDriver.click(Negative_Test_OR.findmylogininfobtn, "find account button");
			}
}
