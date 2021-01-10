package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.ExcelLibrary;

public class ActitimeLoginPage implements AutoConstant{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement KeepmeloginCheckbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotypurpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTIMEincLink;

	public ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException{
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 1));
		KeepmeloginCheckbox.click();
		loginButton.click();
	}
	
	public void forgotyourpasswordMethod() {
		forgotypurpasswordLink.click();
	}
	
	public void actitimeincMethod() {
		actiTIMEincLink.click();
	}
}
