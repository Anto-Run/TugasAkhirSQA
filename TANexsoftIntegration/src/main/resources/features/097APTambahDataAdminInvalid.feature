#Author: Runanto
#Created_date: 07/10/2022
#Modified_date:
Feature: TSAPN014 Admin tambah data invalid

  Scenario Outline: 
    Given TSAPN014001 Admin berhasil masuk form tambah data
    When TSAPN014001 Admin mengisi field <fullname>, privilages, supervisor, <telephone>, <username>, <password>
    And TSAPN014001 Admin klik tombol save
    Then TSAPN014001 Admin tidak bisa menambahkan data

    Examples: 
      | fullname | telephone  | username | password |
      |          |            |          |          |
      | Andika   |            |          |          |
      |          | 8712626282 |          |          |
      |          |            | Bagas31  |          |
      |          |            |          | admin123 |
      | Andika   | 8712626282 |          |          |
      | Andika   |            | Bagas31  |          |
      | Andika   |            |          | admin123 |
      |          | 8712626282 | Bagas31  |          |
      |          | 8712626282 |          | admin123 |
      |          |            | Bagas31  | admin123 |
      | Andika   | 8712626282 | Bagas31  |          |
      | Andika   | 8712626282 |          | admin123 |
      |          | 8712626282 | Bagas31  | admin123 |
