#Author: Bagas
#Created_date: 3/10/2022
#Modified_date: 

@tag
Feature: TSDU011 Admin show page p50 non active

  @tag1
  Scenario: TSDU011021 Admin cek p50 NON ACTIVE data yang tampil
    Given TSDU011021 Admin harus membuka halaman data user
    When TSDU011021 Admin klik p50
    Then TSDU011021 Halaman menampilkan maksimal p50 data
   
  @tag2
  Scenario: TSDU011022 Admin cek p50 NON ACTIVE data yang tampil
    Given TSDU011022 Admin harus sudah membuka halaman Data Users NON ACTIVE dengan show page p50
    When TSDU011022 Admin klik angka h1 di atas tabel sebelah kanan
    Then TSDU011022 Berpindah ke halaman h1
   
  @tag3
  Scenario: TSDU011023 Admin cek p50 NON ACTIVE data yang tampil
    When TSDU011023 Admin klik angka h2 di atas tabel sebelah kanan
    Then TSDU011023 Berpindah ke halaman h2
    
  @tag4
  Scenario: TSDU011024 Admin cek p50 NON ACTIVE data yang tampil
    When TSDU011024 Admin klik icon <<
    Then TSDU011024 Berpindah ke halaman awal
    
  @tag5
  Scenario: TSDU011025 Admin cek p50 NON ACTIVE data yang tampil
    When TSDU011025 Admin klik icon >>
    Then TSDU011025 Berpindah ke halaman akhir
