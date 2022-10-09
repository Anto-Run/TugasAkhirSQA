#Author: Runanto
#Created_date: 04/10/2022
#Modified_date:
Feature: TSAP010 Edit data akun admin

  Background: 
    Given TSAP010 Admin berhasil masuk form edit data

  @tag1
  Scenario Outline: TSAP010001 Admin mengubah satu field pada akun admin
    When TSAP010001 Admin mengubah field <fullname>, <telephone>, <user_active>, <username>
    And TSAP010001 Admin klik update
    And TSAP010001 Admin klik yes
    Then TSAP010001 Admin berhasil mengubah data akun

    #Data mengubah satu field (4 data)
    Examples: 
      | fullname         | telephone | user_active | username |
      | Francesca Palmer |           |             |          |
      |                  | 827272811 |             |          |
      |                  |           | IN ACTIVE   |          |
      |                  |           |             | palmer   |

  @tag2
  Scenario Outline: TSAP010002 Admin mengubah dua field pada akun admin
    When TSAP010002 Admin mengubah field <fullname>, <telephone>, <user_active>, <username>
    And TSAP010002 Admin klik update
    And TSAP010002 Admin klik yes
    Then TSAP010002 Admin berhasil mengubah data akun

    #Data mengubah dua field (6 data)
    Examples: 
      | fullname         | telephone   | user_active | username |
      | Palmer Francesca |   827272811 |             |          |
      | Tony Rowlands    |             | IN ACTIVE   |          |
      | Rowlands Tony    |             |             | Toti     |
      |                  |    87128111 | ACTIVE      |          |
      |                  | 87128113411 |             | Tani     |
      |                  |             | ACTIVE      | Tino     |

  @tag3
  Scenario Outline: TSAP010003 Admin mengubah tiga field pada akun admin
    When TSAP010003 Admin mengubah field <fullname>, <telephone>, <user_active>, <username>
    And TSAP010003 Admin klik update
    And TSAP010003 Admin klik yes
    Then TSAP010003 Admin berhasil mengubah data akun

    #Data mengubah tiga field (3 data)
    Examples: 
      | fullname         | telephone  | user_active | username      |
      | Palmer Francesca |  827272811 | IN ACTIVE   |               |
      | Tony Rowlands    |   87128111 |             | palmer        |
      |                  | 8712811211 | ACTIVE      | Tony Rowlands |

  @tag3
  Scenario Outline: TSAP010004 Admin mengubah semua field pada akun admin
    When TSAP010004 Admin mengubah field <fullname>, <telephone>, <user_active>, <username>
    And TSAP010004 Admin klik update
    And TSAP010004 Admin klik yes
    Then TSAP010004 Admin berhasil mengubah data akun

    #Data mengubah semua field (1 data)
    Examples: 
      | fullname         | telephone | user_active | username |
      | Palmer Francesca | 827272811 | IN ACTIVE   | palmer   |
