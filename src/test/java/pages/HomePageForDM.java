package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClassForDM;

public class HomePageForDM extends BaseClassForDM {

    public HomePageForDM(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Overview')]/../../li/a[contains(text(),'Assessments')]")
    private WebElement btn_Assessment;

    @FindBy(xpath = "//a[contains(text(),'Assessments')]/../ul/li/a")
    private WebElement btn_TestEvents;

    @FindBy(xpath = "//a[contains(text(),'Assessments')]/../../li/a[contains(text(),'Procto')]")
    private WebElement btn_proctorScanning;

    @FindBy(xpath = "//a[contains(text(),'Proctoring/Scanning')]/../ul/li/a[text()='Proctoring']")
    private WebElement btn_Proctoring;

    @FindBy(xpath = "//a[text()='Resources']/../a[text()='Sign out']")
    private WebElement btn_SignOut;



    public void clickOnAssessment()
    {
        btn_Assessment.click();
        btn_TestEvents.click();
    }

    public  void clickOnProctor()
    {
        btn_proctorScanning.click();
        btn_Proctoring.click();

    }
    public void signOutFromDM()
    {
        btn_SignOut.click();
    }
}
