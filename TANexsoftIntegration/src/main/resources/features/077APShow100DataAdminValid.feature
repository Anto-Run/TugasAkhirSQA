#Author: Runanto
#Created date: 04/10/2022 19.00
#Modifier :
#Modified data:
Feature: TSAP008 Menampilkan100 data admin

  Scenario: TSAP008001 Admin menampilkan100 data admin pada page ke1
    Given TSAP008001 Admin berhasil masuk ke halaman admin, memilih100 pada icon show page
    When TSAP008001 Admin klik button page1
    Then TSAP008001 Admin berhasil menampilkan100 data admin pada page1
