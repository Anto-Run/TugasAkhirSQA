//Author : Runanto
//Created-date: 29-09-2022 13.00


package com.sqa.psikotes.framework.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.utils.Utils;

public class LoginPage {

		
	private WebDriver driver;
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Button 
	@FindBy(xpath="//button[@id='51552_query']/span")
	private WebElement btnSignIn;
	
	
	@FindBy(id="tl_login-1-51550_finder")
	private WebElement btnGreenUsername;
	
	@FindBy(id="tl_login-1-51551_finder")
	private WebElement btnGreenPassword;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")
	private WebElement btnOk;
	
	
	@FindBy(xpath="//span[normalize-space()='DEVELOPER']")
	private WebElement btnAccount;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='TIDAK'])[1]/following::span[1]")
	private WebElement btnTidak;
	
	@FindBy(xpath="//button[@id='52706_query']/span")
	private WebElement btnAkunAdmin;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")
	private WebElement btnNoLogout;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='TIDAK'])[1]/following::span[1]")
	private WebElement btnYesLogout;
	
	
	@FindBy(xpath="//div[8]/div/button/span")
	private WebElement btnXLogout;
	
	
	//Validation txt
	@FindBy(id="tl_login-1-51550_text")
	private WebElement txtUsername;
	
	@FindBy(id="tl_login-1-51551_text")
	private WebElement txtPassword;
	
	@FindBy(xpath="//font[normalize-space()='PSIKOTEST']")
	private WebElement txtPsikotes;
	
	@FindBy(id="tele_menu--52817")
	private WebElement txtPsikotesAdmin;
	
	@FindBy(xpath="//div[@id='nikita-form-dialog']/p")
	private WebElement txtGagalLogin;
	
	
	public void loginValidOne(String username, String password) {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtUsername.sendKeys(username);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtPassword.sendKeys(password);
	}
	
	public void loginValidTwo(String username, String password) {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtUsername);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtUsername.sendKeys(username);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtPassword.sendKeys(password);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnSignIn.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnOk.click();
		
	}
	public void loginValidThree(String username, String password) {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtUsername.sendKeys(username);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtPassword.sendKeys(password);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnSignIn.click();
		
	}
	
	public void logout() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnAkunAdmin.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnYesLogout.click();
	}
	
	
	//Click Method
	public void clickBtnSignIn() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnSignIn.click();
	}
	
	public void clickBtnGreenUsername() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnGreenUsername.click();
	}
	
	public void clickBtnGreenPassword() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnGreenPassword.click();
	}
	
	public void clickOk() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnOk);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnOk.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
		
	public void clickEnterUsername() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtUsername.sendKeys(Keys.ENTER);
	}
	
	public void clickEnterPassword() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtPassword.sendKeys(Keys.ENTER);
	}
	
	public void clickBtnAkunAdmin() {
		btnAkunAdmin.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnNoLogout() {
		btnNoLogout.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnXLogout() {
		btnXLogout.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnYesLogout() {
		btnYesLogout.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	//Get Text
	public String getTxtPsikotes() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtPsikotes);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtPsikotes.getText();
	}
	public String getTxtPsikotesAdmin() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtPsikotesAdmin);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtPsikotesAdmin.getText();
	}
	
	
	
	public String getBtnSign() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnSignIn);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return btnSignIn.getText();
	}
	
	public String getTxtGagalLogin() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtGagalLogin);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtGagalLogin.getText();
	}
	
 
	
}
