package com.test.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pages.actitime.ActitimeCreateCustomerPage;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeTaskPage;

public class ActitimeCreateCustomer extends BaseTest {
	@Test
	public void createCustomer() throws IOException {
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.tasksMethod();
		ActitimeTaskPage task=new ActitimeTaskPage(driver);
		task.createNewCustomerMethod();
		ActitimeCreateCustomerPage createcustomer=new ActitimeCreateCustomerPage(driver);
		createcustomer.createcustomerMethod();
		createcustomer.createcustomerButtonMethod();
	}
}
