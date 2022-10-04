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

public class TestDUShowPage100NonActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUShowPage100NonActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSDU011026
	@Given("TSDU011026 Admin harus membuka halaman data user")
	public void tsdu011026_admin_harus_membuka_halaman_data_user() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
	}

	@When("TSDU011026 Admin klik p100")
	public void tsdu011026_admin_klik_p100() {
		dataUsers.clickOneHundred();
	    extentTest.log(LogStatus.PASS, "Admin klik p100");
	}

	@Then("TSDU011026 Halaman menampilkan maksimal p100 data")
	public void tsdu011026_halaman_menampilkan_maksimal_p100_data() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Halaman menampilkan maksimal p100 data");
	}

//	TSDU011027
	@Given("TSDU011027 Admin harus sudah membuka halaman Data Users NON ACTIVE dengan show page p100")
	public void tsdu011027_admin_harus_sudah_membuka_halaman_data_users_non_active_dengan_show_page_p100() {
		dataUsers.clickOneHundred();
	}

	@When("TSDU011027 Admin klik angka h1 di atas tabel sebelah kanan")
	public void tsdu011027_admin_klik_angka_h1_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h1 di atas tabel sebelah kanan");
	}

	@Then("TSDU011027 Berpindah ke halaman h1")
	public void tsdu011027_berpindah_ke_halaman_h1() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h1");
	}
}
