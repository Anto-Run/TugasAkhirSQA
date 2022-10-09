#Author: Runanto
#Created_date: 29-09-2022
#Modified_date:
Feature: TSLPN002 Admin login invalid ke web

  Background: 
    Given TSLPN002 Admin berhasil masuk halaman Login

  @tag1
  Scenario Outline: TSLPN002001 Admin login invalid dan menekan tombol sign in
    When TSLPN002001 Admin memasukan <username> dan <password> invalid
    And TSLPN002001 Admin menekan tombol sign in
    Then TSLPN002001 Admin tidak bisa login

    #Data (6 data)
    Examples: 
      | username  | password |
      |           |          |
      | developer |          |
      |           |       23 |
      | developer | admin123 |
      | adasasa   |       23 |
      | adasasa   | admin123 |

  @tag2
  Scenario Outline: TSLPN002002 Admin login invalid dan menekan tombol enter (green button) username
    When TSLPN002002 Admin memasukan <username> dan <password> invalid
    And TSLPN002002 Admin menekan tombol green button username
    Then TSLPN002002 Admin tidak bisa login

    #Data (6 data)
    Examples: 
      | username  | password |
      |           |          |
      | developer |          |
      |           |       23 |
      | developer | admin123 |
      | adasasa   |       23 |
      | adasasa   | admin123 |

  @tag3
  Scenario Outline: TSLPN002003 Admin login invalid dan menekan tombol enter (green button) password
    When TSLPN002003 Admin memasukan <username> dan <password> invalid
    And TSLPN002003 Admin menekan tombol green button password
    Then TSLPN002003 Admin tidak bisa login

    #Data (6 data)
    Examples: 
      | username  | password |
      |           |          |
      | developer |          |
      |           |       23 |
      | developer | admin123 |
      | adasasa   |       23 |
      | adasasa   | admin123 |
