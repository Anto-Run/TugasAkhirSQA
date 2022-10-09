#Author: Bagas
#Created_date: 5/10/2022
#Modified_date: 
@tag
Feature: TSDUN002 Btn Down Status User
  Background:
  	Given TSDUN002 Admin sudah membuka halaman Data Users

  @tag1
  Scenario: TSDUN002001 Admin klik icon panah di sebelah kanan status Admin
    When TSDUN002001 Admin klik icon panah di sebelah kanan Status Admin NON ACTIVE
    Then TSDUN002001 Tampil semua data NON ACTIVE yang ada
    
  @tag2
  Scenario: TSDUN002002 Admin klik icon panah di sebelah kanan status Admin
    When TSDUN002002 Admin mengisi search field sesuai data yang ada
    And TSDUN002002 Admin klik icon panah di sebelah kanan Status Admin NON ACTIVE
    Then TSDUN002002 Menampilkan data NON ACTIVE yang dicari
    
  @tag3
  Scenario: TSDUN002003 Admin klik icon panah di sebelah kanan status Admin
    When TSDUN002003 Admin klik icon panah di sebelah kanan Status Admin ACTIVE
    Then TSDUN002003 Tampil semua data ACTIVE yang ada
    
  @tag4
  Scenario: TSDUN002004 Admin klik icon panah di sebelah kanan status Admin
    When TSDUN002004 Admin mengisi search field sesuai data yang ada
    And TSDUN002004 Admin klik icon panah di sebelah kanan Status Admin ACTIVE
    Then TSDUN002004 Menampilkan data ACTIVE yang dicari
