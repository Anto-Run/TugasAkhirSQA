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

public class TestAPTambahDataAdminInvalid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPTambahDataAdminInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	
	@Given("TSAPN014001 Admin berhasil masuk form tambah data")
	public void tsapn014001_admin_berhasil_masuk_form_tambah_data() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk form tambah data");
	}

	@When("^TSAPN014001 Admin mengisi field (.*), privilages, supervisor, (.*), (.*), (.*)$")
	public void tsapn014001_admin_mengisi_field_fullname_privilages_supervisor_telephone_username_password(String fullname, String telephone, String username, String password) {
		 adminPage.addDataAdmin(fullname, telephone, username, password);
		   extentTest.log(LogStatus.PASS, "Admin mengisi field");;
	}

	@When("TSAPN014001 Admin klik tombol save")
	public void tsapn014001_admin_klik_tombol_save() {
		 adminPage.clickBtnSaveData();
		   extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSAPN014001 Admin tidak bisa menambahkan data")
	public void tsapn014001_admin_tidak_bisa_menambahkan_data() {
		String strExpected = "Mohon Lengkapi Data";
		assertTrue(adminPage.getTxtAddFailed().contains(strExpected));
	    extentTest.log(LogStatus.PASS, "Admin tidak bisa menambahkan data akun");
	}
}
	