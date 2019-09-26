package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClassForDM;
import utils.Constants;

public class StudentPage extends BaseClassForDM {

    public StudentPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "txbStudentId")
    private WebElement txt_StudentId;

    @FindBy(id = "txbSessionCode1")
    private WebElement txt_SessionCode;

    @FindBy(id = "btnLogin1")
    private WebElement btn_Login;

    public void logIntoStudentPage()
    {
        txt_StudentId.sendKeys(Constants.STUDENT_ID);
        txt_SessionCode.sendKeys(Constants.SESSION_ID);
        btn_Login.click();


    }
}
