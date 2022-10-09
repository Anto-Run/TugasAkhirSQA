#Author: Runanto
#Create date: 05/10/2022
#Modifier:
#Modified date:
Feature: TSAP011 Edit password admin

  Background: 
    Given TSAP011 Admin berhasil masuk halaman form edit passsword admin

  Scenario Outline: TSAP011001 Admin tidak menyetujui edit password
    When TSAP011001 Admin mengisi field <password> admin
    And TSAP011001 Admin klik tombol update
    And TSAP011001 Admin klik tombol No
    Then TSAP011001 Admin berhasil mengagalkan edit <password> admin

    Examples: 
      | password |
      | 12345678 |
      | runantoq |
      | admin222 |

  Scenario Outline: TSAP011002 Admin menyetujui edit password
    When TSAP011002 Admin mengisi field <password> admin
    And TSAP011002 Admin klik tombol update
    And TSAP011002 Admin klik tombol yes
    Then TSAP011002 Admin berhasil edit <password> admin

    Examples: 
      | password |
      | 12345678 |
      | runantoq |
      | admin123 |
