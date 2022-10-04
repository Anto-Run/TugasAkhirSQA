#Author: Bagas
#Created_date: 30/9/2022
#Modified_date: 
@tag
Feature: TSDU003 Menampilkan user non active
	Background:
		Given TSDU003 Admin harus membuka halaman  data users

  @tag1
  Scenario: TSDU003001 Admin ingin menampilkan semua data NON ACTIVE Admins
    When TSDU003001 Admin klik tombol untuk dropdown yang ada di sebelah kanan search field
    And TSDU003001 Admin memilih NON ACTIVE
    Then TSDU003001 Tampil status NON ACTIVE
