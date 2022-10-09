/*
 * Author : Runanto
 * Created-date: 29-09-2022 13.00
 * Modifer:Runanto
 * Modifed date: 07/10/2022 03.00
 */

package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {
	
	/*
	 * Scene Runanto
	 */
	
/*
 * Modul : Login 
 */
	R001("TSLP001001 admin login valid click button signin"), //1
	R002("TSLP001002 admin login valid click button green username"), //1
	R003("TSLP001003 admin login valid click button green password"), //1
	R004("TSLP001004 Admin login valid dan menekan enter keyboard"), //1
	// 1, 1,1,1
	
	R005("TSLPN002001 Admin login invalid dan menekan tombol sign in"), //6
	R006("TSLPN002002 Admin login invalid dan menekan tombol enter (green button) username"), //6
	R007("TSLPN002003 Admin login invalid dan menekan tombol enter (green button) password"), //6
	//6, 6, 6
	
	/*
	 * Modul : User Management (Admin)	
	 */
	R008("TSAP001001 Admin masuk ke halaman admin"), //1
	R009("TSAP002001 Admin mencari data dengan tombol search"), //6
	R010("TSAP002002 Admin mencari data dengan  tombol enter (green button)"), //6
	R011("TSAP002003 Admin mencari data dengan tombol enter pada keyboard"), //6
	//1, 6, 6, 6
	
	R012("TSAP003001 Admin menyetujui menambahkan data akun admin"),//1
	R013("TSAP003002 Admin tidak menyetujui menambahkan data akun admin"),//1
	//1,1

	R014("TSAP004001 Admin menampilkan10 data admin"),//1
	R015("TSAP004002 Admin menampilkan25 data admin"), //1
	R016("TSAP004003 Admin menampilkan50 data admin"), //1
	R017("TSAP004004 Admin menampilkan100 data admin"),//1
	//1,1,1,1
	
	R018("TSAP005001 Admin menampilkan10 data  admin pada page ke1"),//1
	R019("TSAP005002 Admin menampilkan10 data  admin pada page ke2"),//1
	R020("TSAP005003 Admin menampilkan10 data  admin pada page ke3"), //1
	R021("TSAP005004 Admin menampilkan10 data  admin pada page ke4"),//1
	R022("TSAP005005 Admin menampilkan10 data  admin pada page ke5"),//1
	R023("TSAP005006 Admin menampilkan10 data  admin pada page ke6"),//1
	R024("TSAP005007 Admin menampilkan10 data  admin pada page ke7"),//1
	R025("TSAP005008 Admin menampilkan10 data  admin pada page ke8"),//1
	R026("TSAP005009 Admin menampilkan10 data  admin pada page ke9"),//1
	R027("TSAP005010 Admin menampilkan10 data  admin pada page ke10"),//1
	R028("TSAP005011 Admin menampilkan10 data admin pada page paling awal"), //1
	R029("TSAP005012 Admin menampilkan10 data admin pada page paling terakhir"), //1
	//1,1,1,1,1,1,1,1,1,1,1,1,
	
	R030("TSAP006001 Admin menampilkan25 data admin pada page ke1"), //1
	R031("TSAP006002 Admin menampilkan25 data admin pada page ke2"), //1
	R032("TSAP006003 Admin menampilkan25 data admin pada page ke3"), //1
	R033("TSAP006004 Admin menampilkan25 data admin pada page ke4"), //1
	R034("TSAP006005 Admin menampilkan25 data admin pada page paling awal"), //1
	R035("TSAP006006 Admin menampilkan25 data admin pada page paling terakhir"), //1
	//1,1,1,1,1,1
	
	
	R036("TSAP007001 Admin menampilkan50 data admin pada page ke1"),//1
	R037("TSAP007002 Admin menampilkan50 data admin pada page ke2"), //1
	R038("TSAP007003 Admin menampilkan50 data admin pada page >>"), //1
	R039("TSAP007004 Admin menampilkan50 data admin pada page <<"), //1
	R040("TSAP008001 Admin menampilkan100 data admin pada page ke1"),
	// 1, 1, 1, 1, 1

	R041("TSAP009001 Admin mereset passwod akun admin"),
	R042("TSAP010001 Admin mengubah satu field pada akun admin"), //4
	R043("TSAP010002 Admin mengubah dua field pada akun admin"), //6
	R044("TSAP010003 Admin mengubah tiga field pada akun admin"), //3
	R045("TSAP010004 Admin mengubah semua field pada akun admin"), //1
	//1, 4,6,3,1
	
	R046("TSAP011001 Admin tidak menyetujui edit password"), //3
	R047("TSAP011002 Admin menyetujui edit password"), //3
	R048("TSAP012001 Admin batal menghapus data"),
	R049("TSAP012002 Admin berhasil menghapus data"),
	//3,3, 1,1
	
	R051("TSAPN013001 Admin mencari data dengan tombol search"),
	R052("TSAPN013002 Admin mencari data dengan  tombol enter (green button)"),
	R053("TSAPN013003 Admin mencari data dengan tombol enter pada keyboard"),
	//3,3, 1,1
	
	R054("TSAPN014001 Admin berhasil masuk form tambah data"),//14
	//14
//	
//	/*
//	 * Scene Ayu
//	 */
	
	A001("TSMP001001 Admin buka halaman modul"),//1
	A002("TSMP002001 Admin cari data berdasarkan nama modul menggunakan enter pada keyboard"),//1
	A003("TSMP002002 Admin cari data berdasarkan nama modul menggunakan button hijau"),//1
	A004("TSMP002003 Admin cari data berdasarkan nama modul menggunakan button search"),//1
	//1, 1,1,1
	
	A005("TSMP003 Admin menambah modul"),//20
	//20
	
	
	
	A006("TSMP004001 Admin menampilkan10 data modul pada page ke1"),//1
	A007("TSMP004002 Admin menampilkan10 data modul pada page ke2"),//1
	A008("TSMP004003 Admin menampilkan10 data modul pada page ke3"),//1
	A009("TSMP004004 Admin menampilkan10 data modul pada page ke4"),//1
	A010("TSMP004005 Admin menampilkan10 data modul pada page ke5"),//1
	A011("TSMP004006 Admin menampilkan10 data modul pada page paling terakhir"),//1
	A012("TSMP004007 Admin menampilkan10 data modul pada page paling awal"),//1
	//1,1,1,1,1,1,1
	
	A013("TSMP005001 Admin menampilkan25 data modul pada page ke1"),//1
	A014("TSMP005002 Admin menampilkan25 data modul pada page terakhir"),//1
	A015("TSMP005003 Admin menampilkan25 data modul pada page ke2"),//1
	A016("TSMP005004 Admin menampilkan25 data modul pada page pertama"),//1
	A017("TSMP006001 Admin menampilkan50 data modul"),//1
	A018("TSMP006002 Admin menampilkan50 data modul pada page ke1"),//1
	A019("TSMP007 Admin Hapus modul"),//1
	A020("TSMP008001 Admin menampilkan100 data modul"),//1
	A021("TSMP008002 Admin menampilkan100 data modul pada page ke1"),//1
	//1,1,1,1,1, 1,1,1,1
	
	
	A022("TSMP009 Admin membuat soal pilihan ganda"),//12
	A024("TSMP010 Admin membuat soal Esai Free Text"),//4
	//12, 4
	
	
	
	A025("TSMP011 Admin membuat soal Enum (Ya/Tidak)"),//8
	A026("TSMP012 Admin membuat soal Esai Length"),//22
	A027("TSMP013 Admin membuat soal Pilihan AB"), //6
	//8, 22, 6
	
	A028("TSMP019001 Admin klik icon plus"),//1
	A029("TSMP019002 Admin input deskripsi soal"),//1
	A030("TSMP019003 Admin input ketentuan soal"),//1
	A031("TSMP019004 Admin input deskripsi soal dan ketentuan soal"),//1
//	1,1,1,1
	
	A032("TSMP020001 Admin klik edit deskripsi"),//1
	A034("TSMP020002 Admin edit deskripsi soal"),//1
	A035("TSMP020003 Admin edit ketentuan soal"),//1
	A036("TSMP020004 Admin edit deskripsi soal dan ketentuan soal"),//1
	A037("TSMP020005 Admin mengosongkan Deskripsi modul"),//1
	A038("TSMP020006 Admin mengosongkan Ketentuan soal"),//1
//	1,1,1,1,1,1
	
	A039("TSMP021001 Admin klik icon delete"),//1
	A040("TSMP021002 Admin delete deskripsi"),//1
//	1,1
	
	A041("TSMP018001 Admin edit dua field data modul"), //20
	A042("TSMP018002 Admin edit tiga field  data modul"), //14
	A043("TSMP018003 Admin edit empat field  data modull"), //10
	A044("TSMP018004 Admin edit lima field data modul"), //6
	A045("TSMP018005 Admin edit enam field data modul"), //3
	A046("TSMP018006 Admin edit tujuh field data modul"), //1
	//20, 14, 10, 6, 3,1
	
	A047("TSMP014 Admin ingin edit soal pilihan ganda"),//41
	A048("TSMP015001 Admin ingin edit soal esai free text"),//1
	A049("TSMP015002 Admin ingin edit soal esai length"),//21
	A050("TSMP016 Admin ingin edit soal enum"),//5	
	A051("TSMP007 Admin Hapus modul"),//1
	//	41, 1, 21, 5, 1
	
	A052("TSMP017001 Admin ingin menghapus soal pilihan ganda"),//1
	A053("TSMP017002 Admin ingin menghapus soal esai free text"),//1
	A054("TSMP017003 Admin ingin menghapus soal enum"),//1
	A055("TSMP017004 Admin ingin menghapus soal esai length"),//1
	A056("TSMP017005 Admin ingin menghapus soal pilihan ab"),//1
	//1,1,1,1,1
	
	A057("TSMP022 Admin ingin edit soal pilihan ab"), //7
	//7
	
	
	/*
	 * Scene Bagas
	 * 
	 */
	B001("TSDU001001 Admin membuka data users page"),//1
	B002("TSDU002 Admin mencari name, email, dan status dengan tombol search"),//3
	B003("TSDU002 Admin mencari name, email, dan status data dengan tombol hijau"),//3
	B004("TSDU002 Admin mencari name, email, dan status data dengan enter"),//3
	// 1, 3,3,3
	
	B005("TSDU003001 Admin menampilkan data dengan status NON ACTIVE"),//1	
	B006("TSDU004001 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol search"),//2
	B007("TSDU004002 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol hijau"),//2
	B008("TSDU004003 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan enter"),//2
	B009("TSDU005001 Admin menampilkan data dengan status ACTIVE"),//1
	//1, 2, 2,2,1, 
	
	B010("TSDU006001 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan tombol search"),//2
	B011("TSDU006002 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan tombol hijau"),//2
	B012("TSDU006003 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan enter"),//2
	B013("TSDU007 Admin ingin melihat detail salah satu Data Users"),//1
   // 2,2,2, 1,

	
	B014("TSDU008001 Admin klik  icon edit"),//1
	B015("TSDU008002 Admin edit status user NON ACTIVE menjadi ATCIVE validasi pop up"),//1
	B016("TSDU008003 Admin edit status user NON ACTIVE menjadi ATCIVE validasi dengan data"),//1
	B017("TSDU008004 Admin edit kategori dengan mencentang kategori STAFF di status Admin NON ACTIVE"),//1
	B018("TSDU008005 Admin edit kategori dengan mencentang kategori LEADER di status Admin NON ACTIVE"),//1
	B020("TSDU008006 Admin edit kategori dengan menghilangkan centang kategori STAFF di status User NON ACTIVE"),//1
	B021("TSDU008007 Admin edit kategori dengan menghilangkan centang kategori LEADER di status User NON ACTIVE"),//1
	B019("TSDU008008 Admin edit kategori dengan mencentang kategori STAFF dan LEADER di status User NON ACTIVE"),//1
	B022("TSDU008009 Admin edit kategori dengan menghilangkan centang kategori STAFF dan LEADER di status User NON ACTIVE"),//1
	//1,1,1,1,1,1,1,1,1,
	
	B023("TSDU009001 Admin edit status user ACTIVE menjadi NON ATCIVE validasi pop up"),//1
	B024("TSDU009002 Admin edit status user ACTIVE menjadi NON ATCIVE validasi dengan data"),//1
	B025("TSDU009003 Admin edit kategori dengan mencentang kategori STAFF di status User ACTIVE"),//1
	B026("TSDU009004 Admin edit kategori dengan mencentang kategori LEADER di status User ACTIVE"),//1
	B028("TSDU009005 Admin edit kategori dengan menghilangkan centang kategori STAFF di status User ACTIVE"),//1
	B029("TSDU009006 Admin edit kategori dengan menghilangkan centang kategori LEADER di status User ACTIVE"),//1
	B027("TSDU009007 Admin edit kategori dengan mencentang kategori STAFF dan LEADER di status User ACTIVE"),//1
	B030("TSDU009008 Admin edit kategori dengan menghilangkan centang kategori STAFF dan LEADER di status User ACTIVE"),//1
	//1,1,1,1,1,1,1,1
	
	B031("TSDU010001 Admin klik icon edit password"),//1
	B032("TSDU010002 Admin edit password non active user"),//1
	B033("TSDU010003 Admin edit password active user"),//1
	//1,1,1,
	
	B034("TSDU011001 Admin klik show page 10 NON ACTIVE User"),//1
	B035("TSDU011002 Admin klik page 1 NON ACTIVE User"),//1
	B036("TSDU011003 Admin klik page 2 NON ACTIVE User"),//1
	B037("TSDU011004 Admin klik page 3 NON ACTIVE User"),//1
	B038("TSDU011005 Admin klik page 4 NON ACTIVE User"),//1
	B039("TSDU011006 Admin klik page 5 NON ACTIVE User"),//1
	B040("TSDU011007 Admin klik page 6 NON ACTIVE User"),//1
	B041("TSDU011008 Admin klik page 7 NON ACTIVE User"),//1
	B042("TSDU011009 Admin klik page 8 NON ACTIVE User"),//1
	B043("TSDU011010 Admin klik page 9 NON ACTIVE User"),//1
	B044("TSDU011011 Admin klik page 10 NON ACTIVE User"),//1
	B045("TSDU011012 Admin klik icon << NON ACTIVE User"),//1
	B046("TSDU011013 Admin klik icon >> NON ACTIVE User"),//1
	// 1,1,1,1,1,1,1,1,1,1,1,1,1,
	
	B047("TSDU011014 Admin klik show page 25 NON ACTIVE User"),//1
	B048("TSDU011015 Admin klik page 1 NON ACTIVE User"),//1
	B049("TSDU011016 Admin klik page 2 NON ACTIVE User"),//1
	B050("TSDU011017 Admin klik page 3 NON ACTIVE User"),//1
	B051("TSDU011018 Admin klik page 4 NON ACTIVE User"),//1
	B052("TSDU011019 Admin klik icon << NON ACTIVE User"),//1
	B053("TSDU011020 Admin klik icon >> NON ACTIVE User"),//1
	// 1,1,1,1,1,1,1,
	
	B054("TSDU011021 Admin klik show page 50 NON ACTIVE User"),//1
	B055("TSDU011022 Admin klik page 1 NON ACTIVE User"),//1
	B056("TSDU011023 Admin klik page 2 NON ACTIVE User"),//1
	B057("TSDU011024 Admin klik icon << NON ACTIVE User"),//1
	B058("TSDU011025 Admin klik icon >> NON ACTIVE User"),//1	
	B059("TSDU011026 Admin klik show page 100 NON ACTIVE User"),//1
	B060("TSDU011027 Admin klik page 1 NON ACTIVE User"),//1
	// 1,1,1,1,1, 1, 1,
	
	B061("TSDU011028 Admin klik show page 10 ACTIVE User"),//1
	B062("TSDU011029 Admin klik page 1 ACTIVE User"),//1
	B063("TSDU011030 Admin klik page 2 ACTIVE User"),//1
	B064("TSDU011031 Admin klik page 3 ACTIVE User"),//1
	B065("TSDU011032 Admin klik page 4 ACTIVE User"),//1
	B066("TSDU011033 Admin klik page 5 ACTIVE User"),//1
	B067("TSDU011034 Admin klik page 6 ACTIVE User"),//1
	B068("TSDU011035 Admin klik page 7 ACTIVE User"),//1
	B069("TSDU011036 Admin klik page 8 ACTIVE User"),//1
	B070("TSDU011037 Admin klik page 9 ACTIVE User"),//1
	B071("TSDU011038 Admin klik page 10 ACTIVE User"),//1
	B072("TSDU011039 Admin klik icon << ACTIVE User"),//1
	B073("TSDU011040 Admin klik icon >> ACTIVE User"),//1
	// 1,1,1,1,1,1,1,1,1,1,1,1,1,
	
	B074("TSDU011041 Admin klik show page 25 ACTIVE User"),//1
	B075("TSDU011042 Admin klik page 1 ACTIVE User"),//1
	B076("TSDU011043 Admin klik page 2 ACTIVE User"),//1
	B077("TSDU011044 Admin klik page 3 ACTIVE User"),//1
	B078("TSDU011045 Admin klik page 4 ACTIVE User"),//1
	B079("TSDU011046 Admin klik icon << ACTIVE User"),//1
	B080("TSDU011047 Admin klik icon >> ACTIVE User"),//1
	// 1,1,1,1,1,1,1,
	
	B081("TSDU011048 Admin klik show page 50 ACTIVE User"),//1
	B082("TSDU011049 Admin klik page 1 ACTIVE User"),//1
	B083("TSDU011050 Admin klik page 2 ACTIVE User"),//1
	B084("TSDU011051 Admin klik icon << ACTIVE User"),//1
	B085("TSDU011052 Admin klik icon >> ACTIVE User"),//1	
	B086("TSDU011053 Admin klik show page 100 ACTIVE User"),//1
	B087("TSDU011054 Admin klik page 1 ACTIVE User"),//1
	// 1,1,1,1,1,1,1,
	
	
	
	B088("TSDU012001 Admin export semua NON ACTIVE User"),//1
	B089("TSDU012002 Admin export NON ACTIVE user berdasarkan name, email"),//2
	B090("TSDU012003 Admin export semua ACTIVE User"),//1
	B091("TSDU012002 Admin export ACTIVE user berdasarkan name, email"),//2
	// 1,2,1,2, 
	
	B092("TSDUN001001 Admin search field kosong pada status NON ACTIVE"),//1
	B093("TSDUN001002 Admin search dengan value kombinasi pada status NON ACTIVE"),//1
	B094("TSDUN001003 Admin search field kosong pada status ACTIVE"),//1
	B095("TSDUN001004 Admin search dengan value kombinasi pada status ACTIVE"),//1
	// 1,1,1,1, 
	
	B096("TSDUN002001 Admin klik icon panah di sebelah kanan status User NON ACTIVE"),//1
	B097("TSDUN002002 Admin klik icon panah di sebelah kanan status User NON ACTIVE dengan search field diisi data"),//1
	B098("TSDUN002003 Admin klik icon panah di sebelah kanan status User ACTIVE"),//1
	B099("TSDUN002002 Admin klik icon panah di sebelah kanan status User ACTIVE dengan search field diisi data"),//1
	// 1,1,1,1,
	
	B100("TSDUN003001 Admin edit status NON ACTIVE dengan value (pilih)"),//1
	B101("TSDUN003002 Admin edit status ACTIVE dengan value (pilih)"),//1
	B102("TSDUN004001 Admin klik tombol X di pop up View"),//1
	B103("TSDUN004002 Admin klik tombol X di pop up Edit user"),//1
	B104("TSDUN004003 Admin klik tombol X di pop up Edit Password"),//1
	// 1,1, 1,1,1,
	
	B105("TSDUN005001 Admin edit password user dengan field kosong"),//1
	B106("TSDUN005002 Admin edit password user dengan value kurang dari 9 karakter"),//1
	B107("TSDUN005003 Admin edit password user dengan field kosong"),//1
	B108("TSDUN005004 Admin edit password user dengan value kurang dari 9 karakter"),//1
	// 1,1,1,1,

	B109("TSRP001001 Admin membuka halaman report"),//1
	B110("TSRP002001 Admin mencari data report"),//1
	B111("TSRP002002 Admin export report"),//1
	B112("TSRPN001 Search Report invalid"),//1
	// 1,1,1,1
	
	
	B113("TSRA001001 Admin membuka remove activity page"),//1
	B114("TSRA002001 Admin mencari data berdasarkan NIK, Nama, Email, Telpon"),//4	
	B115("TSRA003001 Admin klik icon delete"),//1
	B116("TSRA003002 Admin delete data"),//1
	B117("TSRAN001001 Admin mencari data berdasarkan Value kosong, kombinasi, nilai, tipe modul, dan nama modul"),//5
	B118("TSRAN002001 Admin klik tombol X"),//1
	// 1, 4, 1, 1, 5, 1, 
	
	
	R670("TSLO002001N Admin membatalkan logout dari website"),
	R671("TSLO002002N Admin membatalkan logout dari website"),
	R672("TSLO002002 Admin berhasil logout dari website");
	//1,1,1
	
	
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
