#Author: Bagas
#Created_date: 1/10/2022
#Modified_date: 

@tag
Feature: TSDU005 Menampilkan user active
  Background:
  	Given TSDU005 Admin harus membuka halaman data users

  @tag1
  Scenario: TSDU005001 Admin ingin menampilkan semua data ACTIVE Users
    When TSDU005001 Admin klik tombol untuk dropdown yang ada di sebelah kanan search field
    And TSDU005001 Admin memilih ACTIVE
    Then TSDU005001 Tampil status ACTIVE