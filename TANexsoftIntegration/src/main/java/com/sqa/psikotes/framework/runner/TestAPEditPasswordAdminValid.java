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

public class TestAPEditPasswordAdminValid {
	
	

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private AdminPage adminPage = new AdminPage();
	
	public TestAPEditPasswordAdminValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	
	@Given("TSAP011 Admin berhasil masuk halaman form edit passsword admin")
	public void tsap011_admin_berhasil_masuk_halaman_form_edit_passsword_admin() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.clickInSearch();
		adminPage.searchDataAdmin("Runanto");
		adminPage.clickBtnSearch();
		adminPage.clickBtnEditPassword();
		adminPage.clickBtnUpdatePassword();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman form edit passsword admin");
	}

	@When("^TSAP011001 Admin mengisi field (.*) admin$")
	public void tsap011001_admin_mengisi_field_password_admin(String password) {
	 adminPage.updateTxtPassword(password);
	 extentTest.log(LogStatus.PASS, "Admin mengisi field password admin");
	}

	@When("TSAP011001 Admin klik tombol update")
	public void tsap011001_admin_klik_tombol_update() {
	   adminPage.clickBtnUpdatePasswordDone();
	   extentTest.log(LogStatus.PASS, "Admin klik tombol update");
	}

	@When("TSAP011001 Admin klik tombol No")
	public void tsap011001_admin_klik_tombol_no() {
	   adminPage.clickBtnNo();
	   extentTest.log(LogStatus.PASS, "Admin klik tombol No");
	}

	@Then("^TSAP011001 Admin berhasil mengagalkan edit (.*) admin$")
	public void tsap011001_admin_berhasil_mengagalkan_edit_password_admin(String password) {
	  String strExpected ="Update di batalkan";
	  String strExpectedLogin = "Username atau password tidak ditemukan";
	  assertTrue(adminPage.getTxtUpdatePasswordGagal().contains(strExpected));
	  adminPage.clickOk();
	  adminPage.clickBtnXUpdatePassword();
	  adminPage.clickBtnXUpdateDataAdmin();
	  adminPage.logout();
	  adminPage.loginValidThree("Runanto", password);
	  assertTrue(adminPage.getTxtGagalLogin().contains(strExpectedLogin));
	  driver.get(Constants.URL);
	  adminPage.loginValidTwo(Constants.USERNAME_LOGIN, Constants.PASSWORD_LOGIN);
		extentTest.log(LogStatus.PASS, "Admin berhasil mengagalkan edit password");
	  
	}

	@When("^TSAP011002 Admin mengisi field (.*) admin$")
	public void tsap011002_admin_mengisi_field_password_admin(String password) {
		adminPage.updateTxtPassword(password);
		 extentTest.log(LogStatus.PASS, "Admin mengisi field password admin");
	}

	@When("TSAP011002 Admin klik tombol update")
	public void tsap011002_admin_klik_tombol_update() {
		 adminPage.clickBtnUpdatePasswordDone();
		  extentTest.log(LogStatus.PASS, "Admin klik tombol update");
	}

	@When("TSAP011002 Admin klik tombol yes")
	public void tsap011002_admin_klik_tombol_yes() {
		adminPage.clickBtnYes();
		 extentTest.log(LogStatus.PASS, "Admin klik tombol Yes");
	}

	@Then("^TSAP011002 Admin berhasil edit (.*) admin$")
	public void tsap011002_admin_berhasil_edit_password_admin(String password) {
		String strExpected ="Password Berhasil di Update";
		String strExpectedLogin = "PSIKOTES";
		assertTrue(adminPage.getTxtUpdatePasswordDone().contains(strExpected));
		adminPage.clickOk();
		adminPage.clickBtnXUpdateDataAdmin();
		adminPage.logout();
		adminPage.loginValidTwo("Runanto", password);
		assertTrue(adminPage.getTxtPsikotesAdmin().contains(strExpectedLogin));
		adminPage.logout();
		adminPage.loginValidTwo(Constants.USERNAME_LOGIN, Constants.PASSWORD_LOGIN);
		extentTest.log(LogStatus.PASS, "Admin berhasil edit password");

		
	}


}
