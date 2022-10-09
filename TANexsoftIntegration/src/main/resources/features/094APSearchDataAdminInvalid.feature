#Author: Runanto
#Created date: 02/10/2022 15.00
#Modifier :
#Modified data:
Feature: TSAPN013 Admin Search Data Invalid

  Background: 
    Given TSAPN013 Admin berhasil klik field search data admin

  @tag1
  Scenario Outline: TSAPN013001 Admin mencari data dengan tombol search
    When TSAPN013001 Admin mengisi field search dengan <dataOne> invalid
    And TSAPN013001 Admin klik tombol search
    Then TSAPN013001 Admin berhasil mencari data invalid yang dicari

    Examples: 
      | dataOne       |
      |               |
      | adasasasASSAA |

  @tag2
  Scenario Outline: TSAPN013002 Admin mencari data dengan  tombol enter (green button)
    When TSAPN013002 Admin mengisi field search dengan <dataTwo> yang invalid
    And TSAPN013002 Admin klik  tombol enter (green button)
    Then TSAPN013002 Admin berhasil mencari data invalid yang dicari

    Examples: 
      | dataTwo       |
      |               |
      | adasasasASSAA |

  @tag3
  Scenario Outline: TSAPN013003 Admin mencari data dengan tombol enter pada keyboard
    When TSAPN013003 Admin mengisi field search dengan <dataThree> yang invalid
    And TSAPN013003 Admin klik tombol enter pada keyboard
    Then TSAPN013003 Admin berhasil mencari data invalid yang dicari

    Examples: 
      | dataThree     |
      |               |
      | adasasasASSAA |
