//Author: Bagas
//Created_date: 9/29/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.ReportPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRPOpenReportValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ReportPage reportPage = new ReportPage ();
	
	public TestRPOpenReportValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSRP001 Admin sudah masuk ke halaman utama")
	public void tsrp001_admin_sudah_masuk_ke_halaman_utama() {
		driver.get(Constants.URL);
		reportPage.clickOk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke halaman utama");
	}

	@When("TSRP001001 Admin klik menu Report")
	public void tsrp001001_admin_klik_menu_report() {
	    reportPage.clickMenuReport();
	    extentTest.log(LogStatus.PASS, "Admin klik menu Report");
	}

	@When("TSRP001001 Admin klik submenu Report")
	public void tsrp001001_admin_klik_submenu_report() {
		reportPage.clickReport();
	    extentTest.log(LogStatus.PASS, "Admin klik submenu Report");
	}

	@Then("TSRP001001 Tampil halaman Report")
	public void tsrp001001_tampil_halaman_report() {
	    assertTrue(reportPage.getTxtReport().contains("REPORT PSIKOTEST"));
	    extentTest.log(LogStatus.PASS, "Tampil halaman Report");
	}
}
