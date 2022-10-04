package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.AdminPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAPShow50DataAdminValid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPShow50DataAdminValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	
	@Given("TSAP007 Admin berhasil masuk ke halaman admin serta memilih50 pada icon show page")
	public void tsap007_admin_berhasil_masuk_ke_halaman_admin_serta_memilih50_pada_icon_show_page() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.selectShowPageTen();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk ke halaman admin serta memilih50 pada icon show page");
	}

	@When("TSAP007001 Admin klik button page1")
	public void tsap007001_admin_klik_button_page1() {
	   adminPage.clickBtnPOne();
	   extentTest.log(LogStatus.PASS, "Admin klik button page1");
	}

	@Then("TSAP007001 Admin berhasil menampilkan50 data admin pada page ke1")
	public void tsap007001_admin_berhasil_menampilkan50_data_admin_pada_page_ke1() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 50 data admin pada page ke 1");
	}

	@When("TSAP007002 Admin klik button page2")
	public void tsap007002_admin_klik_button_page2() {
		 adminPage.clickBtnPTwo();
		 extentTest.log(LogStatus.PASS, "Admin klik button page2");
	}

	@Then("TSAP007002 Admin berhasil menampilkan50 data admin pada page ke2")
	public void tsap007002_admin_berhasil_menampilkan50_data_admin_pada_page_ke2() {
			boolean isData = true;
			assertEquals(adminPage.getBtnDataFirst(),isData);
		    extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 50 data admin pada page ke 2");
	}

	@When("TSAP007003 Admin klik button page >>")
	public void tsap007003_admin_klik_button_page() {
		adminPage.clickBtnNextFifty();
		extentTest.log(LogStatus.PASS, "Admin klik button page >>");
	}

	@Then("TSAP007003 Admin berhasil menampilkan50 data admin pada page >>")
	public void tsap007003_admin_berhasil_menampilkan50_data_admin_pada_page() {
		boolean isData = true;
		assertEquals(adminPage.getBtnDataFirst(),isData);
	    extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 50 data admin pada page ke >>");
	}

	@When("TSAP007004 Admin klik button page <<")
	public void tsap007004_admin_klik_button_page() {
		adminPage.clickBtnPrevFifty();
		extentTest.log(LogStatus.PASS, "Admin klik button page <<");
	}

	@Then("TSAP007004 Admin berhasil menampilkan50 data admin pada page <<")
	public void tsap007004_admin_berhasil_menampilkan50_data_admin_pada_page() {
		boolean isData = true;
		assertEquals(adminPage.getBtnDataFirst(),isData);
	    extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 50 data admin pada page ke >>");
	}
}
