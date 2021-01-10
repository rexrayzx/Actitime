package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.ExcelLibrary;

public class ActitimeCreateCustomerPage implements AutoConstant {
	WebDriver driver;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptionTextfield;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomerButton;
	
	@FindBy(xpath="(//div[.='Cancel'])[27]")
	private WebElement cancelButton;
	
	public ActitimeCreateCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createcustomerMethod() throws IOException {
		entercustomernameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 2));
		entercustomerdescriptionTextfield.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 3));
	}
	public void createcustomerButtonMethod() {
		createcustomerButton.click();
	}
	public void cancelMethod() {
		cancelButton.click();
	}
	public void popupAccept() {
		driver.switchTo().alert().accept();
	}
	public void popupDismiss() {
		driver.switchTo().alert().dismiss();
	}
}
