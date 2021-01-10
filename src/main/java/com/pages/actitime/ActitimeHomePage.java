package com.pages.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {
	@FindBy(xpath="//div[.='Switch to actiPLANS']")
	private WebElement switchtoactiplansLink;
	
	@FindBy(id="container_tt")
	private WebElement timetrackLink;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement tasksLink;
	
	@FindBy(id="container_reports")
	private WebElement reportsLink;
	
	@FindBy(id="container_users")
	private WebElement usersLink;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[1]")
	private WebElement calendarsLink;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[3]")
	private WebElement integrationsLink;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[4]")
	private WebElement helpandsupportLink;
	
	@FindBy(xpath="//a[@class='userProfileLink username ']")
	private WebElement myprofileLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void switchtoactiplansMethod() {
		switchtoactiplansLink.click();
	}
	
	public void timetrackMethod() {
		timetrackLink.click();
	}
	
	public void tasksMethod() {
		tasksLink.click();
	}
	
	public void reportsMethod() {
		reportsLink.click();
	}
	
	public void usersMethod() {
		usersLink.click();
	}
	
	public void calendarsMethod(){
		calendarsLink.click();
	}
	public void settingsMethod() throws InterruptedException {
		Thread.sleep(3000);
		settingsLink.click();
	}
	
	public void integrationsMethod(){
		integrationsLink.click();
	}
	
	public void helpandsupportMethod() {
		helpandsupportLink.click();
	}
	
	public void myprofileMethod(){
		myprofileLink.click();
	}
	
	public void logoutMethod() {
		logoutLink.click();
	}
}
