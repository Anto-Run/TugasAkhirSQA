//Author: Bagas
//Created_date: 10/5/2022
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

public class TestRASearchRAInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private RemoveActivityPage removeAct = new RemoveActivityPage ();
	
	public TestRASearchRAInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSRAN001 Admin sudah masuk ke halaman Remove Activity")
	public void tsran001_admin_sudah_masuk_ke_halaman_remove_activity() {
		driver.get(Constants.URL);
	    removeAct.clickOk();
	    removeAct.clickMenuReport();
	    removeAct.clickRemoveActivity();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke halaman Remove Activity");
	}

//	TSRAN001
	@When("^TSRAN001001 Admin mengisi (.*) yang ingin dicari ke dalam search field$")
	public void tsran001001_admin_mengisi_data_yang_ingin_dicari_ke_dalam_search_field(String data) {
		removeAct.inputInvalidSearch(data);
	    extentTest.log(LogStatus.PASS, "Admin mengisi data yang ingin dicari ke dalam search field");
	}

	@When("TSRAN001001 Admin klik tombol View")
	public void tsran001001_admin_klik_tombol_view() {
		removeAct.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol View");
	}

	@Then("TSRAN001001 Menampilkan hasil pencarian")
	public void tsran001001_menampilkan_hasil_pencarian() {
		i++;
		if(i==1) {
			assertTrue(removeAct.getTxtEntries().contains("Showing"));
			extentTest.log(LogStatus.PASS, "Menampilkan hasil pencarian");
		} else {
			assertTrue(removeAct.getTxtEntries().contains("no entries"));
		    extentTest.log(LogStatus.PASS, "Menampilkan hasil pencarian");
		}
	}
}
