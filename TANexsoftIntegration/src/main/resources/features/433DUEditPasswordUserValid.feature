#Author: Bagas
#Created_date: 3/10/2022
#Modified_date: 

@tag
Feature: TSDU010 Admin edit password user

  @tag1
  Scenario: TSDU010001 Admin klik icon edit password 
    Given TSDU010001 Admin harus sudah membuka halaman Data Users
    When TSDU010001 Admin klik icon edit password
    Then TSDU010001 Muncul pop up form untuk edit password
    
  @tag2
  Scenario: TSDU010002 Admin edit password non active user
    Given TSDU010002 Admin harus sudah membuka halaman Data Users NON ACTIVE
    When TSDU010002 Admin mengisi field password baru
    And TSDU010002 Admin klik tombol save
    Then TSDU010002 Muncul pop up data berhasil di update
    And TSDU010002 Admin klik tombol OK
    
  @tag2
  Scenario: TSDU010003 Admin edit password active user
    Given TSDU010003 Admin harus sudah membuka halaman Data Users ACTIVE
    When TSDU010003 Admin mengisi field password baru
    And TSDU010003 Admin klik tombol save
    Then TSDU010003 Muncul pop up data berhasil di update
    And TSDU010003 Admin klik tombol OK
