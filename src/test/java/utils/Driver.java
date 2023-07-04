package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {


    protected static WebDriver driver = getDriver();

    public Driver() {
    }

    protected static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(opt);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30L));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20L));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
        driver.get("https://ineuron-courses.vercel.app/login");
        Runtime.getRuntime().addShutdownHook(new Thread("Driver shutdown thread") {
            public void run() {
                Driver.driver.quit();
            }
        });
        return driver;
    }
}
