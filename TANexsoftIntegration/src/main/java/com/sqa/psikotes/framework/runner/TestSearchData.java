//Author : Andika Bagaskara P.N
//Created date: 29/09/2022
//Modifer:
//Modifed date:


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

public class TestSearchData {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestSearchData() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("Admin harus klik field search Data Users pada halaman Data Users")
	public void admin_harus_klik_field_search_data_users_pada_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickInsSearch();
	}

//	search name with button search
	@When("TSDU002001 Admin mengisi field dengan nama yang ingin dicari")
	public void tsdu002001_admin_mengisi_field_dengan_nama_yang_ingin_dicari() {
		String name = "buhi";
	    dataUsers.insertSearch(name);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field dengan nama yang ingin dicari");
	}

	@When("TSDU002001 Admin klik tombol search")
	public void tsdu002001_admin_klik_tombol_search() {
	    dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("TSDU002001 Tampil nama yang dicari")
	public void tsdu002001_tampil_nama_yang_dicari() {
	    assertTrue(dataUsers.getTxtNameUser().contains("buhi"));
	    extentTest.log(LogStatus.PASS, "Tampil nama yang dicari");
	}
	

	@When("TSDU002002N Admin mengisi field dengan name yang ingin dicari")
	public void tsdu002002n_admin_mengisi_field_dengan_name_yang_ingin_dicari() {
		String name = "yuhu";
	    dataUsers.insertSearch(name);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field dengan nama yang ingin dicari");
	}

	@When("TSDU002002N Admin klik tombol berwarna hijau")
	public void tsdu002002n_admin_klik_tombol_berwarna_hijau() {
	    dataUsers.clickGreen();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol berwarna hijau");
	}

	@Then("TSDU002002N Tampil nama yang dicari")
	public void tsdu002002n_tampil_nama_yang_dicari() {
		assertTrue(dataUsers.getTxtNameUser().contains("yuhu"));
	    extentTest.log(LogStatus.PASS, "Tampil nama yang dicari");
	}
	
//	search name with enter
	@When("TSDU002003 Admin mengisi field dengan name yang ingin dicari")
	public void tsdu002003_admin_mengisi_field_dengan_name_yang_ingin_dicari() {
		String name = "kuma";
	    dataUsers.insertSearch(name);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field dengan nama yang ingin dicari");
	}

	@When("TSDU002003 Admin menekan enter pada keyboard")
	public void tsdu002003_admin_menekan_enter_pada_keyboard() {
	    dataUsers.clickEnter();
	    extentTest.log(LogStatus.PASS, "Admin menekan enter pada keyboard");
	}

	@Then("TSDU002003 Tampil nama yang dicari")
	public void tsdu002003_tampil_nama_yang_dicari() {
		assertTrue(dataUsers.getTxtNameUser().contains("kuma"));
	    extentTest.log(LogStatus.PASS, "Tampil nama yang dicari");
	}
	
//	search email with search button
	@When("TSDU002004 Admin mengisi field dengan email yang ingin dicari")
	public void tsdu002004_admin_mengisi_field_dengan_email_yang_ingin_dicari() {
		String email = "buhi@gmail.com";
	    dataUsers.insertSearch(email);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field dengan email yang ingin dicari");
	}

	@When("TSDU002004 Admin klik tombol search")
	public void tsdu002004_admin_klik_tombol_search() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("TSDU002004 Tampil email yang dicari")
	public void tsdu002004_tampil_nama_yang_dicari() {
		assertTrue(dataUsers.getTxtEmailUser().contains("buhi@gmail.com"));
	    extentTest.log(LogStatus.PASS, "Tampil email yang dicari");
	}
	
//	search email with green icon
	@When("TSDU002005N Admin mengisi field dengan email yang ingin dicari")
	public void tsdu002005n_admin_mengisi_field_dengan_email_yang_ingin_dicari() {
		String email = "yuh@gmail.com";
	    dataUsers.insertSearch(email);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field dengan email yang ingin dicari");
	}

	@When("TSDU002005N Admin klik tombol berwarna hijau")
	public void tsdu002005n_admin_klik_tombol_berwarna_hijau() {
		dataUsers.clickGreen();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol berwarna hijau");
	}

	@Then("TSDU002005N Tampil email yang dicari")
	public void tsdu002005n_tampil_email_yang_dicari() {
		assertTrue(dataUsers.getTxtEmailUser().contains("yuh@gmail.com"));
	    extentTest.log(LogStatus.PASS, "Tampil email yang dicari");
	}
	
//	search email with enter
	@When("TSDU002006 Admin mengisi field dengan email yang ingin dicari")
	public void tsdu002006_admin_mengisi_field_dengan_email_yang_ingin_dicari() {
		String email = "kuma@gmail.com";
	    dataUsers.insertSearch(email);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field dengan email yang ingin dicari");
	}

	@When("TSDU002006 Admin menekan enter pada keyboard")
	public void tsdu002006_admin_menekan_enter_pada_keyboard() {
		dataUsers.clickEnter();
	    extentTest.log(LogStatus.PASS, "Admin menekan enter pada keyboard");
	}

	@Then("TSDU002006 Tampil email yang dicari")
	public void tsdu002006_tampil_email_yang_dicari() {
		assertTrue(dataUsers.getTxtEmailUser().contains("kuma@gmail.com"));
	    extentTest.log(LogStatus.PASS, "Tampil email yang dicari");
	}
	
//	search status with search button
	@When("TSDU002007 Admin mengisi field dengan status yang ingin dicari")
	public void tsdu002007_admin_mengisi_field_dengan_status_yang_ingin_dicari() {
		String email = "non";
	    dataUsers.insertSearch(email);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field dengan status yang ingin dicari");
	}

	@When("TSDU002007 Admin klik tombol search")
	public void tsdu002007_admin_klik_tombol_search() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("TSDU002007 Tampil email yang dicari")
	public void tsdu002007_tampil_email_yang_dicari() {
	    assertTrue(dataUsers.getTxtStatusUser().contains("NON"));
	    extentTest.log(LogStatus.PASS, "Tampil email yang dicari");
	}
}
