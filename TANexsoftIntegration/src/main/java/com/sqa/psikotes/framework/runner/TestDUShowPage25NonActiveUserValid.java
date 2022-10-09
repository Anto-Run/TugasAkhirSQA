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

public class TestDUShowPage25NonActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUShowPage25NonActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSDU011014
	@Given("TSDU011014 Admin harus membuka halaman data user")
	public void tsdu011014_admin_harus_membuka_halaman_data_user() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		extentTest.log(LogStatus.PASS, "Admin harus membuka halaman data user");
	}

	@When("TSDU011014 Admin klik p25")
	public void tsdu011014_admin_klik_p25() {
		dataUsers.clickTwentyFive();
	    extentTest.log(LogStatus.PASS, "Admin klik p25");
	}

	@Then("TSDU011014 Halaman menampilkan maksimal p25 data")
	public void tsdu011014_halaman_menampilkan_maksimal_p25_data() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Halaman menampilkan maksimal p25 data");
	}

//	TSDU011015
	@Given("TSDU011015 Admin harus sudah membuka halaman Data Users NON ACTIVE dengan show page p25")
	public void tsdu011015_admin_harus_sudah_membuka_halaman_data_users_non_active_dengan_show_page_p25() {
		dataUsers.clickTwentyFive();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users NON ACTIVE dengan show page p25");
	}

	@When("TSDU011015 Admin klik angka h1 di atas tabel sebelah kanan")
	public void tsdu011015_admin_klik_angka_h1_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h1 di atas tabel sebelah kanan");
	}

	@Then("TSDU011015 Berpindah ke halaman h1")
	public void tsdu011015_berpindah_ke_halaman_h1() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h1");
	}

//	TSDU011016
	@When("TSDU011016 Admin klik angka h2 di atas tabel sebelah kanan")
	public void tsdu011016_admin_klik_angka_h2_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageTwo();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h2 di atas tabel sebelah kanan");
	}

	@Then("TSDU011016 Berpindah ke halaman h2")
	public void tsdu011016_berpindah_ke_halaman_h2() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h2");
	}

//	TSDU011017
	@When("TSDU011017 Admin klik angka h3 di atas tabel sebelah kanan")
	public void tsdu011017_admin_klik_angka_h3_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageThree();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h3 di atas tabel sebelah kanan");
	}

	@Then("TSDU011017 Berpindah ke halaman h3")
	public void tsdu011017_berpindah_ke_halaman_h3() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h3");
	}

//	TSDU011018
	@When("TSDU011018 Admin klik angka h4 di atas tabel sebelah kanan")
	public void tsdu011018_admin_klik_angka_h4_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageFour();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h4 di atas tabel sebelah kanan");
	}

	@Then("TSDU011018 Berpindah ke halaman h4")
	public void tsdu011018_berpindah_ke_halaman_h4() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h4");
	}
	
//	TSDU011019
	@When("TSDU011019 Admin klik icon <<")
	public void tsdu011019_admin_klik_icon() {
		dataUsers.clickPrev();
	    extentTest.log(LogStatus.PASS, "Admin klik icon <<");
	}

	@Then("TSDU011019 Berpindah ke halaman awal")
	public void tsdu011019_berpindah_ke_halaman_awal() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman awal");
	}

//	TSDU011020
	@When("TSDU011020 Admin klik icon >>")
	public void tsdu011020_admin_klik_icon() {
		dataUsers.clickLast();
	    extentTest.log(LogStatus.PASS, "Admin klik icon >>");
	}

	@Then("TSDU011020 Berpindah ke halaman akhir")
	public void tsdu011020_berpindah_ke_halaman_akhir() {
	    boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman akhir");
	}
}
