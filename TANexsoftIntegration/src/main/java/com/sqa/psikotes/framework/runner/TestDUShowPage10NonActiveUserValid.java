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

public class TestDUShowPage10NonActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUShowPage10NonActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSDU011001
	@Given("TSDU011001 Admin harus membuka halaman data user")
	public void tsdu011001_admin_harus_membuka_halaman_data_user() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
	}

	@When("TSDU011001 Admin klik p10")
	public void tsdu011001_admin_klik_p10() {
	    dataUsers.clickTen();
	    extentTest.log(LogStatus.PASS, "Admin klik p10");
	}

	@Then("TSDU011001 Halaman menampilkan maksimal p10 data")
	public void tsdu011001_halaman_menampilkan_maksimal_p10_data() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataLast(), isExist);
	    extentTest.log(LogStatus.PASS, "Halaman menampilkan maksimal p10 data");
	}
	
//	TSDU011002
	@Given("TSDU011002 Admin harus sudah membuka halaman Data Users NON ACTIVE dengan show page p10")
	public void tsdu011002_admin_harus_sudah_membuka_halaman_data_users_non_active_dengan_show_page_p10_di_halaman_h1() {
		dataUsers.clickTen();
	}

	@When("TSDU011002 Admin klik angka h1 di atas tabel sebelah kanan")
	public void tsdu011002_admin_klik_angka_h1_di_atas_tabel_sebelah_kanan() {
	    dataUsers.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h1 di atas tabel sebelah kanan");
	}

	@Then("TSDU011002 Berpindah ke halaman h1")
	public void tsdu011002_berpindah_ke_halaman_h1() {
	    boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h1");
	}
	
//	TSDU011003
	@When("TSDU011003 Admin klik angka h2 di atas tabel sebelah kanan")
	public void tsdu011003_admin_klik_angka_h2_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageTwo();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h2 di atas tabel sebelah kanan");
	}

	@Then("TSDU011003 Berpindah ke halaman h2")
	public void tsdu011003_berpindah_ke_halaman_h2() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h2");
	}
	
//	TSDU011004
	@When("TSDU011004 Admin klik angka h3 di atas tabel sebelah kanan")
	public void tsdu011004_admin_klik_angka_h3_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageThree();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h3 di atas tabel sebelah kanan");
	}

	@Then("TSDU011004 Berpindah ke halaman h3")
	public void tsdu011004_berpindah_ke_halaman_h3() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h3");
	}

//	TSDU011005
	@When("TSDU011005 Admin klik angka h4 di atas tabel sebelah kanan")
	public void tsdu011005_admin_klik_angka_h4_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageFour();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h4 di atas tabel sebelah kanan");
	}

	@Then("TSDU011005 Berpindah ke halaman h4")
	public void tsdu011005_berpindah_ke_halaman_h4() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h4");
	}

//	TSDU011006
	@When("TSDU011006 Admin klik angka h5 di atas tabel sebelah kanan")
	public void tsdu011006_admin_klik_angka_h5_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageFive();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h5 di atas tabel sebelah kanan");
	}

	@Then("TSDU011006 Berpindah ke halaman h5")
	public void tsdu011006_berpindah_ke_halaman_h5() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h5");
	}

//	TSDU011007
	@When("TSDU011007 Admin klik angka h6 di atas tabel sebelah kanan")
	public void tsdu011007_admin_klik_angka_h6_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageSix();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h6 di atas tabel sebelah kanan");
	}

	@Then("TSDU011007 Berpindah ke halaman h6")
	public void tsdu011007_berpindah_ke_halaman_h6() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h6");
	}

//	TSDU001008
	@When("TSDU011008 Admin klik angka h7 di atas tabel sebelah kanan")
	public void tsdu011008_admin_klik_angka_h7_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageSeven();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h7 di atas tabel sebelah kanan");
	}

	@Then("TSDU011008 Berpindah ke halaman h7")
	public void tsdu011008_berpindah_ke_halaman_h7() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h7");
	}

//	TSDU011011
	@When("TSDU011009 Admin klik angka h8 di atas tabel sebelah kanan")
	public void tsdu011009_admin_klik_angka_h8_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageEight();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h8 di atas tabel sebelah kanan");
	}

	@Then("TSDU011009 Berpindah ke halaman h8")
	public void tsdu011009_berpindah_ke_halaman_h8() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h8");
	}

//	TSDU011010
	@When("TSDU011010 Admin klik angka h9 di atas tabel sebelah kanan")
	public void tsdu011010_admin_klik_angka_h9_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageNine();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h9 di atas tabel sebelah kanan");
	}

	@Then("TSDU011010 Berpindah ke halaman h9")
	public void tsdu011010_berpindah_ke_halaman_h9() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h9");
	}

//	TSDU011011
	@When("TSDU011011 Admin klik angka h10 di atas tabel sebelah kanan")
	public void tsdu011011_admin_klik_angka_h10_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageTen();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h10 di atas tabel sebelah kanan");
	}

	@Then("TSDU011011 Berpindah ke halaman h10")
	public void tsdu011011_berpindah_ke_halaman_h10() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h10");
	}
	
//	TSDU011012
	@When("TSDU011012 Admin klik icon <<")
	public void tsdu011012_admin_klik_icon() {
	    dataUsers.clickPrev();
	    extentTest.log(LogStatus.PASS, "Admin klik icon <<");
	}

	@Then("TSDU011012 Berpindah ke halaman awal")
	public void tsdu011012_berpindah_ke_halaman_awal() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman awal");
	}

//	TSDU011013
	@When("TSDU011013 Admin klik icon >>")
	public void tsdu011013_admin_klik_icon() {
		dataUsers.clickLast();
	    extentTest.log(LogStatus.PASS, "Admin klik icon >>");
	}

	@Then("TSDU011013 Berpindah ke halaman akhir")
	public void tsdu011013_berpindah_ke_halaman_akhir() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman akhir");
	}
}
