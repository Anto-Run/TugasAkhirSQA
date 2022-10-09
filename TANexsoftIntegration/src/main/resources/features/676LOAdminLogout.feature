#Author: Runanto
#Created date: 05/10/2022
#Modifer:
#Modifed date:
Feature: TSLO002 Admin Logout

  Background: 
    Given TSLO002 Admin berhasil masuk halaman utama web

  @tag1
  Scenario: TSLO002001N Admin membatalkan logout dari website
    When TSLO002001N Admin klik akun admin
    And TSLO002001N Admin klik tombol no
    Then TSLO002001N Admin batal logout dari website

  @tag2
  Scenario: TSLO002002N Admin membatalkan logout dari website
    When TSLO002002N Admin klik akun admin
    And TSLO002002N Admin klik tombol x
    Then TSLO002002N Admin batal logout dari website

  @tag3
  Scenario: TSLO002002 Admin berhasil logout dari website
    When TSLO002002 Admin klik akun admin
    And TSLO002002 Admin klik tombol yes
    Then TSLO002002 Admin berhasil logout dari website
