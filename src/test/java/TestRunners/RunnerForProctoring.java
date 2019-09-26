package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/FeatureForProctoring.feature",
        glue = {"stepDefinition"}
)
public class RunnerForProctoring {

}
