//Author : Runanto
//Created-date: 29-09-2022 13.00
//Modifer:Runanto
//Modifed date: 29/09/2022 23.00

package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {


	R1("TSLP001001 admin login valid click button signin"),
	R2("TSLP001002 admin login valid click button green username"),
	R3("TSLP001003 admin login valid click button green password"),
	R4("TSAP001001 Admin masuk ke halaman admin"),
	B1("TSDU001001 Admin open data users page"),
	B2("TSDU002001 Admin mencari nama dengan tombol search"),
	B3("TSDU002002N Admin mencari nama dengan tombol hijau"),
	B4("TSDU002003 Admin mencari nama dengan enter"),
	B5("TSDU002004 Admin mencari email dengan tombol search"),
	B6("TSDU002005N Admin mencari email dengan tombol hijau"),
	B7("TSDU002006 Admin mencari email dengan enter"),
	B8("TSDU002007 Admin mencari status dengan tombol search");
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}