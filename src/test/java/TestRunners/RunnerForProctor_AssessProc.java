package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import jdk.nashorn.internal.objects.annotations.Optimistic;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:/Users/Adeptpros/Downloads/assessments-automation-master/assessments-automation-master/Base_DM/src/test/resources/features/FeatureForAssessProc.feature",
"C:/Users/Adeptpros/Downloads/assessments-automation-master/assessments-automation-master/Base_DM/src/test/resources/features/FeatureForProctoring.feature"},

glue = "stepDefinition")
public class RunnerForProctor_AssessProc {
}
