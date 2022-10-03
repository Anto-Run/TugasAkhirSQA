#Author: Bagas
#Created_date: 29/9/2022
#Modified_date: 30/9/2022
Feature: TSDU002 Admin mencari data
	    Background:
	    	Given TSDU002 Admin harus klik field search Data Users pada halaman Data Users

  @tag1
  Scenario Outline: TSDU002001 Admin ingin mencari data yang ada berdasarkan name menggunakan tombol search
    When TSDU002001 Admin mengisi field dengan <dataone> yang ingin dicari
    And TSDU002001 Admin klik tombol search
    Then TSDU002001 Tampil <dataone> yang dicari
  	Examples:
  	| dataone |
  	| buhi		|
  	| buhi@gmail.com		|
  	| NON			|
    
    
  @tag2
  Scenario Outline: TSDU002002 Admin ingin mencari data yang ada berdasarkan name menggunakan tombol berwarna hijau
  	When TSDU002002 Admin mengisi field dengan <datatwo> yang ingin dicari
  	And TSDU002002 Admin klik tombol berwarna hijau
  	Then TSDU002002 Tampil <datatwo> yang dicari
  	Examples:
  	| datatwo |
  	| kuma		|
  	| kuma@gmail.com		|
  	| ACTIVE			|
  	
  @tag3
  Scenario: TSDU002003 Admin ingin mencari data yang ada berdasarkan name menggunakan enter pada keyboard
  	When TSDU002003 Admin mengisi field dengan <datathree> yang ingin dicari
  	And TSDU002003 Admin menekan enter pada keyboard
  	Then TSDU002003 Tampil <datathree> yang dicari
  	Examples:
  	| datathree |
  	| yuh		|
  	| yuh@gmail.com		|
  	| NON ACTIVE			|