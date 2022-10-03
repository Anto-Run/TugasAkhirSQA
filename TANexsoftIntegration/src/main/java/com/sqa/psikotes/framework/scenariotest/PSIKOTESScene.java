/*
 * Author : Runanto
 * Created-date: 29-09-2022 13.00
 * Modifer:Runanto
 * Modifed date: 01/10/2022 16.00
 */

package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {


	R1("TSLP001001 admin login valid click button signin"), //1
	R2("TSLP001002 admin login valid click button green username"), //1
	R3("TSLP001003 admin login valid click button green password"), //1
	R4("TSLP001004 Admin login valid dan menekan enter keyboard"), //1
	R5("TSAP001001 Admin masuk ke halaman admin"), //1
	
	B1("TSDU001001 Admin membuka data users page"),//1
	B2("TSDU002 Admin mencari name, email, dan status dengan tombol search"),//3
	B3("TSDU002 Admin mencari name, email, dan status data dengan tombol hijau"),//3
	B4("TSDU002 Admin mencari name, email, dan status data dengan enter"),//3
	B5("TSDU003001 Admin menampilkan data dengan status NON ACTIVE"),//1
	B6("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol search"),//2
	B7("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol hijau"),//2
	B8("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan enter");//2
	
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
