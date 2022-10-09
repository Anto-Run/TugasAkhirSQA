//Author: Bagas
//Created_date: 10/5/2022
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

public class TestDUTombolXInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUTombolXInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSDUN004001
	@Given("TSDUN004001 Admin sudah membuka pop up View user di halaman Data Users")
	public void tsdun004001_admin_sudah_membuka_pop_up_view_user_di_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickView();
		extentTest.log(LogStatus.PASS, "Admin haru sudah View membuka halaman Data Users");
	}

	@When("TSDUN004001 Admin klik tombol X")
	public void tsdun004001_admin_klik_tombol_x() {
	    dataUsers.clickSilang();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol X");
	}

	@Then("TSDUN004001 Kembali ke halaman data users")
	public void tsdun004001_kembali_ke_halaman_data_users() {
	    assertTrue(dataUsers.getTxtDataUsers().contains("DATA"));
	    extentTest.log(LogStatus.PASS, "Kembali ke halaman data users");
	}
	
//	TSDUN004002
	@Given("TSDUN004002 Admin sudah membuka pop up Edit user user di halaman Data Users")
	public void tsdun004002_admin_sudah_membuka_pop_up_edit_user_user_di_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickEdit();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka Edit user halaman Data Users");
	}

	@When("TSDUN004002 Admin klik tombol X")
	public void tsdun004002_admin_klik_tombol_x() {
	    dataUsers.clickSilang();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol X");
	}

	@Then("TSDUN004002 Kembali ke halaman data users")
	public void tsdun004002_kembali_ke_halaman_data_users() {
		assertTrue(dataUsers.getTxtDataUsers().contains("DATA"));
	    extentTest.log(LogStatus.PASS, "Kembali ke halaman data users");
	}

//	TSDUN004003
	@Given("TSDUN004003 Admin sudah membuka pop up Edit password user di halaman Data Users")
	public void tsdun004003_admin_sudah_membuka_pop_up_edit_password_user_di_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickEditPw();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka Edit password halaman Data Users");
	}

	@When("TSDUN004003 Admin klik tombol X")
	public void tsdun004003_admin_klik_tombol_x() {
		dataUsers.clickSilang();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol X");
	}

	@Then("TSDUN004003 Kembali ke halaman data users")
	public void tsdun004003_kembali_ke_halaman_data_users() {
		assertTrue(dataUsers.getTxtDataUsers().contains("DATA"));
	    extentTest.log(LogStatus.PASS, "Kembali ke halaman data users");
	}
}
