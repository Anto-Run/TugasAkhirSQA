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

public class TestAPShow100DataAdminValid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPShow100DataAdminValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSAP008001 Admin berhasil masuk ke halaman admin, memilih100 pada icon show page")
	public void tsap008001_admin_berhasil_masuk_ke_halaman_admin_memilih100_pada_icon_show_page() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.selectShowPageOneHundred();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk ke halaman admin, memilih 100 pada icon show page");
	}

	@When("TSAP008001 Admin klik button page1")
	public void tsap008001_admin_klik_button_page1() {
		 adminPage.clickBtnOneOneHundred();
		 extentTest.log(LogStatus.PASS, " Admin klik button page 1");
	}

	@Then("TSAP008001 Admin berhasil menampilkan100 data admin pada page1")
	public void tsap008001_admin_berhasil_menampilkan100_data_admin_pada_page1() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		  extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 100 data admin pada page ke 1");
	}
	
}
