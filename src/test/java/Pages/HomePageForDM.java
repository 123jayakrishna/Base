package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    private WebElement btn_proctor;



    public void clickOnAssessment()
    {
        btn_Assessment.click();
        btn_TestEvents.click();
        System.out.println("");
    }

    public  void clickOnProctor()
    {
        btn_proctor.click();
    }
}
