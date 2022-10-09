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

public class TestAPSearchDataAdminInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPSearchDataAdminInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	
	@Given("TSAPN013 Admin berhasil klik field search data admin")
	public void tsapn013_admin_berhasil_klik_field_search_data_admin() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.clickInSearch();
		extentTest.log(LogStatus.PASS, "Admin berhasil klik field search data admin");
	}

	@When("^TSAPN013001 Admin mengisi field search dengan (.*) invalid$")
	public void tsapn013001_admin_mengisi_field_search_dengan_data_one_invalid(String dataOne) {
		  adminPage.searchDataAdmin(dataOne);
		  extentTest.log(LogStatus.PASS, "Admin mengisi field search dengan data yang invalid");
	}

	@When("TSAPN013001 Admin klik tombol search")
	public void tsapn013001_admin_klik_tombol_search() {
		adminPage.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("TSAPN013001 Admin berhasil mencari data invalid yang dicari")
	public void tsapn013001_admin_berhasil_mencari_data_invalid_yang_dicari() {
		String strExpectedNo = "no entries";
		String strExpected = "Showing";
		
		i++;
		if(i==1) {
			assertTrue(adminPage.getTxtShowData().contains(strExpected));
		}
		else {
			assertTrue(adminPage.getTxtShowData().contains(strExpectedNo));
		}
		extentTest.log(LogStatus.PASS, "Admin berhasil mencari data invalid yang dicari");
	}

	@When("^TSAPN013002 Admin mengisi field search dengan (.*) yang invalid$")
	public void tsapn013002_admin_mengisi_field_search_dengan_data_two_yang_invalid(String dataTwo) {
		adminPage.searchDataAdmin(dataTwo);
		 extentTest.log(LogStatus.PASS, "Admin mengisi field search dengan data yang invalid");
	}

	@When("TSAPN013002 Admin klik  tombol enter \\(green button)")
	public void tsapn013002_admin_klik_tombol_enter_green_button() {
		adminPage.clikBtnGreenSearch();
		extentTest.log(LogStatus.PASS, "Admin klik  tombol enter (green button)");
	}

	@Then("TSAPN013002 Admin berhasil mencari data invalid yang dicari")
	public void tsapn013002_admin_berhasil_mencari_data_invalid_yang_dicari() {
		String strExpectedNo = "no entries";
		String strExpected = "Showing";
		
		i++;
		if(i==3) {
			assertTrue(adminPage.getTxtShowData().contains(strExpected));
		}
		else {
			assertTrue(adminPage.getTxtShowData().contains(strExpectedNo));
		}
		extentTest.log(LogStatus.PASS, "Admin berhasil mencari data invalid yang dicari");;
	}

	@When("^TSAPN013003 Admin mengisi field search dengan (.*) yang invalid$")
	public void tsapn013003_admin_mengisi_field_search_dengan_data_three_yang_invalid(String dataThree) {
		adminPage.searchDataAdmin(dataThree);
		extentTest.log(LogStatus.PASS, "Admin mengisi field search dengan data yang invalid");
	}

	@When("TSAPN013003 Admin klik tombol enter pada keyboard")
	public void tsapn013003_admin_klik_tombol_enter_pada_keyboard() {
		adminPage.clickEnterKeyboard();
		extentTest.log(LogStatus.PASS, "Admin klik tombol enter pada keyboard");
	}

	@Then("TSAPN013003 Admin berhasil mencari data invalid yang dicari")
	public void tsapn013003_admin_berhasil_mencari_data_invalid_yang_dicari() {
		String strExpectedNo = "no entries";
		String strExpected = "Showing";
		
		i++;
		if(i==5) {
			assertTrue(adminPage.getTxtShowData().contains(strExpected));
		}
		else {
			assertTrue(adminPage.getTxtShowData().contains(strExpectedNo));
		}
		extentTest.log(LogStatus.PASS, "Admin berhasil mencari data invalid yang dicari");
	}
}
