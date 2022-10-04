#Author: Bagas
#Created_date: 3/10/2022
#Modified_date: 

@tag
Feature: TSDU011 Admin show page p50 active

  @tag1
  Scenario: TSDU011048 Admin cek p50 ACTIVE data yang tampil
    Given TSDU011048 Admin harus membuka halaman data user
    When TSDU011048 Admin klik p50
    Then TSDU011048 Halaman menampilkan maksimal p50 data
   
  @tag2
  Scenario: TSDU011049 Admin cek p50 ACTIVE data yang tampil
    Given TSDU011049 Admin harus sudah membuka halaman Data Users ACTIVE dengan show page p50
    When TSDU011049 Admin klik angka h1 di atas tabel sebelah kanan
    Then TSDU011049 Berpindah ke halaman h1
   
  @tag3
  Scenario: TSDU011050 Admin cek p50 ACTIVE data yang tampil
    When TSDU011050 Admin klik angka h2 di atas tabel sebelah kanan
    Then TSDU011050 Berpindah ke halaman h2
    
  @tag4
  Scenario: TSDU011051 Admin cek p50 ACTIVE data yang tampil
    When TSDU011051 Admin klik icon <<
    Then TSDU011051 Berpindah ke halaman awal
    
  @tag5
  Scenario: TSDU011052 Admin cek p50 ACTIVE data yang tampil
    When TSDU011052 Admin klik icon >>
    Then TSDU011052 Berpindah ke halaman akhir
