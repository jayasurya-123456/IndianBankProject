package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.util.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\authentication.feature",
glue="org.stepdefinition",dryRun=false
,snippets = SnippetType.UNDERSCORE,
plugin={"html:target\\Reports",
		"junit:target\\Reports\\cucumber.xml",
		"json:target\\Reports\\output.json"})
public class TestRunnerClass {
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\output.json");

	}
}


