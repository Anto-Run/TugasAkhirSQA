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

public class TestAPShowDataAdminValid {

	

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPShowDataAdminValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSAP004 Admin berhasil masuk halaman menu admin")
	public void tsap004_admin_berhasil_masuk_halaman_menu_admin() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman menu admin");
	}

	@When("TSAP004001 Admin memilih10 pada icon show page")
	public void tsap004001_admin_memilih10_pada_icon_show_page() {
	    adminPage.selectShowPageTen();
	    extentTest.log(LogStatus.PASS, "Admin memilih 10 pada icon show page");
	}

	@Then("TSAP004001  Admin berhasil menampilkan10 data admin")
	public void tsap004001_admin_berhasil_menampilkan10_data_admin() {
	   boolean isData = true;
	   assertEquals(adminPage.getBtnDataFirst(),isData);
	   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin");
	}

	@When("TSAP004002 Admin memilih25 pada icon show page")
	public void tsap004002_admin_memilih25_pada_icon_show_page() {
		 adminPage.selectShowPageTwentyFive();
		 extentTest.log(LogStatus.PASS, "Admin memilih 25 pada icon show page");
	}

	@Then("TSAP004002  Admin berhasil menampilkan25 data admin")
	public void tsap004002_admin_berhasil_menampilkan25_data_admin() {
		   boolean isData = true;
		   assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 25 data admin");
	}

	@When("TSAP004003 Admin memilih50 pada icon show page")
	public void tsap004003_admin_memilih50_pada_icon_show_page() {
		 adminPage.selectShowPageFifty();
		 extentTest.log(LogStatus.PASS, "Admin memilih 50 pada icon show page");
	}

	@Then("TSAP004003  Admin berhasil menampilkan50 data admin")
	public void tsap004003_admin_berhasil_menampilkan50_data_admin() {
		 boolean isData = true;
		 assertEquals(adminPage.getBtnDataFirst(),isData);
		 extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 50 data admin");
	}

	@When("TSAP004004 Admin memilih100 pada icon show page")
	public void tsap004004_admin_memilih100_pada_icon_show_page() {
		 adminPage.selectShowPageOneHundred();
		 extentTest.log(LogStatus.PASS, "Admin memilih 100 pada icon show page");
	}

	@Then("TSAP004004  Admin berhasil menampilkan100 data admin")
	public void tsap004004_admin_berhasil_menampilkan100_data_admin() {
		 boolean isData = true;
		 assertEquals(adminPage.getBtnDataFirst(),isData);
		 extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 100 data admin");
	}
}
