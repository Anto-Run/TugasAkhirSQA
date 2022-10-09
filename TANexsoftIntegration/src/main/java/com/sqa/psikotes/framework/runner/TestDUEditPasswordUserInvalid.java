//Author: Bagas
//Created_date: 10/5/2022
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

public class TestDUEditPasswordUserInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUEditPasswordUserInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//TSDUN005001
	@Given("TSDUN005001 Admin sudah membuka pop up Edit password di halaman Data Users NON ACTIVE")
	public void tsdun005001_admin_sudah_membuka_pop_up_edit_password_di_halaman_data_users_non_active() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickNon();
		dataUsers.clickEditPw();
		extentTest.log(LogStatus.PASS, "Admin sudah membuka pop up Edit password di halaman Data Users NON ACTIVE");
	}

	@When("TSDUN005001 Admin klik SAVE")
	public void tsdun005001_admin_klik_save() {
		dataUsers.clickSavePw();
		extentTest.log(LogStatus.PASS, "Admin klik SAVE");
	}

	@Then("TSDUN005001 Muncul pop up password harus diisi")
	public void tsdun005001_muncul_pop_up_password_harus_diisi() {
	    assertEquals(dataUsers.getTxtNeedPw(), "Isi terlebih dahulu");
	    extentTest.log(LogStatus.PASS, "Muncul pop up password harus diisi");
	}
	
//	TSDUN005002
	@Given("TSDUN005002 Admin sudah membuka pop up Edit password di halaman Data Users NON ACTIVE")
	public void tsdun005002_admin_sudah_membuka_pop_up_edit_password_di_halaman_data_users_non_active() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickNon();
		dataUsers.clickEditPw();
		extentTest.log(LogStatus.PASS, "Admin sudah membuka pop up Edit password di halaman Data Users NON ACTIVE");
	}

	@When("TSDUN005002 Admin isi field Password baru dengan karakter kurang dari karakter9")
	public void tsdun005002_admin_isi_field_password_baru_dengan_karakter_kurang_dari_karakter9() {
		dataUsers.insertEditPw("12345");
		extentTest.log(LogStatus.PASS, "Admin isi field Password baru dengan karakter kurang dari karakter9");
	}

	@When("TSDUN005002 Admin klik SAVE")
	public void tsdun005002_admin_klik_save() {
		dataUsers.clickSavePw();
		extentTest.log(LogStatus.PASS, "Admin klik SAVE");
	}

	@Then("TSDUN005002 Muncul pop up password minimal9 karakter")
	public void tsdun005002_muncul_pop_up_password_minimal9_karakter() {
		assertEquals(dataUsers.getTxtMinimalPw(), "Password minimal harus 9 karakter");
	    extentTest.log(LogStatus.PASS, "Muncul pop up password minimal9 karakter");
	}
	
	//TSDUN005003
		@Given("TSDUN005003 Admin sudah membuka pop up Edit password di halaman Data Users ACTIVE")
		public void tsdun005003_admin_sudah_membuka_pop_up_edit_password_di_halaman_data_users_active() {
			driver.get(Constants.URL);
			dataUsers.clickOk();
			dataUsers.clickTask();
			dataUsers.clickDataUsers();
			dataUsers.clickDrop();
			dataUsers.clickNon();
			dataUsers.clickEditPw();
			extentTest.log(LogStatus.PASS, "Admin sudah membuka pop up Edit password di halaman Data Users ACTIVE");
		}

		@When("TSDUN005003 Admin klik SAVE")
		public void tsdun005003_admin_klik_save() {
			dataUsers.clickSavePw();
			extentTest.log(LogStatus.PASS, "Admin klik SAVE");
		}

		@Then("TSDUN005003 Muncul pop up password harus diisi")
		public void tsdun005003_muncul_pop_up_password_harus_diisi() {
		    assertEquals(dataUsers.getTxtNeedPw(), "Isi terlebih dahulu");
		    extentTest.log(LogStatus.PASS, "Muncul pop up password harus diisi");
		}
		
//		TSDUN005004
		@Given("TSDUN005004 Admin sudah membuka pop up Edit password di halaman Data Users ACTIVE")
		public void tsdun005004_admin_sudah_membuka_pop_up_edit_password_di_halaman_data_users_active() {
			driver.get(Constants.URL);
			dataUsers.clickOk();
			dataUsers.clickTask();
			dataUsers.clickDataUsers();
			dataUsers.clickDrop();
			dataUsers.clickNon();
			dataUsers.clickEditPw();
			extentTest.log(LogStatus.PASS, "Admin sudah membuka pop up Edit password di halaman Data Users ACTIVE");
		}

		@When("TSDUN005004 Admin isi field Password baru dengan karakter kurang dari karakter9")
		public void tsdun005004_admin_isi_field_password_baru_dengan_karakter_kurang_dari_karakter9() {
			dataUsers.insertEditPw("qwer");
			extentTest.log(LogStatus.PASS, "Admin isi field Password baru dengan karakter kurang dari karakter9");
		}

		@When("TSDUN005004 Admin klik SAVE")
		public void tsdun005004_admin_klik_save() {
			dataUsers.clickSavePw();
			extentTest.log(LogStatus.PASS, "Admin klik SAVE");
		}

		@Then("TSDUN005004 Muncul pop up password minimal9 karakter")
		public void tsdun005004_muncul_pop_up_password_minimal9_karakter() {
			assertEquals(dataUsers.getTxtMinimalPw(), "Password minimal harus 9 karakter");
		    extentTest.log(LogStatus.PASS, "Muncul pop up password minimal9 karakter");
		}
}
