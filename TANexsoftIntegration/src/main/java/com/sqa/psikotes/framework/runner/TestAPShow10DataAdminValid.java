package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.AdminPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAPShow10DataAdminValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPShow10DataAdminValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	

	@Given("TSAP005 Admin berhasil masuk ke halaman admin serta memilih10 pada icon show page")
	public void tsap005_admin_berhasil_masuk_ke_halaman_admin_serta_memilih10_pada_icon_show_page() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.selectShowPageTen();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk ke halaman admin serta memilih 10 pada icon show");
	}
	
	@When("TSAP005001 Admin klik button page1")
	public void tsap005001_admin_klik_button_page1() {
	   adminPage.clickBtnPOne();
	   extentTest.log(LogStatus.PASS, " Admin klik button page 1");
	}
	
	@Then("TSAP005001 Admin berhasil menampilkan10 data admin pada page ke1")
	public void tsap005001_admin_berhasil_menampilkan10_data_admin_pada_page_ke1() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page ke 1");
	}
	
	@When("TSAP005002 Admin klik button page2")
	public void tsap005002_admin_klik_button_page2() {
		 adminPage.clickBtnPTwo();
		  extentTest.log(LogStatus.PASS, " Admin klik button page 2");
	}
	
	@Then("TSAP005002 Admin berhasil menampilkan10 data admin pada page ke2")
	public void tsap005002_admin_berhasil_menampilkan10_data_admin_pada_page_ke2() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page ke 2");
	}
	
	@When("TSAP005003 Admin klik button page3")
	public void tsap005003_admin_klik_button_page3() {
		 adminPage.clickBtnPThree();
		 extentTest.log(LogStatus.PASS, "Admin klik button page 3");
	}
	
	@Then("TSAP005003 Admin berhasil menampilkan10 data admin pada page ke3")
	public void tsap005003_admin_berhasil_menampilkan10_data_admin_pada_page_ke3() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);		   
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page ke 3");
	}
	
	@When("TSAP005004 Admin klik button page4")
	public void tsap005004_admin_klik_button_page4() {
		 adminPage.clickBtnPFour();
		 extentTest.log(LogStatus.PASS, " Admin klik button page 4");
	}
	
	@Then("TSAP005004 Admin berhasil menampilkan10 data admin pada page ke4")
	public void tsap005004_admin_berhasil_menampilkan10_data_admin_pada_page_ke4() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page ke 4");
	}
	
	@When("TSAP005005 Admin klik button page5")
	public void tsap005005_admin_klik_button_page5() {
		 adminPage.clickBtnPFive();
		   extentTest.log(LogStatus.PASS, " Admin klik button page 5");
	}
	
	@Then("TSAP005005 Admin berhasil menampilkan10 data admin pada page ke5")
	public void tsap005005_admin_berhasil_menampilkan10_data_admin_pada_page_ke5() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page ke 5");
	}
	
	@When("TSAP005006 Admin klik button page6")
	public void tsap005006_admin_klik_button_page6() {
		 adminPage.clickBtnPSix();
		 extentTest.log(LogStatus.PASS, " Admin klik button page 6");
	}
	
	@Then("TSAP005006 Admin berhasil menampilkan10 data admin pada page ke6")
	public void tsap005006_admin_berhasil_menampilkan10_data_admin_pada_page_ke6() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page ke 6");
	}
	
	@When("TSAP005007 Admin klik button page7")
	public void tsap005007_admin_klik_button_page7() {
		 adminPage.clickBtnPSeven();
		 extentTest.log(LogStatus.PASS, " Admin klik button page 7");
	}
	
	@Then("TSAP005007 Admin berhasil menampilkan10 data admin pada page ke7")
	public void tsap005007_admin_berhasil_menampilkan10_data_admin_pada_page_ke7() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page ke 7");
	}
	
	
	@When("TSAP005008 Admin klik button page8")
	public void tsap005008_admin_klik_button_page8() {
		 adminPage.clickBtnPEight();
		 extentTest.log(LogStatus.PASS, " Admin klik button page 8");
	}
	
	@Then("TSAP005008 Admin berhasil menampilkan10 data admin pada page ke8")
	public void tsap005008_admin_berhasil_menampilkan10_data_admin_pada_page_ke8() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page ke 8");
	}

	@When("TSAP005009 Admin klik button page9")
	public void tsap005009_admin_klik_button_page9() {
		 adminPage.clickBtnPNine();
		 extentTest.log(LogStatus.PASS, " Admin klik button page 9");
	}
	
	@Then("TSAP005009 Admin berhasil menampilkan10 data admin pada page ke9")
	public void tsap005009_admin_berhasil_menampilkan10_data_admin_pada_page_ke9() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page ke 9");
	}
	
	@When("TSAP005010 Admin klik button page10")
	public void tsap005010_admin_klik_button_page10() {
		 adminPage.clickBtnPTen();
		 extentTest.log(LogStatus.PASS, " Admin klik button page 10");
	}
	
	@Then("TSAP005010 Admin berhasil menampilkan10 data admin pada page ke10")
	public void tsap005010_admin_berhasil_menampilkan10_data_admin_pada_page_ke10() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page ke 10");
	}
	
	
	@When("TSAP005011 Admin klik button page <<")
	public void tsap005011_admin_klik_button_page() {
		 adminPage.clickBtnPrevTen();
		 extentTest.log(LogStatus.PASS, "Admin klik button page <<");
	}
	
	@Then("TSAP005011 Admin berhasil menampilkan10 data admin pada page paling awal")
	public void tsap005011_admin_berhasil_menampilkan10_data_admin_pada_page_paling_awal() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page paling awal");
	}
	
	@When("TSAP005012 Admin klik button page >>")
	public void tsap005012_admin_klik_button_page() {
		 adminPage.clickBtnNextTen();
		 extentTest.log(LogStatus.PASS, "Admin klik button page >>");
	}
	
	@Then("TSAP005012 Admin berhasil menampilkan10 data admin pada page paling terakhir")
	public void tsap005012_admin_berhasil_menampilkan10_data_admin_pada_page_paling_terakhir() {
		  boolean isData = true;
		  assertEquals(adminPage.getBtnDataFirst(),isData);
		   extentTest.log(LogStatus.PASS, "Admin berhasil menampilkan 10 data admin pada page paling terakhir");
	}

}
