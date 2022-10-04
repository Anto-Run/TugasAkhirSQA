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

public class TestDUSearchNonActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUSearchNonActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDU004 Admin harus sudah membuka halaman Data Users NON ACTIVE")
	public void tsdu004_admin_harus_sudah_membuka_halaman_data_users_non_active() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		dataUsers.clickDrop();
		dataUsers.clickNon();
		 extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users NON ACTIVE");
	}

//	search with button
	@When("TSDU004001 Admin klik search field")
	public void tsdu004001_admin_klik_search_field() {
	    dataUsers.clickInsSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik search field");
	}

	@When("^TSDU004001 Admin mengisi (.*) yang ingin dicari$")
	public void tsdu004001_admin_mengisi_dataone_yang_ingin_dicari(String dataone) {
	    dataUsers.insertSearch(dataone);
	    extentTest.log(LogStatus.PASS, "Admin mengisi data yang ingin dicari");
	}

	@When("TSDU004001 Admin klik tombol search")
	public void tsdu004001_admin_klik_tombol_search() {
	    dataUsers.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol search");
	}

	@Then("^TSDU004001 Tampil hasil filter NON ACTIVE User berdasarkan name dan email (.*)$")
	public void tsdu004001_tampil_hasil_filter_non_active_user_berdasarkan_name_dan_email(String dataOne) {
	    i++;
	    if(i==1) {
	    	assertTrue(dataUsers.getTxtNameUser().contains(dataOne));
	    } else {
	    	assertTrue(dataUsers.getTxtEmailUser().contains(dataOne));
	    }
	    extentTest.log(LogStatus.PASS, "Tampil hasil filter NON ACTIVE User berdasarkan name dan email");
	}
	
//	search with green icon
	@When("TSDU004002 Admin klik search field")
	public void tsdu004002_admin_klik_search_field() {
		dataUsers.clickInsSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik search field");
	}

	@When("^TSDU004002 Admin mengisi (.*) yang ingin dicari$")
	public void tsdu004002_admin_mengisi_datatwo_yang_ingin_dicari(String dataTwo) {
		dataUsers.insertSearch(dataTwo);
	    extentTest.log(LogStatus.PASS, "Admin mengisi data yang ingin dicari");
	}

	@When("TSDU004002 Admin klik tombol berwarna hijau")
	public void tsdu004002_admin_klik_tombol_berwarna_hijau() {
	    dataUsers.clickGreen();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol berwarna hijau");
	}

	@Then("^TSDU004002 Tampil hasil filter NON ACTIVE User berdasarkan name dan email (.*)$")
	public void tsdu004002_tampil_hasil_filter_non_active_user_berdasarkan_name_dan_email_datatwo(String dataTwo) {
		i++;
	    if(i==3) {
	    	assertTrue(dataUsers.getTxtNameUser().contains(dataTwo));
	    } else {
	    	assertTrue(dataUsers.getTxtEmailUser().contains(dataTwo));
	    }
	    extentTest.log(LogStatus.PASS, "Tampil hasil filter NON ACTIVE User berdasarkan name dan email");
	}
	
//	search with enter
	@When("TSDU004003 Admin klik search field")
	public void tsdu004003_admin_klik_search_field() {
		dataUsers.clickInsSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik search field");
	}

	@When("^TSDU004003 Admin mengisi (.*) yang ingin dicari$")
	public void tsdu004003_admin_mengisi_datathree_yang_ingin_dicari(String dataThree) {
		dataUsers.insertSearch(dataThree);
	    extentTest.log(LogStatus.PASS, "Admin mengisi data yang ingin dicari");
	}

	@When("TSDU004003 Admin menekan enter pada keyboard")
	public void tsdu004003_admin_menekan_enter_pada_keyboard() {
	    dataUsers.clickEnter();
	    extentTest.log(LogStatus.PASS, "Admin menekan enter pada keyboard");
	}

	@Then("^TSDU004003 Tampil hasil filter NON ACTIVE User berdasarkan name dan email (.*)$")
	public void tsdu004003_tampil_hasil_filter_non_active_user_berdasarkan_name_dan_email_datathree(String dataThree) {
		i++;
	    if(i==3) {
	    	assertTrue(dataUsers.getTxtNameUser().contains(dataThree));
	    } else {
	    	assertTrue(dataUsers.getTxtEmailUser().contains(dataThree));
	    }
	    extentTest.log(LogStatus.PASS, "Tampil hasil filter NON ACTIVE User berdasarkan name dan email");
	}
}
