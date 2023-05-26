package com.mohs10.base;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class StartBrowser {
	 public static WebDriver driver;
	 //set up report
	 public static ExtentReports extent;
	 public static ExtentTest parentTest;
	 public static ExtentTest childTest;
	 ExtentSparkReporter sparkReporter;
	 static final String ZAP_PROXY_ADDRESS = "localhost"; 
	 static final int ZAP_PROXY_PORT = 8081; 
	 static final String ZAP_API_KEY = "jihemojbr0hmcght3url3i1s5f";
	 private ClientApi api;
	 ChromeOptions options ;
	
	 
	 @BeforeTest
	 public void generateReport()
	 {
		 sparkReporter = new ExtentSparkReporter("Report/AutomationReport.html");
		 extent = new ExtentReports();
		 extent.attachReporter(sparkReporter);
	 }
	 
	 @BeforeMethod
	 public void methodName(Method method)
	 {
		parentTest = extent.createTest(method.getName()); 
	 }
	 @BeforeClass
	  public void beforeClass()
	 {
		 String proxyServerUrl = ZAP_PROXY_ADDRESS + ":" + ZAP_PROXY_PORT;
			Proxy proxy = new Proxy();
			proxy.setHttpProxy(proxyServerUrl);
			proxy.setSslProxy(proxyServerUrl);
			ChromeOptions co = new ChromeOptions();
			co.setAcceptInsecureCerts(true);
			co.setProxy(proxy);
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			api= new ClientApi(ZAP_PROXY_ADDRESS,ZAP_PROXY_PORT, ZAP_API_KEY);}
		  
		  @AfterMethod 
		  
		  public void tearDown()
		  { if(api !=null) { 
			  String title ="Demo Website  Security Report"; 
		  String template = "traditional-html";
		  String description = "this demo is mohs10 zap security test report";
		  String reportfilename = "demowebshop-zap-report.html"; 
		  String targetFolder = System.getProperty("user.dir"); 
		  try{ ApiResponse response =api.reports.generate(title, template, null, description, null, null, null,
		  null, null, reportfilename, null, targetFolder, null);
		  System.out.println("ZAP report generated at this location:" +
		  response.toString()); } catch (ClientApiException e) { // TODO Auto-generated catch block 
			  e.printStackTrace();
			  } 
		  } 
		  }
		  
	  @AfterClass public void afterClass() { driver.quit(); extent.flush(); }
	 

	}
