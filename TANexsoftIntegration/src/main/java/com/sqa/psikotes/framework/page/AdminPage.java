//Author : Runanto
//Created-date: 29-09-2022 13.00
//Modified_date

package com.sqa.psikotes.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.utils.Utils;

public class AdminPage extends LoginPage{

	
	private WebDriver driver;
	public AdminPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page object
	
	@FindBy(xpath="//h3[@id='ui-id-7']")
	private WebElement btnUserManagement;
	
	@FindBy(xpath="//span[normalize-space()='Admin']")
	private WebElement btnAdmin;
	
	@FindBy(xpath="//input[@id='tl_user_management--51695_text']")
	private WebElement txtUserManagement;
	
	public void adminPage() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnUserManagement.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnAdmin.click();
	}
	
	public void clickBtnUserManagement() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnUserManagement.click();
	}
	
	public void clickBtnAdmin() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnAdmin.click();
	}
	
	public String getTxtUserManagement() {
		
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtUserManagement);
		
		return txtUserManagement.getAttribute("value");
	}
	
	
	
	
	
	
	
}
