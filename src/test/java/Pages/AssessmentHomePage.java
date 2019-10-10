package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClassForDM;

public class AssessmentHomePage extends BaseClassForDM {

    public AssessmentHomePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "hlTestAsgnLocGrade")
    private WebElement btn_LocGrade;

    @FindBy(id="hlTestAsgnStudent")
    private WebElement btn_AsgnStudent;

    @FindBy(id = "hlTestAsgnView")
    private WebElement btn_ViewAssessments;

    public void assignByLocation()
    {
        btn_LocGrade.click();
    }

    public void assignByStudent()
    {
        btn_AsgnStudent.click();
    }
    public void viewTestAssignments()
    {
        btn_ViewAssessments.click();
    }
}
