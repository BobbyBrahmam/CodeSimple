package myrunner;
import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/SelectFlight.feature", 
glue = {"steps"}, 
tags = {"@Regression"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
monochrome = true, 
strict = false, 
dryRun = false)

public class SuiteRunner 
{
	@AfterClass
	public static void writeExtentReport() 
	{
		 Reporter.loadXMLConfig(new File("F:\\Programming\\workspace\\SeleniumCucumberBDD\\extent-config.xml"));
		 Reporter.setSystemInfo("Brahmam", System.getProperty("user"));
	     Reporter.setSystemInfo("Time Zone", System.getProperty("timezone"));
	     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	     Reporter.setSystemInfo("Selenium", "3.7.0");
	     Reporter.setSystemInfo("Maven", "3.5.2");
	     Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}

}