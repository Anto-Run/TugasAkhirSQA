#Author: Bagas
#Created_date: 1/10/2022
#Modified_date: 

@tag
Feature: TSDU006 Mencari user active
  Background:
  	Given TSDU006 Admin harus sudah membuka halaman Data Users ACTIVE

  @tag1
  Scenario Outline: TSDU006001 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan tombol search
    When TSDU006001 Admin klik search field
    And TSDU006001 Admin mengisi <dataone> yang ingin dicari
    And TSDU006001 Admin klik tombol search
    Then TSDU006001 Tampil hasil filter ACTIVE User berdasarkan <dataone>

    Examples: 
      | dataone  |
      | kenshin |
      | kenshin@gmail.com |
      
  @tag2
  Scenario Outline: TSDU006002 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan berwarna hijau
    When TSDU006002 Admin klik search field
    And TSDU006002 Admin mengisi <datatwo> yang ingin dicari
    And TSDU006002 Admin klik tombol berwarna hijau
    Then TSDU006002 Tampil hasil filter ACTIVE User berdasarkan <datatwo>

    Examples: 
      | datatwo  |
      | gerald |
      | gerald@gmail.com |
      
  @tag3
  Scenario Outline: TSDU006003 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan enter pada keyboard
    When TSDU006003 Admin klik search field
    And TSDU006003 Admin mengisi <datathree> yang ingin dicari
    And TSDU006003 Admin klik tombol berwarna hijau
    Then TSDU006003 Tampil hasil filter ACTIVE User berdasarkan <datathree>

    Examples: 
      | datathree  |
      | kuroshi |
      | kuroshi@gmail.com |
