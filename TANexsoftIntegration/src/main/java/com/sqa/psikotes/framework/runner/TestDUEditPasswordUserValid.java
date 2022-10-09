//Author: Bagas
//Created_date: 10/3/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.DataUsersPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDUEditPasswordUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUEditPasswordUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSDU010001
	@Given("TSDU010001 Admin harus sudah membuka halaman Data Users")
	public void tsdu010001_admin_harus_sudah_membuka_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users");
	}

	@When("TSDU010001 Admin klik icon edit password")
	public void tsdu010001_admin_klik_icon_edit_password() {
	    dataUsers.clickEditPw();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit password");
	}

	@Then("TSDU010001 Muncul pop up form untuk edit password")
	public void tsdu010001_muncul_pop_up_form_untuk_edit_password() {
	    assertTrue(dataUsers.getTxtEditPw().contains("Password Baru"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up form untuk edit password");
	}
	
//	TSDU010002
	@Given("TSDU010002 Admin harus sudah membuka halaman Data Users NON ACTIVE")
	public void tsdu010002_admin_harus_sudah_membuka_halaman_data_users_non_active() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickNon();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users NON ACTIVE");
	}

	@When("TSDU010002 Admin mengisi field password baru")
	public void tsdu010002_admin_mengisi_field_password_baru() {
		dataUsers.clickEditPw();
		String Pw = "123456789";
	    dataUsers.insertEditPw(Pw);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field password baru");
	}

	@When("TSDU010002 Admin klik tombol save")
	public void tsdu010002_admin_klik_tombol_save() {
	    dataUsers.clickSavePw();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU010002 Muncul pop up data berhasil di update")
	public void tsdu010002_muncul_pop_up_data_berhasil_di_update() {
	    assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil di update");
	}

	@Then("TSDU010002 Admin klik tombol OK")
	public void tsdu010002_admin_klik_tombol_ok() {
	    dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TSDU010003
	@Given("TSDU010003 Admin harus sudah membuka halaman Data Users ACTIVE")
	public void tsdu010003_admin_harus_sudah_membuka_halaman_data_users_active() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickActive();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users ACTIVE");
	}

	@When("TSDU010003 Admin mengisi field password baru")
	public void tsdu010003_admin_mengisi_field_password_baru() {
		dataUsers.clickEditPw();
		String Pw = "123456789";
	    dataUsers.insertEditPw(Pw);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field password baru");
	}

	@When("TSDU010003 Admin klik tombol save")
	public void tsdu010003_admin_klik_tombol_save() {
		dataUsers.clickSavePw();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU010003 Muncul pop up data berhasil di update")
	public void tsdu010003_muncul_pop_up_data_berhasil_di_update() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil di update");
	}

	@Then("TSDU010003 Admin klik tombol OK")
	public void tsdu010003_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
}
