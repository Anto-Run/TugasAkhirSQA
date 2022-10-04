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

public class TestAPTambahDataAdminValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPTambahDataAdminValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	

	@Given("TSAP003 Admin berhasil masuk form tambah data")
	public void tsap003_admin_berhasil_masuk_form_tambah_data() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk form tambah data");
		
	}
	

	@When("^TSAP003001 Admin mengisi field (.*), privilages, supervisor, (.*), (.*), (.*)$")
	public void tsap003001_admin_mengisi_field_fullname_privilages_supervisor_telephone_username_password(String fullname, String telephone, String username, String password) {
	    adminPage.addDataAdmin(fullname, telephone, username, password);
	    extentTest.log(LogStatus.PASS, "Admin berhasil mengisi form tambah data");
	    
	}

	@When("TSAP003001 Admin klik tombol save")
	public void tsap003001_admin_klik_tombol_save() {
	   adminPage.clickBtnSaveData();
	   extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	   
	}

	@When("TSAP003001 Admin klik yes")
	public void tsap003001_admin_klik_yes() {
		adminPage.clickBtnYes();
		extentTest.log(LogStatus.PASS, "Admin klik tombol yes");
	}

	@Then("^TSAP003001 Admin berhasil menambahkan (.*) akun$")
	public void tsap003001_admin_berhasil_menambahkan_data_akun(String data) {
		adminPage.searchDataAdmin(data);
		adminPage.clickBtnSearch();
		assertTrue(adminPage.getTxtUsername().contains(data));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menambahkan data akun");
	}
	
	

	@When("^TSAP003002 Admin mengisi field (.*), privilages, supervisor, (.*), (.*), (.*)$")
	public void tsap003002_admin_mengisi_field_fullname_privilages_supervisor_telephone_username_password(String fullname, String telephone, String username, String password) {
	    adminPage.addDataAdmin(fullname, telephone, username, password);
	    extentTest.log(LogStatus.PASS, "Admin berhasil mengisi form tambah data");
	    
	}

	@When("TSAP003002 Admin klik tombol save")
	public void tsap003002_admin_klik_tombol_save() {
	   adminPage.clickBtnSaveData();
	   extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	   
	}

	@When("TSAP003002 Admin klik no")
	public void tsap003002_admin_klik_no() {
		adminPage.clickBtnNo();
		extentTest.log(LogStatus.PASS, "Admin klik tombol no");
	}

	@Then("^TSAP003002 Admin tidak melakukan tambah (.*) akun$")
	public void tsap003002_admin_tidak_melakukan_tambah_data_akun(String data) {
		adminPage.clickInSearch();
		adminPage.searchDataAdmin(data);
		adminPage.clickBtnSearch();
		assertTrue(adminPage.getTxtNotFound().contains("User"));
	    extentTest.log(LogStatus.PASS, "Admin tidak melakukan tambah data akun");
	}
	

	


	

}
