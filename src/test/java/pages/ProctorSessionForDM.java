package pages;

import org.openqa.selenium.By;
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
    public static String sessionID=null;

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

    @FindBy(id = "testlevel")
    private WebElement dDown_Level;

    @FindBy(id="saveTestSession")
    private WebElement dDown_CreateSession;

    @FindBy(id="sessionname")
    private WebElement txt_SessionName;

    @FindBy(id = "subtest")
    private WebElement dDown_Battery;

    @FindBy(id = "saveTestSession")
    private WebElement btn_CreateSession;

    @FindBy(id = "info_sessionCode200830")
    private WebElement btn_SessionCode;


    public void clickOnAddWalkInStudent()
    {
        btn_WalkInStudent.click();
    }

    public void clickOnStudentLookUp()
    {
        btn_StudentLookUp.click();
    }

    public void selectTestEvent(String testEvent)
    {
        sel= new Select(dDown_TestEvent);
        sel.selectByVisibleText(testEvent);
    }

    public void selectGrade(String gradeName)
    {
        sel= new Select(dDown_Grade);
        sel.selectByVisibleText(gradeName);
    }

    public void selectLevel(String level)
    {
        sel= new Select(dDown_Level);
        sel.selectByVisibleText(level);
    }


    public void selectTestGroup(String group)
    {
        sel= new Select(dDown_TestGroup);
        sel.selectByVisibleText(group);
    }

    public void selectBattery(String battery)
    {
        sel= new Select(dDown_Battery);
        sel.selectByVisibleText(battery);
    }

    public void setSessionId(String sessionID)
    {
        txt_SessionName.sendKeys(sessionID);
    }

    public void createSession()
    {
        btn_CreateSession.click();
    }

    public void openCreatedSession(String sessionName)
    {
        driver.findElement(By.xpath("//a[text()='"+sessionName+"']")).click();
    }

    public String captureSessionCode(String sessionName)
    {
        sessionID=driver.findElement(By.xpath("//td[text()='"+sessionName+"']/../td[7]")).getText();
        return sessionID;

    }

    public void approveStudent(String studentName)
    {
        driver.findElement(By.xpath("//a[text()='"+studentName+"']/../../td/div/div/img[@title='Approve Student']")).click();
    }

    public void denyStudent(String studentName)
    {
        driver.findElement(By.xpath("//a[text()='"+studentName+"']/../../td/div/div/img[@title='Deny Student']")).click();
    }




}
