#Author: Bagas
#Created_date: 5/10/2022
#Modified_date: 

@tag
Feature: TSRAN001 Admin mencari data remove activity
  Background:
		Given TSRAN001 Admin sudah masuk ke halaman Remove Activity

  @tag1
  Scenario Outline: TSRAN001001 Admin mencari data berdasarkan Value kosong, kombinasi, nilai, tipe modul, dan nama modul
  	When TSRAN001001 Admin mengisi <data> yang ingin dicari ke dalam search field
  	And TSRAN001001 Admin klik tombol View
  	Then TSRAN001001 Menampilkan hasil pencarian
  	
  Examples:
  | data |
  | |
  | ASdeg90=- |
  | 70 |
  | ENUM |
  | Matematika Dasar |