package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClassForDM;

public class LocationAndGradePage extends BaseClassForDM {

    public LocationAndGradePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "selTestMode")
    private WebElement dDown_Administration;

    public void selectAdministrationMode()
    {
        Select sel= new Select(dDown_Administration);
        sel.selectByVisibleText("Online Testing");
    }
    /*------------------------------------------------------------------------------------------------*/

    @FindBy(xpath = "//label[text()='3 - Three']/../../td/label/div/label[text()='Operations & Algebraic Thinking']/input")
    private WebElement box_3_Operations;
    public void select_3_Operations()
    {
        box_3_Operations.click();
    }

    @FindBy(xpath = "//label[text()='3 - Three']/../../td/label/div/label[text()='Number & Operations – Base Ten']/input")
    private WebElement box_3_Number_Base10;
    public void select_3_Number_Base10()
    {
        box_3_Number_Base10.click();
    }

    @FindBy(xpath = "//label[text()='3 - Three']/../../td/label/div/label[text()='Number & Operations – Fractions']/input")
    private WebElement box_3_Number_Fractions;
    public void select_3_Number_Fractions()
    {
        box_3_Number_Fractions.click();
    }


    @FindBy(xpath = "//label[text()='3 - Three']/../../td/label/div/label[text()='Measurement and Data']/input")
    private WebElement box_3_Measurements;
    public void select_3_Measurements()
    {
        box_3_Measurements.click();
    }

    @FindBy(xpath = "//label[text()='3 - Three']/../../td/label/div/label[text()='Geometry']/input")
    private WebElement box_3_Geometry;
    public void select_3_Geometry()
    {
        box_3_Geometry.click();
    }


    /*------------------------------------------------------------------------------------------------*/
    @FindBy(xpath = "//label[text()='4 - Four']/../../td/label/div/label[text()='Operations & Algebraic Thinking']/input")
    private WebElement box_4_Operations;
    public void select_4_Operations()
    {
        box_4_Operations.click();
    }

    @FindBy(xpath = "//label[text()='4 - Four']/../../td/label/div/label[text()='Number & Operations – Base Ten']/input")
    private WebElement box_4_Number_Base10;
    public void select_4_Number_Base10()
    {
        box_4_Number_Base10.click();
    }

    @FindBy(xpath = "//label[text()='4 - Four']/../../td/label/div/label[text()='Number & Operations – Fractions']/input")
    private WebElement box_4_Number_Fractions;
    public void select_4_Number_Fractions()
    {
        box_4_Number_Fractions.click();
    }


    @FindBy(xpath = "//label[text()='4 - Four']/../../td/label/div/label[text()='Measurement and Data']/input")
    private WebElement box_4_Measurements;
    public void select_4_Measurements()
    {
       box_4_Measurements.click();
    }

    @FindBy(xpath = "//label[text()='4 - Four']/../../td/label/div/label[text()='Geometry']/input")
    private WebElement box_4_Geometry;
    public void select_4_Geometry()
    {
        box_4_Geometry.click();
    }

    /*------------------------------------------------------------------------------------------------*/

    @FindBy(xpath = "//label[text()='5 - Five']/../../td/label/div/label[text()='Operations & Algebraic Thinking']/input")
    private WebElement box_5_Operations;
    public void select_5_Operations()
    {
        box_5_Operations.click();
    }

    @FindBy(xpath = "//label[text()='5 - Five']/../../td/label/div/label[text()='Number & Operations – Base Ten']/input")
    private WebElement box_5_Number_Base10;
    public void select_5_Number_Base10()
    {
        box_5_Number_Base10.click();
    }

    @FindBy(xpath = "//label[text()='5 - Five']/../../td/label/div/label[text()='Number & Operations – Fractions']/input")
    private WebElement box_5_Number_Fractions;
    public void select_5_Number_Fractions()
    {
        box_5_Number_Fractions.click();
    }


    @FindBy(xpath = "//label[text()='5 - Five']/../../td/label/div/label[text()='Measurement and Data']/input")
    private WebElement box_5_Measurements;
    public void select_5_Measurements()
    {
        box_5_Measurements.click();
    }

    @FindBy(xpath = "//label[text()='5 - Five']/../../td/label/div/label[text()='Geometry']/input")
    private WebElement box_5_Geometry;
    public void select_5_Geometry()
    {
        box_5_Geometry.click();
    }

    /*------------------------------------------------------------------------------------------------*/

    @FindBy(xpath = "//label[text()='6 - Six']/../../td/label/div/label[text()='Geometry']/input")
    private WebElement box_6_Geometry;
    public void select_6_Geometry()
    {
        box_6_Geometry.click();
    }

    @FindBy(xpath = "//label[text()='6 - Six']/../../td/label/div/label[text()='The Number System']/input")
    private WebElement box_6_NumberSystems;
    public void select_6_NumberSystems()
    {
        box_6_NumberSystems.click();
    }

    @FindBy(xpath = "//label[text()='6 - Six']/../../td/label/div/label[text()='Ratios & Proportional Relationships']/input")
    private WebElement box_6_Ratios_Proportional;
    public void select_6_Ratios_Proportional()
    {
        box_6_Ratios_Proportional.click();
    }

    @FindBy(xpath = "//label[text()='6 - Six']/../../td/label/div/label[text()='Expressions & Equations']/input")
    private WebElement box_6_Expressions_Equations;
    public void select_6_Expressions_Equations()
    {
        box_6_Expressions_Equations.click();
    }


    @FindBy(xpath = "//label[text()='6 - Six']/../../td/label/div/label[text()='Statistics & Probability']/input")
    private WebElement box_6_Statistics_Probability;
    public void select_6_Statistics_Probability()
    {
        box_6_Statistics_Probability.click();
    }



    /*------------------------------------------------------------------------------------------------*/

    @FindBy(xpath = "//label[text()='7 - Seven']/../../td/label/div/label[text()='Geometry']/input")
    private WebElement box_7_Geometry;
    public void select_7_Geometry()
    {
        box_7_Geometry.click();
    }

    @FindBy(xpath = "//label[text()='7 - Seven']/../../td/label/div/label[text()='The Number System']/input")
    private WebElement box_7_NumberSystems;
    public void select_7_NumberSystems()
    {
        box_7_NumberSystems.click();
    }

    @FindBy(xpath = "//label[text()='7 - Seven']/../../td/label/div/label[text()='Ratios & Proportional Relationships']/input")
    private WebElement box_7_Ratios_Proportional;
    public void select_7_Ratios_Proportional()
    {
       box_7_Ratios_Proportional.click();
    }

    @FindBy(xpath = "//label[text()='7 - Seven']/../../td/label/div/label[text()='Expressions & Equations']/input")
    private WebElement box_7_Expressions_Equations;
    public void select_7_Expressions_Equations()
    {
        box_7_Expressions_Equations.click();
    }


    @FindBy(xpath = "//label[text()='7 - Seven']/../../td/label/div/label[text()='Statistics & Probability']/input")
    private WebElement box_7_Statistics_Probability;
    public void select_7_Statistics_Probability()
    {
        box_7_Statistics_Probability.click();
    }

    /*------------------------------------------------------------------------------------------------*/

    @FindBy(xpath = "//label[text()='8 - Eight']/../../td/label/div/label[text()='Geometry']/input")
    private WebElement box_8_Geometry;
    public void select_8_Geometry()
    {
        box_8_Geometry.click();
    }

    @FindBy(xpath = "//label[text()='8 - Eight']/../../td/label/div/label[text()='The Number System']/input")
    private WebElement box_8_NumberSystems;
    public void select_8_NumberSystems() {
        box_8_NumberSystems.click();
    }

    @FindBy(xpath = "//label[text()='8 - Eight']/../../td/label/div/label[text()='Functions']/input")
    private WebElement box_8_Functions;
    public void select_8_Functions() {
        box_8_Functions.click();
    }

    @FindBy(xpath = "//label[text()='8 - Eight']/../../td/label/div/label[text()='Expressions & Equations']/input")
    private WebElement box_8_Expressions_Equations;
    public void select_8_Expressions_Equations()
    {
        box_8_Expressions_Equations.click();
    }


    @FindBy(xpath = "//label[text()='8 - Eight']/../../td/label/div/label[text()='Statistics & Probability']/input")
    private WebElement box_8_Statistics_Probability;
    public void select_8_Statistics_Probability()
    {
        box_8_Statistics_Probability.click();
    }


    @FindBy(xpath = "//tr/td/input[@value='Save']")
    private WebElement btn_Save;
    public void clickOnSave()
    {
        btn_Save.click();
    }



    @FindBy(xpath = "//label[text()='3 - Three']/../../td/a/img[@title='View Assignment Details']")
    private WebElement btn_ViewAssignment;
    public void clickOnViewAssignment()
    {
        btn_ViewAssignment.click();

    }

    @FindBy(xpath = "//label[text()='3 - Three']/../../td/a/img[@title='Print Test Roster']")
    private WebElement btn_PrintRoaster;
    public void clickOnPrintRoaster()
    {
        btn_PrintRoaster.click();
    }


}
