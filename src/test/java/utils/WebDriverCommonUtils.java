package utils;

import Pages.BaseClassForDM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class WebDriverCommonUtils extends BaseClassForDM {
    public Select sel;

    public  WebDriverCommonUtils(WebDriver driver)
    {
        super(driver);
    }

    public void selectByVisbleText(WebElement element, String visibleText)
    {
        sel= new Select(element);
        sel.selectByVisibleText(visibleText);
    }

    public void waitForPageToLoad(WebDriver driver,int seconds)
    {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

    }

    public void maximizeTheWindow(WebDriver driver)
    {
        driver.manage().window().maximize();
    }

}
