package utils;

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
        /*System.setProperty("webdriver.chrome.driver", "C:/Users/Adeptpros/Downloads/assessments-automation-master/assessments-automation-master/Base_DM/src/main/resources/chromedriver.exe");
        driver= new ChromeDriver();*/
        if(Key.equals("chrome") ) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }


        else if (Key.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
            driver= new FirefoxDriver();

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(Constants.PROCTOR_URL);



    }
}
