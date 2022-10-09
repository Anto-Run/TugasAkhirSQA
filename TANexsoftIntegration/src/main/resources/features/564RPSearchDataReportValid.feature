#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 
@tag
Feature: TSRP002 Membuka halaman Data Users
	Background:
		Given TSRP002 Admin sudah membuka halaman report

  @tag1
  Scenario: TSRP002001 Admin mencari data berdasarkan range tanggal
    When TSRP002001 Admin set tanggal awal
    And TSRP002001 Admin set tanggal akhir
    And TSRP002001 Admin klik tombol View
    Then TSRP002001 List report tampil
    
  @tag2
  Scenario: TSRP002002 Admin mencari data berdasarkan range tanggal
    When TSRP002002 Admin set tanggal awal
    And TSRP002002 Admin set tanggal akhir
    And TSRP002002 Admin klik tombol export
    Then TSRP002002 Validasi file menggunakan size
