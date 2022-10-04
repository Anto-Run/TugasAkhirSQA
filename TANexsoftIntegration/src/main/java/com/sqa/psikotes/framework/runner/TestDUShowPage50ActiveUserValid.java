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

public class TestDUShowPage50ActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUShowPage50ActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSDU011048
	@Given("TSDU011048 Admin harus membuka halaman data user")
	public void tsdu011048_admin_harus_membuka_halaman_data_user() {
	    driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickActive();
	}

	@When("TSDU011048 Admin klik p50")
	public void tsdu011048_admin_klik_p50() {
		dataUsers.clickFifty();
	    extentTest.log(LogStatus.PASS, "Admin klik p50");
	}

	@Then("TSDU011048 Halaman menampilkan maksimal p50 data")
	public void tsdu011048_halaman_menampilkan_maksimal_p50_data() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Halaman menampilkan maksimal p50 data");
	}

//	TSDU011049
	@Given("TSDU011049 Admin harus sudah membuka halaman Data Users ACTIVE dengan show page p50")
	public void tsdu011049_admin_harus_sudah_membuka_halaman_data_users_active_dengan_show_page_p50() {
	    dataUsers.clickFifty();
	}

	@When("TSDU011049 Admin klik angka h1 di atas tabel sebelah kanan")
	public void tsdu011049_admin_klik_angka_h1_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h1 di atas tabel sebelah kanan");
	}

	@Then("TSDU011049 Berpindah ke halaman h1")
	public void tsdu011049_berpindah_ke_halaman_h1() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h1");
	}

//	TSDU011050
	@When("TSDU011050 Admin klik angka h2 di atas tabel sebelah kanan")
	public void tsdu011050_admin_klik_angka_h2_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageTwo();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h2 di atas tabel sebelah kanan");
	}

	@Then("TSDU011050 Berpindah ke halaman h2")
	public void tsdu011050_berpindah_ke_halaman_h2() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h2");
	}

//	TSDU011051
	@When("TSDU011051 Admin klik icon <<")
	public void tsdu011051_admin_klik_icon() {
		dataUsers.clickPrev();
	    extentTest.log(LogStatus.PASS, "Admin klik icon <<");
	}

	@Then("TSDU011051 Berpindah ke halaman awal")
	public void tsdu011051_berpindah_ke_halaman_awal() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman awal");
	}

//	TSDU011052
	@When("TSDU011052 Admin klik icon >>")
	public void tsdu011052_admin_klik_icon() {
		dataUsers.clickLast();
	    extentTest.log(LogStatus.PASS, "Admin klik icon >>");
	}

	@Then("TSDU011052 Berpindah ke halaman akhir")
	public void tsdu011052_berpindah_ke_halaman_akhir() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman akhir");
	}
}
