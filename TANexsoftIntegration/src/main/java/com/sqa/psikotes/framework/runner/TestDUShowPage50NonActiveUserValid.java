//Author: Bagas
//Created_date: 9/29/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.DataUsersPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDUShowPage50NonActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUShowPage50NonActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSDU011021
	@Given("TSDU011021 Admin harus membuka halaman data user")
	public void tsdu011021_admin_harus_membuka_halaman_data_user() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		extentTest.log(LogStatus.PASS, "Admin harus membuka halaman data user");
	}

	@When("TSDU011021 Admin klik p50")
	public void tsdu011021_admin_klik_p50() {
		dataUsers.clickFifty();
	    extentTest.log(LogStatus.PASS, "Admin klik p50");
	}

	@Then("TSDU011021 Halaman menampilkan maksimal p50 data")
	public void tsdu011021_halaman_menampilkan_maksimal_p50_data() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Halaman menampilkan maksimal p50 data");
	}

//	TSDU011022
	@Given("TSDU011022 Admin harus sudah membuka halaman Data Users NON ACTIVE dengan show page p50")
	public void tsdu011022_admin_harus_sudah_membuka_halaman_data_users_non_active_dengan_show_page_p50() {
		dataUsers.clickFifty();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users NON ACTIVE dengan show page p50");
	}

	@When("TSDU011022 Admin klik angka h1 di atas tabel sebelah kanan")
	public void tsdu011022_admin_klik_angka_h1_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h1 di atas tabel sebelah kanan");
	}

	@Then("TSDU011022 Berpindah ke halaman h1")
	public void tsdu011022_berpindah_ke_halaman_h1() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h1");
	}

//	TSDU011023
	@When("TSDU011023 Admin klik angka h2 di atas tabel sebelah kanan")
	public void tsdu011023_admin_klik_angka_h2_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageTwo();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h2 di atas tabel sebelah kanan");
	}

	@Then("TSDU011023 Berpindah ke halaman h2")
	public void tsdu011023_berpindah_ke_halaman_h2() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h2");
	}

//	TSDU011024
	@When("TSDU011024 Admin klik icon <<")
	public void tsdu011024_admin_klik_icon() {
		dataUsers.clickPrev();
	    extentTest.log(LogStatus.PASS, "Admin klik icon <<");
	}

	@Then("TSDU011024 Berpindah ke halaman awal")
	public void tsdu011024_berpindah_ke_halaman_awal() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman awal");
	}

//	TSDU011025
	@When("TSDU011025 Admin klik icon >>")
	public void tsdu011025_admin_klik_icon() {
		dataUsers.clickLast();
	    extentTest.log(LogStatus.PASS, "Admin klik icon >>");
	}

	@Then("TSDU011025 Berpindah ke halaman akhir")
	public void tsdu011025_berpindah_ke_halaman_akhir() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman akhir");
	}
}
