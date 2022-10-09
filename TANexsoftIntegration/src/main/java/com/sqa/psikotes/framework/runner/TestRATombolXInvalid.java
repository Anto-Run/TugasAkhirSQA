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

public class TestRATombolXInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private RemoveActivityPage removeAct = new RemoveActivityPage ();
	
	public TestRATombolXInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSRAN002001
	@Given("TSRAN002001 Admin sudah membuka pop up delete pada halaman Remove Activity")
	public void tsran002001_admin_sudah_membuka_pop_up_delete_pada_halaman_remove_activity() {
		driver.get(Constants.URL);
	    removeAct.clickOk();
	    removeAct.clickMenuReport();
	    removeAct.clickRemoveActivity();
	    removeAct.clickDelete();
	    extentTest.log(LogStatus.PASS, "Admin sudah membuka pop up delete pada halaman Remove Activity");
	}

	@When("TSRAN002001 Admin klik tombol X pada pop up")
	public void tsran002001_admin_klik_tombol_x_pada_pop_up() {
	    removeAct.clickSilang();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol X pada pop up");
	}

	@Then("TSRAN002001 Kembali ke halaman Remove Activity")
	public void tsran002001_kembali_ke_halaman_remove_activity() {
		assertTrue(removeAct.getTxtRemoveAct().contains("REPORT PSIKOTEST"));
	    extentTest.log(LogStatus.PASS, "Tampil halaman Remove Activity");
	}
}
