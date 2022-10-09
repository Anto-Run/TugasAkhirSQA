#Author: Bagas
#Created_date: 5/10/2022
#Modified_date: 
@tag
Feature: TSDUN004 Tombol X

  @tag1
  Scenario: TSDUN004001 Admin klik tombol X di pop up View
    Given TSDUN004001 Admin sudah membuka pop up View user di halaman Data Users
    When TSDUN004001 Admin klik tombol X
    Then TSDUN004001 Kembali ke halaman data users
    
  @tag2
  Scenario: TSDUN004002 Admin klik tombol X di pop up Edit user
    Given TSDUN004002 Admin sudah membuka pop up Edit user user di halaman Data Users
    When TSDUN004002 Admin klik tombol X
    Then TSDUN004002 Kembali ke halaman data users
    
  @tag3
  Scenario: TSDUN004003 Admin klik tombol X di pop up Edit password
    Given TSDUN004003 Admin sudah membuka pop up Edit password user di halaman Data Users
    When TSDUN004003 Admin klik tombol X
    Then TSDUN004003 Kembali ke halaman data users