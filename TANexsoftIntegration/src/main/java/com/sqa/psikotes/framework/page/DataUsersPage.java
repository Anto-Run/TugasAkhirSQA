//Author: Bagas
//Created_date: 9/29/2022
//Modified_date:

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
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")
	private WebElement btnView;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/img[1]")
	private WebElement btnEdit;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/img[1]")
	private WebElement btnEditPw;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//img[@id='tl_data_users--53411_finder']")
	private WebElement btnFinder;
	
	@FindBy(xpath = "//img[@id='tl_data_users--53078_finder']")
	private WebElement btnGreen;
	
	@FindBy(xpath = "//button[@id='53086_query']/span")
	private WebElement btnExport;
	
	@FindBy(xpath = "//button[@id='53211_query']/span")
	private WebElement btnSave;
	
	@FindBy(xpath = "//button[@id='53416_query']/span")
	private WebElement btnSavePw;
	
	@FindBy(linkText = "1")
	private WebElement btnOne;
	
	@FindBy(linkText = "2")
	private WebElement btnTwo;
	
	@FindBy(linkText = "3")
	private WebElement btnThree;
	
	@FindBy(linkText = "4")
	private WebElement btnFour;
	
	@FindBy(linkText = "5")
	private WebElement btnFive;
	
	@FindBy(linkText = "6")
	private WebElement btnSix;
	
	@FindBy(linkText = "7")
	private WebElement btnSeven;
	
	@FindBy(linkText = "8")
	private WebElement btnEight;
	
	@FindBy(linkText = "9")
	private WebElement btnNine;
	
	@FindBy(linkText = "10")
	private WebElement btnTen;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[1]//a[1]")
	private WebElement btnPrev;
	
	@FindBy(linkText = ">>")
	private WebElement btnLast;
	
	@FindBy(xpath = "//div[9]/div/div/button/span")
	private WebElement btnSilang;
	
//	Dropdown
	@FindBy(xpath = "//select[@id='tl_data_users--53411_text']")
	private WebElement dropStatus;
	
	@FindBy(id = "tl_view_user--53301_text")
	private WebElement dropEditStatus;
	
	@FindBy(xpath = "//span[@id='ddcl-tl_view_user--53302_select']/span/span")
	private WebElement dropKategori;
	
	@FindBy(id = "tl_data_users--53082_show_text")
	private WebElement dropPage;
	
//	Select
	@FindBy(xpath = "//option[@value='NON ACTIVE']")
	private WebElement selectNon;
	
	@FindBy(xpath = "//option[@value='ACTIVE']")
	private WebElement selectActive;
	
	@FindBy(xpath = "//option[@value='']")
	private WebElement selectPilih;
	
	@FindBy(xpath = "//select[@id='tl_view_user--53301_text']/option[2]")
	private WebElement selectEditActive;
	
	@FindBy(xpath = "//select[@id='tl_view_user--53301_text']/option[3]")
	private WebElement selectEditNon;
	
	@FindBy(id = "ddcl-tl_view_user--53302_select-i0")
	private WebElement selectStaff;
	
	@FindBy(id = "ddcl-tl_view_user--53302_select-i1")
	private WebElement selectLeader;
	
	@FindBy(xpath = "//option[@value='10']")
	private WebElement selectTen;
	
	@FindBy(xpath = "//option[@value='25']")
	private WebElement selectTwentiFive;
	
	@FindBy(xpath = "//option[@value='50']")
	private WebElement selectFifty;
	
	@FindBy(xpath = "//option[@value='100']")
	private WebElement selectOneHundred;
	
//	Insert
	@FindBy(xpath = "//input[@id='tl_data_users--53078_text']")
	private WebElement insSearch;
	
	@FindBy(id = "tl_editpss_user--53424_text")
	private WebElement insEditPw;
	
//	Validation
	@FindBy(xpath = "//input[@id='tl_data_users--53079_text']")
	private WebElement txtDataUsers;
	
	@FindBy(xpath = "//td[@id='tl_data_users--53082-cell-0-1']")
	private WebElement txtNameUser;
	
	@FindBy(xpath = "//td[@id='tl_data_users--53082-cell-0-2']")
	private WebElement txtEmailUser;
	
	@FindBy(xpath = "//td[@id='tl_data_users--53082-cell-0-4']")
	private WebElement txtStatusUser;
	
	@FindBy(id = "tl_viewedit_user--53383_text")
	private WebElement txtViewName;
	
	@FindBy(id = "tl_view_user--53299_text")
	private WebElement txtEditName;
	
	@FindBy(xpath = "//p[normalize-space()='Data Berhasil Di Update']")
	private WebElement txtDisimpan;
	
	@FindBy(xpath = "//table[@id='tl_data_users--53082_table']/tbody/tr/td/table/tbody/tr/td")
	private WebElement txtDataFirst;
	
	@FindBy(xpath = "//table[@id='tl_data_users--53082_table']/tbody/tr[10]/td/table/tbody/tr/td")
	private WebElement txtDataLast;
	
	@FindBy(xpath = "//div[@id='tl_data_users--53082']/div[8]")
	private WebElement txtEntries;
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtNeedPw;
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtMininamlPw;
	
	
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
	
	public void clickFinder() {
		btnFinder.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickActive() {
		selectActive.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickExport() {
		btnExport.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageOne() {
		btnOne.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageTwo() {
		btnTwo.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageThree() {
		btnThree.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageFour() {
		btnFour.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageFive() {
		btnFive.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageSix() {
		btnSix.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageSeven() {
		btnSeven.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageEight() {
		btnEight.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageNine() {
		btnNine.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageTen() {
		btnTen.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPrev() {
		btnPrev.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickLast() {
		btnLast.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSilang() {
		btnSilang.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDropEditStatus() {
		dropEditStatus.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEditPilih() {
		selectPilih.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEditActive() {
		selectEditActive.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEditNon() {
		selectEditNon.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickKategori() {
		dropKategori.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickStaff() {
		selectStaff.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickLeader() {
		selectLeader.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSearch() {
		btnSearch.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickView() {
		btnView.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEdit() {
		btnEdit.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEditPw() {
		btnEditPw.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickGreen() {
		btnGreen.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEnter() {
		this.insSearch.sendKeys(Keys.ENTER);
	}
	
	public void clickSave() {
		btnSave.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSavePw() {
		btnSavePw.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickTen() {
		dropPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropPage).selectByVisibleText("10");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		dropPage.click();
	}
	
	public void clickTwentyFive() {
		dropPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropPage).selectByVisibleText("25");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		dropPage.click();
	}
	
	public void clickFifty() {
		dropPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropPage).selectByVisibleText("50");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		dropPage.click();
	}
	
	public void clickOneHundred() {
		dropPage.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropPage).selectByVisibleText("100");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
//	Clear
	public void clearSearch() {
		insSearch.click();
		insSearch.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
//	Insert
	public void insertSearch(String search) {
		this.insSearch.sendKeys(search);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void insertEditPw(String newPassword) {
		this.insEditPw.sendKeys(newPassword);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
//	Validation
	public String getTxtDataUsers() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDataUsers);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtDataUsers.getText());
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
	
	public String getTxtViewName() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtViewName);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtViewName.getAttribute("value"));
		return txtViewName.getAttribute("value");
	}
	
	public String getTxtEditName() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtEditName);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtEditName.getAttribute("value"));
		return txtEditName.getAttribute("value");
	}
	
	public String getTxtDisimpan() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDisimpan);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtDisimpan.getText());
		return txtDisimpan.getText();
	}
	
	public String getTxtEditPw() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, insEditPw);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(insEditPw.getAttribute("placeholder"));
		return insEditPw.getAttribute("placeholder");
	}
	
	public boolean getTxtDataFirst() {
		boolean isExist = false;
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDataFirst);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		int intData = Integer.parseInt(txtDataFirst.getText());
		if(intData == 1) {
			return isExist = true;
		}else if(intData == 11) {
			return isExist = true;
		}else if (intData == 21) {
			return isExist = true;
		}else if(intData == 26) {
			return isExist = true;
		}else if (intData == 31) {
			return isExist = true;
		}else if (intData == 41) {
			return isExist = true;
		}else if (intData == 51) {
			return isExist = true;
		}else if (intData == 61) {
			return isExist = true;
		}else if (intData == 71) {
			return isExist = true;
		}else if(intData == 76) {
			return isExist = true;
		}else if (intData == 81) {
			return isExist = true;
		}else if (intData >= 91) {
			return isExist = true;
		}else {
			return isExist;
		}
	}
	
	public boolean getTxtDataLast() {
		boolean isExist = false;
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDataLast);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		int intData = Integer.parseInt(txtDataLast.getText());
		if(intData == 10) {
			return isExist = true;
		}else if(intData == 20) {
			return isExist = true;
		}else if(intData == 25) {
			return isExist = true;
		}else if (intData == 30) {
			return isExist == true;
		}else if (intData == 40) {
			return isExist = true;
		}else if (intData == 50) {
			return isExist = true;
		}else if (intData == 60) {
			return isExist = true;
		}else if (intData == 70) {
			return isExist = true;
		}else if(intData == 75) {
			return isExist = true;
		}else if (intData == 80) {
			return isExist = true;
		}else if (intData == 90) {
			return isExist = true;
		}else if (intData >= 100) {
			return isExist = true;
		}else {
			return isExist;
		}
	}
	
	public boolean getFirstNumberData() {
		boolean isAbove = false;
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDataFirst);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		int intData = Integer.parseInt(txtDataFirst.getText());
		if(intData>=1) {
			return isAbove = true;
		} else {
			return isAbove;
		}
	}
	
	public String getTxtEntries() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtEntries);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtEntries.getText());
		return txtEntries.getText();
	}
	
	public String getTxtNeedPw() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtNeedPw);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtNeedPw.getText());
		return txtNeedPw.getText();
	}
	
	public String getTxtMinimalPw() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtNeedPw);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtNeedPw.getText());
		return txtNeedPw.getText();
	}
}
