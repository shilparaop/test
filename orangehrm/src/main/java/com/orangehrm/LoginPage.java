package com.orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LoginPage extends BaseMain 
{
	
	public  LandingPage doLogin()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Xwq3qYaY");
		driver.findElement(By.id("btnLogin")).click();
		return new LandingPage();
				
	}	
	
	public boolean isLogIn()
	{
		return 	 driver.findElement(By.id("welcome")).isDisplayed();
	}
	

}
