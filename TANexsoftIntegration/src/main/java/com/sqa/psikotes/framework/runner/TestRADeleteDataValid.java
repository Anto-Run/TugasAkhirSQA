//Author: Bagas
//Created_date: 10/4/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.RemoveActivityPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRADeleteDataValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private RemoveActivityPage removeAct = new RemoveActivityPage ();
	
	public TestRADeleteDataValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSRA003 Admin sudah masuk ke halaman Remove Activity")
	public void tsra003_admin_sudah_masuk_ke_halaman_remove_activity() {
		driver.get(Constants.URL);
	    removeAct.clickOk();
	    removeAct.clickMenuReport();
	    removeAct.clickRemoveActivity();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke halaman Remove Activity");
	}

//	TSDU003001
	@When("TSRA003001 Admin klik icon delete")
	public void tsra003001_admin_klik_icon_delete() {
	    removeAct.clickDelete();
	    extentTest.log(LogStatus.PASS, "Admin klik icon delete");
	}

	@Then("TSRA003001 Muncul pop up delete")
	public void tsra003001_muncul_pop_up_delete() {
	    assertTrue(removeAct.getTxtDihapus().contains("Yakin ingin menghapus ini ?"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up delete");
	}

	@Then("TSRA003001 Admin klik TIDAK")
	public void tsra003001_admin_klik_tidak() {
	    removeAct.clickTidak();
	    extentTest.log(LogStatus.PASS, "Admin klik TIDAK");
	}
	
//	TSRA003002
	@When("TSRA003002 Admin klik icon delete")
	public void tsra003002_admin_klik_icon_delete() {
		removeAct.clickDelete();
	    extentTest.log(LogStatus.PASS, "Admin klik icon delete");
	}

	@When("TSRA003002 Admin klik YA")
	public void tsra003002_admin_klik_ya() {
	    removeAct.clickYa();
	    extentTest.log(LogStatus.PASS, "Admin klik YA");
	}

	@Then("TSRA003002 Muncul pop up data berhasil dihapus")
	public void tsra003002_muncul_pop_up_data_berhasil_dihapus() {
	    assertTrue(removeAct.getTxtDihapus().contains("Data berhasil dihapus!"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil dihapus");
	}

	@Then("TSRA003002 Admin klik OK")
	public void tsra003002_admin_klik_ok() {
	    removeAct.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}
	
}
