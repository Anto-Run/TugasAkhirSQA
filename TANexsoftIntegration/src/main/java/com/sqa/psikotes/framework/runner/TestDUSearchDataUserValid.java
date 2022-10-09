//Author: Bagas
//Created_date: 9/29/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.DataUsersPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDUSearchDataUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUSearchDataUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDU002 Admin harus klik field search Data Users pada halaman Data Users")
	public void tsdu002_admin_harus_klik_field_search_data_users_pada_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickInsSearch();
		extentTest.log(LogStatus.PASS, "Admin harus klik field search Data Users pada halaman Data Users");
	}

//	search data with button search
	@When("^TSDU002001 Admin mengisi field dengan (.*) yang ingin dicari$")
	public void tsdu002001_admin_mengisi_field_dengan_nama_yang_ingin_dicari(String dataOne) {
	    dataUsers.insertSearch(dataOne);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field dengan nama yang ingin dicari");
	}

	@When("TSDU002001 Admin klik tombol search")
	public void tsdu002001_admin_klik_tombol_search() {
	    dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("^TSDU002001 Tampil (.*) yang dicari$")
	public void tsdu002001_tampil_nama_yang_dicari(String dataOne) {
		i++;
		if(i==1) {
			assertTrue(dataUsers.getTxtNameUser().contains(dataOne));
		} else if(i==2) {
			assertTrue(dataUsers.getTxtEmailUser().contains(dataOne));
		} else {
			assertTrue(dataUsers.getTxtStatusUser().contains(dataOne));
		}
	    extentTest.log(LogStatus.PASS, "Tampil nama yang dicari");
	}
	
//	search data with green icon
	@When("^TSDU002002 Admin mengisi field dengan (.*) yang ingin dicari$")
	public void tsdu002002n_admin_mengisi_field_dengan_name_yang_ingin_dicari(String dataTwo) {
	    dataUsers.insertSearch(dataTwo);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field dengan nama yang ingin dicari");
	}

	@When("TSDU002002 Admin klik tombol berwarna hijau")
	public void tsdu002002n_admin_klik_tombol_berwarna_hijau() {
	    dataUsers.clickGreen();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol berwarna hijau");
	}

	@Then("^TSDU002002 Tampil (.*) yang dicari$")
	public void tsdu002002n_tampil_nama_yang_dicari(String dataTwo) {
		i++;
		if(i==4) {
			assertTrue(dataUsers.getTxtNameUser().contains(dataTwo));
		} else if(i==5) {
			assertTrue(dataUsers.getTxtEmailUser().contains(dataTwo));
		} else {
			assertTrue(dataUsers.getTxtStatusUser().contains(dataTwo));
		}
	    extentTest.log(LogStatus.PASS, "Tampil nama yang dicari");
	}
	
//	search data with enter
	@When("^TSDU002003 Admin mengisi field dengan (.*) yang ingin dicari$")
	public void tsdu002003_admin_mengisi_field_dengan_name_yang_ingin_dicari(String dataThree) {
	    dataUsers.insertSearch(dataThree);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field dengan nama yang ingin dicari");
	}

	@When("TSDU002003 Admin menekan enter pada keyboard")
	public void tsdu002003_admin_menekan_enter_pada_keyboard() {
	    dataUsers.clickEnter();
	    extentTest.log(LogStatus.PASS, "Admin menekan enter pada keyboard");
	}

	@Then("^TSDU002003 Tampil (.*) yang dicari$")
	public void tsdu002003_tampil_nama_yang_dicari(String dataThree) {
		i++;
		if(i==7) {
			assertTrue(dataUsers.getTxtNameUser().contains(dataThree));
		} else if(i==8) {
			assertTrue(dataUsers.getTxtEmailUser().contains(dataThree));
		} else {
			assertTrue(dataUsers.getTxtStatusUser().contains(dataThree));
		}
	    extentTest.log(LogStatus.PASS, "Tampil nama yang dicari");
	}
}
