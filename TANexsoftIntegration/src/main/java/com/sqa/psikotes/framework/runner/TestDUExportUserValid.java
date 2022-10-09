//Author: Bagas
//Created_date: 10/4/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.DataUsersPage;
import com.sqa.psikotes.framework.utils.Utils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDUExportUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUExportUserValid() throws IOException {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
		Utils.deleteFile("C:\\Users\\"+ Constants.PC_USER_NAME +"\\Downloads\\exportdatausers.xls");
		Utils.deleteFile("C:\\Users\\"+ Constants.PC_USER_NAME +"\\Downloads\\exportdatausers (1).xls");
	}
	
	@Given("TSDU012 Admin harus sudah membuka halaman Data Users")
	public void tsdu012_admin_harus_sudah_membuka_halaman_data_users() throws IOException {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users");
	}

//	TSDU012001
	@When("TSDU012001 Admin klik tombol export")
	public void tsdu012001_admin_klik_tombol_export() {
		dataUsers.clickNon();
	    dataUsers.clickExport();
	    dataUsers.clickExport();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol export");
	}

	@Then("TSDU012001 Membandingkan file size")
	public void tsdu012001_membandingkan_file_size() {
		String pathSatu = "C:\\Users\\" + Constants.PC_USER_NAME + "\\Downloads\\exportdatausers.xls";
		String pathDua = "C:\\Users\\" + Constants.PC_USER_NAME + "\\Downloads\\exportdatausers (1).xls";
		assertTrue(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
		extentTest.log(LogStatus.PASS, "Membandingkan file size");
	}
	
//	TSDU012002
	@When("TSDU012002 Admin klik search field")
	public void tsdu012002_admin_klik_search_field() {
		dataUsers.clickNon();
	    dataUsers.clickInsSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik search field");
	}

	@When("^TSDU012002 Admin input (.*) yang ingin dicari$")
	public void tsdu012002_admin_input_data_yang_ingin_dicari(String dataOne) {
	    dataUsers.insertSearch(dataOne);
	    extentTest.log(LogStatus.PASS, "Admin input data yang ingin dicari");
	}

	@When("TSDU012002 Admin klik tombol search")
	public void tsdu012002_admin_klik_tombol_search() {
	    dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}
	
	@When("TSDU012002 Admin klik tombol export")
	public void tsdu012002_admin_klik_tombol_export() {
		dataUsers.clickExport();
	    dataUsers.clickExport();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol export");
	}

	@Then("TSDU012002 Membandingkan file size")
	public void tsdu012002_membandingkan_file_size() {
		String pathSatu = "C:\\Users\\" + Constants.PC_USER_NAME + "\\Downloads\\exportdatausers.xls";
		String pathDua = "C:\\Users\\" + Constants.PC_USER_NAME + "\\Downloads\\exportdatausers (1).xls";
		assertTrue(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
		extentTest.log(LogStatus.PASS, "Membandingkan file size");
	}
	
//	TSDU012003
	@When("TSDU012003 Admin klik tombol export")
	public void tsdu012003_admin_klik_tombol_export() {
		dataUsers.clickActive();
		dataUsers.clickExport();
	    dataUsers.clickExport();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol export");
	}

	@Then("TSDU012003 Membandingkan file size")
	public void tsdu012003_membandingkan_file_size() {
		String pathSatu = "C:\\Users\\" + Constants.PC_USER_NAME + "\\Downloads\\exportdatausers.xls";
		String pathDua = "C:\\Users\\" + Constants.PC_USER_NAME + "\\Downloads\\exportdatausers (1).xls";
		assertTrue(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
		extentTest.log(LogStatus.PASS, "Membandingkan file size");
	}
	
//	TSDU012004
	@When("TSDU012004 Admin klik search field")
	public void tsdu012004_admin_klik_search_field() {
		dataUsers.clickActive();
	    dataUsers.clickInsSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik search field");
	}
	
	@When("^TSDU012004 Admin input (.*) yang ingin dicari$")
	public void tsdu012004_admin_input_datatwo_yang_ingin_dicari(String dataTwo) {
		dataUsers.insertSearch(dataTwo);
	    extentTest.log(LogStatus.PASS, "Admin input data yang ingin dicari");
	}

	@When("TSDU012004 Admin klik tombol search")
	public void tsdu012004_admin_klik_tombol_search() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@When("TSDU012004 Admin klik tombol export")
	public void tsdu012004_admin_klik_tombol_export() {
		dataUsers.clickExport();
	    dataUsers.clickExport();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol export");
	}

	@Then("TSDU012004 Membandingkan file size")
	public void tsdu012004_membandingkan_file_size() {
		String pathSatu = "C:\\Users\\" + Constants.PC_USER_NAME + "\\Downloads\\exportdatausers.xls";
		String pathDua = "C:\\Users\\" + Constants.PC_USER_NAME + "\\Downloads\\exportdatausers (1).xls";
		assertTrue(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
		extentTest.log(LogStatus.PASS, "Membandingkan file size");
	}
}
