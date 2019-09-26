package MultiStepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/Adeptpros/Downloads/assessments-automation-master/assessments-automation-master/Base_DM/src/test/resources/features/FeaturForMulti.feature",
glue = "stepDefinition",
tags = {@AssessProc,@Proctor})

public class RunnerForMulti {
}
