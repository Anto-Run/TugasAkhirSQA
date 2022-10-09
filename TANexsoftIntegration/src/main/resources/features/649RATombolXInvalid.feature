#Author: Bagas
#Created_date: 5/10/2022
#Modified_date: 
@tag
Feature: TSRAN002 Tombol X

  @tag1
  Scenario: TSRAN002001 Admin klik tombol X
    Given TSRAN002001 Admin sudah membuka pop up delete pada halaman Remove Activity
    When TSRAN002001 Admin klik tombol X pada pop up
    Then TSRAN002001 Kembali ke halaman Remove Activity