//Author: Bagas
//Created_date: 10/5/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.DataUsersPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDUButtonDownStatusUserInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static String generatedString;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUButtonDownStatusUserInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDUN002 Admin sudah membuka halaman Data Users")
	public void tsdun002_admin_sudah_membuka_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users");
	}

//	TSDUN002001
	@When("TSDUN002001 Admin klik icon panah di sebelah kanan Status Admin NON ACTIVE")
	public void tsdun002001_admin_klik_icon_panah_di_sebelah_kanan_status_admin() {
		dataUsers.clickNon();
		dataUsers.clickFinder();
		extentTest.log(LogStatus.PASS, "Admin klik icon panah di sebelah kanan Status Admin");
	}

	@Then("TSDUN002001 Tampil semua data NON ACTIVE yang ada")
	public void tsdun002001_tampil_semua_data_non_active_yang_ada() {
		boolean isAbove = true;
	    dataUsers.clickLast();
	    assertEquals(dataUsers.getFirstNumberData(), isAbove);
	    extentTest.log(LogStatus.PASS, "Menampilkan semua data");
	}
	
//	TSDUN002002
	@When("TSDUN002002 Admin mengisi search field sesuai data yang ada")
	public void tsdun002002_admin_mengisi_search_field_sesuai_data_yang_ada() {
	    dataUsers.clickNon();
	    dataUsers.insertSearch("buhi");
	    extentTest.log(LogStatus.PASS, "Admin mengisi search field sesuai data yang ada");
	}

	@When("TSDUN002002 Admin klik icon panah di sebelah kanan Status Admin NON ACTIVE")
	public void tsdun002002_admin_klik_icon_panah_di_sebelah_kanan_status_admin_non_active() {
	    dataUsers.clickFinder();
	    extentTest.log(LogStatus.PASS, "Admin klik icon panah di sebelah kanan Status Admin NON ACTIVE");
	}

	@Then("TSDUN002002 Menampilkan data NON ACTIVE yang dicari")
	public void tsdun002002_menampilkan_data_non_active_yang_dicari() {
	    assertTrue(dataUsers.getTxtNameUser().contains("buhi"));
	    extentTest.log(LogStatus.PASS, "Menampilkan data NON ACTIVE yang dicari");
	}

//	TSDUN002003
	@When("TSDUN002003 Admin klik icon panah di sebelah kanan Status Admin ACTIVE")
	public void tsdun002003_admin_klik_icon_panah_di_sebelah_kanan_status_admin_active() {
		dataUsers.clickActive();
		dataUsers.clickFinder();
		extentTest.log(LogStatus.PASS, "Admin klik icon panah di sebelah kanan Status Admin ACTIVE");
	}

	@Then("TSDUN002003 Tampil semua data ACTIVE yang ada")
	public void tsdun002003_tampil_semua_data_active_yang_ada() {
		boolean isAbove = true;
	    dataUsers.clickLast();
	    assertEquals(dataUsers.getFirstNumberData(), isAbove);
	    extentTest.log(LogStatus.PASS, "Menampilkan semua data");
	}

//	TSDUN002004
	@When("TSDUN002004 Admin mengisi search field sesuai data yang ada")
	public void tsdun002004_admin_mengisi_search_field_sesuai_data_yang_ada() {
		dataUsers.clickActive();
	    dataUsers.insertSearch("kenshin");
	    extentTest.log(LogStatus.PASS, "Admin mengisi search field sesuai data yang ada");
	}

	@When("TSDUN002004 Admin klik icon panah di sebelah kanan Status Admin ACTIVE")
	public void tsdun002004_admin_klik_icon_panah_di_sebelah_kanan_status_admin_active() {
		dataUsers.clickFinder();
	    extentTest.log(LogStatus.PASS, "Admin klik icon panah di sebelah kanan Status Admin ACTIVE");
	}

	@Then("TSDUN002004 Menampilkan data ACTIVE yang dicari")
	public void tsdun002004_menampilkan_data_non_active_yang_dicari() {
		assertTrue(dataUsers.getTxtNameUser().contains("kenshin"));
	    extentTest.log(LogStatus.PASS, "Menampilkan data ACTIVE yang dicari");
	}
}
