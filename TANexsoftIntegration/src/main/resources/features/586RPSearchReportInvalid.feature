#Author: Bagas
#Created_date: 5/10/2022
#Modified_date: 
@tag
Feature: TSRPN001 Search Report invalid

  @tag1
  Scenario: TSRPN001001 Admin set date awal kebih besar dari date akhir
    Given TSRPN001001 Admin sudah membuka halaman Report
    When TSRPN001001 Admin set date awal lebih besar
    And TSRPN001001 Admin set date akhir lebih kecil
    And TSRPN001001 Admin klik View
    Then TSRPN001001 Tidak ada data yang tampil