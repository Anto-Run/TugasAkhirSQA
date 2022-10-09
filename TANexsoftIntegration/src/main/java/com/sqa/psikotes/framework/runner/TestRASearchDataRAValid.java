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

public class TestRASearchDataRAValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static int i=0;
	
	private RemoveActivityPage removeAct = new RemoveActivityPage ();
	
	public TestRASearchDataRAValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSRS002001
	@Given("TSRA002 Admin sudah masuk ke halaman Remove Activity")
	public void tsra002_admin_sudah_masuk_ke_halaman_remove_activity() {
		driver.get(Constants.URL);
	    removeAct.clickOk();
	    removeAct.clickMenuReport();
	    removeAct.clickRemoveActivity();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke halaman Remove Activity");
	}

	@When("^TSRA002001 Admin mengisi (.*) yang ingin dicari ke dalam search field$")
	public void tsra002001_admin_mengisi_data_yang_ingin_dicari_ke_dalam_search_field(String data) {
	    removeAct.inputSearch(data);
	    extentTest.log(LogStatus.PASS, "Admin mengisi data yang ingin dicari ke dalam search field");
	}

	@When("TSRA002001 Admin klik tombol View")
	public void tsra002001_admin_klik_tombol_view() {
	    removeAct.clickSearch();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol View");
	}

	@Then("^TSRA002001 Tampil (.*) dengan data yang sama$")
	public void tsra002001_tampil_data_dengan_data_yang_sama(String data) {
	    i++;
	    if(i==1) {
	    	assertTrue(removeAct.getTxtNik().contains(data));
	    } else if(i==2) {
	    	assertTrue(removeAct.getTxtNama().contains(data));
	    } else if(i==3) {
	    	assertTrue(removeAct.getTxtEmail().contains(data));
	    } else {
	    	assertTrue(removeAct.getTxtTelpon().contains(data));
	    }
	    extentTest.log(LogStatus.PASS, "Tampil data yang sama");
	}
}
