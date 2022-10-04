#Author: Bagas
#Created_date: 3/10/2022
#Modified_date: 

@tag
Feature: TSDU011 Admin show page p100 non active

  @tag1
  Scenario: TSDU011026 Admin cek p100 NON ACTIVE data yang tampil
    Given TSDU011026 Admin harus membuka halaman data user
    When TSDU011026 Admin klik p100
    Then TSDU011026 Halaman menampilkan maksimal p100 data
   
  @tag2
  Scenario: TSDU011027 Admin cek p100 NON ACTIVE data yang tampil
    Given TSDU011027 Admin harus sudah membuka halaman Data Users NON ACTIVE dengan show page p100
    When TSDU011027 Admin klik angka h1 di atas tabel sebelah kanan
    Then TSDU011027 Berpindah ke halaman h1
