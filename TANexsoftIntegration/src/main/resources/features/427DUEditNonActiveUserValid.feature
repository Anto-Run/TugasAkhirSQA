#Author: Bagas
#Created_date: 2/10/2022
#Modified_date: 3/10/2022

@tag
Feature: TSDU008 Edit user non active
  Background:
  	Given TSDU008 Admin harus sudah membuka halaman Data Users dengan status NON ACTIVE

  @tag1
  Scenario: TSDU008001 Admin klik  icon edit
    When TSDU008001 Admin klik icon edit
    Then TSDU008001 Muncul pop up edit user
    
  @tag2
  Scenario: TSDU008002 Admin edit status User dari NON ACTIVE menjadi ACTIVE dan cek validasi dari pop up
    When TSDU008002 Admin klik icon edit
    And TSDU008002 Admin ubah status User dari NON ACTIVE menjadi ACTIVE
    And TSDU008002 Admin klik tombol save
    Then TSDU008002 Muncul pop up
    And TSDU008002 Admin klik tombol OK
    
  @tag3
  Scenario: TSDU008003 Admin edit status User dari NON ACTIVE menjadi ACTIVE dan cek validasi dari tabel active
    When TSDU008003 Admin klik icon edit
    And TSDU008003 Admin ubah status User dari NON ACTIVE menjadi ACTIVE
    And TSDU008003 Admin klik tombol save
    And TSDU008003 Muncul pop up
    And TSDU008003 Admin klik tombol OK
    And TSDU008003 Admin memilih opsi ACTIVE
    And TSDU008003 Admin klik search field
    And TSDU008003 Admin mengisi dengan Name atau Email yang sudah diubah sebelumnya
    And TSDU008003 Admin klik tombol search
    Then TSDU008003 Data tampil
    
  @tag4
  Scenario: TSDU008004 Admin edit kategori dengan mencentang kategori STAFF di status User NON ACTIVE
    When TSDU008004 Admin klik icon edit
    And TSDU008004 Admin klik field kategori
    And TSDU008004 Admin centang STAFF
    And TSDU008004 Admin klik tombol save
    Then TSDU008004 Muncul pop up data berhasil diubah
    And TSDU008004 Admin klik tombol OK
    
  @tag5
  Scenario: TSDU008005 Admin edit kategori dengan mencentang kategori LEADER di status User NON ACTIVE
    When TSDU008005 Admin klik icon edit
    And TSDU008005 Admin klik field kategori
    And TSDU008005 Admin centang LEADER
    And TSDU008005 Admin klik tombol save
    Then TSDU008005 Muncul pop up data berhasil diubah
    And TSDU008005 Admin klik tombol OK
    
  @tag6
  Scenario: TSDU008006 Admin edit kategori dengan menghilangkan centang kategori STAFF di status User NON ACTIVE
    When TSDU008006 Admin klik icon edit
    And TSDU008006 Admin klik field kategori
    And TSDU008006 Admin hilangkan centang pada kategori STAFF
    And TSDU008006 Admin klik tombol save
    Then TSDU008006 Muncul pop up data berhasil diubah
    And TSDU008006 Admin klik tombol OK
    
  @tag7
  Scenario: TSDU008007 Admin edit kategori dengan menghilangkan centang kategori LEADER di status User NON ACTIVE
    When TSDU008007 Admin klik icon edit
    And TSDU008007 Admin klik field kategori
    And TSDU008007 Admin hilangkan centang pada kategori LEADER
    And TSDU008007 Admin klik tombol save
    Then TSDU008007 Muncul pop up data berhasil diubah
    And TSDU008007 Admin klik tombol OK
    
  @tag8
  Scenario: TSDU008008 Admin edit kategori dengan mencentang kategori STAFF dan LEADER di status User NON ACTIVE
    When TSDU008008 Admin klik icon edit
    And TSDU008008 Admin klik field kategori
    And TSDU008008 Admin centang STAFF dan LEADER
    And TSDU008008 Admin klik tombol save
    Then TSDU008008 Muncul pop up data berhasil diubah
    And TSDU008008 Admin klik tombol OK
    
  @tag9
  Scenario: TSDU008009 Admin edit kategori dengan menghilangkan centang kategori STAFF dan LEADER di status User NON ACTIVE
    When TSDU008009 Admin klik icon edit
    And TSDU008009 Admin klik field kategori
    And TSDU008009 Admin hilangkan centang pada kategori STAFF dan LEADER
    And TSDU008009 Admin klik tombol save
    Then TSDU008009 Muncul pop up data berhasil diubah
    And TSDU008009 Admin klik tombol OK
