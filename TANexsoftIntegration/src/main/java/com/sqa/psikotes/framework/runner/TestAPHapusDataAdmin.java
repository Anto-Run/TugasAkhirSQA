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

public class TestAPHapusDataAdmin {


	private static WebDriver driver;
	private static ExtentTest extentTest;
	private AdminPage adminPage = new AdminPage();
	
	public TestAPHapusDataAdmin() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSAP012 Admin berhasil masuk halaman admin")
	public void tsap012_admin_berhasil_masuk_halaman_admin() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.clickInSearch();
		adminPage.searchDataAdmin("Bagas41");
		adminPage.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman admin");
	}

	@When("TSAP012001 Admin klik tombol hapus data")
	public void tsap012001_admin_klik_tombol_hapus_data() {
	    adminPage.clickBtnDeleteDataAdmin();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol hapus data");
	}

	@When("TSAP012001 Admin klik tombol No")
	public void tsap012001_admin_klik_tombol_no() {
		 adminPage.clickBtnNo();
		 extentTest.log(LogStatus.PASS, "Admin klik tombol No");
	}

	@Then("TSAP012001 Admin batal menghapus data")
	public void tsap012001_admin_batal_menghapus_data() {
		String strExpected = "Showing";
	   adminPage.clickInSearch();
	   adminPage.searchDataAdmin("Bagas41");
	   assertTrue(adminPage.getTxtShowData().contains(strExpected));
	   extentTest.log(LogStatus.PASS, "Admin batal menghapus data");
	   
	}

	@When("TSAP012002 Admin klik tombol hapus data")
	public void tsap012002_admin_klik_tombol_hapus_data() {
		  adminPage.clickBtnDeleteDataAdmin();
		    extentTest.log(LogStatus.PASS, "Admin klik tombol hapus data");
	}

	@When("TSAP012002 Admin klik tombol yes")
	public void tsap012002_admin_klik_tombol_yes() {
	    adminPage.clickBtnYesDelete();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol Yes");
	}

	@Then("TSAP012002 Admin berhasil menghapus data")
	public void tsap012002_admin_berhasil_menghapus_data() {
		String strExpected = "no entries";
		   adminPage.clickInSearch();
		   adminPage.searchDataAdmin("Bagas41");
		   assertTrue(adminPage.getTxtShowData().contains(strExpected));
		   extentTest.log(LogStatus.PASS, "Admin berhasil menghapus data");
	}

}
