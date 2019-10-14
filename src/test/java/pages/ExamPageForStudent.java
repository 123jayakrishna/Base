package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.security.acl.AclEntryImpl;
import utils.BaseClassForDM;

public class ExamPageForStudent extends BaseClassForDM {
    public ExamPageForStudent(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[text()='Yes']")
    private WebElement btn_Yes;

    @FindBy(xpath = "//span[text()='No']")
    private WebElement btn_No;

    public void clickOnYes()
    {
        btn_Yes.click();
    }

    public void clickOnNo()
    {
        btn_No.click();
    }




}
