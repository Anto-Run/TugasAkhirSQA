#Author: Runanto
#Created_date: 29-09-2022
#Modified_date: 

Feature: TSLP001 Admin login valid ke web
	Background:
	    Given TSLP001 Admin berhasil masuk halaman Login

	@tag1
  Scenario: TSLP001001 Admin login valid dan menekan tombol sign in
    When TSLP001001 Admin memasukan username dan password valid
    And TSLP001001 Admin menekan tombol sign in
    Then TSLP001001 Admin berhasil masuk halaman utama psikotes

	@tag2
   Scenario: TSLP001002 Admin login valid dan menekan tombol enter (green button) username
    When TSLP001002 Admin memasukan username dan password valid
    And TSLP001002 Admin menekan tombol green button username
    Then TSLP001002 Admin berhasil masuk halaman utama psikotes
    
  @tag3
   Scenario: TSLP001003 Admin login valid dan menekan tombol enter (green button) password
    When TSLP001003 Admin memasukan username dan password valid
    And TSLP001003 Admin menekan tombol green button password
    Then TSLP001003 Admin berhasil masuk halaman utama psikotes
    
   @tag4
   Scenario: TSLP001004 Admin login valid dan menekan enter keyboard
    When TSLP001004 Admin memasukan username dan password valid
    And TSLP001004 Admin menekan tombol enter keyboard
    Then TSLP001004 Admin berhasil masuk halaman utama psikotes
 
