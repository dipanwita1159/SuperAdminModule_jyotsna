package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.ActionDriver.XLUtils;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

public class HomeTest extends StartBrowser
	{
		

	  String excelfile = "C:\\Users\\DELL\\Downloads\\Security-main\\Security-main\\TestData\\Data.xlsx";
	  String excelsheet = "Login"; 
	
	//Clicking on Categories links 
	//@Test(priority = 5)
	public void CategoriesTest() throws Exception 
	{
		SSreuseclass.SSReusablemethod(driver, "CategoryTest");
		CommonFuns cat = new CommonFuns();
	    cat.Categories();
		Thread.sleep(5000);
	}
	
	//Clicking on news link 
//	@Test(priority = 4)
	public void NewsbtnTestCase() throws Exception 
	{
		CommonFuns News = new CommonFuns();
	    News.Pagedown();
	    Thread.sleep(2000);
	    News.Newsbtn();
	   // SSreuseclass.SSReusablemethod(driver, "NewsbtnTestCase");
		Thread.sleep(5000);
	}
	
	//blog Link 
	//@Test(priority = 3)
	public void BlogbtnTestCase() throws Exception 
	{
		CommonFuns blog = new CommonFuns();
	    blog.Pagedown();
	    Thread.sleep(2000);
	    blog.Blogbtn();
	    //SSreuseclass.SSReusablemethod(driver, "BlogbtnTestCase");
		Thread.sleep(5000);
	}
		
	//Registration of new user 
//	@Test(priority = 0)
	public void RegisterPageTestCase() throws Exception 
	{
		CommonFuns hm = new CommonFuns();
		 //SSreuseclass.SSReusablemethod(driver, "RegisterPage");
		int rowcount = XLUtils.getRowCount(excelfile, excelsheet);	
		for(int i=1;i<rowcount;i++) {
	            String Email = XLUtils.getStringCellData(excelfile, excelsheet, i, 0);
	            String Pwd = XLUtils.getStringCellData(excelfile, excelsheet, i, 1);
	            
	            hm.logIn(Email, Pwd);
			 
			  Thread.sleep(5000);}
	}
	
	//Testing with invalid inputs 
	@Test
	public void InvalidLogInTestCase() throws Exception 
	{
		//SSreuseclass.SSReusablemethod(driver, "InvalidLogIn");
		CommonFuns hm1 = new CommonFuns();
		int rowcount = XLUtils.getRowCount(excelfile, excelsheet);	
		for(int i=1;i<rowcount;i++) {
			String gender=XLUtils.getStringCellData(excelfile, excelsheet, i, 0);
			String FristName = XLUtils.getStringCellData(excelfile, excelsheet, i, 1);
            String LastName = XLUtils.getStringCellData(excelfile, excelsheet, i, 1);
	            String Email = XLUtils.getStringCellData(excelfile, excelsheet, i, 0);
	            String Pwd = XLUtils.getStringCellData(excelfile, excelsheet, i, 1);
	            
	            String confirmpass = XLUtils.getStringCellData(excelfile, excelsheet, i, 1);
	            
	            hm1.Register(Pwd, Pwd, Email, Pwd, Pwd);
	
	}    }         
	
	/*
	 * //Testing with Valid inputs
	 * 
	 * @Test(priority = 0) public void LoginPageTestCase() throws Exception {
	 * CommonFuns hm2 = new CommonFuns(); int rowcount =
	 * XLUtils.getRowCount(excelfile, excelsheet); for(int i=1;i<rowcount;i++) {
	 * String Email = XLUtils.getStringCellData(excelfile, excelsheet, i, 0); String
	 * Pwd = XLUtils.getStringCellData(excelfile, excelsheet, i, 1);
	 * 
	 * hm2.logIn(Email, Pwd); Thread.sleep(7000); } }
	 */
	}
