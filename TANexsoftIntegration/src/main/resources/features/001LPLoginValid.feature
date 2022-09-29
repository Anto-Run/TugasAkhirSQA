#Author: Runanto
#Created_date: 29-09-2022
#Modified_date: 

Feature: TSLP001 Admin login valid ke web
	Background:
	    Given Admin go to page login

	@tag1
  Scenario: TSLP001001 admin login valid click button signin
    When TSLP001001 admin enter username and password valid
    And TSLP001001 admin click button sign in
    Then TSLP001001 The system check credentsial login valid

	@tag2
   Scenario: TSLP001002 Admin login valid click button green username
    When TSLP001002 admin enter username and password valid
    And TSLP001002 admin click button green username
    Then TSLP001002 The system check credentsial login valid
    
  @tag3
   Scenario: TSLP001002 admin login valid click button green password
    When TSLP001003 admin enter username and password valid
    And TSLP001003 admin click button green password
    Then TSLP001003 he system check credentsial login valid
 
