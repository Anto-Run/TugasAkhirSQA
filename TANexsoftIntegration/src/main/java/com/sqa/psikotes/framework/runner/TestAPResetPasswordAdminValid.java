package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.AdminPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAPResetPasswordAdminValid {
	
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPResetPasswordAdminValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	@Given("TSAP009001 Admin berhasil masuk halaman menu admin")
	public void tsap009001_admin_berhasil_masuk_halaman_menu_admin() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.clickInSearch();
		adminPage.searchDataAdmin("Bagas41");
		adminPage.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman menu admin");
	}

	@When("TSAP009001 Admin klik checkbox pada data yang akan di reset passwordnya")
	public void tsap009001_admin_klik_checkbox_pada_data_yang_akan_di_reset_passwordnya() {
	   adminPage.clickCheckPassword();
	   extentTest.log(LogStatus.PASS, "Admin klik checkbox pada data yang akan di reset passwordnya");
	}
	@When("TSAP009001 Admin klik button reset password")
	public void tsap009001_admin_klik_button_reset_password() {
		adminPage.clickBtnResetPassword();
		extentTest.log(LogStatus.PASS, "Admin klik button reset password");
	}
	@When("TSAP009001 Admin klik button yes")
	public void tsap009001_admin_klik_button_yes() {
		adminPage.clickBtnYesReset();
		extentTest.log(LogStatus.PASS, "Admin klik button yes");
	}

	@Then("TSAP009001 Admin berhasil reset password berdasarkan akun admin yang akan direset")
	public void tsap009001_admin_berhasil_reset_password_berdasarkan_akun_admin_yang_akan_direset() {
		String strDoneReset = "PASSWORD";
		String strExpectedLogin = "PSIKOTES";
		assertTrue(adminPage.getTxtDoneReset().contains(strDoneReset));
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.logout();
		adminPage.loginValidTwo("Bagas41", "1");
		extentTest.log(LogStatus.PASS, "Admin berhasil reset password berdasarkan akun admin yang akan direset");
		assertTrue(adminPage.getTxtPsikotesAdmin().contains(strExpectedLogin));
		adminPage.logout();
		adminPage.loginValidTwo(Constants.USERNAME_LOGIN, Constants.PASSWORD_LOGIN);
		
	}



}
