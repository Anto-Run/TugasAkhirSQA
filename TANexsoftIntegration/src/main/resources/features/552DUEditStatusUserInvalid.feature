#Author: Bagas
#Created_date: 5/10/2022
#Modified_date: 
@tag
Feature: TSDUN003 Edit status user

  @tag1
  Scenario: TSDUN003001 Admin edit status dengan value (pilih)
    Given TSDUN003001 Admin sudah membuka halaman Data Users
    And TSDUN003001 Admin klik icon Edit User NON ACTIVE
    When TSDUN003001 Admin pilih status User dari NON ACTIVE menjadi pilih
    And TSDUN003001 Admin klik SAVE
    And TSDUN003001 Admin klik OK
    Then TSDUN003001 Admin search data yang diubah di status NON ACTIVE
    And TSDUN003001 Admin search data yang diubah di status ACTIVE
    
  @tag2
  Scenario: TSDUN003002 Admin edit status dengan value (pilih)
    Given TSDUN003002 Admin sudah membuka halaman Data Users
    And TSDUN003002 Admin klik icon Edit User ACTIVE
    When TSDUN003002 Admin pilih status User dari ACTIVE menjadi pilih
    And TSDUN003002 Admin klik SAVE
    And TSDUN003002 Admin klik OK
    Then TSDUN003002 Admin search data yang diubah di status ACTIVE
    And TSDUN003002 Admin search data yang diubah di status NON ACTIVE
    