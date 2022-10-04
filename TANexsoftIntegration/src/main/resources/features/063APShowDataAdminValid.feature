#Author: Runanto
#Created date: 02/10/2022 21.00
#Modifier :
#Modified data:
Feature: TSAP004 Menampilkan data admin

  Background: 
    Given TSAP004 Admin berhasil masuk halaman menu admin

  @tag1
  Scenario: TSAP004001 Admin menampilkan10 data admin
    When TSAP004001 Admin memilih10 pada icon show page
    Then TSAP004001  Admin berhasil menampilkan10 data admin

  @tag2
  Scenario: TSAP004002 Admin menampilkan25 data admin
    When TSAP004002 Admin memilih25 pada icon show page
    Then TSAP004002  Admin berhasil menampilkan25 data admin

  @tag3
  Scenario: TSAP004003 Admin menampilkan50 data admin
    When TSAP004003 Admin memilih50 pada icon show page
    Then TSAP004003  Admin berhasil menampilkan50 data admin

  @tag4
  Scenario: TSAP004004 Admin menampilkan100 data admin
    When TSAP004004 Admin memilih100 pada icon show page
    Then TSAP004004  Admin berhasil menampilkan100 data admin
