package com.mohs10.or;

import org.openqa.selenium.By;

public class Negative_Test_OR 
{
	//To Register
		public static By lnkRegister = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
		public static By registerfName = By.id("customer.firstName");
		public static By registerlname = By.id("customer.lastName");
		public static By registeraddress = By.id("customer.address.street");
		public static By registercity = By.id("customer.address.city");
		public static By registerstate = By.id("customer.address.state");
		public static By registerzipcode = By.id("customer.address.zipCode");
		public static By registerphone = By.id("customer.phoneNumber");
		public static By registerssn = By.id("customer.ssn");
		public static By registerusername = By.id("customer.username");
		public static By registerPassword = By.id("customer.password");
		public static By registerConfirmpassword = By.id("repeatedPassword");
		public static By btnRegister = By.xpath("//input[@value='Register']");
		
		
		//To login
		public static By username = By.xpath("//input[@name='username']");
		public static By txtpwd = By.name("password");
		public static By btnlogin = By.xpath("//input[@value='Log In']");
		public static By lnkLogout = By.xpath("//a[normalize-space()='Log Out']");
		
		
		//forget password
		public static By forgetlogininfolink = By.xpath("//a[normalize-space()='Forgot login info?']");
		public static By forgetfname = By.xpath("//input[@id='firstName']");
		public static By forgetlname = By.xpath("//input[@id='lastName']");
		public static By forgetaddress = By.xpath("//input[@id='address.street']");
		public static By forgetcity = By.xpath("//input[@id='address.city']");
		public static By forgetstate = By.xpath("//input[@id='address.state']");
		public static By forgetzipcode = By.xpath("//input[@id='address.zipCode']");
		public static By forgetssn = By.xpath("//input[@id='ssn']");
		public static By findmylogininfobtn = By.xpath("//input[@value='Find My Login Info']");
}





