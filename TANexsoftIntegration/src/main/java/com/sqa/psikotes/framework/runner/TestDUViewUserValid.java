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

public class TestDUViewUserValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestDUViewUserValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDU007 Admin harus sudah membuka halaman Data Users")
	public void tsdu007_admin_harus_sudah_membuka_halaman_data_users() {
		driver.get(Constants.URL);
		dataUsers.clickOk();
		dataUsers.clickTask();
		dataUsers.clickDataUsers();
	}

	@When("TSDU007001 Admin klik icon view Admins")
	public void tsdu007001_admin_klik_icon_view_admins() {
	    dataUsers.clickView();
	    extentTest.log(LogStatus.PASS, "Admin klik icon view Admins");
	}

	@Then("TSDU007001 Muncul pop up view user")
	public void tsdu007001_muncul_pop_up_view_user() {
	    assertTrue(dataUsers.getTxtViewName().contains(dataUsers.getTxtViewName()));
	}
}
