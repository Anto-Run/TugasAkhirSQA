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

public class TestLOAdminLogout {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestLOAdminLogout() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	

		@Given("TSLO002 Admin berhasil masuk halaman utama web")
		public void tslo002_admin_berhasil_masuk_halaman_utama_web() {
			driver.get(Constants.URL);
			loginPage.clickOk();
			extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman utama web");
			
		}

		@When("TSLO002001N Admin klik akun admin")
		public void tslo002001n_admin_klik_akun_admin() {
		    loginPage.clickBtnAkunAdmin();
		    extentTest.log(LogStatus.PASS, "Admin klik aku admin");
		}
		
		@When("TSLO002001N Admin klik tombol no")
		public void tslo002001n_admin_klik_tombol_no() {
		    loginPage.clickBtnNoLogout();
		    extentTest.log(LogStatus.PASS, "Admin klik tombol no");
		}
		
		@Then("TSLO002001N Admin batal logout dari website")
		public void tslo002001n_admin_batal_logout_dari_website() {
			String strExpect ="PSIKOTES";
			assertTrue(loginPage.getTxtPsikotes().contains(strExpect));
			extentTest.log(LogStatus.PASS, "Admin batal logout dari website");
		}

		@When("TSLO002002N Admin klik akun admin")
		public void tslo002002n_admin_klik_akun_admin() {
		    loginPage.clickBtnAkunAdmin();
		    extentTest.log(LogStatus.PASS, "Admin klik aku admin");
		}
		
		@When("TSLO002002N Admin klik tombol x")
		public void tslo002002n_admin_klik_tombol_x() {
		   loginPage.clickBtnXLogout();
		   extentTest.log(LogStatus.PASS, "Admin klik tombol x");
		}
		
		@Then("TSLO002002N Admin batal logout dari website")
		public void tslo002002n_admin_batal_logout_dari_website() {
			String strExpect ="PSIKOTES";
			assertTrue(loginPage.getTxtPsikotes().contains(strExpect));
			extentTest.log(LogStatus.PASS, "Admin batal logout dari website");
		}
		
		
		@When("TSLO002002 Admin klik akun admin")
		public void tslo002002_admin_klik_akun_admin() {
		    loginPage.clickBtnAkunAdmin();
		    extentTest.log(LogStatus.PASS, "Admin klik aku admin");
		}
		
		@When("TSLO002002 Admin klik tombol yes")
		public void tslo002002_admin_klik_tombol_yes() {
			 loginPage.clickBtnYesLogout();
			   extentTest.log(LogStatus.PASS, "Admin klik tombol yes");
		}
		
		@Then("TSLO002002 Admin berhasil logout dari website")
		public void tslo002002_admin_batal_logout_dari_website() {
			String strExpect ="Sign In";
			assertTrue(loginPage.getBtnSign().contains(strExpect));
			extentTest.log(LogStatus.PASS, "Admin berhasil logout dari website");
		}

}
