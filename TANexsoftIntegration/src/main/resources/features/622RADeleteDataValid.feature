#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 

@tag
Feature: TSRA003 Admin menghapus data remove activity
  Background:
		Given TSRA003 Admin sudah masuk ke halaman Remove Activity

  @tag1
  Scenario: TSRA003001 Admin klik icon delete
    When TSRA003001 Admin klik icon delete
    Then TSRA003001 Muncul pop up delete
    And TSRA003001 Admin klik TIDAK
    
  @tag1
  Scenario: TSRA003002 Admin delete data
    When TSRA003002 Admin klik icon delete
    And TSRA003002 Admin klik YA
    Then TSRA003002 Muncul pop up data berhasil dihapus
    And TSRA003002 Admin klik OK
