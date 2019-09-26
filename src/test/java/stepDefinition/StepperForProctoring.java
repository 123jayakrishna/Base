package stepDefinition;

import Pages.BaseClassForDM;
import Pages.HomePageForDM;
import Pages.LoginPageForDM;
import Pages.ProctorSessionForDM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepperForProctoring extends BaseClassForDM {
    public LoginPageForDM lPage;
    public HomePageForDM hPage;
    public ProctorSessionForDM pSessPage;

    public StepperForProctoring()
    {
        super(driver);
    }

    @Given("open chrome browser")
    public void open_chrome_browser() throws Exception {
        navigateTo();

    }

    @When("Login into Data Manager site")
    public void login_into_Data_Manager_site() {


    }

    @When("Enter username")
    public void enter_username() {
        lPage= new LoginPageForDM(driver);
        lPage.setUserName();

    }

    @When("enter password")
    public void enter_password() {
        lPage= new LoginPageForDM(driver);
        lPage.setPassword();


    }

    @When("Click on signIn")
    public void click_on_signIn() {
        lPage= new LoginPageForDM(driver);
        lPage.clickOnButton();

    }

    @When("Goto proctor page")
    public void goto_proctor_page() {
        hPage= new HomePageForDM(driver);
        hPage.clickOnProctor();


    }

    @Then("Create a Test Session")
    public void create_a_Test_Session() {
        pSessPage= new ProctorSessionForDM(driver);
        pSessPage.selectTestEvent();
        pSessPage.selectGrade();
        pSessPage.setSessionId();
        driver.close();

    }



}
