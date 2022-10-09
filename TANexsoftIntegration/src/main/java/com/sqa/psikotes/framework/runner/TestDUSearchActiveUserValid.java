//Author: Bagas
//Created_date: 10/1/2022
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

public class TestDUSearchActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUSearchActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDU006 Admin harus sudah membuka halaman Data Users ACTIVE")
	public void tsdu006_admin_harus_membuka_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickActive();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data UsersACTIVE");
	}

//	search with button
	@When("TSDU006001 Admin klik search field")
	public void tsdu006001_admin_klik_search_field() {
		dataUsers.clickInsSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik search field");
	}

	@When("^TSDU006001 Admin mengisi (.*) yang ingin dicari$")
	public void tsdu006001_admin_mengisi_dataone_yang_ingin_dicari(String dataOne) {
		dataUsers.insertSearch(dataOne);
	    extentTest.log(LogStatus.PASS, "Admin mengisi data yang ingin dicari");
	}

	@When("TSDU006001 Admin klik tombol search")
	public void tsdu006001_admin_klik_tombol_search() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("^TSDU006001 Tampil hasil filter ACTIVE User berdasarkan (.*)$")
	public void tsdu006001_tampil_hasil_filter_active_user_berdasarkan_dataone(String dataOne) {
		i++;
	    if(i==1) {
	    	assertTrue(dataUsers.getTxtNameUser().contains(dataOne));
	    } else {
	    	assertTrue(dataUsers.getTxtEmailUser().contains(dataOne));
	    }
	    extentTest.log(LogStatus.PASS, "Tampil hasil filter ACTIVE User berdasarkan name dan email");
	}
	
//	search with green icon
	@When("TSDU006002 Admin klik search field")
	public void tsdu006002_admin_klik_search_field() {
	    dataUsers.clickInsSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik search field");
	}

	@When("^TSDU006002 Admin mengisi (.*) yang ingin dicari$")
	public void tsdu006002_admin_mengisi_datatwo_yang_ingin_dicari(String dataOne) {
		dataUsers.insertSearch(dataOne);
	    extentTest.log(LogStatus.PASS, "Admin mengisi data yang ingin dicari");
	}

	@When("TSDU006002 Admin klik tombol berwarna hijau")
	public void tsdu006002_admin_klik_tombol_berwarna_hijau() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol berwarna hijau");
	}

	@Then("^TSDU006002 Tampil hasil filter ACTIVE User berdasarkan (.*)$")
	public void tsdu006002_tampil_hasil_filter_active_user_berdasarkan_datatwo(String dataTwo) {
		i++;
	    if(i==1) {
	    	assertTrue(dataUsers.getTxtNameUser().contains(dataTwo));
	    } else {
	    	assertTrue(dataUsers.getTxtEmailUser().contains(dataTwo));
	    }
	    extentTest.log(LogStatus.PASS, "Tampil hasil filter ACTIVE User berdasarkan name dan email");
	}
	
//	search with enter
	@When("TSDU006003 Admin klik search field")
	public void tsdu006003_admin_klik_search_field() {
		dataUsers.clickInsSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik search field");
	}

	@When("^TSDU006003 Admin mengisi (.*) yang ingin dicari$")
	public void tsdu006003_admin_mengisi_datathree_yang_ingin_dicari(String dataThree) {
		dataUsers.insertSearch(dataThree);
	    extentTest.log(LogStatus.PASS, "Admin mengisi data yang ingin dicari");
	}

	@When("TSDU006003 Admin klik enter pada keyboard")
	public void tsdu006003_admin_klik_enter_pada_keyboard() {
		dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik enter pada keyboard");
	}

	@Then("^TSDU006003 Tampil hasil filter ACTIVE User berdasarkan (.*)$")
	public void tsdu006003_tampil_hasil_filter_active_user_berdasarkan_datathree(String dataThree) {
		i++;
	    if(i==1) {
	    	assertTrue(dataUsers.getTxtNameUser().contains(dataThree));
	    } else {
	    	assertTrue(dataUsers.getTxtEmailUser().contains(dataThree));
	    }
	    extentTest.log(LogStatus.PASS, "Tampil hasil filter ACTIVE User berdasarkan name dan email");
	}
}
