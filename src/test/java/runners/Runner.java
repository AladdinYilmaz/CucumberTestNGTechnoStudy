package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features="src/test/resources",
        glue="stepDefs",
        tags="@login"  ,

        dryRun= false
)





public class Runner extends AbstractTestNGCucumberTests {
}
