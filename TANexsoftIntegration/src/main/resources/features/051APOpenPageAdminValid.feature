#Author: Runanto
#Created_date: 29-09-2022 11.55
#Modified_date: 
Feature: TSAP001 Masuk halaman admin

	Scenario: TSAP001001 Admin masuk ke halaman admin
		Given TSAP001001 Admin berhasil masuk halaman utama web
		When TSAP001001 Admin klik Menu User Management
		And TSAP001001 Admin klik tombol admin
		Then TSAP001001 Admin berhasil masuk ke halaman admin psikotes
			