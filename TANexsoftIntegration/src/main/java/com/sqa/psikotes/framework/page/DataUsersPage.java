//Author: Bagas
//Created_date: 9/29/2022
//Modified_date:

package com.sqa.psikotes.framework.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.utils.Utils;

public class DataUsersPage extends LoginPage{
	private WebDriver driver;
	public DataUsersPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Button
	@FindBy(id = "ui-id-9")
	private WebElement btnTask;
	
	@FindBy(xpath = "//button[@id='52827_query']/span")
	private WebElement btnDataUsers;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//img[@id='tl_data_users--53078_finder']")
	private WebElement btnGreen;
	
//	Dropdown
	@FindBy(xpath = "//select[@id='tl_data_users--53411_text']")
	private WebElement dropStatus;
	
//	Select
	@FindBy(xpath = "//option[@value='NON ACTIVE']")
	private WebElement selectNon;
	
//	Insert
	@FindBy(xpath = "//input[@id='tl_data_users--53078_text']")
	private WebElement insSearch;
	
//	Validation
	@FindBy(xpath = "//input[@id='tl_data_users--53079_text']")
	private WebElement txtDataUsers;
	
	@FindBy(xpath = "//td[@id='tl_data_users--53082-cell-0-1']")
	private WebElement txtNameUser;
	
	@FindBy(xpath = "//td[@id='tl_data_users--53082-cell-0-2']")
	private WebElement txtEmailUser;
	
	@FindBy(xpath = "//td[@id='tl_data_users--53082-cell-0-4']")
	private WebElement txtStatusUser;
	
//	Click
	public void clickTask() {
		btnTask.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDataUsers() {
		btnDataUsers.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickInsSearch() {
		insSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDrop() {
		dropStatus.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickNon() {
		selectNon.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSearch() {
		btnSearch.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickGreen() {
		btnGreen.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEnter() {
		this.insSearch.sendKeys(Keys.ENTER);
	}
	
//	Insert
	public void insertSearch(String search) {
		this.insSearch.sendKeys(search);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
//	Validation
	public String getTxtDataUsers() {
		return txtDataUsers.getAttribute("value");
	}
	
	public String getTxtNameUser() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtNameUser);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtNameUser.getText());
		return txtNameUser.getText();
	}
	
	public String getTxtEmailUser() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtEmailUser);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtEmailUser.getText());
		return txtEmailUser.getText();
	}
	
	public String getTxtStatusUser() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtStatusUser);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtStatusUser.getText());
		return txtStatusUser.getText();
	}
	
	
}
