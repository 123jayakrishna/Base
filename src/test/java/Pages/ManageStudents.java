package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClassForDM;

public class ManageStudents extends BaseClassForDM {
    public ManageStudents(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "hlStudentAdd")
    private WebElement btn_AddStudent;
    public void addAStudent()
    {
        btn_AddStudent.click();
    }

    @FindBy(id = "hlStudentSearch")
    private WebElement btn_SearchStudent;
    public void searchAStudent()
    {
        btn_SearchStudent.click();
    }
}
