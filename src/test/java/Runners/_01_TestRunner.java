package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"},  // buraya feature files in path i
        // (_01_Login.feature path i alabimk icin "sag tiklatip "Copy Path/Reference" tiklat ve sonra "Path From Content Root.."
        // tikla ve paranteslerin arasina yapistir.
        glue = {"StepDefinitions"} // Step definitions in klasörü yaziliyor
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {

}
