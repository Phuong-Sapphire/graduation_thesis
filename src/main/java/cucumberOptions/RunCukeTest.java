package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = "src/main/resources/features/myHaui.feature",
        glue = "stepsdefinition",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt",
                "junit:target/reports/cucumber.xml"
        }
        ,monochrome = true
)

public class RunCukeTest {

}
