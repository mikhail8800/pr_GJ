package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

abstract public class BaseConfigTest {
    protected WebDriver driver;

    @Before
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        //options.addArguments("--disable-popup-blocking");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize(); ///уточнить значение
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        BaseConfigPage.setDriver(driver);

    }

//    public static void CloseBanner(WebDriver driver){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        System.setProperty(driver);
//        driver = new ChromeDriver(options);

//    @After
//    public void takeOff(){
//        driver.close();
//        //driver.quit();
//    }
}
