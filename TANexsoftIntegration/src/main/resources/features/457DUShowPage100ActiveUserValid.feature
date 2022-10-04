#Author: Bagas
#Created_date: 3/10/2022
#Modified_date: 

@tag
Feature: TSDU011 Admin show page p100 active

  @tag1
  Scenario: TSDU011053 Admin cek p100 ACTIVE data yang tampil
    Given TSDU011053 Admin harus membuka halaman data user
    When TSDU011053 Admin klik p100
    Then TSDU011053 Halaman menampilkan maksimal p100 data
   
  @tag2
  Scenario: TSDU011054 Admin cek p100 ACTIVE data yang tampil
    Given TSDU011054 Admin harus sudah membuka halaman Data Users ACTIVE dengan show page p100
    When TSDU011054 Admin klik angka h1 di atas tabel sebelah kanan
    Then TSDU011054 Berpindah ke halaman h1
