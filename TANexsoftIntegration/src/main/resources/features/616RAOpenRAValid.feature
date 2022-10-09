#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 

@tag
Feature: TSRA001 Admin membuka halaman Remove Activity
	Background:
		Given TSRA001 Admin sudah masuk ke halaman utama

  @tag1
  Scenario: TSRA001001 Admin ingin membuka halaman remove activity
    When TSRA001001 Admin klik menu Report
    And TSRA001001 Admin klik submenu Remove Activity
    Then TSRA001001 Tampil halaman Remove Activity
