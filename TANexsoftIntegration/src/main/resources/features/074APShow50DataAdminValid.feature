#Author: Runanto
#Created date: 03/10/2022 19.00
#Modifier :
#Modified data:

Feature: TSAP007 Menampilkan50 data admin

  Background: 
    Given TSAP007 Admin berhasil masuk ke halaman admin serta memilih50 pada icon show page

  @tag1
  Scenario: TSAP007001 Admin menampilkan50 data admin pada page ke1
    When TSAP007001 Admin klik button page1
    Then TSAP007001 Admin berhasil menampilkan50 data admin pada page ke1
    
    
    @tag2
  Scenario: TSAP007002 Admin menampilkan50 data admin pada page ke2
    When TSAP007002 Admin klik button page2
    Then TSAP007002 Admin berhasil menampilkan50 data admin pada page ke2
    
        
    @tag3
  Scenario: TSAP007003 Admin menampilkan50 data admin pada page >>
    When TSAP007003 Admin klik button page >>
    Then TSAP007003 Admin berhasil menampilkan50 data admin pada page >>
    
    @tag4
    Scenario: TSAP007004 Admin menampilkan50 data admin pada page <<
    When TSAP007004 Admin klik button page <<
    Then TSAP007004 Admin berhasil menampilkan50 data admin pada page <<
    
    

