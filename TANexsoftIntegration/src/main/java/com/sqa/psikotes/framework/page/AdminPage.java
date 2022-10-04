//Author : Runanto
//Created-date: 29-09-2022 13.00
//Modified_date

package com.sqa.psikotes.framework.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.utils.Utils;

public class AdminPage extends LoginPage{

	
	private WebDriver driver;
	public AdminPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Button
	@FindBy(xpath="//h3[@id='ui-id-7']")
	private WebElement btnUserManagement;
	
	@FindBy(xpath="//span[normalize-space()='Admin']")
	private WebElement btnAdmin;
	
	@FindBy(xpath="//img[@id='tl_user_management--51690_finder']")
	private WebElement btnGreenSearch;
	
	@FindBy(xpath="//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath="//span[normalize-space()='Add']")
	private WebElement btnAdd;
	
	@FindBy(xpath="//button[@id='51742_query']/span")
	private WebElement btnSaveData;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='No'])[2]/following::span[1]")
	private WebElement btnYes;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")
	private WebElement btnNo;
	
	/*
	 * Button Page
	 */
	
	
	@FindBy(xpath = "//div[4]//ul[1]//li[1]//a[1]")
	private WebElement btnPrev;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[8]//a[1]")
	private WebElement btnNext;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[1]//a[1]")
	private WebElement btnNextTwentyFive;

	@FindBy(xpath = "//div[4]//ul[1]//li[1]//a[1]")
	private WebElement btnNextFifty;
	
	@FindBy(linkText="1")
	private WebElement btnPOne;
	
	@FindBy(linkText="2")
	private WebElement btnPTwo;
	
	
	@FindBy(linkText="3")
	private WebElement btnPThree;
	
	@FindBy(linkText="4")
	private WebElement btnPFour;
	
	@FindBy(linkText="5")
	private WebElement btnPFive;
	
	@FindBy(linkText="6")
	private WebElement btnPSix;

	@FindBy(linkText="7")
	private WebElement btnPSeven;
	
	@FindBy(linkText="8")
	private WebElement btnPEight;
	
	@FindBy(linkText="9")
	private WebElement btnPNine;
	
	@FindBy(linkText="10")
	private WebElement btnPTen;
	


	//Insert
	@FindBy(xpath="//input[@id='tl_user_management--51690_text']")
	private WebElement insertSearch;
	
	//txt Add data
	@FindBy(id="tl_agent_editable-14-51730_text")
	private WebElement txtAddFullName;
	
	@FindBy(id="tl_agent_editable-14-51736_text")
	private WebElement txtAddTelephone;
	
	@FindBy(id="tl_agent_editable-14-51740_text")
	private WebElement txtAddUsername;
	
	@FindBy(id="tl_agent_editable-14-51741_text")
	private WebElement txtAddPassword;
	
	
	//Dropdown
	
	@FindBy(id="tl_agent_editable-14-51731_text")
	private WebElement btnDropPrivileges;

	
	@FindBy(xpath="tl_agent_editable-14-51733_text")
	private WebElement btnDropSupervisor;
	
	@FindBy(id="tl_user_management--51688_show_text")
	private WebElement dropShowPage;
	
	//Select
	@FindBy(xpath="//select[@id='tl_agent_editable-14-51731_text']")
	private WebElement selectPrivileges;	
	
	@FindBy(xpath="//select[@id='tl_agent_editable-14-51733_text']")
	private WebElement selectSupervisor;
	
	@FindBy(xpath = "//option[@value='10']")
	private WebElement selectTen;
	
	@FindBy(xpath = "//option[@value='25']")
	private WebElement selectTwentyFive;
	
	@FindBy(xpath = "//option[@value='50']")
	private WebElement selectFifty;
	
	@FindBy(xpath = "//option[@value='100']")
	private WebElement selectOneHundred;
	

	
	//Validation (txt)
	@FindBy(xpath="//input[@id='tl_user_management--51695_text']")
	private WebElement txtUserManagement;

	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-2']")
	private WebElement txtUsername;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-3']")
	private WebElement txtFullName;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-4']")
	private WebElement txtPrivileges;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-5']")
	private WebElement txtSupervisor;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-6']")
	private WebElement txtTelephone;
	
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-8']")
	private WebElement txtUserActive;
	
	
	@FindBy(xpath="//th[normalize-space()='User Name']")
	private WebElement txtNotFound;
	
	//Validation (button)
	@FindBy(xpath="//td[@id='tl_user_management--51688-cell-0-0']")
	private WebElement btnDataFirst;


	//Method
	public void adminPage() {
		btnUserManagement.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnAdmin.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);	
	}
	
	public void searchDataAdmin(String strSearch) {
		this.insertSearch.sendKeys(strSearch);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void addDataAdmin(String fullName, String telephone, String username, String password) {
		this.txtAddFullName.sendKeys(fullName);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectPrivileges.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	    new Select(selectPrivileges).selectByVisibleText("Admin");
		selectPrivileges.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectSupervisor.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(selectSupervisor).selectByVisibleText("DEVELOPER (DEVELOPER)");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectSupervisor.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtAddTelephone.sendKeys(telephone);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtAddUsername.sendKeys(username);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtAddPassword.sendKeys(password);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
	//Click method
	public void clickBtnUserManagement() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnUserManagement.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void clickBtnAdmin() {
		btnAdmin.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickInSearch() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		insertSearch.click();
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void clikBtnGreenSearch() {
		btnGreenSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	
	}
	
	public void clickEnterKeyboard() {
		this.insertSearch.sendKeys(Keys.ENTER);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	public void clickBtnAdd(){
		btnAdd.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void clickBtnSaveData() {
		btnSaveData.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickFullName(String fullname) {
		this.txtAddFullName.clear();
		this.txtAddFullName.sendKeys(fullname);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	

	
	public void clickTelephone(String telephone) {
		this.txtAddTelephone.clear();
		this.txtAddTelephone.sendKeys(telephone);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickUsername(String username) {
		this.txtAddUsername.clear();
		this.txtAddUsername.sendKeys(username);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPassword(String password) {
		this.txtAddPassword.clear();
		this.txtAddPassword.sendKeys(password);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnYes() {
		btnYes.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnNo() {
		btnNo.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPOne() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPOne.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
	public void clickBtnPTwo() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPTwo.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	

	public void clickBtnPThree() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPThree.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPFour() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPFour.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPFive() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPFive.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPSix() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPSix.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPSeven() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnNext.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPSeven.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPEight() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnNext.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPEight.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPNine() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnNext.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPNine.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPTen() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnNext.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPTen.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
	
	public void clickBtnNextTen() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnNext.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPrevTen() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnNext.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPrev.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnNextTwentyFive() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnNextTwentyFive.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPrevTwentyFive() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnNextTwentyFive.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPrev.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void clickBtnNextFifty() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnNextFifty.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnPrevFifty() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnNextFifty.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnPrev.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	
	
	//select
	public void selectShowPageTen() {
		dropShowPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropShowPage).selectByVisibleText("10");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectTen.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void selectShowPageTwentyFive() {
		dropShowPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropShowPage).selectByVisibleText("25");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectTwentyFive.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void selectShowPageFifty() {
		dropShowPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropShowPage).selectByVisibleText("50");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectFifty.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void selectShowPageOneHundred() {
		dropShowPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropShowPage).selectByVisibleText("100");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		selectOneHundred.click();
	}
	
	
	//get method
	public String getTxtUserManagement() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtUserManagement);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtUserManagement.getAttribute("value");
	}
	
	public String getTxtUsername() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtUsername);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtUsername);
		return txtUsername.getText();
	}
	
	public String getTxtFullName() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtFullName);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtFullName);
		return txtFullName.getText();
	}
	
	public String getTxtPrivileges() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtPrivileges);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtPrivileges);
		return txtPrivileges.getText();
	}
	
	public String getTxSupervisor() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtSupervisor);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtSupervisor);
		return txtSupervisor.getText();
	}
	
	public String getTxtTelephone() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtTelephone);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtTelephone);
		return txtTelephone.getText();
	}
	
	public String getTxtUserActive() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtUserActive);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtUserActive);
		return txtUserActive.getText();
	}
	
	public String getTxtNotFound() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtNotFound);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtNotFound+"Data tidak ditemukan");
		return txtNotFound.getText();
	}
	
	public boolean getBtnDataFirst() {
		boolean isData = false;
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnDataFirst);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		int intData = Integer.parseInt(btnDataFirst.getText());
		if(intData == 1) {
			return isData = true;
		}else if(intData == 11) {
			return isData = true;
		}else if (intData == 21) {
			return isData = true;
		}else if (intData == 31) {
			return isData = true;
		}else if (intData == 41) {
			return isData = true;
		}else if (intData == 51) {
			return isData = true;
		}else if (intData == 61) {
			return isData = true;
		}else if (intData == 71) {
			return isData = true;
		}else if (intData == 81) {
			return isData = true;
		}else if (intData == 91) {
			return isData = true;
		}else if (intData == 26) {
			return isData = true;
		}else if (intData == 51) {
			return isData = true;
		}else if (intData == 76) {
			return isData = true;
		}else if(intData >= 91) {
			return isData = true;
		}else {
			return isData;
		}
	}
	
	
}
