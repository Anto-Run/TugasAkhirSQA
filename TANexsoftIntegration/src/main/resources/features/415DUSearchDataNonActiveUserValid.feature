#Author: Bagas
#Created_date: 1/10/2022
#Modified_date: 

@tag
Feature: TSDU004 Mencari user non active
  Background:
		Given TSDU004 Admin harus sudah membuka halaman Data Users NON ACTIVE

  @tag1
  Scenario Outline: TSDU004001 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol search
    When TSDU004001 Admin klik search field
    And TSDU004001 Admin mengisi <dataone> yang ingin dicari
    And TSDU004001 Admin klik tombol search
    Then TSDU004001 Tampil hasil filter NON ACTIVE User berdasarkan <dataone>

    Examples: 
      | dataone  |
      | yuhu |
      | yuh@gmail.com |
      
  @tag2
  Scenario Outline: TSDU004002 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan berwarna hijau
    When TSDU004002 Admin klik search field
    And TSDU004002 Admin mengisi <datatwo> yang ingin dicari
    And TSDU004002 Admin klik tombol berwarna hijau
    Then TSDU004002 Tampil hasil filter NON ACTIVE User berdasarkan <datatwo>

    Examples: 
      | datatwo  |
      | buhi |
      | buhi@gmail.com |
      
  @tag3
  Scenario Outline: TSDU004003 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan enter pada keyboard
    When TSDU004003 Admin klik search field
    And TSDU004003 Admin mengisi <datathree> yang ingin dicari
    And TSDU004003 Admin menekan enter pada keyboard
    Then TSDU004003 Tampil hasil filter NON ACTIVE User berdasarkan <datathree>

    Examples: 
      | datathree  |
      | kuma |
      | kuma@gmail.com |
