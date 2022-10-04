#Author: Runanto
#Created date: 03/10/2022 14.00
#Modifier :
#Modified data:
Feature: TSAP006 Menampilkan25 data admin

  Background: 
    Given TSAP006 Admin berhasil masuk ke halaman admin serta memilih25 pada icon show page

  @tag1
  Scenario: TSAP006001 Admin menampilkan25 data admin pada page ke1
    When TSAP006001 Admin klik button page1
    Then TSAP006001 Admin berhasil menampilkan25 data admin pada page ke1

  @tag2
  Scenario: TSAP006002 Admin menampilkan25 data admin pada page ke2
    When TSAP006002 Admin klik button page2
    Then TSAP006002 Admin berhasil menampilkan25 data admin pada page ke2

  @tag3
  Scenario: TSAP006003 Admin menampilkan25 data admin pada page ke3
    When TSAP006003 Admin klik button page3
    Then TSAP006003 Admin berhasil menampilkan25 data admin pada page ke3

  @tag4
  Scenario: TSAP006004 Admin menampilkan25 data admin pada page ke4
    When TSAP006004 Admin klik button page4
    Then TSAP006004 Admin berhasil menampilkan25 data admin pada page ke4

  @tag5
  Scenario: TSAP006005 Admin menampilkan25 data admin pada page paling awal
    When TSAP006005 Admin klik button page <<
    Then TSAP006005 Admin berhasil menampilkan25 data admin pada page paling awal

  @tag6
  Scenario: TSAP006006 Admin menampilkan25 data admin pada page paling terakhir
    When TSAP006006 Admin klik button page >>
    Then TSAP006006 Admin berhasil menampilkan25 data admin pada page paling terakhir
