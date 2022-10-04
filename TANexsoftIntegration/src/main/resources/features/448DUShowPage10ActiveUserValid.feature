#Author: Bagas
#Created_date: 3/10/2022
#Modified_date: 

@tag
Feature: TSDU011 Admin show page p10 active

  @tag1
  Scenario: TSDU011028 Admin cek p10 ACTIVE data yang tampil
    Given TSDU011028 Admin harus sudah membuka halaman Data Users ACTIVE
    When TSDU011028 Admin klik p10
    Then TSDU011028 Halaman menampilkan maksimal p10 data
    
  @tag2
  Scenario: TSDU011029 Admin cek p10 ACTIVE data yang tampil
    Given TSDU011029 Admin harus sudah membuka halaman Data Users ACTIVE dengan show page p10
    When TSDU011029 Admin klik angka h1 di atas tabel sebelah kanan
    Then TSDU011029 Berpindah ke halaman h1
   
  @tag3
  Scenario: TSDU011030 Admin cek p10 ACTIVE data yang tampil
    When TSDU011030 Admin klik angka h2 di atas tabel sebelah kanan
    Then TSDU011030 Berpindah ke halaman h2
    
  @tag4
  Scenario: TSDU011031 Admin cek p10 ACTIVE data yang tampil
    When TSDU011031 Admin klik angka h3 di atas tabel sebelah kanan
    Then TSDU011031 Berpindah ke halaman h3
    
  @tag5
  Scenario: TSDU011032 Admin cek p10 ACTIVE data yang tampil
    When TSDU011032 Admin klik angka h4 di atas tabel sebelah kanan
    Then TSDU011032 Berpindah ke halaman h4
    
  @tag6
  Scenario: TSDU011033 Admin cek p10 ACTIVE data yang tampil
    When TSDU011033 Admin klik angka h5 di atas tabel sebelah kanan
    Then TSDU011033 Berpindah ke halaman h5
    
  @tag7
  Scenario: TSDU011034 Admin cek p10 ACTIVE data yang tampil
    When TSDU011034 Admin klik angka h6 di atas tabel sebelah kanan
    Then TSDU011034 Berpindah ke halaman h6
    
  @tag8
  Scenario: TSDU011035 Admin cek p10 ACTIVE data yang tampil
    When TSDU011035 Admin klik angka h7 di atas tabel sebelah kanan
    Then TSDU011035 Berpindah ke halaman h7
    
  @tag9
  Scenario: TSDU011036 Admin cek p10 ACTIVE data yang tampil
    When TSDU011036 Admin klik angka h8 di atas tabel sebelah kanan
    Then TSDU011036 Berpindah ke halaman h8
    
  @tag10
  Scenario: TSDU011037 Admin cek p10 ACTIVE data yang tampil
    When TSDU011037 Admin klik angka h9 di atas tabel sebelah kanan
    Then TSDU011037 Berpindah ke halaman h9
    
  @tag11
  Scenario: TSDU011038 Admin cek p10 ACTIVE data yang tampil
    When TSDU011038 Admin klik angka h10 di atas tabel sebelah kanan
    Then TSDU011038 Berpindah ke halaman h10
    
  @tag12
  Scenario: TSDU011039 Admin cek p10 ACTIVE data yang tampil
    When TSDU011039 Admin klik icon <<
    Then TSDU011039 Berpindah ke halaman awal
    
  @tag13
  Scenario: TSDU011040 Admin cek p10 ACTIVE data yang tampil
    When TSDU011040 Admin klik icon >>
    Then TSDU011040 Berpindah ke halaman akhir
