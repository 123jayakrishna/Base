package testsuits.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseClassForDM;

import java.util.Iterator;
import java.util.Set;

public class studentTest_Browsers extends BaseClassForDM{

    public HomePageForDM hPage;
    public ProctorSessionForDM pSession;
    public LoginPageForDM lPage;
    public Student stPage;
    public String str;
    public ExamPageForStudent examPage;

    public studentTest_Browsers() {
        super(driver);
    }



    @Given("Proctor setup a test in chrome browser")
    public void proctor_setup_a_test_in_chrome_browser() throws Exception {
        navigateTo("chrome");
        lPage= new LoginPageForDM(driver);

        lPage.setUserName();
        lPage.setPassword();
        lPage.clickOnSignIn();

    }

    @When("Proctor click on Proctoring")
    public void proctor_click_on_Proctoring() {
        hPage = new HomePageForDM(driver);
        hPage.clickOnProctor();

    }

    @When("Proctor create a session")
    public void proctor_create_a_session() {
        pSession= new ProctorSessionForDM(driver);
        pSession.selectTestEvent("Look Up for Flex");
        pSession.selectGrade("4 - Four");
        pSession.selectTestGroup("Interim Assessments for Math Form A");
        pSession.selectLevel("Grade 4");
        pSession.selectBattery("MATHEMATICS PART 1");
        pSession.setSessionId("XYZ123");
        pSession.createSession();
    }

    @When("Proctor click on created session")
    public void proctor_click_on_created_session() {
        pSession= new ProctorSessionForDM(driver);
        pSession.openCreatedSession("XYZ123");
        str= pSession.captureSessionCode("XYZ123");
        System.out.println("-----"+str+"------");
        //pSession.approveStudent("OConnor");

    }

    @When("Open student browser")
    public void open_student_browser() throws Exception {

        navigateToStudent("chrome");
        Set<String> s= driver.getWindowHandles();
        Iterator<String> it= s.iterator();

        while (it.hasNext())
        {
            String child= it.next();
            driver.switchTo().window(child);
        }

        stPage= new Student(driver);
        pSession= new ProctorSessionForDM(driver);
        stPage.setStudentID("400");
        WebElement ssCode= driver.findElement(By.id("txbSessionCode1"));
        JavascriptExecutor jsExe= (JavascriptExecutor)driver;
        jsExe.executeScript("arguments[0].value='"+str+"';",ssCode);
        stPage.clickonLogin();


    }

    @Then("Login into student page")
    public void login_into_student_page() {
        examPage= new ExamPageForStudent(driver);
        examPage.clickOnYes();




    }


}
