package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(  // en basit Rapor sekli
        tags = "@SmokeTest", // hangi senaryolarda bu etiket varsa onlari calistiracak
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin= {"html:target/site/cucumber-pretty.html"}
)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
