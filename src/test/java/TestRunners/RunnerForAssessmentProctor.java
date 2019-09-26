package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import jdk.nashorn.internal.objects.annotations.Optimistic;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/FeatureForAssessProc.feature",
 glue = "stepDefinition")
public class RunnerForAssessmentProctor {
}
