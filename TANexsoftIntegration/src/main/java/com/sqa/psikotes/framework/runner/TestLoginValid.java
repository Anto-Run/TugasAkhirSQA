/*
 * Author : Runanto
 * Created-date: 29-09-2022 13.00
 * Modifier:
 * Modified_date:
 */

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
	
	
	@Given("TSLP001 Admin berhasil masuk halaman Login")
	public void tslp001_admin_berhasil_masuk_halaman_login() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman login");
	}

	@When("TSLP001001 Admin memasukan username dan password valid")
	public void tslp001001_admin_memasukan_username_dan_password_valid() {
		String username = "developer";
		String password = "23";
		System.out.println("admin_enter_valid_username_and_password : "+ username +" pwd : "+password);
		loginPage.loginValidOne(username, password);
		extentTest.log(LogStatus.PASS, "admin memasukan username dan password valid");
	}

	@When("TSLP001001 Admin menekan tombol sign in")
	public void tslp001001_admin_menekan_tombol_sign_in() {
		 loginPage.clickBtnSignIn();
		  extentTest.log(LogStatus.PASS, "admin menekan tombol sign in");
	}
	
	@Then("TSLP001001 Admin berhasil masuk halaman utama psikotes")
	public void tslp001001_admin_berhasil_masuk_halaman_utama_psikotes() {
		String strExpect ="PSIKOTES";
		assertTrue(loginPage.getTxtPsikotes().contains(strExpect));
		extentTest.log(LogStatus.PASS, "admin berhasil masuk halaman utama psikotes");
		Utils.delay(1, Constants.CHROME);
		DriverSingleton.closeObjectInstance();
	}

	@When("TSLP001N002 Admin memasukan username dan password valid")
	public void tslp001n002_admin_memasukan_username_dan_password_valid() {
		String username = "developer";
		String password = "23";
		System.out.println("admin_enter_valid_username_and_password : "+ username +" pwd : "+password);
		loginPage.loginValidOne(username, password);
		extentTest.log(LogStatus.PASS, "admin memasukan username dan password valid");
	}

	@When("TSLP001N002 Admin menekan tombol green button username")
	public void tslp001n002_admin_menekan_tombol_green_button_username() {
		 loginPage.clickBtnGreenUsername();
		 extentTest.log(LogStatus.PASS, "admin menekan tombol green username");
	}
	
	@Then("TSLP001N002 Admin berhasil masuk halaman utama psikotes")
	public void tslp001N002_admin_berhasil_masuk_halaman_utama_psikotes() {
		String strExpect ="PSIKOTES";
		assertTrue(loginPage.getTxtPsikotes().contains(strExpect));
		extentTest.log(LogStatus.PASS, "admin berhasil masuk halaman utama psikotes");
		Utils.delay(1, Constants.CHROME);
		DriverSingleton.closeObjectInstance();
	}

	@When("TSLP001N003 Admin memasukan username dan password valid")
	public void tslp001n003_admin_memasukan_username_dan_password_valid() {
		String username = "developer";
		String password = "23";
		System.out.println("admin_enter_valid_username_and_password : "+ username +" pwd : "+password);
		loginPage.loginValidOne(username, password);
		extentTest.log(LogStatus.PASS, "admin memasukan username dan password valid");
	}

	@When("TSLP001N003 Admin menekan tombol green button password")
	public void tslp001n003_admin_menekan_tombol_green_button_password() {
		 loginPage.clickBtnGreenPassword();
		 extentTest.log(LogStatus.PASS, "admin menekan tombol green password");
	}
	@Then("TSLP001N003 Admin berhasil masuk halaman utama psikotes")
	public void tslp001N003_admin_berhasil_masuk_halaman_utama_psikotes() {
		String strExpect ="PSIKOTES";
		assertTrue(loginPage.getTxtPsikotes().contains(strExpect));
		extentTest.log(LogStatus.PASS, "admin berhasil masuk halaman utama psikotes");
		Utils.delay(1, Constants.CHROME);
		DriverSingleton.closeObjectInstance();
	}
	

	@When("TSLP001004 Admin memasukan username dan password valid")
	public void tslp001004_admin_memasukan_username_dan_password_valid() {
		String username = "developer";
		String password = "23";
		System.out.println("admin_enter_valid_username_and_password : "+ username +" pwd : "+password);
		loginPage.loginValidOne(username, password);
		extentTest.log(LogStatus.PASS, "admin memasukan username dan password");
	}

	@When("TSLP001004 Admin menekan tombol enter keyboard")
	public void tslp001004_admin_menekan_tombol_enter_keyboard() {
		 loginPage.clickEnterPassword();
		 extentTest.log(LogStatus.PASS, "admin menekan tombol enter keyboard");
	}
	
	@Then("TSLP001004 Admin berhasil masuk halaman utama psikotes")
	public void tslp001004_admin_berhasil_masuk_halaman_utama_psikotes() {
		String strExpect ="PSIKOTES";
		assertTrue(loginPage.getTxtPsikotes().contains(strExpect));
		extentTest.log(LogStatus.PASS, "admin berhasil masuk halaman utama psikotes");
	}
	

	

}
