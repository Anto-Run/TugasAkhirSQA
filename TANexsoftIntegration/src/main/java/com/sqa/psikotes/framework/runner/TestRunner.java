/*
 * Author : Runanto
 * Created date: 29/09/2022 13.00
 * Modifer:Runanto
 * Modifed date: 01/10/2022
 */

package com.sqa.psikotes.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/features/001LPLoginValid.feature",
		"src/main/resources/features/051APOpenPageAdminValid.feature",
		"src/main/resources/features/055APSearchDataAdminValid.feature",
		//"src/main/resources/features/059APTambahDataAdminValid.feature",
		"src/main/resources/features/063APShowDataAdminValid.feature",
		"src/main/resources/features/067APShow10DataAdminValid.feature",
		"src/main/resources/features/071APShow25DataAdminValid.feature",
		"src/main/resources/features/074APShow50DataAdminValid.feature",
		

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
		"src/main/resources/features/457DUShowPage100ActiveUserValid.feature"},
glue = "com.sqa.psikotes.framework.runner",
monochrome=true,
plugin = {"pretty","html:target/psikotes/htmlreport/PSIKOTESRunner.html",
		"json:target/psikotes/jsonreport/PSIKOTESRunner.json",
		"junit:target/psikotes/junitreport/PSIKOTESRunner.xml"})


public class TestRunner extends AbstractTestNGCucumberTests {

}

