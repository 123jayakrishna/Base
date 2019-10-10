package testsuits.steps;

import Pages.*;
import utils.BaseClassForDM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class StepperForSearchTestEvent extends BaseClassForDM {

    HomePageForDM hPage;
    TestOverViewPage tOverPage;
    LoginPageForDM lPage;
    AssessmentHomePage aHomePage;
    LocationAndGradePage loGPage;


    public StepperForSearchTestEvent()
    {
        super(driver);
    }

    @Given("navigate to DM")
    public void navigate_to_DM() throws Exception {
        navigateTo("chrome");
        lPage= new LoginPageForDM(driver);
        lPage.setUserName();
        lPage.setPassword();
        lPage.clickOnButton();

    }

    @When("click on Assessment button")
    public void click_on_Assessment_button() {
        hPage= new HomePageForDM(driver);
        hPage.clickOnAssessment();

    }

    @Then("manage Test event")
    public void manage_Test_event() {
        tOverPage= new TestOverViewPage(driver);
        tOverPage.clickOnAssign("sdffg");
        driver.close();
    }
}
