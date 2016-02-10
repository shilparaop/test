package com.orangehrm;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BaseMain {
	


	public LeaveEURPage navigate() {
		
		action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule")));
		action.moveToElement(driver.findElement(By.id("menu_leave_Reports")));
		action.click(driver.findElement(By.id("menu_leave_viewLeaveBalanceReport")));
		action.build().perform();
		return new LeaveEURPage();
	}

	public boolean isNavigated() {
		return driver.findElement(By.xpath("//*[@id='frmLeaveBalanceReport']/fieldset/ol/li[1]/label")).isDisplayed();
	}
}

