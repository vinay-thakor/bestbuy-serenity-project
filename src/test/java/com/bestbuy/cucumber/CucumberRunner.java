package com.bestbuy.cucumber;

import com.bestbuy.testbase.TestBase;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
//        features = ".",
        features = "src/test/resources/feature/",
        //single slash at the end of the path of feature package will run all the feature files present inside it
//        features = "src/test/resources/feature/categories.feature",
        plugin = {"json:target/RunCuke/cucumber.json", "pretty", "html:target/cucumber-report/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"},
        monochrome = true
//        tags = {"@Sanity"}
)

public class CucumberRunner extends TestBase {

    @AfterClass
    public static void setUp() {


        String projectPath = System.getProperty("user.dir");
        //generates Extent report in the given path
        String reportConfigPath = projectPath + "/src/test/resources/extentreport/extent-config.xml";
        //using the Reporter from cucumber.Listener
        Reporter.loadXMLConfig(reportConfigPath);

        //The below code generates details of environment information
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        //generic info of the machine
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        //selenium version
        Reporter.setSystemInfo("Selenium Version", "3.141.59");
        //maven version
        Reporter.setSystemInfo("Maven Version", "3.5.2");
        //java version
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }
}

