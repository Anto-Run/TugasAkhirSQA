/*
 * Author : Runanto
 * Created-date: 29-09-2022 13.00
 * Modifer:Runanto
 * Modifed date: 01/10/2022 16.00
 */

package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {
	
	/*
	 * Scene Runanto
	 */
	
	//1, 1,1,1, 1, 6, 6, 6, 1,1, 1,1,1,1, 1,1,1,1,1,1,1,1,1,1,1,1

		R001("TSLP001001 admin login valid click button signin"), //1
		R002("TSLP001002 admin login valid click button green username"), //1
		R003("TSLP001003 admin login valid click button green password"), //1
		R004("TSLP001004 Admin login valid dan menekan enter keyboard"), //1
		R005("TSAP001001 Admin masuk ke halaman admin"), //1
		// 1, 1,1,1,1
		
		R006("TSAP002001 Admin mencari data dengan tombol search"), //6
		R007("TSAP002002 Admin mencari data dengan  tombol enter (green button)"), //6
		R008("TSAP002003 Admin mencari data dengan tombol enter pada keyboard"), //6
		//6, 6, 6
		
//		R009("TSAP003001 Admin menyetujui menambahkan data akun admin"),//1
//		R010("TSAP003002 Admin menyetujui menambahkan data akun admin"),//1
//		//1,1
		
		R011("TSAP004001 Admin menampilkan10 data admin"),//1
		R012("TSAP004002 Admin menampilkan25 data admin"), //1
		R013("TSAP004003 Admin menampilkan50 data admin"), //1
		R014("TSAP004004 Admin menampilkan100 data admin"),//1
		//1,1,1,1
		
		
		R015("TSAP005001 Admin menampilkan10 data  admin pada page ke1"),//1
		R016("TSAP005002 Admin menampilkan10 data  admin pada page ke2"),//1
		R017("TSAP005003 Admin menampilkan10 data  admin pada page ke3"), //1
		R018("TSAP005004 Admin menampilkan10 data  admin pada page ke4"),//1
		R019("TSAP005005 Admin menampilkan10 data  admin pada page ke5"),//1
		R020("TSAP005006 Admin menampilkan10 data  admin pada page ke6"),//1
		R021("TSAP005007 Admin menampilkan10 data  admin pada page ke7"),//1
		R022("TSAP005008 Admin menampilkan10 data  admin pada page ke8"),//1
		R023("TSAP005009 Admin menampilkan10 data  admin pada page ke9"),//1
		R024("TSAP005010 Admin menampilkan10 data  admin pada page ke10"),//1
		R025("TSAP005011 Admin menampilkan10 data admin pada page paling awal"), //1
		R026("TSAP005012 Admin menampilkan10 data admin pada page paling terakhir"), //1
//		//1,1,1,1,1,1,1,1,1,1,1,1,
		
		R027("TSAP006001 Admin menampilkan25 data admin pada page ke1"), //1
		R028("TSAP006002 Admin menampilkan25 data admin pada page ke2"), //1
		R029("TSAP006003 Admin menampilkan25 data admin pada page ke3"), //1
		R030("TSAP006004 Admin menampilkan25 data admin pada page ke4"), //1
		R031("TSAP006005 Admin menampilkan25 data admin pada page paling awal"), //1
		R032("TSAP006006 Admin menampilkan25 data admin pada page paling terakhir"), //1
		//1,1,1,1,1,1

		R033("TSAP007001 Admin menampilkan50 data admin pada page ke1"),//1
		R034("TSAP007002 Admin menampilkan50 data admin pada page ke2"), //1
		R035("TSAP007003 Admin menampilkan50 data admin pada page >>"), //1
		R036("TSAP007004 Admin menampilkan50 data admin pada page <<"), //1
		// 1, 1, 1, 1
		
		
		/*
		 * Scene Ayu
		 */
		
		A001("TSMP001001 Admin buka halaman modul"),//1
		
		A002("TSMP002001 Admin cari data berdasarkan nama modul menggunakan enter pada keyboard"),//1
		A003("TSMP002002 Admin cari data berdasarkan nama modul menggunakan button hijau"),//1
		A004("TSMP002003 Admin cari data berdasarkan nama modul menggunakan button search"),//1
		
		A005("TSMP003 Admin menambah modul"),//20
		
		A006("TSMP004001 Admin menampilkan10 data modul pada page ke1"),//1
		A007("TSMP004002 Admin menampilkan10 data modul pada page ke2"),//1
		A008("TSMP004003 Admin menampilkan10 data modul pada page ke3"),//1
		A009("TSMP004004 Admin menampilkan10 data modul pada page ke4"),//1
		A010("TSMP004005 Admin menampilkan10 data modul pada page ke5"),//1
		A011("TSMP004006 Admin menampilkan10 data modul pada page paling terakhir"),//1
		A012("TSMP004007 Admin menampilkan10 data modul pada page paling awal"),//1
		
		A013("TSMP005001 Admin menampilkan25 data modul pada page ke1"),//1
		A014("TSMP005002 Admin menampilkan25 data modul pada page terakhir"),//1
		A015("TSMP005003 Admin menampilkan25 data modul pada page ke2"),//1
		A016("TSMP005004 Admin menampilkan25 data modul pada page pertama"),//1
		
		A017("TSMP006001 Admin menampilkan50 data modul"),//1
		A018("TSMP006002 Admin menampilkan50 data modul pada page ke1"),//1
		
		A019("TSMP008001 Admin menampilkan100 data modul"),//1
		A020("TSMP006002 Admin menampilkan100 data modul pada page ke1"),//1
		
		
		
		/*
		 * Scene Bagas
		 */
		
//		1, 3,3,3, 1, 2,2,2, 1, 2,2,2,
//		1, 1,1,1,1,1,1,1,1,1,	1,1,1,1,1,1,1,1,		1,1,1	1,1,1,1,1,1,1,1,1,1,1,1,1		1,1,1,1,1,1,1	
//		1,1,1,1,1,	1,1, 	1,1,1,1,1,1,1,1,1,1,1,1,1, 1,1,1,1,1,1,1	1,1,1,1,1,1,1
		B001("TSDU001001 Admin membuka data users page"),//1
		B002("TSDU002 Admin mencari name, email, dan status dengan tombol search"),//3
		B003("TSDU002 Admin mencari name, email, dan status data dengan tombol hijau"),//3
		B004("TSDU002 Admin mencari name, email, dan status data dengan enter"),//3
//		1, 3,3,3
		
		B005("TSDU003001 Admin menampilkan data dengan status NON ACTIVE"),//1
		B006("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol search"),//2
		B007("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol hijau"),//2
		B008("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan enter"),//2
//		1, 2,2,2
		
		B009("TSDU005001 Admin menampilkan data dengan status ACTIVE"),//1
		B010("TSDU006 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan tombol search"),//2
		B011("TSDU006 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan tombol hijau"),//2
		B012("TSDU006 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan enter"),//2
//		1, 2,2,2
		
		B013("TSDU007 Admin ingin melihat detail salah satu Data Users"),//1
		B014("TSDU008001 Admin klik  icon edit"),//1
		B015("TSDU008002 Admin edit status user NON ACTIVE menjadi ATCIVE validasi pop up"),//1
		B016("TSDU008003 Admin edit status user NON ACTIVE menjadi ATCIVE validasi dengan data"),//1
		B017("TSDU008004 Admin edit kategori dengan mencentang kategori STAFF di status Admin NON ACTIVE"),//1
		B018("TSDU008005 Admin edit kategori dengan mencentang kategori LEADER di status Admin NON ACTIVE"),//1
		B020("TSDU008006 Admin edit kategori dengan menghilangkan centang kategori STAFF di status User NON ACTIVE"),//1
		B021("TSDU008007 Admin edit kategori dengan menghilangkan centang kategori LEADER di status User NON ACTIVE"),//1
		B019("TSDU008008 Admin edit kategori dengan mencentang kategori STAFF dan LEADER di status User NON ACTIVE"),//1
		B022("TSDU008009 Admin edit kategori dengan menghilangkan centang kategori STAFF dan LEADER di status User NON ACTIVE"),//1
//		1, 1,1,1,1,1,1,1,1,1
		
		B023("TSDU009001 Admin edit status user ACTIVE menjadi NON ATCIVE validasi pop up"),//1
		B024("TSDU009002 Admin edit status user ACTIVE menjadi NON ATCIVE validasi dengan data"),//1
		B025("TSDU009003 Admin edit kategori dengan mencentang kategori STAFF di status User ACTIVE"),//1
		B026("TSDU009004 Admin edit kategori dengan mencentang kategori LEADER di status User ACTIVE"),//1
		B028("TSDU009005 Admin edit kategori dengan menghilangkan centang kategori STAFF di status User ACTIVE"),//1
		B029("TSDU009006 Admin edit kategori dengan menghilangkan centang kategori LEADER di status User ACTIVE"),//1
		B027("TSDU009007 Admin edit kategori dengan mencentang kategori STAFF dan LEADER di status User ACTIVE"),//1
		B030("TSDU009008 Admin edit kategori dengan menghilangkan centang kategori STAFF dan LEADER di status User ACTIVE"),//1
//		1,1,1,1,1,1,1,1
	
		B031("TSDU010001 Admin klik icon edit password"),//1
		B032("TSDU010002 Admin edit password non active user"),//1
		B033("TSDU010003 Admin edit password active user"),//1
//		1,1,1
		
		B034("TSDU011001 Admin klik show page 10"),//1
		B035("TSDU011002 Admin klik page 1"),//1
		B036("TSDU011003 Admin klik page 2"),//1
		B037("TSDU011004 Admin klik page 3"),//1
		B038("TSDU011005 Admin klik page 4"),//1
		B039("TSDU011006 Admin klik page 5"),//1
		B040("TSDU011007 Admin klik page 6"),//1
		B041("TSDU011008 Admin klik page 7"),//1
		B042("TSDU011009 Admin klik page 8"),//1
		B043("TSDU011010 Admin klik page 9"),//1
		B044("TSDU011011 Admin klik page 10"),//1
		B045("TSDU011012 Admin klik icon <<"),//1
		B046("TSDU011013 Admin klik icon >>"),//1
//		1,1,1,1,1,1,1,1,1,1,1,1,1
		
		B047("TSDU011014 Admin klik show page 25"),//1
		B048("TSDU011015 Admin klik page 1"),//1
		B049("TSDU011016 Admin klik page 2"),//1
		B050("TSDU011017 Admin klik page 3"),//1
		B051("TSDU011018 Admin klik page 4"),//1
		B052("TSDU011019 Admin klik icon <<"),//1
		B053("TSDU011020 Admin klik icon >>"),//1
//		1,1,1,1,1,1,1
		
		B054("TSDU011021 Admin klik show page 50"),//1
		B055("TSDU011022 Admin klik page 1"),//1
		B056("TSDU011023 Admin klik page 2"),//1
		B057("TSDU011024 Admin klik icon <<"),//1
		B058("TSDU011025 Admin klik icon >>"),//1
//		1,1,1,1,1
		
		B059("TSDU011026 Admin klik show page 100"),//1
		B060("TSDU011027 Admin klik page 1"),//1
//		1,1
		
		
		B061("TSDU011028 Admin klik show page 10"),//1
		B062("TSDU011029 Admin klik page 1"),//1
		B063("TSDU011030 Admin klik page 2"),//1
		B064("TSDU011031 Admin klik page 3"),//1
		B065("TSDU011032 Admin klik page 4"),//1
		B066("TSDU011033 Admin klik page 5"),//1
		B067("TSDU011034 Admin klik page 6"),//1
		B068("TSDU011035 Admin klik page 7"),//1
		B069("TSDU011036 Admin klik page 8"),//1
		B070("TSDU011037 Admin klik page 9"),//1
		B071("TSDU011038 Admin klik page 10"),//1
		B072("TSDU011039 Admin klik icon <<"),//1
		B073("TSDU011040 Admin klik icon >>"),//1
//		1,1,1,1,1,1,1,1,1,1,1,1,1
		
		B074("TSDU011041 Admin klik show page 25"),//1
		B075("TSDU011042 Admin klik page 1"),//1
		B076("TSDU011043 Admin klik page 2"),//1
		B077("TSDU011044 Admin klik page 3"),//1
		B078("TSDU011045 Admin klik page 4"),//1
		B079("TSDU011046 Admin klik icon <<"),//1
		B080("TSDU011047 Admin klik icon >>"),//1
//		1,1,1,1,1,1,1
		
		B081("TSDU011048 Admin klik show page 50"),//1
		B082("TSDU011049 Admin klik page 1"),//1
		B083("TSDU011050 Admin klik page 2"),//1
		B084("TSDU011051 Admin klik icon <<"),//1
		B085("TSDU011052 Admin klik icon >>"),//1
//		1,1,1,1,1
		
		B086("TSDU011053 Admin klik show page 100"),//1
		B087("TSDU011054 Admin klik page 1");//1
//		1,1
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
