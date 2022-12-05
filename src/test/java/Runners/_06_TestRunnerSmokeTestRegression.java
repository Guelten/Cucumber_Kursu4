package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression or @SmokeTest", // hangi senaryolarda bu (@Regression or @SmokeTest) etiket varsa onlari calistiracak
        // or yerine and yazilirsa hem smoke hem de regression tag i olanlari calistiriyor.
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"})

public class _06_TestRunnerSmokeTestRegression extends AbstractTestNGCucumberTests{

}
