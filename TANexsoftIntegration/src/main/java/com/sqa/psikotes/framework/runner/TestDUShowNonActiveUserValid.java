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

public class TestDUShowNonActiveUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUShowNonActiveUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDU003 Admin harus membuka halaman  data users")
	public void tsdu003_admin_harus_membuka_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
	}

	@When("TSDU003001 Admin klik tombol untuk dropdown yang ada di sebelah kanan search field")
	public void tsdu003001_admin_klik_tombol_untuk_dropdown_yang_ada_di_sebelah_kanan_search_field() {
	    dataUsers.clickDrop();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol untuk dropdown yang ada di sebelah kanan search field");
	}

	@When("TSDU003001 Admin memilih NON ACTIVE")
	public void tsdu003001_admin_memilih_non_active() {
	    dataUsers.clickNon();
	    extentTest.log(LogStatus.PASS, "Admin memilih NON ACTIVE");
	}

	@Then("TSDU003001 Tampil status NON ACTIVE")
	public void tsdu003001_tampil_status_non_active() {
	    assertTrue(dataUsers.getTxtStatusUser().contains("NON ACTIVE"));
	    extentTest.log(LogStatus.PASS, "Tampil status NON ACTIVE");
	}
}
