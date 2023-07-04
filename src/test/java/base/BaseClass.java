package base;

import browserFactory.BrowserFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

import java.io.IOException;

public class BaseClass {


    public static WebDriver driver;

    @BeforeClass
    public static void setupBrowser() throws IOException {
        //Approach 1: Using config file to manage the browsername and app URL... This doesn't work for cross browser testing/ parallel execution
        driver= BrowserFactory.startBrowser(ConfigReader.getProperty("browser"),ConfigReader.getProperty("url"));
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}


