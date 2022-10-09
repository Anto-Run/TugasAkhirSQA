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

public class TestRPSearchReportInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ReportPage reportPage = new ReportPage ();
	
	public TestRPSearchReportInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSRPN001001
	@Given("TSRPN001001 Admin sudah membuka halaman Report")
	public void tsrpn001001_admin_sudah_membuka_halaman_report() {
		driver.get(Constants.URL);
		reportPage.clickOk();
		reportPage.clickMenuReport();
		reportPage.clickReport();
		extentTest.log(LogStatus.PASS, "Admin sudah membuka halaman report");
	}

	@When("TSRPN001001 Admin set date awal lebih besar")
	public void tsrpn001001_admin_set_date_awal_lebih_besar() {
		reportPage.clickDateFirst();
	    for(int i=0; i<3; i++) {
	    	reportPage.clickDateNext();
	    }
	    reportPage.clickTglFirst();
	    extentTest.log(LogStatus.PASS, "Admin set date awal lebih besar");
	}

	@When("TSRPN001001 Admin set date akhir lebih kecil")
	public void tsrpn001001_admin_set_date_akhir_lebih_kecil() {
		reportPage.clickDateLast();
	    for(int i=0; i<3; i++) {
	    	reportPage.clickDatePrev();
	    }
	    reportPage.clickTglFirst();
	    extentTest.log(LogStatus.PASS, "Admin set akhir lebih kecil");
	}

	@When("TSRPN001001 Admin klik View")
	public void tsrpn001001_admin_klik_view() {
		reportPage.clickView();
	    extentTest.log(LogStatus.PASS, "Admin klik View");
	}

	@Then("TSRPN001001 Tidak ada data yang tampil")
	public void tsrpn001001_tidak_ada_data_yang_tampil() {
		assertTrue(reportPage.getTxtEntries().contains("no entries"));
	    extentTest.log(LogStatus.PASS, "List report tampil");
	}
}
