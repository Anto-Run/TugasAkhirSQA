#Author: Bagas
#Created_date: 1/10/2022
#Modified_date: 
@tag
Feature: TSDU007 Melihat detail user
  Background:
  	Given TSDU007 Admin harus sudah membuka halaman Data Users

  @tag1
  Scenario: TSDU007001 Admin ingin melihat detail salah satu Data Users
    When TSDU007001 Admin klik icon view Admins
    Then TSDU007001 Muncul pop up view user
