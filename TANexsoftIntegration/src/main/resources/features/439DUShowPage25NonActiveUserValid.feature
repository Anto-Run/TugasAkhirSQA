#Author: Bagas
#Created_date: 3/10/2022
#Modified_date: 

@tag
Feature: TSDU011 Admin show page p25 non active

  @tag1
  Scenario: TSDU011014 Admin cek p25 NON ACTIVE data yang tampil
    Given TSDU011014 Admin harus membuka halaman data user
    When TSDU011014 Admin klik p25
    Then TSDU011014 Halaman menampilkan maksimal p25 data
   
  @tag2
  Scenario: TSDU011015 Admin cek p25 NON ACTIVE data yang tampil
    Given TSDU011015 Admin harus sudah membuka halaman Data Users NON ACTIVE dengan show page p25
    When TSDU011015 Admin klik angka h1 di atas tabel sebelah kanan
    Then TSDU011015 Berpindah ke halaman h1
   
  @tag3
  Scenario: TSDU011016 Admin cek p25 NON ACTIVE data yang tampil
    When TSDU011016 Admin klik angka h2 di atas tabel sebelah kanan
    Then TSDU011016 Berpindah ke halaman h2
    
  @tag4
  Scenario: TSDU011017 Admin cek p25 NON ACTIVE data yang tampil
    When TSDU011017 Admin klik angka h3 di atas tabel sebelah kanan
    Then TSDU011017 Berpindah ke halaman h3
    
  @tag5
  Scenario: TSDU011018 Admin cek p25 NON ACTIVE data yang tampil
    When TSDU011018 Admin klik angka h4 di atas tabel sebelah kanan
    Then TSDU011018 Berpindah ke halaman h4
    
  @tag6
  Scenario: TSDU011019 Admin cek p25 NON ACTIVE data yang tampil
    When TSDU011019 Admin klik icon <<
    Then TSDU011019 Berpindah ke halaman awal
    
  @tag7
  Scenario: TSDU011020 Admin cek p25 NON ACTIVE data yang tampil
    When TSDU011020 Admin klik icon >>
    Then TSDU011020 Berpindah ke halaman akhir
