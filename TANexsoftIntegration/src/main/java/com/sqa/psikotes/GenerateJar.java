package com.sqa.psikotes;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.cli.Main;

public class GenerateJar {

	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			Main.main(new String[]
			{
				"-g","com.sqa.psikotes.framework.runner",
				"classpath:features",
				"-p","pretty",
				"-p","html:target/psikotes/htmlreport/PSIKOTESRunner.html",
				"-p","json:target/psikotes/jsonreport/PSIKOTESRunner.json",
				"-p","junit:target/psikotes/junitreport/PSIKOTESRunner.xmll",
				"-m"
			});
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Main Class Execption : "+e);
		}
	}
	
}