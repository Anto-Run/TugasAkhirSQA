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

public class TestAPSearchDataAdminValid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPSearchDataAdminValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSAP002 Admin berhasil klik field search data admin")
	public void tsap002_admin_berhasil_klik_field_search_data_admin() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.clickInSearch();
		extentTest.log(LogStatus.PASS, "Admin berhasil klik field search data admin");
	}

	@When("^TSAP002001 Admin mengisi field search dengan (.*) yang dicari$")
	public void tsap002001_admin_mengisi_field_search_dengan_data_one_yang_dicari(String dataOne) {
	    adminPage.searchDataAdmin(dataOne);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field search dengan data yang dicari");
	}

	@When("TSAP002001 Admin klik tombol search")
	public void tsap002001_admin_klik_tombol_search() {
		adminPage.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("^TSAP002001 Admin berhasil mencari (.*) yang dicari$")
	public void tsap002001_admin_berhasil_mencari_data_one_yang_dicari(String dataOne) {
		i++;
		if(i==1) {
			assertTrue(adminPage.getTxtUsername().contains(dataOne));
		} else if(i==2) {
			assertTrue(adminPage.getTxtFullName().contains(dataOne));
		} else if(i==3) {
			assertTrue(adminPage.getTxtPrivileges().contains(dataOne));
		}else if(i==4) {
			assertTrue(adminPage.getTxSupervisor().contains(dataOne));
		}else if(i==5) {
			assertTrue(adminPage.getTxtTelephone().contains(dataOne));
		}else {
			assertTrue(adminPage.getTxtUserActive().contains(dataOne));
		}
		extentTest.log(LogStatus.PASS, "Admin berhasil mencari data yang dicari");
	}

	@When("^TSAP002002 Admin mengisi field search dengan (.*) yang dicari$")
	public void tsap002002_admin_mengisi_field_search_dengan_data_two_yang_dicari(String dataTwo) {
		 adminPage.searchDataAdmin(dataTwo);
		 extentTest.log(LogStatus.PASS, "Admin mengisi field search dengan data yang dicari");
	}

	@When("TSAP002002 Admin klik  tombol enter \\(green button)")
	public void tsap002002_admin_klik_tombol_enter_green_button() {
		adminPage.clikBtnGreenSearch();
		extentTest.log(LogStatus.PASS, "Admin klik  tombol enter (green button)");
	}

	@Then("^TSAP002002 Admin berhasil mencari (.*) yang dicari$")
	public void tsap002002_admin_berhasil_mencari_data_two_yang_dicari(String dataTwo) {
		i++;
		if(i==7) {
			assertTrue(adminPage.getTxtUsername().contains(dataTwo));
		} else if(i==8) {
			assertTrue(adminPage.getTxtFullName().contains(dataTwo));
		} else if(i==9) {
			assertTrue(adminPage.getTxtPrivileges().contains(dataTwo));
		}else if(i==10) {
			assertTrue(adminPage.getTxSupervisor().contains(dataTwo));
		}else if(i==11) {
			assertTrue(adminPage.getTxtTelephone().contains(dataTwo));
		}else {
			assertTrue(adminPage.getTxtUserActive().contains(dataTwo));
		}
		extentTest.log(LogStatus.PASS, "Admin berhasil mencari data yang dicari");
	}

	@When("^TSAP002003 Admin mengisi field search dengan (.*) yang dicari$")
	public void tsap002003_admin_mengisi_field_search_dengan_data_three_yang_dicari(String dataThree) {
		adminPage.searchDataAdmin(dataThree);
		extentTest.log(LogStatus.PASS, "Admin mengisi field search dengan data yang dicari");
	}

	@When("TSAP002003 Admin klik tombol enter pada keyboard")
	public void tsap002003_admin_klik_tombol_enter_pada_keyboard() {
		adminPage.clickEnterKeyboard();
		extentTest.log(LogStatus.PASS, "Admin klik tombol enter pada keyboard");
	}

	@Then("^TSAP002003 Admin berhasil mencari (.*) yang dicari$")
	public void tsap002003_admin_berhasil_mencari_data_three_yang_dicari(String dataThree) {
		i++;
		if(i==13) {
			assertTrue(adminPage.getTxtUsername().contains(dataThree));
		} else if(i==14) {
			assertTrue(adminPage.getTxtFullName().contains(dataThree));
		} else if(i==15) {
			assertTrue(adminPage.getTxtPrivileges().contains(dataThree));
		}else if(i==16) {
			assertTrue(adminPage.getTxSupervisor().contains(dataThree));
		}else if(i==17) {
			assertTrue(adminPage.getTxtTelephone().contains(dataThree));
		}else {
			assertTrue(adminPage.getTxtUserActive().contains(dataThree));
		}
		extentTest.log(LogStatus.PASS, "Admin berhasil mencari data yang dicari");
	}

}
