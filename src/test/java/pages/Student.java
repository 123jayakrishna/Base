package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClassForDM;

public class Student extends BaseClassForDM {

    public Student(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "txbStudentId")
    private WebElement txt_StudentId;

    @FindBy(id = "txbSessionCode1")
    private WebElement txt_SessionCode;

    @FindBy(id = "btnLogin1")
    private WebElement btn_Login;



    public void setStudentID(String ID)
    {
        txt_StudentId.sendKeys(ID);
    }

    public void setSessionCode(String code) throws Exception {

        txt_SessionCode.click();
        txt_SessionCode.clear();
        Thread.sleep(3000);
        txt_SessionCode.sendKeys(code);
    }

    public void clickonLogin()
    {
        btn_Login.click();
    }

    public void clickOnSessionCode()
    {
        txt_SessionCode.click();
    }

}
