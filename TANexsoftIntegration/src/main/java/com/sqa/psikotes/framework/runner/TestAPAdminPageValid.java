//Author : Runanto
//Created-date: 29-09-2022 13.00

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

public class TestAPAdminPageValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private AdminPage adminPage = new AdminPage();
	
	public TestAPAdminPageValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	

	@Given("TSAP001001 Admin berhasil masuk halaman utama web")
	public void tsap001001_admin_berhasil_masuk_halaman_utama_web() {
		driver.get(Constants.URL);
		adminPage.loginValidTwo(Constants.USERNAME_LOGIN, Constants.PASSWORD_LOGIN);
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman utama web");
	}

	@When("TSAP001001 Admin klik Menu User Management")
	public void tsap001001_admin_klik_menu_user_management() {
		adminPage.clickBtnUserManagement();
		extentTest.log(LogStatus.PASS, "Admin klik menu user management");
	}

	@When("TSAP001001 Admin klik tombol admin")
	public void tsap001001_admin_klik_tombol_admin() {
	    adminPage.clickBtnAdmin();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol admin");
	}

	@Then("TSAP001001 Admin berhasil masuk ke halaman admin psikotes")
	public void tsap001001_admin_berhasil_masuk_ke_halaman_admin_psikotes() {
		String strExpect ="USER";
		assertTrue(adminPage.getTxtUserManagement().contains(strExpect));
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk ke halaman admin psikotes");
	}

}
