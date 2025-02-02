package utils;

import config.WebDriverCommonUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import config.Constants;


import java.io.File;

public class BaseClassForDM {

    public static WebDriver driver;
    public static WebDriver studentDriver;
    public WebDriverCommonUtils webDriverCommon;

    public BaseClassForDM(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    /**
     * This method is used to initialize  driver based on user requirement.
     * @param Key
     * @throws Exception
     */
    public void navigateTo(String Key) throws Exception
    {
        if(Key.equals("chrome") )
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if (Key.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        }

        webDriverCommon= new WebDriverCommonUtils(driver);
        webDriverCommon.maximizeTheWindow(driver);
        webDriverCommon.waitForPageToLoad(driver,20);
        driver.get(Constants.PROCTOR_URL);
    }


    public void navigateToStudent(String Key) throws Exception
    {
        if(Key.equals("chrome") )
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if (Key.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        }

        webDriverCommon= new WebDriverCommonUtils(driver);
        webDriverCommon.maximizeTheWindow(driver);
        webDriverCommon.waitForPageToLoad(driver,20);
        driver.get(Constants.STUDENT_URL);
    }





    /**
     * This method is to pass values into text box.
     * @param element
     * @param value
     */

    public void passValueToElement(WebElement element ,String value)
    {
        element.sendKeys(value);
    }


    /**
     * This method is used to take screenShot.
     * @throws Exception
     */
    public void takeAScreenShot(String methodName) throws Exception
    {
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dst= new File("./ScreenShots/"+methodName+".png");
        FileUtils.copyFile(src,dst);
    }


    public String getChromeHandle(WebDriver driver)
    {
        String parent= driver.getWindowHandle();
        return parent;
    }

    public String getFirefoxHandle(WebDriver driver)
    {
        String child= driver.getWindowHandle();
        return child;
    }


}
