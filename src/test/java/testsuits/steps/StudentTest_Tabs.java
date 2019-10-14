package testsuits.steps;

import config.Constants;
import config.WebDriverCommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;
import utils.BaseClassForDM;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class StudentTest_Tabs extends BaseClassForDM {
    public HomePageForDM hPage;
    public ProctorSessionForDM pSession;
    public LoginPageForDM lPage;
    public Student stPage;
    public String str;
    public Set<String> s;
    public Iterator<String> it;
    public String parent;
    public String child;
    public ExamPageForStudent exPage;

    public StudentTest_Tabs() {
        super(driver);
    }

    @Given("Teacher is in tab{int}")
    public void teacher_is_in_tab(Integer int1) throws Exception {
        navigateTo("chrome");
        lPage= new LoginPageForDM(driver);
        lPage.setUserName();
        lPage.setPassword();
        lPage.clickOnSignIn();

    }

    @When("Teacher click on Proctoring")
    public void teacher_click_on_Proctoring() {
       hPage= new HomePageForDM(driver);
       hPage.clickOnProctor();

    }

    @When("Teacher create a session")
    public void teacher_create_a_session() {


    }

    @When("Teacher click on created session")
    public void teacher_click_on_created_session() {
        pSession= new ProctorSessionForDM(driver);
        pSession.selectTestEvent("Look Up for Flex");
        pSession.selectGrade("4 - Four");
        pSession.selectTestGroup("Interim Assessments for Math Form A");
        pSession.selectLevel("Grade 4");
        pSession.selectBattery("MATHEMATICS PART 1");
        pSession.setSessionId("XYZ123");
        pSession.createSession();
        pSession.openCreatedSession("XYZ123");
        str= pSession.captureSessionCode("XYZ123");
        System.out.println("-----"+str+"------");

    }

    @When("Open student tab")
    public void open_student_tab() throws Exception {
        Robot robo= new Robot();
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_T);
        robo.keyRelease(KeyEvent.VK_T);
        robo.keyRelease(KeyEvent.VK_CONTROL);
         s= driver.getWindowHandles();
        System.out.println(s);
        it=s.iterator();
        parent=it.next();
        child=it.next();
        System.out.println(parent);
        System.out.println(child);
        driver.switchTo().window(child);
        driver.get(Constants.STUDENT_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        stPage= new Student(driver);
        stPage.setStudentID("400");
        WebElement ssCode= driver.findElement(By.id("txbSessionCode1"));
        JavascriptExecutor jsExe= (JavascriptExecutor)driver;
        jsExe.executeScript("arguments[0].value='"+str+"';",ssCode);
        stPage.clickonLogin();

    }

    @When("Go back to teacher tab")
    public void go_back_to_teacher_tab() throws InterruptedException {
        exPage= new ExamPageForStudent(driver);
        exPage.clickOnYes();
        driver.switchTo().window(parent);
        Thread.sleep(3000);
        pSession= new ProctorSessionForDM(driver);
        pSession.approveStudent("OConnor");



    }

    @Then("Go back to student again")
    public void go_back_to_student_again() {
        driver.switchTo().window(child);


    }



}
