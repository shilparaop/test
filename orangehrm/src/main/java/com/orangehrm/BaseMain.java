package com.orangehrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BaseMain {
	
	protected  static WebDriver driver;
	 Actions action;
	 Select dropdown;
	
	public void openBrowser() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fs = new FileInputStream("C:/Users/shilpa/workspace/orangehrm/src/test/resources/config.properties");
		prop.load(fs);
		//String URL = prop.getProperty("url");
		//String browser = prop.getProperty("browser");
		System.out.println("testing");
		switch (prop.getProperty("browser"))
		{

		case "ie":
			
			System.setProperty("webdriver.ie.driver", "C:/Users/shilpa/Desktop/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:/Users/shilpa/Desktop/chromedriver.exe");
			driver=new ChromeDriver();
			break;

		default:
			driver=new FirefoxDriver();
			break;
		} 
		
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//PAGE FACTORY
		PageFactory.initElements(driver, this);
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
