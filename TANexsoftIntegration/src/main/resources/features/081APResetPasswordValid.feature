#Author: Runanto
#Created_date: 04/10/2022
#Modified_date:
Feature: TSAP009 Reset Password Akun admin

  Scenario: TSAP009001 Admin mereset passwod akun admin
    Given TSAP009001 Admin berhasil masuk halaman menu admin
    When TSAP009001 Admin klik checkbox pada data yang akan di reset passwordnya
    And TSAP009001 Admin klik button reset password
    And TSAP009001 Admin klik button yes
    Then TSAP009001 Admin berhasil reset password berdasarkan akun admin yang akan direset
