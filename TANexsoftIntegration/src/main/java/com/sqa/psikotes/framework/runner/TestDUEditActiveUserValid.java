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

public class TestDUEditActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUEditActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDU009 Admin harus sudah membuka halaman Data Users dengan status ACTIVE")
	public void tsdu009_admin_harus_sudah_membuka_halaman_data_users_dengan_status_active() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickActive();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users dengan status ACTIVE");
	}

//	TSDU009001	
	@When("TSDU009001 Admin klik icon edit")
	public void tsdu009001_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU009001 Admin ubah status User dari ACTIVE menjadi NON ACTIVE")
	public void tsdu009001_admin_ubah_status_user_dari_active_menjadi_non_active() {
		dataUsers.clickDropEditStatus();
	    dataUsers.clickEditNon();
	    extentTest.log(LogStatus.PASS, "Admin ubah status User dari ACTIVE menjadi NON ACTIVE");
	}

	@When("TSDU009001 Admin klik tombol save")
	public void tsdu009001_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU009001 Muncul pop up")
	public void tsdu009001_muncul_pop_up() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSDU009001 Admin klik tombol OK")
	public void tsdu009001_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TSDU009002
	@When("TSDU009002 Admin klik icon edit")
	public void tsdu009002_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU009002 Admin ubah status Admin dari ACTIVE menjadi NON ACTIVE")
	public void tsdu009002_admin_ubah_status_admin_dari_active_menjadi_non_active() {
		dataUsers.clickDropEditStatus();
	    dataUsers.clickEditNon();
	    extentTest.log(LogStatus.PASS, "Admin ubah status User dari ACTIVE menjadi NON ACTIVE");
	}

	@When("TSDU009002 Admin klik tombol save")
	public void tsdu009002_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@When("TSDU009002 Muncul pop up")
	public void tsdu009002_muncul_pop_up() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@When("TSDU009002 Admin klik tombol OK")
	public void tsdu009002_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}

	@When("TSDU009002 Admin memilih opsi NON ACTIVE")
	public void tsdu009002_admin_memilih_opsi_non_active() {
		dataUsers.clickDrop();
	    dataUsers.clickNon();
	    extentTest.log(LogStatus.PASS, "Admin memilih opsi NON ACTIVE");
	}

	@When("TSDU009002 Admin klik search field")
	public void tsdu009002_admin_klik_search_field() {
		dataUsers.clickInsSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik search field");
	}

	@When("TSDU009002 Admin mengisi dengan Name atau Email yang sudah diubah sebelumnya")
	public void tsdu009002_admin_mengisi_dengan_name_atau_email_yang_sudah_diubah_sebelumnya() {
		dataUsers.insertSearch(dataUsers.getTxtNameUser());
	    extentTest.log(LogStatus.PASS, "Admin mengisi dengan Name atau Email yang sudah diubah sebelumnya");
	}

	@When("TSDU009002 Admin klik tombol search")
	public void tsdu009002_admin_klik_tombol_search() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("TSDU009002 Data tampil")
	public void tsdu009002_data_tampil() {
		assertTrue(dataUsers.getTxtNameUser().contains(dataUsers.getTxtNameUser()));
	    extentTest.log(LogStatus.PASS, "Data tampil");
	}
	
//	TSDU009003
	@When("TSDU009003 Admin klik icon edit")
	public void tsdu009003_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU009003 Admin klik field kategori")
	public void tsdu009003_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU009003 Admin centang STAFF")
	public void tsdu009003_admin_centang_staff() {
		dataUsers.clickStaff();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin centang STAFF");
	}

	@When("TSDU009003 Admin klik tombol save")
	public void tsdu009003_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU009003 Muncul pop up data berhasil diubah")
	public void tsdu009003_muncul_pop_up_data_berhasil_diubah() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
		extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU009003 Admin klik tombol OK")
	public void tsdu009003_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TSDU009004
	@When("TSDU009004 Admin klik icon edit")
	public void tsdu009004_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU009004 Admin klik field kategori")
	public void tsdu009004_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU009004 Admin centang LEADER")
	public void tsdu009004_admin_centang_leader() {
		dataUsers.clickLeader();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin centang LEADER");
	}

	@When("TSDU009004 Admin klik tombol save")
	public void tsdu009004_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU009004 Muncul pop up data berhasil diubah")
	public void tsdu009004_muncul_pop_up_data_berhasil_diubah() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
		extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU009004 Admin klik tombol OK")
	public void tsdu009004_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TSDU009005
	@When("TSDU009005 Admin klik icon edit")
	public void tsdu009005_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU009005 Admin klik field kategori")
	public void tsdu009005_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU009005 Admin hilangkan centang pada kategori STAFF")
	public void tsdu009005_admin_hilangkan_centang_pada_kategori_staff() {
		dataUsers.clickStaff();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin hilangkan centang pada kategori STAFF");
	}

	@When("TSDU009005 Admin klik tombol save")
	public void tsdu009005_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU009005 Muncul pop up data berhasil diubah")
	public void tsdu009005_muncul_pop_up_data_berhasil_diubah() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
		extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU009005 Admin klik tombol OK")
	public void tsdu009005_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TSDU009006
	@When("TSDU009006 Admin klik icon edit")
	public void tsdu009006_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU009006 Admin klik field kategori")
	public void tsdu009006_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU009006 Admin hilangkan centang pada kategori LEADER")
	public void tsdu009006_admin_hilangkan_centang_pada_kategori_leader() {
		dataUsers.clickLeader();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin hilangkan centang pada kategori LEADER");
	}

	@When("TSDU009006 Admin klik tombol save")
	public void tsdu009006_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU009006 Muncul pop up data berhasil diubah")
	public void tsdu009006_muncul_pop_up_data_berhasil_diubah() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
		extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU009006 Admin klik tombol OK")
	public void tsdu009006_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TSDU009007
	@When("TSDU009007 Admin klik icon edit")
	public void tsdu009007_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU009007 Admin klik field kategori")
	public void tsdu009007_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU009007 Admin centang STAFF dan LEADER")
	public void tsdu009007_admin_centang_staff_dan_leader() {
		dataUsers.clickStaff();
		dataUsers.clickLeader();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin centang STAFF dan LEADER");
	}

	@When("TSDU009007 Admin klik tombol save")
	public void tsdu009007_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU009007 Muncul pop up data berhasil diubah")
	public void tsdu009007_muncul_pop_up_data_berhasil_diubah() {
	    assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
		extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU009007 Admin klik tombol OK")
	public void tsdu009007_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
	
//	TDSU009008
	@When("TSDU009008 Admin klik icon edit")
	public void tsdu009008_admin_klik_icon_edit() {
		dataUsers.clickEdit();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@When("TSDU009008 Admin klik field kategori")
	public void tsdu009008_admin_klik_field_kategori() {
		dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin klik field kategori");
	}

	@When("TSDU009008 Admin hilangkan centang pada kategori STAFF dan LEADER")
	public void tsdu009008_admin_hilangkan_centang_pada_kategori_staff_dan_leader() {
		dataUsers.clickStaff();
		dataUsers.clickLeader();
	    dataUsers.clickKategori();
	    extentTest.log(LogStatus.PASS, "Admin hilangkan centang pada kategori STAFF dan LEADER");
	}

	@When("TSDU009008 Admin klik tombol save")
	public void tsdu009008_admin_klik_tombol_save() {
		dataUsers.clickSave();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol save");
	}

	@Then("TSDU009008 Muncul pop up data berhasil diubah")
	public void tsdu009008_muncul_pop_up_data_berhasil_diubah() {
		assertTrue(dataUsers.getTxtDisimpan().contains("Berhasil Di Update"));
		extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil diubah");
	}

	@Then("TSDU009008 Admin klik tombol OK")
	public void tsdu009008_admin_klik_tombol_ok() {
		dataUsers.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol OK");
	}
}
