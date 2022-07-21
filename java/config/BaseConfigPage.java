package config;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

abstract public class BaseConfigPage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

//    @Before
//    public boolean popUpCheck(WebElement popUpList){
//
//        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//        List elementList = driver.findElements((By) popUpList);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        if (elementList.size() > 0){
//            return elementList.get(0).
//        }
//        return false;
//    }
//    }

}

