package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        dryRun = true,
       // monochrome = true,
        dryRun= true,
        plugin = {        		
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "junit:target/cucumber-report/cucumber.xml",
                "message:target/cucumber-report/cucumber.ndjson",
                "html:target/result.html",
                "me.jvt.cucumber.report.PrettyReports:report"},
        features = "src/test/resources",
        glue = {"steps", "hooks"},
        tags = "@SauceLab",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
