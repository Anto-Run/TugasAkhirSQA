#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 
@tag
Feature: TSDU012 Membuka halaman Data Users
	Background:
		Given TSDU012 Admin harus sudah membuka halaman Data Users
	    
  @tag1
  Scenario: TSDU012001 Export semua NON ACTIVE Admin
    When TSDU012001 Admin klik tombol export
    Then TSDU012001 Membandingkan file size
    
  @tag2
  Scenario Outline: TSDU012002 Export semua NON ACTIVE Admin
    When TSDU012002 Admin klik search field
    And TSDU012002 Admin input <dataone> yang ingin dicari
    And TSDU012002 Admin klik tombol search
    And TSDU012002 Admin klik tombol export
    Then TSDU012002 Membandingkan file size
    
  Examples:
  | dataone |
  | buhi |
  | yuh@gmail.com |
  
  @tag3
  Scenario: TSDU012003 Export semua ACTIVE Admin
    When TSDU012001 Admin klik tombol export
    Then TSDU012001 Membandingkan file size
    
  @tag4
  Scenario Outline: TSDU012004 Export semua ACTIVE Admin
    When TSDU012004 Admin klik search field
    And TSDU012004 Admin input <datatwo> yang ingin dicari
    And TSDU012004 Admin klik tombol search
    And TSDU012004 Admin klik tombol export
    Then TSDU012004 Membandingkan file size
    
  Examples:
  | datatwo |
  | kuroshi |
  | kenshin@gmail.com |
