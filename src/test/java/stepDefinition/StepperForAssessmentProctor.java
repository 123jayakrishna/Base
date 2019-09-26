package stepDefinition;

import Pages.BaseClassForDM;
import Pages.HomePageForDM;
import Pages.LoginPageForDM;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class StepperForAssessmentProctor extends BaseClassForDM {

    public StepperForAssessmentProctor()
    {
        super(driver);
    }

    public LoginPageForDM lPage;
    public HomePageForDM hPage;

    @Given("Open Chrome browser and navigate to DM")
    public void open_Chrome_browser_and_navigate_to_DM() {
        navigateTo();

    }

    @When("User Enter user name")
    public void user_Enter_user_name() {
        lPage= new LoginPageForDM(driver);
        lPage.setUserName();

    }

    @When("User enter password")
    public void user_enter_password() {
        lPage= new LoginPageForDM(driver);
        lPage.setPassword();

    }

    @When("User click on SignIn")
    public void user_click_on_SignIn() {
        lPage= new LoginPageForDM(driver);
        lPage.clickOnButton();

    }

    @When("User navigate to Assessment page")
    public void user_navigate_to_Assessment_page() {
        hPage= new HomePageForDM(driver);
        hPage.clickOnAssessment();

    }

    @When("user navigate back to home page")
    public void user_navigate_back_to_home_page() {
        driver.navigate().back();

    }

    @When("User navigate to Proctor page")
    public void user_navigate_to_Proctor_page() {
        hPage= new HomePageForDM(driver);
        hPage.clickOnProctor();

    }

    @Then("Browser should be closed")
    public void browser_should_be_closed() {
        driver.close();

    }
}
