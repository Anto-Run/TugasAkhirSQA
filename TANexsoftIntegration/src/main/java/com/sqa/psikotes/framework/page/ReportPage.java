//Author: Bagas
//Created_date: 9/29/2022
//Modified_date:

package com.sqa.psikotes.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.utils.Utils;

public class ReportPage extends LoginPage{
	private WebDriver driver;
	public ReportPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Button
	@FindBy(id = "ui-id-11")
	private WebElement btnMenuReport;
	
	@FindBy(xpath = "//button[@id='52828_query']/span")
	private WebElement btnReport;
	
//	@FindBy(xpath = "//button[@id='51778_query']/span")
	@FindBy(xpath = "//button[@id='53459_query']/span")
	private WebElement btnView;
	
//	@FindBy(xpath = "//button[@id='51797_query']/span")
	@FindBy(xpath = "//button[@id='53462_query']/span")
	private WebElement btnExport;
	
//	@FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-w']")
	@FindBy(xpath = "//div[@id='ui-datepicker-div']/div/a/span")
	private WebElement btnDatePrev;
	
//	@FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
	@FindBy(xpath = "//div[@id='ui-datepicker-div']/div/a[2]/span")
	private WebElement btnDateNext;
	
//	@FindBy(xpath = "//div[@id='ui-datepicker-div']/table/tbody/tr/td/a")
	@FindBy(linkText = "1")
	private WebElement btnTglFirst;
	
	@FindBy(xpath = "//div[@id='ui-datepicker-div']/table/tbody/tr/td[6]/a")
	private WebElement btnTglLast;
	
//	Date
//	@FindBy(xpath = "//input[@id='tl_report_setuju--51772_text']")
	@FindBy(id = "tl_report_setuju--53453_text")
	private WebElement dateFirst;
	
//	@FindBy(xpath = "//input[@id='tl_report_setuju--51780_text']")
	@FindBy(id = "tl_report_setuju--53460_text")
	private WebElement dateLast;
	
//	Validation
//	@FindBy(xpath = "//input[@id='tl_report_setuju--51773_text']")
	@FindBy(xpath = "//input[@id='tl_report_setuju--53454_text']")
	private WebElement txtReport;
	
	@FindBy(xpath = "//td[@id='tl_report_setuju--51776-cell-0-4']")
	private WebElement txtTgl;
	
//	@FindBy(xpath = "//div[@id='tl_report_setuju--51776']/div[8]")
	@FindBy(xpath = "//div[@id='tl_report_setuju--53457']/div[8]")
	private WebElement txtEntries;
	
//	Click
	public void clickMenuReport() {
		btnMenuReport.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickReport() {
		btnReport.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickView() {
		btnView.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickExport() {
		btnExport.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDateFirst() {
		dateFirst.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDateLast() {
		dateLast.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDatePrev() {
		btnDatePrev.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDateNext() {
		btnDateNext.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickTglFirst() {
		btnTglFirst.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickTglLast() {
		btnTglLast.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
//	Validation
	public String getTxtReport() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtReport);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtReport.getText());
		return txtReport.getAttribute("value");
	}
	
	public String getTxtTgl() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtTgl);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtTgl.getText());
		return txtTgl.getText();
	}
	
	public String getTxtEntries() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtEntries);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtEntries.getText());
		return txtEntries.getText();
	}
}
