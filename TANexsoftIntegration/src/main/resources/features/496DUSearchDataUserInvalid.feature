#Author: Bagas
#Created_date: 5/10/2022
#Modified_date: 
@tag
Feature: TSDUN001 Admin search data invalid
  Background:
  	Given TSDUN001 Admin sudah membuka halaman Data Users
  

  @tag1
  Scenario: TSDUN001001 Admin search field kosong pada status NON ACTIVE
    When TSDUN001001 Admin memastikan search field kosong
    And TSDUN001001 Klik tombol Search
    Then TSDUN001001 Menampilkan semua data
    
  @tag2
  Scenario: TSDUN001002 Admin search field kosong pada status NON ACTIVE
    When TSDUN001002 Admin search dengan value kombinasi pada status NON ACTIVE
    And TSDUN001002 Klik tombol Search
    Then TSDUN001002 Tidak menampilkan data
    
  @tag3
  Scenario: TSDUN001003 Admin search field kosong pada status ACTIVE
    When TSDUN001003 Admin memastikan search field kosong
    And TSDUN001003 Klik tombol Search
    Then TSDUN001003 Menampilkan semua data
    
  @tag4
  Scenario: TSDUN001004 Admin search field kosong pada status ACTIVE
    When TSDUN001004 Admin search dengan value kombinasi pada status ACTIVE
    And TSDUN001004 Klik tombol Search
    Then TSDUN001004 Tidak menampilkan data
