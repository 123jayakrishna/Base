package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Constants;


import utils.WebDriverCommonUtils;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseClassForDM {

    public static WebDriver driver;
    public  WebDriverCommonUtils webDriverCommon;

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
        File dst= new File("./Screen/"+methodName+".png");
        FileUtils.copyFile(src,dst);
    }
}
