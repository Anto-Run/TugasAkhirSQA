#Author: Bagas
#Created_date: 5/10/2022
#Modified_date: 
@tag
Feature: TSDUN005 Edit Password Invalid

  @tag1
  Scenario: TSDUN005001 Admin edit password user dengan field kosong
    Given TSDUN005001 Admin sudah membuka pop up Edit password di halaman Data Users NON ACTIVE
    When TSDUN005001 Admin klik SAVE
    Then TSDUN005001 Muncul pop up password harus diisi
    
  @tag2
  Scenario: TSDUN005002 Admin edit password user dengan value kurang dari9 karakter
    Given TSDUN005002 Admin sudah membuka pop up Edit password di halaman Data Users NON ACTIVE
    When TSDUN005002 Admin isi field Password baru dengan karakter kurang dari karakter9
    And TSDUN005002 Admin klik SAVE
    Then TSDUN005002 Muncul pop up password minimal9 karakter
    
 @tag3
  Scenario: TSDUN005003 Admin edit password user dengan field kosong
    Given TSDUN005003 Admin sudah membuka pop up Edit password di halaman Data Users ACTIVE
    When TSDUN005003 Admin klik SAVE
    Then TSDUN005003 Muncul pop up password harus diisi
    
  @tag4
  Scenario: TSDUN005004 Admin edit password user dengan value kurang dari9 karakter
    Given TSDUN005004 Admin sudah membuka pop up Edit password di halaman Data Users ACTIVE
    When TSDUN005004 Admin isi field Password baru dengan karakter kurang dari karakter9
    And TSDUN005004 Admin klik SAVE
    Then TSDUN005004 Muncul pop up password minimal9 karakter