/*
 * Author : Runanto
 * Created date: 29/09/2022 13.00
 * Modifer:Runanto
 * Modifed date: 06/10/2022
 */

package com.sqa.psikotes.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {

		"src/main/resources/features/001LPLoginValid.feature",
		"src/main/resources/features/005LPLoginInvalid.feature",
		
		"src/main/resources/features/051APOpenPageAdminValid.feature",
		"src/main/resources/features/055APSearchDataAdminValid.feature",
		"src/main/resources/features/059APTambahDataAdminValid.feature",
		"src/main/resources/features/063APShowDataAdminValid.feature",
		"src/main/resources/features/067APShow10DataAdminValid.feature",
		"src/main/resources/features/071APShow25DataAdminValid.feature",
		"src/main/resources/features/074APShow50DataAdminValid.feature",
		"src/main/resources/features/077APShow100DataAdminValid.feature",
		"src/main/resources/features/081APResetPasswordValid.feature",
		"src/main/resources/features/084APEditDataAdminValid.feature",
		"src/main/resources/features/087APEditPasswordAdminValid.feature",
		"src/main/resources/features/091APHapusDataAdmin.feature",
		"src/main/resources/features/094APSearchDataAdminInvalid.feature",
		"src/main/resources/features/097APTambahDataAdminInvalid.feature",

		
		"src/main/resources/features/176MPOpenMPValid.feature",
		"src/main/resources/features/179MPSearchMPValid.feature",
		"src/main/resources/features/182MPaddMPValid.feature",
		"src/main/resources/features/185MPShow10DataValid.feature",
		"src/main/resources/features/188MPShow25DataValid.feature",
		"src/main/resources/features/191MPShow50DataValid.feature",
		"src/main/resources/features/194MPDeleteModulValid.feature",
		"src/main/resources/features/197MPShow100DataValid.feature",
		"src/main/resources/features/200MPAddSoalPilihanGandaValid.feature",
		"src/main/resources/features/203MPAddSoalEsaiFreeTextValid.feature",
		"src/main/resources/features/206MPAddSoalEnumValid.feature",
		"src/main/resources/features/209MPAddSoalEsaiLengthValid.feature",
		"src/main/resources/features/212MPAddSoalPilihanABValid.feature",
		"src/main/resources/features/215MPAddDeskripsiValid.feature",
		"src/main/resources/features/218MPEditDeskripsiValid.feature",
		"src/main/resources/features/221MPHapusDeskripsiValid.feature",
		"src/main/resources/features/227MPEditModulValid.feature",
		"src/main/resources/features/230MPEditSoalPilihanGandaValid.feature",
		"src/main/resources/features/233MPEditSoalKategoriEsaiValid.feature",
		"src/main/resources/features/236MPEditSoalEnumValid.feature",
		"src/main/resources/features/239MPHapusSoalValid.feature",
		"src/main/resources/features/242MPEditSoalPilihanABValid.feature",
		
		
		"src/main/resources/features/406DUOpenDUValid.feature", 
		"src/main/resources/features/409DUSearchDataValid.feature",
		"src/main/resources/features/412DUShowNonActiveValid.feature",
		"src/main/resources/features/415DUSearchDataNonActiveUserValid.feature",
		"src/main/resources/features/418DUShowActiveValid.feature",
		"src/main/resources/features/421DUSearchDataActiveUserValid.feature",
		"src/main/resources/features/424DUViewUserValid.feature",
		"src/main/resources/features/427DUEditNonActiveUserValid.feature",
		"src/main/resources/features/430DUEditActiveUserValid.feature",
		"src/main/resources/features/433DUEditPasswordUserValid.feature",
		"src/main/resources/features/436DUShowPage10NonActiveUserValid.feature",
		"src/main/resources/features/439DUShowPage25NonActiveUserValid.feature",
		"src/main/resources/features/442DUShowPage50NonActiveUserValid.feature",
		"src/main/resources/features/445DUShowPage100NonActiveUserValid.feature",
		"src/main/resources/features/448DUShowPage10ActiveUserValid.feature",
		"src/main/resources/features/451DUShowPage25ActiveUserValid.feature",
		"src/main/resources/features/454DUShowPage50ActiveUserValid.feature",
		"src/main/resources/features/457DUShowPage100ActiveUserValid.feature",
		"src/main/resources/features/460DUExportUserValid.feature",
		"src/main/resources/features/496DUSearchDataUserInvalid.feature",
		"src/main/resources/features/499DUButtonDownStatusUserInvalid.feature",
		"src/main/resources/features/552DUEditStatusUserInvalid.feature",
		"src/main/resources/features/555DUTombolXInvalid.feature",
		"src/main/resources/features/558DUEditPasswordUserInvalid.feature",
		
		
	
		"src/main/resources/features/561RPOpenReportValid.feature",
		"src/main/resources/features/564RPSearchDataReportValid.feature",
		"src/main/resources/features/586RPSearchReportInvalid.feature",
		
		"src/main/resources/features/616RAOpenRAValid.feature",
		"src/main/resources/features/619RASearchDataValid.feature",
		"src/main/resources/features/622RADeleteDataValid.feature",
		"src/main/resources/features/646RASearchRAInvalid.feature",
		"src/main/resources/features/649RATombolXInvalid.feature",
		
		
		
		"src/main/resources/features/676LOAdminLogout.feature",
		
		
	},
glue = "com.sqa.psikotes.framework.runner",
monochrome=true,
plugin = {"pretty","html:target/psikotes/htmlreport/PSIKOTESRunner.html",
//		"json:target/psikotes/jsonreport/PSIKOTESRunner.json",
//		"junit:target/psikotes/junitreport/PSIKOTESRunner.xml"
		
	})


public class TestRunner extends AbstractTestNGCucumberTests {

}

