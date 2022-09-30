//Author : Runanto
//Created date: 29/09/2022 13.00
//Modifer:Runanto
//Modifed date: 30/09/2022 15.00

package com.sqa.psikotes.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/features/001LPLoginValid.feature", 
		"src/main/resources/features/051APOpenPageAdminValid.feature",
		"src/main/resources/features/176MPOPenMPValid.feature",
		"src/main/resources/features/179MPSearchMPValid.feature",
		"src/main/resources/features/406DUOpenDUValid.feature", 
		"src/main/resources/features/409DUSearchDataValid.feature"},
glue = "com.sqa.psikotes.framework.runner",
monochrome=true,
plugin = {"pretty","html:target/psikotes/htmlreport/PSIKOTESRunner.html",
		"json:target/psikotes/jsonreport/PSIKOTESRunner.json",
		"junit:target/psikotes/junitreport/PSIKOTESRunner.xml"})


public class TestRunner extends AbstractTestNGCucumberTests {

}

