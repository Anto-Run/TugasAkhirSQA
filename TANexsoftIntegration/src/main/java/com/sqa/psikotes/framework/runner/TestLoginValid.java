//Author : Runanto
//Created-date: 29-09-2022 13.00
//Modifier: 
//Modified_date:


package com.sqa.psikotes.framework.runner;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.LoginPage;
import com.sqa.psikotes.framework.utils.Utils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private LoginPage loginPage = new LoginPage ();
	
	public TestLoginValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("Admin go to page login")
	public void admin_go_to_page_login() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Browser open page login");
	}

	@When("TSLP001001 admin enter username and password valid")
	public void tslp001001_admin_enter_username_and_password_valid() {
		String username = "developer";
		String password = "23";
		System.out.println("admin_enter_valid_username_and_password : "+ username +" pwd : "+password);
		loginPage.loginValidOne(username, password);
		extentTest.log(LogStatus.PASS, "admin_valid_username_and_password");

	}

	@When("TSLP001001 admin click button sign in")
	public void tslp001001_admin_click_button_sign_in() {
	  loginPage.clickBtnSignIn();
	  extentTest.log(LogStatus.PASS, "button sign in clicked");
	}

	@Then("TSLP001001 The system check credentsial login valid")
	public void tslp001001_the_system_check_credentsial_login_valid() {
		String strExpect ="PSIKOTES";
		assertTrue(loginPage.getTxtPsikotes().contains(strExpect));
		extentTest.log(LogStatus.PASS, "System check credentials valid login");
		Utils.delay(1, Constants.CHROME);
		DriverSingleton.closeObjectInstance();
	}

	@When("TSLP001002 admin enter username and password valid")
	public void tslp001002_admin_enter_username_and_password_valid() {
		String username = "developer";
		String password = "23";
		System.out.println("admin_enter_valid_username_and_password : "+ username +" pwd : "+password);
		loginPage.loginValidOne(username, password);
		extentTest.log(LogStatus.PASS, "admin_valid_username_and_password");
	}

	@When("TSLP001002 admin click button green username")
	public void tslp001002_admin_click_button_green_username() {
		loginPage.clickBtnGreenUsername();
		extentTest.log(LogStatus.PASS, "button green username clicked");
	}

	@Then("TSLP001002 The system check credentsial login valid")
	public void tslp001002_the_system_check_credentsial_login_valid() {
		String strExpect ="PSIKOTES";
		assertTrue(loginPage.getTxtPsikotes().contains(strExpect));
		extentTest.log(LogStatus.PASS, "System check credentials valid login");
		Utils.delay(1, Constants.CHROME);
		DriverSingleton.closeObjectInstance();
	}

	@When("TSLP001003 admin enter username and password valid")
	public void tslp001003_admin_enter_username_and_password_valid() {
		String username = "developer";
		String password = "23";
		System.out.println("admin_enter_valid_username_and_password : "+ username +" pwd : "+password);
		loginPage.loginValidOne(username, password);
		extentTest.log(LogStatus.PASS, "admin_valid_username_and_password");
	}

	@When("TSLP001003 admin click button green password")
	public void tslp001003_admin_click_button_green_password() {
		loginPage.clickBtnGreenPassword();
		extentTest.log(LogStatus.PASS, "button green password clicked");
	}

	@Then("TSLP001003 he system check credentsial login valid")
	public void tslp001003_he_system_check_credentsial_login_valid() {
		String strExpect ="PSIKOTES";
		assertTrue(loginPage.getTxtPsikotes().contains(strExpect));
		extentTest.log(LogStatus.PASS, "System check credentials valid login");
	}
	

	

}
