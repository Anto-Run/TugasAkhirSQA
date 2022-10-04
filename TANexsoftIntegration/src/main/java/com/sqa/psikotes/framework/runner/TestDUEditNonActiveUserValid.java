//Author: Bagas
//Created_date: 10/2/2022
//Modified_date: 10/3/2022

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

public class TestDUEditNonActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUEditNonActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDU008 Admin harus sudah membuka halaman Data Users dengan status NON ACTIVE")
	public void tsdu008_admin_harus_sudah_membuka_halaman_data_users_dengan_status_non_active() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickNon();
	}

//	TSDU008001
	@When("TSDU008001 Admin klik icon edit")
	public void tsdu008001_admin_klik_icon_edit() {
	    dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@Then("TSDU008001 Muncul pop up edit user")
	public void tsdu008001_muncul_pop_up_edit_user() {
	    assertTrue(dataUsers.getTxtEditName().contains(dataUsers.getTxtEditName()));
	    extentTest.log(LogStatus.PASS, "Muncul pop up edit user");
	}
	
//	TSDU008002
	@When("TSDU008002 Admin klik icon edit")
	public void tsdu008002_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU008002 Admin ubah status User dari NON ACTIVE menjadi ACTIVE")
	public void tsdu008002_admin_ubah_status_user_dari_non_active_menjadi_active() {
	    dataUsers.clickDropEditStatus();
	    dataUsers.clickEditActive();
	    extentTest.log(LogStatus.PASS, "Admin ubah status User dari NON ACTIVE menjadi ACTIVE");
	}

	@When("TSDU008002 Admin klik tombol save")
	public void tsdu008002_admin_klik_tombol_save() {
	    dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU008002 Muncul pop up")
	public void tsdu008002_muncul_pop_up() {
	    assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSDU008002 Admin klik tombol OK")
	public void tsdu008002_admin_klik_tombol_ok() {
	    dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TSDU008003
	@When("TSDU008003 Admin klik icon edit")
	public void tsdu008003_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU008003 Admin ubah status User dari NON ACTIVE menjadi ACTIVE")
	public void tsdu008003_admin_ubah_status_user_dari_non_active_menjadi_active() {
		dataUsers.clickDropEditStatus();
	    dataUsers.clickEditActive();
	    extentTest.log(LogStatus.PASS, "Admin ubah status User dari NON ACTIVE menjadi ACTIVE");
	}

	@When("TSDU008003 Admin klik tombol save")
	public void tsdu008003_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@When("TSDU008003 Muncul pop up")
	public void tsdu008003_muncul_pop_up() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@When("TSDU008003 Admin klik tombol OK")
	public void tsdu008003_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}

	@When("TSDU008003 Admin memilih opsi ACTIVE")
	public void tsdu008003_admin_memilih_opsi_active() {
	    dataUsers.clickDrop();
	    dataUsers.clickActive();
	    extentTest.log(LogStatus.PASS, "Admin memilih opsi ACTIVE");
	}

	@When("TSDU008003 Admin klik search field")
	public void tsdu008003_admin_klik_search_field() {
	    dataUsers.clickInsSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik search field");
	}

	@When("TSDU008003 Admin mengisi dengan Name atau Email yang sudah diubah sebelumnya")
	public void tsdu008003_admin_mengisi_dengan_name_atau_email_yang_sudah_diubah_sebelumnya() {
	    dataUsers.insertSearch(dataUsers.getTxtNameUser());
	    extentTest.log(LogStatus.PASS, "Admin mengisi dengan Name atau Email yang sudah diubah sebelumnya");
	}

	@When("TSDU008003 Admin klik tombol search")
	public void tsdu008003_admin_klik_tombol_search() {
	    dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("TSDU008003 Data tampil")
	public void tsdu008003_data_tampil() {
	    assertTrue(dataUsers.getTxtNameUser().contains(dataUsers.getTxtNameUser()));
	    extentTest.log(LogStatus.PASS, "Data tampil");
	}
	
//	TSDU008004
	@When("TSDU008004 Admin klik icon edit")
	public void tsdu008004_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU008004 Admin klik field kategori")
	public void tsdu008004_admin_klik_field_kategori() {
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU008004 Admin centang STAFF")
	public void tsdu008004_admin_centang_staff() {
	    dataUsers.clickStaff();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin centang STAFF");
	}

	@When("TSDU008004 Admin klik tombol save")
	public void tsdu008004_admin_klik_tombol_save() {
	    dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU008004 Muncul pop up data berhasil diubah")
	public void tsdu008004_tampil_kategori_staff() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
		extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}
	
	@Then("TSDU008004 Admin klik tombol OK")
	public void tsdu008004_admin_klik_tombol_ok() {
	    dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TSDU008005
	@When("TSDU008005 Admin klik icon edit")
	public void tsdu008005_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU008005 Admin klik field kategori")
	public void tsdu008005_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU008005 Admin centang LEADER")
	public void tsdu008005_admin_centang_leader() {
	    dataUsers.clickLeader();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin centang LEADER");
	}

	@When("TSDU008005 Admin klik tombol save")
	public void tsdu008005_admin_klik_tombol_save() {
	    dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU008005 Muncul pop up data berhasil diubah")
	public void tsdu008005_muncul_pop_up_data_berhasil_diubah() {
	    assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU008005 Admin klik tombol OK")
	public void tsdu008005_admin_klik_tombol_ok() {
	    dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	

//	TSDU008006
	@When("TSDU008006 Admin klik icon edit")
	public void TSDU008006_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU008006 Admin klik field kategori")
	public void TSDU008006_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU008006 Admin hilangkan centang pada kategori STAFF")
	public void TSDU008006_admin_hilangkan_centang_pada_kategori_staff() {
		dataUsers.clickStaff();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin centang LEADER");
	}

	@When("TSDU008006 Admin klik tombol save")
	public void TSDU008006_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU008006 Muncul pop up data berhasil diubah")
	public void TSDU008006_muncul_pop_up_data_berhasil_diubah() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU008006 Admin klik tombol OK")
	public void TSDU008006_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TSDU008007
	@When("TSDU008007 Admin klik icon edit")
	public void tsdu008007_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU008007 Admin klik field kategori")
	public void tsdu008007_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU008007 Admin hilangkan centang pada kategori LEADER")
	public void tsdu008007_admin_hilangkan_centang_pada_kategori_leader() {
		dataUsers.clickLeader();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin centang LEADER");
	}

	@When("TSDU008007 Admin klik tombol save")
	public void tsdu008007_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU008007 Muncul pop up data berhasil diubah")
	public void tsdu008007_muncul_pop_up_data_berhasil_diubah() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU008007 Admin klik tombol OK")
	public void tsdu008007_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TSDU008008
	@When("TSDU008008 Admin klik icon edit")
	public void tsdu008008_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU008008 Admin klik field kategori")
	public void tsdu008008_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU008008 Admin centang STAFF dan LEADER")
	public void tsdu008008_admin_centang_staff_dan_leader() {
		dataUsers.clickStaff();
		dataUsers.clickLeader();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin centang LEADER");
	}

	@When("TSDU008008 Admin klik tombol save")
	public void tsdu008008_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU008008 Muncul pop up data berhasil diubah")
	public void tsdu008008_muncul_pop_up_data_berhasil_diubah() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU008008 Admin klik tombol OK")
	public void tsdu008008_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
	
//	TSDU008009
	@When("TSDU008009 Admin klik icon edit")
	public void tsdu008009_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU008009 Admin klik field kategori")
	public void tsdu008009_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU008009 Admin hilangkan centang pada kategori STAFF dan LEADER")
	public void tsdu008009_admin_hilangkan_centang_pada_kategori_staff_dan_leader() {
		dataUsers.clickStaff();
		dataUsers.clickLeader();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin centang LEADER");
	}

	@When("TSDU008009 Admin klik tombol save")
	public void tsdu008009_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU008009 Muncul pop up data berhasil diubah")
	public void tsdu008009_muncul_pop_up_data_berhasil_diubah() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU008009 Admin klik tombol OK")
	public void tsdu008009_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
}
