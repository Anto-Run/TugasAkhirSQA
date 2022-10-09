#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 

@tag
Feature: TSRA002 Admin mencari data remove activity
  Background:
		Given TSRA002 Admin sudah masuk ke halaman Remove Activity

  @tag1
  Scenario Outline: TSRA002001 Admin mencari data berdasarkan NIK, Nama, Email, Telpon
  	When TSRA002001 Admin mengisi <data> yang ingin dicari ke dalam search field
  	And TSRA002001 Admin klik tombol View
  	Then TSRA002001 Tampil <data> dengan data yang sama
  	
  Examples:
  | data |
  | 5851449312729320 |
  | Ahlan |
  | cgreves4@google.com |
  | 0855771341820 |
