#Author: Runanto
#Created date: 02/10/2022 15.00
#Modifier :
#Modified data:
Feature: TSAP002 Admin Search Data

  Background: 
    Given TSAP002 Admin berhasil klik field search data admin

  @tag1
  Scenario Outline: TSAP002001 Admin mencari data dengan tombol search
    When TSAP002001 Admin mengisi field search dengan <dataOne> yang dicari
    And TSAP002001 Admin klik tombol search
    Then TSAP002001 Admin berhasil mencari <dataOne> yang dicari

    Examples: 
      | dataOne   |
      | jack      |
      | jack      |
      | Admin     |
      | DEVELOPER |
      |    888888 |
      | ACTIVE    |

  @tag2
  Scenario Outline: TSAP002002 Admin mencari data dengan  tombol enter (green button)
    When TSAP002002 Admin mengisi field search dengan <dataTwo> yang dicari
    And TSAP002002 Admin klik  tombol enter (green button)
    Then TSAP002002 Admin berhasil mencari <dataTwo> yang dicari

    Examples: 
      | dataTwo    |
      | Tyler      |
      | Tyler Bell |
      | Admin      |
      | DEVELOPER  |
      | 4251768538 |
      | ACTIVE     |

  @tag3
  Scenario Outline: TSAP002003 Admin mencari data dengan tombol enter pada keyboard
    When TSAP002003 Admin mengisi field search dengan <dataThree> yang dicari
    And TSAP002003 Admin klik tombol enter pada keyboard
    Then TSAP002003 Admin berhasil mencari <dataThree> yang dicari

    Examples: 
      | dataThree    |
      | Elijah       |
      | Nick Doherty |
      | Admin        |
      | DEVELOPER    |
      |   2771035365 |
      | ACTIVE       |
