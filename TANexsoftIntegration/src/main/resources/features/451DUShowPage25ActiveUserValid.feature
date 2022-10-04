#Author: Bagas
#Created_date: 3/10/2022
#Modified_date: 

@tag
Feature: TSDU011 Admin show page p25 active

  @tag1
  Scenario: TSDU011041 Admin cek p25 ACTIVE data yang tampil
    Given TSDU011041 Admin harus membuka halaman data user
    When TSDU011041 Admin klik p25
    Then TSDU011041 Halaman menampilkan maksimal p25 data
   
  @tag2
  Scenario: TSDU011042 Admin cek p25 ACTIVE data yang tampil
    Given TSDU011042 Admin harus sudah membuka halaman Data Users ACTIVE dengan show page p25
    When TSDU011042 Admin klik angka h1 di atas tabel sebelah kanan
    Then TSDU011042 Berpindah ke halaman h1
   
  @tag3
  Scenario: TSDU011043 Admin cek p25 ACTIVE data yang tampil
    When TSDU011043 Admin klik angka h2 di atas tabel sebelah kanan
    Then TSDU011043 Berpindah ke halaman h2
    
  @tag4
  Scenario: TSDU011044 Admin cek p25 ACTIVE data yang tampil
    When TSDU011044 Admin klik angka h3 di atas tabel sebelah kanan
    Then TSDU011044 Berpindah ke halaman h3
    
  @tag5
  Scenario: TSDU011045 Admin cek p25 ACTIVE data yang tampil
    When TSDU011045 Admin klik angka h4 di atas tabel sebelah kanan
    Then TSDU011045 Berpindah ke halaman h4
    
  @tag6
  Scenario: TSDU011046 Admin cek p25 ACTIVE data yang tampil
    When TSDU011046 Admin klik icon <<
    Then TSDU011046 Berpindah ke halaman awal
    
  @tag7
  Scenario: TSDU011047 Admin cek p25 ACTIVE data yang tampil
    When TSDU011047 Admin klik icon >>
    Then TSDU011047 Berpindah ke halaman akhir
