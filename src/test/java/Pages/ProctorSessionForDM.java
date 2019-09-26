package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClassForDM;

public class ProctorSessionForDM extends BaseClassForDM {

    public ProctorSessionForDM(WebDriver driver)
    {
        super(driver);
    }

    public Select sel;

    @FindBy(id="addStudent")
    private WebElement btn_WalkInStudent;

    @FindBy(id="studentLookup")
    private WebElement btn_StudentLookUp;

    @FindBy(id="testevent")
    private WebElement dDown_TestEvent;

    @FindBy(id="grade")
    private WebElement dDown_Grade;

    @FindBy(id="testgroup")
    private WebElement dDown_TestGroup;

    @FindBy(id="saveTestSession")
    private WebElement dDown_CreateSession;

    @FindBy(id="sessionname")
    private WebElement txt_SessionName;


    public void clickOnAddWalkInStudent()
    {
        btn_WalkInStudent.click();
    }

    public void clickOnStudentLookUp()
    {
        btn_StudentLookUp.click();
    }

    public void selectTestEvent()
    {
        sel= new Select(dDown_TestEvent);
        sel.selectByVisibleText("Leboy's Test");
    }

    public void selectGrade()
    {
        sel= new Select(dDown_Grade);
        sel.selectByVisibleText("5 - Five");
    }

    public void setSessionId()
    {
        txt_SessionName.sendKeys("405588");
    }








}
