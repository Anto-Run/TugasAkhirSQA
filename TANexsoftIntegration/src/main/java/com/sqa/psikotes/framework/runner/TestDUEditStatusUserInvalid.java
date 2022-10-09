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

public class TestDUEditStatusUserInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static String userEmail;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUEditStatusUserInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSDUN003001
	@Given("TSDUN003001 Admin sudah membuka halaman Data Users")
	public void tsdun003001_admin_sudah_membuka_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users");
	}

	@Given("TSDUN003001 Admin klik icon Edit User NON ACTIVE")
	public void tsdun003001_admin_klik_icon_edit_user_non_active() {
		dataUsers.clickDrop();
		dataUsers.clickNon();
		dataUsers.clickPageFour();
		dataUsers.clickEdit();
		userEmail = dataUsers.getTxtEmailUser();
		extentTest.log(LogStatus.PASS, "Admin klik icon Edit User NON ACTIVE");
	}

	@When("TSDUN003001 Admin pilih status User dari NON ACTIVE menjadi pilih")
	public void tsdun003001_admin_pilih_status_admin_dari_non_active_menjadi_pilih() {
	    dataUsers.clickDropEditStatus();
	    dataUsers.clickEditPilih();
	    extentTest.log(LogStatus.PASS, "Admin pilih status User dari NON ACTIVE menjadi (pilih)");
	}

	@When("TSDUN003001 Admin klik SAVE")
	public void tsdun003001_admin_klik_save() {
	    dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik SAVE");
	}

	@When("TSDUN003001 Admin klik OK")
	public void tsdun003001_admin_klik_ok() {
	    dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}

	@Then("TSDUN003001 Admin search data yang diubah di status NON ACTIVE")
	public void tsdun003001_admin_search_data_yang_diubah_di_status_non_active() {
		dataUsers.clickDrop();
	    dataUsers.clickNon();
	    dataUsers.clearSearch();
	    dataUsers.insertSearch(userEmail);
	    dataUsers.clickSearch();
	    assertTrue(dataUsers.getTxtEntries().contains("no entries"));
	    extentTest.log(LogStatus.PASS, "Admin search data yang diubah di status NON ACTIVE");
	}

	@Then("TSDUN003001 Admin search data yang diubah di status ACTIVE")
	public void tsdun003001_admin_search_data_yang_diubah_di_status_active() {
		dataUsers.clickDrop();
	    dataUsers.clickActive();
	    dataUsers.clearSearch();
	    dataUsers.insertSearch(userEmail);
	    dataUsers.clickSearch();
	    assertTrue(dataUsers.getTxtEntries().contains("no entries"));
	    extentTest.log(LogStatus.PASS, "Admin search data yang diubah di status ACTIVE");
	}

//	TSDUN003002
	@Given("TSDUN003002 Admin sudah membuka halaman Data Users")
	public void tsdun003002_admin_sudah_membuka_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users");
	}

	@Given("TSDUN003002 Admin klik icon Edit User ACTIVE")
	public void tsdun003002_admin_klik_icon_edit_user_active() {
		dataUsers.clickDrop();
		dataUsers.clickActive();
		dataUsers.clickPageFour();
		dataUsers.clickEdit();
		userEmail = dataUsers.getTxtEmailUser();
		extentTest.log(LogStatus.PASS, "Admin klik icon Edit User ACTIVE");
	}

	@When("TSDUN003002 Admin pilih status User dari ACTIVE menjadi pilih")
	public void tsdun003002_admin_pilih_status_user_dari_active_menjadi_pilih() {
		dataUsers.clickDropEditStatus();
	    dataUsers.clickEditPilih();
	    extentTest.log(LogStatus.PASS, "Admin pilih status User dari NON ACTIVE menjadi (pilih)");
	}

	@When("TSDUN003002 Admin klik SAVE")
	public void tsdun003002_admin_klik_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik SAVE");
	}

	@When("TSDUN003002 Admin klik OK")
	public void tsdun003002_admin_klik_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}

	@Then("TSDUN003002 Admin search data yang diubah di status ACTIVE")
	public void tsdun003002_admin_search_data_yang_diubah_di_status_active() {
		dataUsers.clickDrop();
	    dataUsers.clickActive();
	    dataUsers.clearSearch();
	    dataUsers.insertSearch(userEmail);
	    dataUsers.clickSearch();
	    assertTrue(dataUsers.getTxtEntries().contains("no entries"));
	    extentTest.log(LogStatus.PASS, "Admin search data yang diubah di status ACTIVE");
	}

	@Then("TSDUN003002 Admin search data yang diubah di status NON ACTIVE")
	public void tsdun003002_admin_search_data_yang_diubah_di_status_non_active() {
		dataUsers.clickDrop();
	    dataUsers.clickNon();
	    dataUsers.clearSearch();
	    dataUsers.insertSearch(userEmail);
	    dataUsers.clickSearch();
	    assertTrue(dataUsers.getTxtEntries().contains("no entries"));
	    extentTest.log(LogStatus.PASS, "Admin search data yang diubah di status NON ACTIVE");
	}
}
