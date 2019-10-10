package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClassForDM;

public class AdministrationPage extends BaseClassForDM {

    public AdministrationPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Reports')]/../../li/a[contains(text(),'Admini')]")
    private WebElement btn_Admin;
    public void clickOmAdmin()
    {
        btn_Admin.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Admini')]/../ul/li/a[text()='Manage Students']")
    private WebElement btn_ManageStudents;
    public void clickOnManageStudents()
    {
        btn_ManageStudents.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Admini')]/../ul/li/a[text()='Manage Staff']")
    private WebElement btn_ManageStaff;
    public void clickOnManageStaff()
    {
        btn_ManageStaff.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Admini')]/../ul/li/a[text()='Manage Rostering']")
    private WebElement btn_ManageRoaster;
    public void clickOnManageRoaster()
    {
        btn_ManageRoaster.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Admini')]/../ul/li/a[text()='Manage Reports Access']")
    private WebElement btn_ManageReports;
    public void clickOnManageReports()
    {
        btn_ManageReports.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Admini')]/../ul/li/a[text()='Manage Testing Activity']")
    private WebElement btn_ManageTestActivity;
    public void clickOnManageTestingActivity()
    {
        btn_ManageTestActivity.click();
    }
}
