//Author: Bagas
//Created_date: 9/29/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.ReportPage;
import com.sqa.psikotes.framework.utils.Utils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRPSearchReportValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ReportPage reportPage = new ReportPage ();
	
	public TestRPSearchReportValid() throws IOException {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
		Utils.deleteFile("C:\\Users\\"+ Constants.PC_USER_NAME +"\\Downloads\\exportreport.xls");
		Utils.deleteFile("C:\\Users\\"+ Constants.PC_USER_NAME +"\\Downloads\\exportreport (1).xls");
	}

	@Given("TSRP002 Admin sudah membuka halaman report")
	public void tsrp002_admin_sudah_membuka_halaman_report() {
		driver.get(Constants.URL);
		reportPage.clickOk();
		reportPage.clickMenuReport();
		reportPage.clickReport();
		extentTest.log(LogStatus.PASS, "Admin sudah membuka halaman report");
	}

//	TSRP002001
	@When("TSRP002001 Admin set tanggal awal")
	public void tsrp002001_admin_set_tanggal_awal() {
		reportPage.clickDateFirst();
	    for(int i=0; i<3; i++) {
	    	reportPage.clickDatePrev();
	    }
	    reportPage.clickTglFirst();
	    extentTest.log(LogStatus.PASS, "Admin set tanggal awal");
	}

	@When("TSRP002001 Admin set tanggal akhir")
	public void tsrp002001_admin_set_tanggal_akhir() {
	    reportPage.clickDateLast();
	    for(int i=0 ; i<1; i++) {
	    	reportPage.clickDateNext();
	    }
	    reportPage.clickTglLast();
	    extentTest.log(LogStatus.PASS, "Admin set tanggal akhir");
	}

	@When("TSRP002001 Admin klik tombol View")
	public void tsrp002001_admin_klik_tombol_view() {
	    reportPage.clickView();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol View");
	}

	@Then("TSRP002001 List report tampil")
	public void tsrp002001_list_report_tampil() {
	    assertTrue(reportPage.getTxtEntries().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "List report tampil");
	}
	
//	TSRP002002
	@When("TSRP002002 Admin set tanggal awal")
	public void tsrp002002_admin_set_tanggal_awal() {
		reportPage.clickDateFirst();
	    for(int i=0; i<3; i++) {
	    	reportPage.clickDatePrev();
	    }
	    reportPage.clickTglFirst();
	    extentTest.log(LogStatus.PASS, "Admin set tanggal awal");
	}

	@When("TSRP002002 Admin set tanggal akhir")
	public void tsrp002002_admin_set_tanggal_akhir() {
		reportPage.clickDateLast();
	    reportPage.clickTglLast();
	    extentTest.log(LogStatus.PASS, "Admin set tanggal akhir");
	}

	@When("TSRP002002 Admin klik tombol export")
	public void tsrp002002_admin_klik_tombol_export() {
		reportPage.clickView();
		reportPage.clickExport();
		reportPage.clickExport();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol export");
	}

	@Then("TSRP002002 Validasi file menggunakan size")
	public void tsrp002002_validasi_file_menggunakan_size() {
	    String pathSatu = "C:\\Users\\"+ Constants.PC_USER_NAME +"\\Downloads\\exportreport.xls";
	    String pathDua = "C:\\Users\\"+ Constants.PC_USER_NAME +"\\Downloads\\exportreport (1).xls";
	    assertTrue(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
	    extentTest.log(LogStatus.PASS, "Validasi file menggunakan size");
	}
}
