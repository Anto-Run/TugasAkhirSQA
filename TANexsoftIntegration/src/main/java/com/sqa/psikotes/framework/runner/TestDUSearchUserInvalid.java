//Author: Bagas
//Created_date: 10/5/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.DataUsersPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDUSearchUserInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static String generatedString;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUSearchUserInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDUN001 Admin sudah membuka halaman Data Users")
	public void tsdun001_admin_sudah_membuka_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users");
	}

//	TSDUN001001
	@When("TSDUN001001 Admin memastikan search field kosong")
	public void tsdun001001_admin_memastikan_search_field_kosong() {
		dataUsers.clickNon();
	    dataUsers.clearSearch();
	    extentTest.log(LogStatus.PASS, "Admin memastikan search field kosong");
	}

	@When("TSDUN001001 Klik tombol Search")
	public void tsdun001001_klik_tombol_search() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("TSDUN001001 Menampilkan semua data")
	public void tsdun001001_menampilkan_semua_data() {
		boolean isAbove = true;
	    dataUsers.clickLast();
	    assertEquals(dataUsers.getFirstNumberData(), isAbove);
	    extentTest.log(LogStatus.PASS, "Menampilkan semua data");
	}
	
//	TSDUN001002
	@When("TSDUN001002 Admin search dengan value kombinasi pada status NON ACTIVE")
	public void tsdun001002_admin_search_dengan_value_kombinasi_pada_status_non_active() {
		 generatedString = RandomStringUtils.randomAlphabetic(10);
		 dataUsers.insertSearch(generatedString);
		    extentTest.log(LogStatus.PASS, "Admin search dengan value kombinasi pada status NON ACTIVE");
	}

	@When("TSDUN001002 Klik tombol Search")
	public void tsdun001002_klik_tombol_search() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Klik tombol Search");
	}

	@Then("TSDUN001002 Tidak menampilkan data")
	public void tsdun001002_tidak_menampilkan_data() {
	    assertTrue(dataUsers.getTxtEntries().contains("no entries"));
	    extentTest.log(LogStatus.PASS, "Tidak menampilkan data");
	}

//	TSDUN001003
	@When("TSDUN001003 Admin memastikan search field kosong")
	public void tsdun001003_admin_memastikan_search_field_kosong() {
		dataUsers.clickActive();
	    dataUsers.clearSearch();
	    extentTest.log(LogStatus.PASS, "Admin memastikan search field kosong");
	}

	@When("TSDUN001003 Klik tombol Search")
	public void tsdun001003_klik_tombol_search() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("TSDUN001003 Menampilkan semua data")
	public void tsdun001003_menampilkan_semua_data() {
		boolean isAbove = true;
	    dataUsers.clickLast();
	    assertEquals(dataUsers.getFirstNumberData(), isAbove);
	    extentTest.log(LogStatus.PASS, "Menampilkan semua data");
	}

//	
	@When("TSDUN001004 Admin search dengan value kombinasi pada status ACTIVE")
	public void tsdun001004_admin_search_dengan_value_kombinasi_pada_status_active() {
		generatedString = RandomStringUtils.randomAlphabetic(10);
		 dataUsers.insertSearch(generatedString);
		    extentTest.log(LogStatus.PASS, "Admin search dengan value kombinasi pada status ACTIVE");
	}

	@When("TSDUN001004 Klik tombol Search")
	public void tsdun001004_klik_tombol_search() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("TSDUN001004 Tidak menampilkan data")
	public void tsdun001004_tidak_menampilkan_data() {
		assertTrue(dataUsers.getTxtEntries().contains("no entries"));
	    extentTest.log(LogStatus.PASS, "Tidak menampilkan data");
	}
	
}
