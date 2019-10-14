package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClassForDM;

public class TestOverViewPage extends BaseClassForDM {

    public TestOverViewPage(WebDriver driver)
    {
        super(driver);
    }


    @FindBy(id = "btnCreateTestEvent")
    private WebElement btn_newTestEvent;

    @FindBy(id = "btnSearch")
    private WebElement btn_search;

    @FindBy(id = "btnClose")
    private WebElement btn_close;

    @FindBy(id = "btnEditTestEvent")
    private WebElement btn_Edit;

    @FindBy(id = "btnAssign")
    private WebElement btn_Assign;

    @FindBy(id = "btnDownloadRoster")
    private WebElement btn_DownloadRoster;







    public void createNewTestEvent()
    {
        btn_newTestEvent.click();
    }


    public void clickOnSearch()
    {
        btn_search.click();
    }

    public void clickOnManage(String TestEventName)
    {
       driver.findElement(By.xpath("//a[text()='"+TestEventName+"']/../../td/div/a[text()='Manage']")).click();
    }

    public void clickOnAssign(String TestEventName)
    {
        driver.findElement(By.xpath("//a[text()='"+TestEventName+"']/../../td/div/a[text()='Assign']")).click();
    }
    public void clickOnEdit()
    {
        btn_Edit.click();
    }

    public void clickOnAssign()
    {
        btn_Assign.click();
    }

    public void downloadRoaster()
    {
        btn_DownloadRoster.click();
    }

    public void clickOnClose()
    {
        btn_close.click();
    }





}
