package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClassForDM;

import java.util.concurrent.TimeUnit;

public class WebDriverCommonUtils extends BaseClassForDM {

    public Select sel;

    public  WebDriverCommonUtils(WebDriver driver)
    {
        super(driver);
    }





    /**
     * This method is used to select a value in dropdown based on visible text.
     * @param element
     * @param visibleText
     */
    public void selectByVisbleText(WebElement element, String visibleText)
    {
        sel= new Select(element);
        sel.selectByVisibleText(visibleText);
    }


    /**
     * This method is used to wait for page to load.
     * @param driver
     * @param seconds
     */
    public void waitForPageToLoad(WebDriver driver,int seconds)
    {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

    }


    /**
     * This method is used to maximize the browser window.
     * @param driver
     */
    public void maximizeTheWindow(WebDriver driver)
    {
        driver.manage().window().maximize();
    }

}
