#Author: Bagas
#Created_date: 29/9/2022
#Modified_date: 
Feature: TSDU002 Admin mencari data
	    Background:
	    	Given Admin harus klik field search Data Users pada halaman Data Users

  @tag1
  Scenario: TSDU002001 Admin ingin mencari data yang ada berdasarkan name menggunakan tombol search
    When TSDU002001 Admin mengisi field dengan nama yang ingin dicari
    And TSDU002001 Admin klik tombol search
    Then TSDU002001 Tampil nama yang dicari
    
  @tag2
  Scenario: TSDU002002N Admin ingin mencari data yang ada berdasarkan name menggunakan tombol berwarna hijau
  	When TSDU002002N Admin mengisi field dengan name yang ingin dicari
  	And TSDU002002N Admin klik tombol berwarna hijau
  	Then TSDU002002N Tampil nama yang dicari
  	
  @tag3
  Scenario: TSDU002003 Admin ingin mencari data yang ada berdasarkan name menggunakan enter pada keyboard
  	When TSDU002003 Admin mengisi field dengan name yang ingin dicari
  	And TSDU002003 Admin menekan enter pada keyboard
  	Then TSDU002003 Tampil nama yang dicari
  	
  @tag4
  Scenario: TSDU002004 Admin ingin mencari data yang ada berdasarkan email menggunakan tombol search
  	When TSDU002004 Admin mengisi field dengan email yang ingin dicari
  	And TSDU002004 Admin klik tombol search
  	Then TSDU002004 Tampil email yang dicari
  	
  @tag5
  Scenario: TSDU002005N Admin ingin mencari data yang ada berdasarkan email menggunakan tombol berwarna hijau
  	When TSDU002005N Admin mengisi field dengan email yang ingin dicari
  	And TSDU002005N Admin klik tombol berwarna hijau
  	Then TSDU002005N Tampil email yang dicari
  	
  @tag6
  Scenario: TSDU002006 Admin ingin mencari data yang ada berdasarkan email menggunakan enter pada keyboard
  	When TSDU002006 Admin mengisi field dengan email yang ingin dicari
  	And TSDU002006 Admin menekan enter pada keyboard
  	Then TSDU002006 Tampil email yang dicari
  	
  @tag6
  Scenario: TSDU002007 Admin ingin mencari data yang ada berdasarkan status menggunakan tombol search
  	When TSDU002007 Admin mengisi field dengan status yang ingin dicari
  	And TSDU002007 Admin klik tombol search
  	Then TSDU002007 Tampil email yang dicari