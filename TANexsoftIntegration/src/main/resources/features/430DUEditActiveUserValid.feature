#Author: Bagas
#Created_date: 3/10/2022
#Modified_date: 

@tag
Feature: TSDU009 Edit user active
  Background:
  	Given TSDU009 Admin harus sudah membuka halaman Data Users dengan status ACTIVE

  @tag1
  Scenario: TSDU009001 Admin edit status User dari ACTIVE menjadi NON ACTIVE dan cek validasi dari pop up
    When TSDU009001 Admin klik icon edit
    And TSDU009001 Admin ubah status User dari ACTIVE menjadi NON ACTIVE
    And TSDU009001 Admin klik tombol save
    Then TSDU009001 Muncul pop up
    And TSDU009001 Admin klik tombol OK
    
  @tag2
  Scenario: TSDU009002 Admin edit status User dari ACTIVE menjadi NON ACTIVE dan cek validasi dari tabel active
    When TSDU009002 Admin klik icon edit
    And TSDU009002 Admin ubah status Admin dari ACTIVE menjadi NON ACTIVE
    And TSDU009002 Admin klik tombol save
    And TSDU009002 Muncul pop up
    And TSDU009002 Admin klik tombol OK
    And TSDU009002 Admin memilih opsi NON ACTIVE
    And TSDU009002 Admin klik search field
    And TSDU009002 Admin mengisi dengan Name atau Email yang sudah diubah sebelumnya
    And TSDU009002 Admin klik tombol search
    Then TSDU009002 Data tampil
    
  @tag3
  Scenario: TSDU009003 Admin edit kategori dengan mencentang kategori STAFF di status User ACTIVE
    When TSDU009003 Admin klik icon edit
    And TSDU009003 Admin klik field kategori
    And TSDU009003 Admin centang STAFF
    And TSDU009003 Admin klik tombol save
    Then TSDU009003 Muncul pop up data berhasil diubah
    And TSDU009003 Admin klik tombol OK
    
  @tag4
  Scenario: TSDU009004 Admin edit kategori dengan mencentang kategori LEADER di status User ACTIVE
    When TSDU009004 Admin klik icon edit
    And TSDU009004 Admin klik field kategori
    And TSDU009004 Admin centang LEADER
    And TSDU009004 Admin klik tombol save
    Then TSDU009004 Muncul pop up data berhasil diubah
    And TSDU009004 Admin klik tombol OK
    
  @tag5
  Scenario: TSDU009005 Admin edit kategori dengan menghilangkan centang kategori STAFF di status User NON ACTIVE
    When TSDU009005 Admin klik icon edit
    And TSDU009005 Admin klik field kategori
    And TSDU009005 Admin hilangkan centang pada kategori STAFF
    And TSDU009005 Admin klik tombol save
    Then TSDU009005 Muncul pop up data berhasil diubah
    And TSDU009005 Admin klik tombol OK
    
  @tag6
  Scenario: TSDU009006 Admin edit kategori dengan menghilangkan centang kategori LEADER di status User NON ACTIVE
    When TSDU009006 Admin klik icon edit
    And TSDU009006 Admin klik field kategori
    And TSDU009006 Admin hilangkan centang pada kategori LEADER
    And TSDU009006 Admin klik tombol save
    Then TSDU009006 Muncul pop up data berhasil diubah
    And TSDU009006 Admin klik tombol OK
    
   @tag7
  Scenario: TSDU009007 Admin edit kategori dengan mencentang kategori STAFF dan LEADER di status User ACTIVE
    When TSDU009007 Admin klik icon edit
    And TSDU009007 Admin klik field kategori
    And TSDU009007 Admin centang STAFF dan LEADER
    And TSDU009007 Admin klik tombol save
    Then TSDU009007 Muncul pop up data berhasil diubah
    And TSDU009007 Admin klik tombol OK
    
  @tag8
  Scenario: TSDU009008 Admin edit kategori dengan menghilangkan centang kategori STAFF dan LEADER di status User NON ACTIVE
    When TSDU009008 Admin klik icon edit
    And TSDU009008 Admin klik field kategori
    And TSDU009008 Admin hilangkan centang pada kategori STAFF dan LEADER
    And TSDU009008 Admin klik tombol save
    Then TSDU009008 Muncul pop up data berhasil diubah
    And TSDU009008 Admin klik tombol OK
