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

public class TestDUShowPage25ActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUShowPage25ActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSDU011041
	@Given("TSDU011041 Admin harus membuka halaman data user")
	public void tsdu011041_admin_harus_membuka_halaman_data_user() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickActive();
	}

	@When("TSDU011041 Admin klik p25")
	public void tsdu011041_admin_klik_p25() {
		dataUsers.clickTwentyFive();
	    extentTest.log(LogStatus.PASS, "Admin klik p25");
	}

	@Then("TSDU011041 Halaman menampilkan maksimal p25 data")
	public void tsdu011041_halaman_menampilkan_maksimal_p25_data() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Halaman menampilkan maksimal p25 data");
	}

//	TSDU011042
	@Given("TSDU011042 Admin harus sudah membuka halaman Data Users ACTIVE dengan show page p25")
	public void tsdu011042_admin_harus_sudah_membuka_halaman_data_users_active_dengan_show_page_p25() {
		dataUsers.clickTwentyFive();
	}

	@When("TSDU011042 Admin klik angka h1 di atas tabel sebelah kanan")
	public void tsdu011042_admin_klik_angka_h1_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h1 di atas tabel sebelah kanan");
	}

	@Then("TSDU011042 Berpindah ke halaman h1")
	public void tsdu011042_berpindah_ke_halaman_h1() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h1");
	}

//	TSDU011043
	@When("TSDU011043 Admin klik angka h2 di atas tabel sebelah kanan")
	public void tsdu011043_admin_klik_angka_h2_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageTwo();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h2 di atas tabel sebelah kanan");
	}

	@Then("TSDU011043 Berpindah ke halaman h2")
	public void tsdu011043_berpindah_ke_halaman_h2() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h2");
	}

//	TSDU011044
	@When("TSDU011044 Admin klik angka h3 di atas tabel sebelah kanan")
	public void tsdu011044_admin_klik_angka_h3_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageThree();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h3 di atas tabel sebelah kanan");
	}

	@Then("TSDU011044 Berpindah ke halaman h3")
	public void tsdu011044_berpindah_ke_halaman_h3() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h3");
	}

//	TSDU011045
	@When("TSDU011045 Admin klik angka h4 di atas tabel sebelah kanan")
	public void tsdu011045_admin_klik_angka_h4_di_atas_tabel_sebelah_kanan() {
		dataUsers.clickPageFour();
	    extentTest.log(LogStatus.PASS, "Admin klik angka h4 di atas tabel sebelah kanan");
	}

	@Then("TSDU011045 Berpindah ke halaman h4")
	public void tsdu011045_berpindah_ke_halaman_h4() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman h4");
	}

//	TSDU011046
	@When("TSDU011046 Admin klik icon <<")
	public void tsdu011046_admin_klik_icon() {
		dataUsers.clickPrev();
	    extentTest.log(LogStatus.PASS, "Admin klik icon <<");
	}

	@Then("TSDU011046 Berpindah ke halaman awal")
	public void tsdu011046_berpindah_ke_halaman_awal() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman awal");
	}

//	TSDU011047
	@When("TSDU011047 Admin klik icon >>")
	public void tsdu011047_admin_klik_icon() {
		dataUsers.clickLast();
	    extentTest.log(LogStatus.PASS, "Admin klik icon >>");
	}

	@Then("TSDU011047 Berpindah ke halaman akhir")
	public void tsdu011047_berpindah_ke_halaman_akhir() {
		boolean isExist = true;
	    assertEquals(dataUsers.getTxtDataFirst(), isExist);
	    extentTest.log(LogStatus.PASS, "Berpindah ke halaman akhir");
	}
}
