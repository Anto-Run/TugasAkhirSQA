package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLPLoginInvalid {

	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private LoginPage loginPage = new LoginPage ();
	
	public TestLPLoginInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSLPN002 Admin berhasil masuk halaman Login")
	public void tslpn002_admin_berhasil_masuk_halaman_login() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman login");
	}

	@When("^TSLPN002001 Admin memasukan (.*) dan (.*) invalid$")
	public void tslpn002001_admin_memasukan_username_dan_password_invalid(String username, String password) {
		loginPage.loginValidOne(username, password);
		extentTest.log(LogStatus.PASS, "Admin memasukan username dan password invalid");
	}

	@When("TSLPN002001 Admin menekan tombol sign in")
	public void tslpn002001_admin_menekan_tombol_sign_in() {
		 loginPage.clickBtnSignIn();
		  extentTest.log(LogStatus.PASS, "admin menekan tombol sign in");
	}

	@Then("TSLPN002001 Admin tidak bisa login")
	public void tslpn002001_admin_tidak_bisa_login() {
		 String strExpectedLogin = "Username atau password tidak ditemukan";
		 assertTrue(loginPage.getTxtGagalLogin().contains(strExpectedLogin));
		 extentTest.log(LogStatus.PASS, "Admin tidak bisa login");
	}

	@When("^TSLPN002002 Admin memasukan (.*) dan (.*) invalid$")
	public void tslpn002002_admin_memasukan_username_dan_password_invalid(String username, String password) {
		loginPage.loginValidOne(username, password);
		extentTest.log(LogStatus.PASS, "Admin memasukan username dan password invalid");
	}

	@When("TSLPN002002 Admin menekan tombol green button username")
	public void tslpn002002_admin_menekan_tombol_green_button_username() {
		 loginPage.clickBtnGreenUsername();
		 extentTest.log(LogStatus.PASS, "admin menekan tombol green username");
	}

	@Then("TSLPN002002 Admin tidak bisa login")
	public void tslpn002002_admin_tidak_bisa_login() {
		 String strExpectedLogin = "Username atau password tidak ditemukan";
		 assertTrue(loginPage.getTxtGagalLogin().contains(strExpectedLogin));
		 extentTest.log(LogStatus.PASS, "Admin tidak bisa login");
	}

	@When("^TSLPN002003 Admin memasukan (.*) dan (.*) invalid$")
	public void tslpn002003_admin_memasukan_username_dan_password_valid(String username, String password) {
		loginPage.loginValidOne(username, password);
		extentTest.log(LogStatus.PASS, "Admin memasukan username dan password invalid");
	}

	@When("TSLPN002003 Admin menekan tombol green button password")
	public void tslpn002003_admin_menekan_tombol_green_button_password() {
		 loginPage.clickBtnGreenPassword();
		 extentTest.log(LogStatus.PASS, "admin menekan tombol green password");
	}

	@Then("TSLPN002003 Admin tidak bisa login")
	public void tslpn002003_admin_tidak_bisa_login() {
		String strExpectedLogin = "Username atau password tidak ditemukan";
		 assertTrue(loginPage.getTxtGagalLogin().contains(strExpectedLogin));
		 extentTest.log(LogStatus.PASS, "Admin tidak bisa login");
	}
}
