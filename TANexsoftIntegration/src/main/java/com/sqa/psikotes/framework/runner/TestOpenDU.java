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

public class TestOpenDU {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestOpenDU() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSDU001 Admin harus membuka halaman utama web")
	public void tsdu001admin_go_to_page_login() {
		driver.get(Constants.URL);
//		String username = "developer";
//		String password = "23";
//		System.out.println("admin_enter_valid_username_and_password : "+ username +" pwd : "+password);
//		dataUsers.loginValidTwo(username, password);
		dataUsers.clickOk();
	}

	@When("TSDU001001 Admin klik menu Task")
	public void tsdu001001_admin_klik_menu_task() {
	    dataUsers.clickTask();
	    extentTest.log(LogStatus.PASS, "Admin klik menu Task");
	}

	@When("TSDU001001 Admin klik submenu Data Users")
	public void tsdu001001_admin_klik_submenu_data_users() {
		dataUsers.clickDataUsers();
	    extentTest.log(LogStatus.PASS, "Admin klik submenu Data Users");
	}

	@Then("TSDU001001 Tampil halaman Data Users")
	public void tsdu001001_the_system_check_credential_data_users_page() {
	    assertTrue(dataUsers.getTxtDataUsers().contains("DATA"));
	    extentTest.log(LogStatus.PASS, "Tampil halaman Data Users");
	}
}
