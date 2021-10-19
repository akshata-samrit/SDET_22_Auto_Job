package com.crm.orgtest;

import org.testng.annotations.Test;

public class OrgTest 
{
	@Test
	public void createOrgTest()
	{
		System.out.println("Execute Create Org Test");
		
		String URL = System.getProperty("url");
		System.out.println(URL);
		
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		
		
		System.out.println("========================");
	}
}


