package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        dryRun = false,
        monochrome = true,
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "junit:target/cucumber-report/cucumber.xml",
                "message:target/cucumber-report/cucumber.ndjson",
                "html:target/result.html",
                "me.jvt.cucumber.report.PrettyReports:report"},
        features = "src/test/resources/feature/SauceLab.feature",
        glue = {"step", "hook"},
        tags = "@EndToEndProduct",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerClass extends AbstractTestNGCucumberTests {

}
