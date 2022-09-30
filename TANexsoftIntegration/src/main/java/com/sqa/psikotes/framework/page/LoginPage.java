//Author : Runanto
//Created-date: 29/09/2022
//Modifer:
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

public class LoginPage {

		
		private WebDriver driver;
		public LoginPage() {
			this.driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="tl_login-1-51550_text")
	private WebElement txtUsername;
	
	@FindBy(id="tl_login-1-51551_text")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[@id='51552_query']/span")
	private WebElement btnSignIn;
	
	
	@FindBy(id="tl_login-1-51550_finder")
	private WebElement btnGreenUsername;
	
	@FindBy(id="tl_login-1-51551_finder")
	private WebElement btnGreenPassword;
	
	@FindBy(id="nikita-form-dialog-tag")
	private WebElement txtWelcome;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")
	private WebElement btnOk;
	
	@FindBy(xpath="//span[normalize-space()='DEVELOPER']")
	private WebElement btnAccount;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='TIDAK'])[1]/following::span[1]")
	private WebElement btnTidak;
	
	@FindBy(xpath="//font[normalize-space()='PSIKOTEST']")
	private WebElement txtPsikotes;
	
	public void loginValidOne(String username, String password) {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtUsername.sendKeys(username);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtPassword.sendKeys(password);
	}
	
	public void loginValidTwo(String username, String password) {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtUsername.sendKeys(username);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtPassword.sendKeys(password);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnSignIn.click();
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnOk);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		btnOk.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void clickBtnSignIn() {
		btnSignIn.click();
	}
	
	public void clickBtnGreenUsername() {
		btnGreenUsername.click();
	}
	
	public void clickBtnGreenPassword() {
		btnGreenPassword.click();
	}
	
	public void clickOk() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnOk);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		btnOk.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void logout() {
		btnOk.click();
		btnAccount.click();
		btnTidak.click();
	}
	
	public void clickEnterUsername() {
		this.txtUsername.sendKeys(Keys.ENTER);
	}
	
	public void clickEnterPassword() {
		this.txtPassword.sendKeys(Keys.ENTER);
	}
	
	
	public String getTxtWelcome() {
		
		return txtWelcome.getText();
	}
	
	public String getTxtPsikotes() {
		
		return txtPsikotes.getText();
	}
	
	
	
 
	
}


