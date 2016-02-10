package com.orangehrm;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;

public class BaseTest {
	
	BaseMain bmobj=new BaseMain();
	
	@Before
	public void setUp() {
		
			try {
				bmobj.openBrowser();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} 
	
	@After
	public void tearDown() {
		bmobj.closeBrowser();
		
	}
	
}
