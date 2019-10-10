package testsuits.steps;

import Pages.LoginPageForDM;
import Pages.Student;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.BaseClassForDM;

import java.util.Iterator;
import java.util.Set;

public class StepperForStudent extends BaseClassForDM {

    public StepperForStudent() {
        super(driver);
    }

    @Given("Open Chrome and open DM")
    public void open_Chrome_and_open_DM() throws Exception {
        navigateTo("chrome");

    }

    @When("Open Firefox and Open Student")
    public void open_Firefox_and_Open_Student() throws Exception {

        navigateToStudent("chrome");


        Set<String> s= driver.getWindowHandles();
        Iterator<String> it= s.iterator();



        while (it.hasNext())
        {
            String child= it.next();
            driver.switchTo().window(child);
        }

        System.out.println("---------");
        System.out.println(driver.getTitle());
        System.out.println("---------");
        System.out.println(driver.getCurrentUrl());
        Student st= new Student(driver);
        st.logIntoStudentPage();



    }
}
