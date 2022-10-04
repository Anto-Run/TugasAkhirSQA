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

public class TestAPShow25DataAdminValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPShow25DataAdminValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSAP006 Admin berhasil masuk ke halaman admin serta memilih25 pada icon show page")
	public void tsap006_admin_berhasil_masuk_ke_halaman_admin_serta_memilih25_pada_icon_show_page() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.selectShowPageTwentyFive();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk ke halaman admin serta memilih 25 pada icon show");
	}

	@When("TSAP006001 Admin klik button page1")
	public void tsap006001_admin_klik_button_page1() {
		 adminPage.clickBtnPOne();
		 extentTest.log(LogStatus.PASS, " Admin klik button page 1");
	}

	@Then("TSAP006001 Admin berhasil menampilkan25 data admin pada page ke1")
	public void tsap006001_admin_berhasil_menampilkan25_data_admin_pada_page_ke1() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 25 data admin pada page ke 1");
	}

	@When("TSAP006002 Admin klik button page2")
	public void tsap006002_admin_klik_button_page2() {
		 adminPage.clickBtnPTwo();
		 extentTest.log(LogStatus.PASS, " Admin klik button page 2");
	}

	@Then("TSAP006002 Admin berhasil menampilkan25 data admin pada page ke2")
	public void tsap006002_admin_berhasil_menampilkan25_data_admin_pada_page_ke2() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 25 data admin pada page ke 2");
	}

	@When("TSAP006003 Admin klik button page3")
	public void tsap006003_admin_klik_button_page3() {
		 adminPage.clickBtnPThree();
		 extentTest.log(LogStatus.PASS, " Admin klik button page 3");
	}

	@Then("TSAP006003 Admin berhasil menampilkan25 data admin pada page ke3")
	public void tsap006003_admin_berhasil_menampilkan25_data_admin_pada_page_ke3() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 25 data admin pada page ke 3");
	}

	@When("TSAP006004 Admin klik button page4")
	public void tsap006004_admin_klik_button_page4() {
		 adminPage.clickBtnPThree();
		 extentTest.log(LogStatus.PASS, "Admin klik button page 4");
	}

	@Then("TSAP006004 Admin berhasil menampilkan25 data admin pada page ke4")
	public void tsap006004_admin_berhasil_menampilkan25_data_admin_pada_page_ke4() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 25 data admin pada page ke 4");
	}

	@When("TSAP006005 Admin klik button page <<")
	public void tsap006005_admin_klik_button_page() {
		 adminPage.clickBtnPrevTwentyFive();
		 extentTest.log(LogStatus.PASS, "Admin klik button page <<");
	}

	@Then("TSAP006005 Admin berhasil menampilkan25 data admin pada page paling awal")
	public void tsap006005_admin_berhasil_menampilkan25_data_admin_pada_page_paling_awal() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 25 data admin pada page paling awal");
	}

	@When("TSAP006006 Admin klik button page >>")
	public void tsap006006_admin_klik_button_page() {
		 adminPage.clickBtnNextTwentyFive();
		 extentTest.log(LogStatus.PASS, "Admin klik button page >>");
	}

	@Then("TSAP006006 Admin berhasil menampilkan25 data admin pada page paling terakhir")
	public void tsap006006_admin_berhasil_menampilkan25_data_admin_pada_page_paling_terakhir() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 25 data admin pada page paling terakhir");
	}

}
