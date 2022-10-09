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

public class TestRAOpenRAValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private RemoveActivityPage removeAct = new RemoveActivityPage ();
	
	public TestRAOpenRAValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSRA001001
	@Given("TSRA001 Admin sudah masuk ke halaman utama")
	public void tsra001_admin_sudah_masuk_ke_halaman_utama() {
	    driver.get(Constants.URL);
	    removeAct.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke halaman utama");
	}

	@When("TSRA001001 Admin klik menu Report")
	public void tsra001001_admin_klik_menu_report() {
		removeAct.clickMenuReport();
		extentTest.log(LogStatus.PASS, "Admin klik menu Report");
	}

	@When("TSRA001001 Admin klik submenu Remove Activity")
	public void tsra001001_admin_klik_submenu_remove_activity() {
		removeAct.clickRemoveActivity();
		extentTest.log(LogStatus.PASS, "Admin klik submenu Remove Activity");
	}

	@Then("TSRA001001 Tampil halaman Remove Activity")
	public void tsra001001_tampil_halaman_remove_activity() {
	    assertTrue(removeAct.getTxtRemoveAct().contains("REPORT PSIKOTEST"));
	    extentTest.log(LogStatus.PASS, "Tampil halaman Remove Activity");
	}
}
