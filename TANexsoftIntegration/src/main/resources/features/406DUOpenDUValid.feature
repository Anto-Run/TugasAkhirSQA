#Author: Bagas
#Created_date: 29/9/2022
#Modified_date: 
Feature: TSDU001 Membuka halaman Data Users
	Background:
	    Given TSDU001 Admin harus membuka halaman utama web
	    
	@tag1
  Scenario: TSDU001001 Admin ingin membuka halaman data Admin
    When TSDU001001 Admin klik menu Task
    And TSDU001001 Admin klik submenu Data Users
    Then TSDU001001 Tampil halaman Data Users
    
 
