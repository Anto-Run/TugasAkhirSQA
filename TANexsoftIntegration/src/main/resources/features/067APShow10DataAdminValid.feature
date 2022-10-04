#Author: Runanto
#Created date: 03/10/2022 10.00
#Modifier :
#Modified data:
Feature: TSAP005 Menampilkan10 Data admin

  Background: 
    Given TSAP005 Admin berhasil masuk ke halaman admin serta memilih10 pada icon show page

  @tag1
  Scenario: TSAP005001 Admin menampilkan10 data  admin pada page ke1
    When TSAP005001 Admin klik button page1
    Then TSAP005001 Admin berhasil menampilkan10 data admin pada page ke1

  @tag2
  Scenario: TSAP005002 Admin menampilkan10 data  admin pada page ke2
    When TSAP005002 Admin klik button page2
    Then TSAP005002 Admin berhasil menampilkan10 data admin pada page ke2

  @tag3
  Scenario: TSAP005003 Admin menampilkan10 data  admin pada page ke3
    When TSAP005003 Admin klik button page3
    Then TSAP005003 Admin berhasil menampilkan10 data admin pada page ke3

  @tag4
  Scenario: TSAP005004 Admin menampilkan10 data  admin pada page ke4
    When TSAP005004 Admin klik button page4
    Then TSAP005004 Admin berhasil menampilkan10 data admin pada page ke4

  @tag5
  Scenario: TSAP005005 Admin menampilkan10 data  admin pada page ke5
    When TSAP005005 Admin klik button page5
    Then TSAP005005 Admin berhasil menampilkan10 data admin pada page ke5

  @tag6
  Scenario: TSAP005006 Admin menampilkan10 data  admin pada page ke6
    When TSAP005006 Admin klik button page6
    Then TSAP005006 Admin berhasil menampilkan10 data admin pada page ke6

  @tag7
  Scenario: TSAP005007 Admin menampilkan10 data  admin pada page ke7
    When TSAP005007 Admin klik button page7
    Then TSAP005007 Admin berhasil menampilkan10 data admin pada page ke7

  @tag8
  Scenario: TSAP005008 Admin menampilkan10 data  admin pada page ke8
    When TSAP005008 Admin klik button page8
    Then TSAP005008 Admin berhasil menampilkan10 data admin pada page ke8

  @tag9
  Scenario: TSAP005009 Admin menampilkan10 data  admin pada page ke9
    When TSAP005009 Admin klik button page9
    Then TSAP005009 Admin berhasil menampilkan10 data admin pada page ke9

  @tag10
  Scenario: TSAP005010 Admin menampilkan10 data  admin pada page ke10
    When TSAP005010 Admin klik button page10
    Then TSAP005010 Admin berhasil menampilkan10 data admin pada page ke10

  @tag11
  Scenario: TSAP005011 Admin menampilkan10 data admin pada page paling awal
    When TSAP005011 Admin klik button page <<
    Then TSAP005011 Admin berhasil menampilkan10 data admin pada page paling awal

  @tag12
  Scenario: TSAP005012 Admin menampilkan10 data admin pada page paling terakhir
    When TSAP005012 Admin klik button page >>
    Then TSAP005012 Admin berhasil menampilkan10 data admin pada page paling terakhir
