package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.snippets.Snippet;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\AdactinHomePage.feature",glue="com.stepdef",monochrome=true,dryRun = false,
tags= {"~@TC02"},plugin={"pretty","junit:target/Reports/data.xml","json:target/Reports/data.json"},strict=true,snippets=SnippetType.CAMELCASE)

//plugin="usage"
public  class TestRunner {

	
	
	
	
	  @AfterClass public static void afterClass() {
	 JvmReport.genereateJVMReport(System.getProperty("user.dir")+  "\\target\\Reports\\data.json"); }
	 
	 
}