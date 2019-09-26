package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
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

    public void navigateTo()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Adeptpros/Downloads/assessments-automation-master/assessments-automation-master/Base_DM/src/main/resources/chromedriver.exe");
        driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.navigate().to("http://datamanagerqand.rpcsys.hmco.com/BalancedManagement/user/signin");



    }
}
