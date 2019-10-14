package dump;

import utils.BaseClassForDM;
import pages.HomePageForDM;
import pages.LoginPageForDM;
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
    public void open_Chrome_browser_and_navigate_to_DM() throws Exception {
        navigateTo("firefox");
        takeAScreenShot(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @When("User Enter user name")
    public void user_Enter_user_name() throws Exception{
        lPage= new LoginPageForDM(driver);
        lPage.setUserName();
        takeAScreenShot(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @When("User enter password")
    public void user_enter_password() throws Exception{
        lPage= new LoginPageForDM(driver);
        lPage.setPassword();
        takeAScreenShot(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @When("User click on SignIn")
    public void user_click_on_SignIn() throws Exception{
        lPage= new LoginPageForDM(driver);
        lPage.clickOnButton();
        System.out.println("Take screenShot");
        takeAScreenShot(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @When("User navigate to Assessment page")
    public void user_navigate_to_Assessment_page() throws Exception{
        hPage= new HomePageForDM(driver);
        hPage.clickOnAssessment();
        takeAScreenShot(new Object(){}.getClass().getEnclosingMethod().getName());

    }

    @When("user navigate back to home page")
    public void user_navigate_back_to_home_page() {
        driver.navigate().back();
    }

    @When("User navigate to Proctor page")
    public void user_navigate_to_Proctor_page() throws Exception{
        hPage= new HomePageForDM(driver);
        hPage.clickOnProctor();
        takeAScreenShot(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Then("Browser should be closed")
    public void browser_should_be_closed() {
        driver.close();
    }
}
