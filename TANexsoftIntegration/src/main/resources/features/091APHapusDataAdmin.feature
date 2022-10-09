#Author: your.email@your.domain.com
#Create date : 06/10/2022
#Modifier :
#Modifier date:
Feature: TSAP012 Admin menghapus data
	Background: 
  Given TSAP012 Admin berhasil masuk halaman admin

  Scenario: TSAP012001 Admin batal menghapus data
    When TSAP012001 Admin klik tombol hapus data
    And TSAP012001 Admin klik tombol No
    Then TSAP012001 Admin batal menghapus data

  Scenario: TSAP012002 Admin berhasil menghapus data
    When TSAP012002 Admin klik tombol hapus data
    And TSAP012002 Admin klik tombol yes
    Then TSAP012002 Admin berhasil menghapus data
