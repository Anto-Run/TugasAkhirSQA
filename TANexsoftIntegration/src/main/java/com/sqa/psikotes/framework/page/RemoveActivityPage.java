//Author: Bagas
//Created_date: 10/4/2022
//Modified_date:

package com.sqa.psikotes.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.utils.Utils;

public class RemoveActivityPage extends LoginPage{
	private WebDriver driver;
	public RemoveActivityPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Button
	@FindBy(id = "ui-id-11")
	private WebElement btnMenuReport;
	
	@FindBy(xpath = "//button[@id='52836_query']/span")
	private WebElement btnRemoveActivity;
	
	@FindBy(xpath = "//button[@id='53431_query']/span")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//tr[2]/td[10]/div/table/tbody/tr/td/div/img")
	private WebElement btnDelete;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Close'])/following::span[2]")
	private WebElement btnYa;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='IYA'])[1]/following::span[1]")
	private WebElement btnTidak;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Close'])[2]/following::span[2]")
	private WebElement btnOK;
	
	@FindBy(xpath = "//div[8]/div/button/span")
	private WebElement btnSilang;
	
//	Input
	@FindBy(xpath = "//input[@id='tl_remove_activity--53435_text']")
	private WebElement insSearch;
	
//	Validation
	@FindBy(id = "tl_remove_activity--53426_text")
	private WebElement txtRemoveActivity;
	
	@FindBy(xpath = "//td[@id='tl_remove_activity--53429-cell-0-1']")
	private WebElement txtNik;
	
	@FindBy(xpath = "//td[@id='tl_remove_activity--53429-cell-0-2']")
	private WebElement txtNama;
	
	@FindBy(xpath = "//td[@id='tl_remove_activity--53429-cell-0-3']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//td[@id='tl_remove_activity--53429-cell-0-4']")
	private WebElement txtTelpon;
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtDihapus;
	
	@FindBy(xpath = "//div[@id='tl_remove_activity--53429']/div[8]")
	private WebElement txtNoEntries;
	
//	Click
	public void clickMenuReport() {
		btnMenuReport.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickRemoveActivity() {
		btnRemoveActivity.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSearch() {
		btnSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDelete() {
		btnDelete.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickYa() {
		btnYa.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickTidak() {
		btnTidak.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSilang() {
		btnSilang.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
//	Input
	public void inputSearch(String search) {
		this.insSearch.sendKeys(search);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputInvalidSearch(String search) {
		if(!search.equals("")) {
			this.insSearch.sendKeys(search);
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		}
	}
	
//	Validation
	public String getTxtRemoveAct() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtRemoveActivity);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtRemoveActivity.getText());
		return txtRemoveActivity.getAttribute("value");
	}
	
	public String getTxtNik() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtNik);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtNik.getText());
		return txtNik.getText();
	}
	
	public String getTxtNama() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtNama);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtNama.getText());
		return txtNama.getText();
	}
	
	public String getTxtEmail() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtEmail);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtEmail.getText());
		return txtEmail.getText();
	}
	
	public String getTxtTelpon() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtTelpon);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtTelpon.getText());
		return txtTelpon.getText();
	}
	
	public String getTxtDihapus() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDihapus);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtDihapus.getText());
		return txtDihapus.getText();
	}
	
	public String getTxtEntries() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtNoEntries);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtNoEntries.getText());
		return txtNoEntries.getText();
	}
}
