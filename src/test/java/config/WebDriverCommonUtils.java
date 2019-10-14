package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClassForDM;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class WebDriverCommonUtils extends BaseClassForDM {
   public static Select sel;


    public  WebDriverCommonUtils(WebDriver driver)
    {
        super(driver);
    }





    /**
     * This method is used to select a value in dropdown based on visible text.
     * @param element
     * @param eventKey
     */
    public void select(WebElement element,String eventKey)
    {
        sel= new Select(element);
        sel.selectByVisibleText(eventKey);
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

    public void openNewTab() throws Exception {
        Robot robo= new Robot();
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_T);
        robo.keyRelease(KeyEvent.VK_T);
        robo.keyRelease(KeyEvent.VK_CONTROL);

    }

}
