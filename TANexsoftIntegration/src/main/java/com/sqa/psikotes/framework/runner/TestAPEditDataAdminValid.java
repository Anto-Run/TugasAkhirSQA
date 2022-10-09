package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.AdminPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAPEditDataAdminValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private boolean isFullnameEmpty;
	private boolean isTelephoneEmpty;
	private boolean isUserActiveEmpty;
	private boolean isUsernameEmpty;
	
	private String strUpdateFullName;
	private String strUpdateTelephone;
	private String strUpdateUserActive;
	private String strUpdateUsername;
	
	private AdminPage adminPage = new AdminPage ();
	
	public TestAPEditDataAdminValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
		
		this.isFullnameEmpty = true;
		this.isTelephoneEmpty = true;
		this.isUserActiveEmpty = true;
		this.isUsernameEmpty = true;
	}
	
	
	@Given("TSAP010 Admin berhasil masuk form edit data")
	public void tsap010_admin_berhasil_masuk_form_edit_data() {
		driver.get(Constants.URL);
		adminPage.clickOk();
		adminPage.adminPage();
		adminPage.clickBtnEditData();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk form edit data");
	}

	@When("^TSAP010001 Admin mengubah field (.*), (.*), (.*), (.*)$")
	public void tsap010001_admin_mengubah_field_fullname_telephone_user_active_username(String fullname, String telephone, String userActive, String username) {
	    if(!fullname.equals("")) {
	    	this.isFullnameEmpty = false;
	    }
	    
	    if(!telephone.equals("")) {
	    	this.isTelephoneEmpty = false;
	    }
	    
	    if(!userActive.equals("")) {
	    	this.isUserActiveEmpty = false;
	    }
	    
	    if(!username.equals("")) {
	    	this.isUsernameEmpty = false;
	    }
	    
	    /*
	     * Update data
	     */

	    strUpdateFullName = fullname;
	    strUpdateTelephone = telephone;
	    strUpdateUserActive = userActive;
	    strUpdateUsername = username;
	    
		adminPage.updateData(fullname, telephone, userActive, username);
		
		extentTest.log(LogStatus.PASS, "Admin mengubah satu isi field");
		
			
	}

	@When("TSAP010001 Admin klik update")
	public void tsap010001_admin_klik_update() {
		adminPage.clickBtnUpdateData();
		extentTest.log(LogStatus.PASS, "Admin klik tombol update");
	}

	@When("TSAP010001 Admin klik yes")
	public void tsap010001_admin_klik_yes() {
	    adminPage.clickBtnYes();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol Yes");
	    
	}
	
	@Then("TSAP010001 Admin berhasil mengubah data akun")
	public void tsap010001_admin_berhasil_mengubah_data_akun() {
		 if(!this.isFullnameEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateFullName);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtFullName().contains(strUpdateFullName));
		    }
		   
		   if(!this.isTelephoneEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateTelephone);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtTelephone().contains(strUpdateTelephone));
		    }
		   
		   if(!this.isUserActiveEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateUserActive);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtUserActive().contains(strUpdateUserActive));
		    }
		   if(!this.isUsernameEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateUsername);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtUsername().contains(strUpdateUsername));
		    }
		   
		   extentTest.log(LogStatus.PASS, "Admin berhasil mengubah data akun");
	}


	@When("^TSAP010002 Admin mengubah field (.*), (.*), (.*), (.*)$")
	public void tsap010002_admin_mengubah_field_fullname_telephone_user_active_username(String fullname, String telephone, String userActive, String username) {
	    if(!fullname.equals("")) {
	    	this.isFullnameEmpty = false;
	    }
	    
	    if(!telephone.equals("")) {
	    	this.isTelephoneEmpty = false;
	    }
	    
	    if(!userActive.equals("")) {
	    	this.isUserActiveEmpty = false;
	    }
	    
	    if(!username.equals("")) {
	    	this.isUsernameEmpty = false;
	    }
	    
	    /*
	     * Update data
	     */
	    strUpdateFullName = fullname;
	    strUpdateTelephone = telephone;
	    strUpdateUserActive = userActive;
	    strUpdateUsername = username;
	    
		adminPage.updateData(fullname, telephone, userActive, username);
		
		extentTest.log(LogStatus.PASS, "Admin mengubah dua isi field");
	}

	@When("TSAP010002 Admin klik update")
	public void tsap010002_admin_klik_update() {
		adminPage.clickBtnUpdateData();
		extentTest.log(LogStatus.PASS, "Admin klik tombol update");
	}

	@When("TSAP010002 Admin klik yes")
	public void tsap010002_admin_klik_yes() {
		adminPage.clickBtnYes();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol Yes");
	}

	
	@Then("TSAP010002 Admin berhasil mengubah data akun")
	public void tsap010002_admin_berhasil_mengubah_data_akun() {
		 if(!this.isFullnameEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateFullName);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtFullName().contains(strUpdateFullName));
		    }
		   
		   if(!this.isTelephoneEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateTelephone);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtTelephone().contains(strUpdateTelephone));
		    }
		   
		   if(!this.isUserActiveEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateUserActive);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtUserActive().contains(strUpdateUserActive));
		    }
		   if(!this.isUsernameEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateUsername);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtUsername().contains(strUpdateUsername));
		    }
		   extentTest.log(LogStatus.PASS, "Admin berhasil mengubah data akun");
	}
	
	@When("^TSAP010003 Admin mengubah field (.*), (.*), (.*), (.*)$")
	public void tsap010003_admin_mengubah_field_fullname_telephone_user_active_username(String fullname, String telephone, String userActive, String username) {
	    if(!fullname.equals("")) {
	    	this.isFullnameEmpty = false;
	    }
	    
	    if(!telephone.equals("")) {
	    	this.isTelephoneEmpty = false;
	    }
	    
	    if(!userActive.equals("")) {
	    	this.isUserActiveEmpty = false;
	    }
	    
	    if(!username.equals("")) {
	    	this.isUsernameEmpty = false;
	    }
	    
	    /*
	     * Update data
	     */
	    strUpdateFullName = fullname;
	    strUpdateTelephone = telephone;
	    strUpdateUserActive = userActive;
	    strUpdateUsername = username;
	    
		adminPage.updateData(fullname, telephone, userActive, username);
		
		extentTest.log(LogStatus.PASS, "Admin mengubah tiga isi field");
	}
	

	@When("TSAP010003 Admin klik update")
	public void tsap010003_admin_klik_update() {
		adminPage.clickBtnUpdateData();
		extentTest.log(LogStatus.PASS, "Admin klik tombol update");
	}

	@When("TSAP010003 Admin klik yes")
	public void tsap010003_admin_klik_yes() {
		  adminPage.clickBtnYes();
		    extentTest.log(LogStatus.PASS, "Admin klik tombol Yes");
	}

	
	
	@Then("TSAP010003 Admin berhasil mengubah data akun")
	public void tsap010003_admin_berhasil_mengubah_data_akun() {
		 if(!this.isFullnameEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateFullName);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtFullName().contains(strUpdateFullName));
		    }
		   
		   if(!this.isTelephoneEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateTelephone);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtTelephone().contains(strUpdateTelephone));
		    }
		   
		   if(!this.isUserActiveEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateUserActive);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtUserActive().contains(strUpdateUserActive));
		    }
		   if(!this.isUsernameEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateUsername);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtUsername().contains(strUpdateUsername));
		    }
		   
		   extentTest.log(LogStatus.PASS, "Admin berhasil mengubah data akun");
	}

	@When("^TSAP010004 Admin mengubah field (.*), (.*), (.*), (.*)$")
	public void tsap010004_admin_mengubah_field_fullname_telephone_user_active_username(String fullname, String telephone, String userActive, String username) {
	    if(!fullname.equals("")) {
	    	this.isFullnameEmpty = false;
	    }
	    
	    if(!telephone.equals("")) {
	    	this.isTelephoneEmpty = false;
	    }
	    
	    if(!userActive.equals("")) {
	    	this.isUserActiveEmpty = false;
	    }
	    
	    if(!username.equals("")) {
	    	this.isUsernameEmpty = false;
	    }
	    
	    /*
	     * Update data
	     */
	    
	    strUpdateFullName = fullname;
	    strUpdateTelephone = telephone;
	    strUpdateUserActive = userActive;
	    strUpdateUsername = username;
	    
		adminPage.updateData(fullname, telephone, userActive, username);
		
		extentTest.log(LogStatus.PASS, "Admin mengubah empat isi field");
	}

	@When("TSAP010004 Admin klik update")
	public void tsap010004_admin_klik_update() {
		adminPage.clickBtnUpdateData();
		extentTest.log(LogStatus.PASS, "Admin klik tombol update");
	}

	@When("TSAP010004 Admin klik yes")
	public void tsap010004_admin_klik_yes() {
		  adminPage.clickBtnYes();
		    extentTest.log(LogStatus.PASS, "Admin klik tombol Yes");
	}


	
	@Then("TSAP010004 Admin berhasil mengubah data akun")
	public void tsap010004_admin_berhasil_mengubah_data_akun() {
		 if(!this.isFullnameEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateFullName);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtFullName().contains(strUpdateFullName));
		    }
		   
		   if(!this.isTelephoneEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateTelephone);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtTelephone().contains(strUpdateTelephone));
		    }
		   
		   if(!this.isUserActiveEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateUserActive);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtUserActive().contains(strUpdateUserActive));
		    }
		   if(!this.isUsernameEmpty) {
		    	adminPage.clickInSearch();
		    	adminPage.searchDataAdmin(strUpdateUsername);
		    	adminPage.clickBtnSearch();
		    	assertTrue(adminPage.getTxtUsername().contains(strUpdateUsername));
		    }
		   
		   extentTest.log(LogStatus.PASS, "Admin berhasil mengubah data akun");
	}

}
