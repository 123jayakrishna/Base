package utils;

import Pages.BaseClassForDM;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class FIleLib extends BaseClassForDM {

    public FIleLib(WebDriver driver)
    {
        super(driver);
    }

    public String getValue(String Key) throws Exception
    {
        FileInputStream fis= new FileInputStream("src/test/resources/TestData.properties");
        Properties pObj= new Properties();
        pObj.load(fis);

        String data= pObj.getProperty(Key);
        return data;
    }
}
