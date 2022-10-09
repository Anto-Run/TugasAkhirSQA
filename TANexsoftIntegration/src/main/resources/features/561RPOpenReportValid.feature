#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 
@tag
Feature: TSRP001 Membuka halaman Data Users
	Background:
		Given TSRP001 Admin sudah masuk ke halaman utama

  @tag1
  Scenario: TSRP001001 Admin ingin membuka halaman report
    When TSRP001001 Admin klik menu Report
    And TSRP001001 Admin klik submenu Report
    Then TSRP001001 Tampil halaman Report