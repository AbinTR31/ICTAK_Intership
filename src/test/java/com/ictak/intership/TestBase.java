package com.ictak.intership;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {

	WebDriver driver=null;
	Properties prop =null;
	
	 public TestBase() throws IOException
	 {
	        loadprop();
	 }

	public void loadprop() throws IOException
	{
		prop = new Properties();
		FileInputStream fileip = new FileInputStream("C:\\Automation\\Intership_portal\\Ictak_intership_portal\\src\\test\\resources\\config.properties");
		prop.load(fileip);
	}
	
    @BeforeTest
	public void openbrowser() 
	{
    	driver=new ChromeDriver();
    	driver.get(prop.getProperty("url"));
    	driver.manage().window().maximize();
	}
}
