package dump;

import pages.Student;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
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

        System.out.println(getChromeHandle(driver));

    }

    @When("Open Firefox and Open Student")
    public void open_Firefox_and_Open_Student() throws Exception {

        navigateToStudent("firefox");
        System.out.println(getFirefoxHandle(driver));



        Set<String> s= driver.getWindowHandles();
        System.out.println(s.size());
        Iterator<String> it= s.iterator();
        System.out.println(it.next());

        while (it.hasNext())
        {
            String child= it.next();
            System.out.println(child);
            driver.switchTo().window(child);
        }

        Student st= new Student(driver);
        st.logIntoStudentPage();
       // driver.switchTo().window(parent);
        driver.getTitle();



    }
}
