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

public class TestDUShowActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUShowActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDU005 Admin harus membuka halaman data users")
	public void tsdu005_admin_harus_membuka_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
		extentTest.log(LogStatus.PASS, "Admin harus sudah membuka halaman Data Users");
	}

	@When("TSDU005001 Admin klik tombol untuk dropdown yang ada di sebelah kanan search field")
	public void tsdu005001_admin_klik_tombol_untuk_dropdown_yang_ada_di_sebelah_kanan_search_field() {
		dataUsers.clickDrop();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol untuk dropdown yang ada di sebelah kanan search field");
	}

	@When("TSDU005001 Admin memilih ACTIVE")
	public void tsdu005001_admin_memilih_active() {
	    dataUsers.clickActive();
	    extentTest.log(LogStatus.PASS, "Admin memilih ACTIVE");
	}

	@Then("TSDU005001 Tampil status ACTIVE")
	public void tsdu005001_tampil_status_active() {
		assertTrue(dataUsers.getTxtStatusUser().contains("ACTIVE"));
	    extentTest.log(LogStatus.PASS, "Tampil status ACTIVE");
	}
}
