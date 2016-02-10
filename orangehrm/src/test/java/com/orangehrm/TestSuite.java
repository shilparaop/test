package com.orangehrm;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestSuite extends BaseTest{
	
	LoginPage log;
	
	@Test
	public void generateForEmployee()
	{ 
		log=new LoginPage();
		LandingPage go=log.doLogin();
        Assert.assertTrue(log.isLogIn());
		LeaveEURPage leave=go.navigate();
		Assert.assertTrue(go.isNavigated());
		
		leave.employeeLeaveReport();
		Assert.assertTrue(leave.isReportDisplayed());
	}
	@Ignore
	@Test
	public void generateForLeaveType()
	{

		log=new LoginPage();
        log.doLogin();
        Assert.assertTrue(log.isLogIn());
		LandingPage go=new LandingPage();
		go.navigate();
		Assert.assertTrue(go.isNavigated());
		LeaveEURPage leave=new LeaveEURPage();
		leave.leaveTypeReport();
		Assert.assertTrue(leave.isReportDisplayed());
		
	}
		
	
}
