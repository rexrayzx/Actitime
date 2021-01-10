package com.pages.actitime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTaskPage {
	WebDriver driver;
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createNewCustomerLink;
	
	@FindBy(xpath="//div[contains(text(),'Rajiv')]/../..//div[@class='editButton']")
	private WebElement editButton;
	
	@FindBy(xpath="(//div[.='qsoider'][@class='nameLabel']/../../../..//div[.='ACTIONS']")
	private WebElement actionButton;
	
	@FindBy(xpath="//div[.='qsoider'][@class='nameLabel']/../../../../..//div[.='Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deletepermanentlyButton;
	
	@FindBy(xpath="//div[.='Rajiv']")
	private WebElement customerRajivLink;
	
	public ActitimeTaskPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createNewCustomerMethod() {
		addnewButton.click();
		createNewCustomerLink.click();
	}
	public void editMethod() {
		editButton.click();
	}
	
	public void deleteCustomerMethod() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click", "customerRajivLink");
		js.executeScript("arguments[0].click", "editButton");
		js.executeScript("arguments[0].click", "actionButton");
		deleteButton.click();
		deletepermanentlyButton.click();
	}
}
