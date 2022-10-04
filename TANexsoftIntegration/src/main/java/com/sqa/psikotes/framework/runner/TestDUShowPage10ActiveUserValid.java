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

public class TestDUShowPage10ActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUShowPage10ActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSDU011028
	@Given("TSDU011028 Admin harus sudah membuka halaman Data Users ACTIVE")
	public void tsdu011028_admin_harus_sudah_membuka_halaman_data_users_active() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickActive();
	}

	@When("TSDU011028 Admin klik p10")
	public void tsdu011028_admin_klik_p10() {
		dataUsers.clickTen();
	    extentTest.log(LogStatus.PASS, "Admin klik p10");
	}

	@Then("TSDU011028 Halaman menampilkan maksimal p10 data")
	public void tsdu011028_halaman_menampilkan_maksimal_p10_data() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataLast(), isExist);
	    extentTest.log(LogStatus.PASS, "Halaman menampilkan maksimal p10 data");
	}

//	TSDU011029
	@Given("TSDU011029 Admin harus sudah membuka halaman Data Users ACTIVE dengan show page p10")
	public void tsdu011029_admin_harus_sudah_membuka_halaman_data_users_active_dengan_show_page_p10() {
		dataUsers.clickTen();
	}

	@When("TSDU011029 Admin klik angka h1 di atas tabel sebelah kanan")
	public void tsdu011029_admin_klik_angka_h1_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h1 di atas tabel sebelah kanan");
	}

	@Then("TSDU011029 Berpindah ke halaman h1")
	public void tsdu011029_berpindah_ke_halaman_h1() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h1");
	}

//	TSDU011030
	@When("TSDU011030 Admin klik angka h2 di atas tabel sebelah kanan")
	public void tsdu011030_admin_klik_angka_h2_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageTwo();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h2 di atas tabel sebelah kanan");
	}

	@Then("TSDU011030 Berpindah ke halaman h2")
	public void tsdu011030_berpindah_ke_halaman_h2() {
	    boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h2");
	}

//	TSDU011031
	@When("TSDU011031 Admin klik angka h3 di atas tabel sebelah kanan")
	public void tsdu011031_admin_klik_angka_h3_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageThree();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h3 di atas tabel sebelah kanan");
	}

	@Then("TSDU011031 Berpindah ke halaman h3")
	public void tsdu011031_berpindah_ke_halaman_h3() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h3");
	}

//	TSDU011032
	@When("TSDU011032 Admin klik angka h4 di atas tabel sebelah kanan")
	public void tsdu011032_admin_klik_angka_h4_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageFour();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h4 di atas tabel sebelah kanan");
	}

	@Then("TSDU011032 Berpindah ke halaman h4")
	public void tsdu011032_berpindah_ke_halaman_h4() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h4");
	}

//	TSDU011033
	@When("TSDU011033 Admin klik angka h5 di atas tabel sebelah kanan")
	public void tsdu011033_admin_klik_angka_h5_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageFive();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h5 di atas tabel sebelah kanan");
	}

	@Then("TSDU011033 Berpindah ke halaman h5")
	public void tsdu011033_berpindah_ke_halaman_h5() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h5");
	}

//	TSDU011034
	@When("TSDU011034 Admin klik angka h6 di atas tabel sebelah kanan")
	public void tsdu011034_admin_klik_angka_h6_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageSix();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h6 di atas tabel sebelah kanan");
	}

	@Then("TSDU011034 Berpindah ke halaman h6")
	public void tsdu011034_berpindah_ke_halaman_h6() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h6");
	}

//	TSDU011035
	@When("TSDU011035 Admin klik angka h7 di atas tabel sebelah kanan")
	public void tsdu011035_admin_klik_angka_h7_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageSeven();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h7 di atas tabel sebelah kanan");
	}

	@Then("TSDU011035 Berpindah ke halaman h7")
	public void tsdu011035_berpindah_ke_halaman_h7() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h7");
	}

//	TSDU011036
	@When("TSDU011036 Admin klik angka h8 di atas tabel sebelah kanan")
	public void tsdu011036_admin_klik_angka_h8_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageEight();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h8 di atas tabel sebelah kanan");
	}

	@Then("TSDU011036 Berpindah ke halaman h8")
	public void tsdu011036_berpindah_ke_halaman_h8() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h8");
	}

//	TSDU011037
	@When("TSDU011037 Admin klik angka h9 di atas tabel sebelah kanan")
	public void tsdu011037_admin_klik_angka_h9_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageNine();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h9 di atas tabel sebelah kanan");
	}

	@Then("TSDU011037 Berpindah ke halaman h9")
	public void tsdu011037_berpindah_ke_halaman_h9() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h9");
	}

//	TSDU011038
	@When("TSDU011038 Admin klik angka h10 di atas tabel sebelah kanan")
	public void tsdu011038_admin_klik_angka_h10_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageTen();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h10 di atas tabel sebelah kanan");
	}

	@Then("TSDU011038 Berpindah ke halaman h10")
	public void tsdu011038_berpindah_ke_halaman_h10() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h10");
	}

//	TSDU011039
	@When("TSDU011039 Admin klik icon <<")
	public void tsdu011039_admin_klik_icon() {
		dataUsers.clickPrev();
	    extentTest.log(LogStatus.PASS, "Admin klik icon <<");
	}

	@Then("TSDU011039 Berpindah ke halaman awal")
	public void tsdu011039_berpindah_ke_halaman_awal() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman awal");
	}

//	TSDU011040
	@When("TSDU011040 Admin klik icon >>")
	public void tsdu011040_admin_klik_icon() {
		dataUsers.clickLast();
	    extentTest.log(LogStatus.PASS, "Admin klik icon >>");
	}

	@Then("TSDU011040 Berpindah ke halaman akhir")
	public void tsdu011040_berpindah_ke_halaman_akhir() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman akhir");
	}
}
