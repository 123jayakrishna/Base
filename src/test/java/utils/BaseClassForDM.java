package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Constants;


import utils.WebDriverCommonUtils;

import java.util.concurrent.TimeUnit;

public class BaseClassForDM {

    public static WebDriver driver;
    public  WebDriverCommonUtils webDriverCommon;

    public BaseClassForDM(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

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
}
