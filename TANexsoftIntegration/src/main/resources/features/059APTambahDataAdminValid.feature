#Author: Runanto
#Created date: 02/10/2022 21.00
#Modifier :
#Modified data:
Feature: TSAP003 Tambah data akun admin

  Background: 
    Given TSAP003 Admin berhasil masuk form tambah data

  @tag1
  Scenario Outline: TSAP003001 Admin menyetujui menambahkan data akun admin
    When TSAP003001 Admin mengisi field <fullname>, privilages, supervisor, <telephone>, <username>, <password>
    And TSAP003001 Admin klik tombol save
    And TSAP003001 Admin klik yes
    Then TSAP003001 Admin berhasil menambahkan <username> akun

    Examples: 
      | fullname         | telephone  | username  | password |
      | Francesca Palmer | 5677867453 | Francesca | admin123 |

  #| David Miller        |  24772473815 | David     | admin123 |
  #| Marissa Ingham      |  18500602384 | Marissa   | admin123 |
  #| Wade Bishop         |  15844221811 | Wade      | admin123 |
  #| Aiden Notman        |  55274164025 | Aiden     | admin123 |
  #| Tony Rowlands       |   8232713205 | Tony      | admin123 |
  #| Elijah Emmett       |  83812257664 | Elijah    | admin123 |
  #| Sebastian Phillips  |  45800210774 | Sebastian | admin123 |
  #| Kassandra Walsh     |  21128646330 | Kassandra | admin123 |
  @tag2
  Scenario Outline: TSAP003002 Admin menyetujui menambahkan data akun admin
    When TSAP003002 Admin mengisi field <fullname>, privilages, supervisor, <telephone>, <username>, <password>,
    And TSAP003002 Admin klik tombol save
    And TSAP003002 Admin klik no
    Then TSAP003002 Admin tidak melakukan tambah <username> akun

    Examples: 
      | fullname     | telephone   | username | password |
      #| Francesca Palmer    |   5677867453 | Francesca | admin123 |
      | David Miller | 24772473815 | David    | admin123 |
      #| Marissa Ingham      |  18500602384 | Marissa   | admin123 |
      #| Wade Bishop         |  15844221811 | Wade      | admin123 |
      #| Aiden Notman        |  55274164025 | Aiden     | admin123 |
      #| Tony Rowlands       |   8232713205 | Tony      | admin123 |
      #| Elijah Emmett       |  83812257664 | Elijah    | admin123 |
      #| Sebastian Phillips  |  45800210774 | Sebastian | admin123 |
      #| Kassandra Walsh     |  21128646330 | Kassandra | admin123 |
