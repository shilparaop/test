package com.orangehrm;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LeaveEURPage extends BaseMain{
	
	public void employeeLeaveReport()
	{
		
	   
	    dropdown = new Select(driver.findElement(By.id("leave_balance_report_type")));
	    
	    dropdown.selectByVisibleText("Employee");
	  	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	  
	     

	     driver.findElement(By.id("leave_balance_employee_empName")).clear();     
	     driver.findElement(By.id("leave_balance_employee_empName")).sendKeys("aal");
	     WebDriverWait wait=new WebDriverWait(driver, 10);
	    List<WebElement> elementslist=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("li")));
	   
	    for(WebElement element:elementslist)
	    {
	    	
	    	if(element.getText().equalsIgnoreCase("aaliyah haq"))
	    	{
	    		element.click();
	    		//System.out.println("true");
	    	}
	    	
	    }
	    	
	    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[4]/ul/li"))).click();


//	  	action =new Actions(driver);
//	    action.sendKeys(driver.findElement(By.id("leave_balance_employee_empName")),Keys.CLEAR);
//	    action.sendKeys(driver.findElement(By.id("leave_balance_employee_empName")),"aaliyah haq");
//	    action.sendKeys(driver.findElement(By.id("leave_balance_employee_empName")),Keys.ARROW_DOWN);
//	    action.sendKeys(driver.findElement(By.id("leave_balance_employee_empName")),Keys.ENTER);
//	    action.perform();
	      
	
	    driver.findElement(By.id("viewBtn")).click();
	    
	    }
	public boolean isReportDisplayed()
	{
		
		return driver.findElement(By.xpath("//*[@id='report-results']/div")).isDisplayed();
		
	}
	public void leaveTypeReport()
	{
		selectDropdown("leave_balance_report_type","Leave Type");
		selectDropdown("leave_balance_leave_type","Annual Leave");
		selectDropdown("leave_balance_job_title","All");
		selectDropdown("leave_balance_location","All");
		selectDropdown("leave_balance_sub_unit","All");
		driver.findElement(By.id("leave_balance_include_terminated")).click();
		driver.findElement(By.id("leave_balance_eligible_employees_only")).click();
		driver.findElement(By.id("viewBtn")).click();
		
		
		
		    
	}
	
	public void selectDropdown(String locatorvalue,String label)
	{    
        
		 dropdown = new Select(driver.findElement(By.id(locatorvalue)));
		 dropdown.selectByVisibleText(label);
	}
	
	
		
}