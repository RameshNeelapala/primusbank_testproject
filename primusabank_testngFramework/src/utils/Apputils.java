package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Apputils
{


public static  WebDriver  driver;
public static  String  url="http://primusabank.qedgetech.com/";

@AfterClass
	public void launchApp()
	{cs().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
	}
		
		
			
			
