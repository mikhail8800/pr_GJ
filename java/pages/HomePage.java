package pages;

import config.BaseConfigPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseConfigPage {
    /**
     * локатор кнопки "Войти"
     */
    @FindBy(xpath = "//span[@data-qa='account-link']")
    private WebElement logButton;

    /**
     * локатор кнопки "Избранное"
     */
    @FindBy (xpath = "//span[@class='caption-14 margin-left-8 show-after-tabletLarge']")
    private WebElement favoriteButton;

    /**
     * локатор кнопки "Корзина"
     */
    @FindBy (xpath ="//div[@class='js-minicart-price header-basket__price']")
    private WebElement cartButton;


    /**
     * локатор поля поиска
     */
    @FindBy (xpath = "//input[@id='js-site-search-input']")
    private WebElement searchField;

    /**
     * Вкладка "Регистрация"
     */
    @FindBy(xpath = "//div[@data-block-name='registration']")
    private WebElement regTab;

    /**
     * Вкладка "Вход"
     */
    @FindBy(xpath = "//div[@data-block-name='ingress']")
    private WebElement regLog;

    /**
     * Теневой банер главной страницы
     */

    @FindBy(xpath = "//div[@class='box-shadow modal-found-choice your-region js-pop-up-you-region']")
    private WebElement popUpRegion;

    @FindBy (xpath = "//div[@data-qa='closeAutodetectRegion']")
    private  WebElement popUpRegionClose;



    public HomePage(){ try {
            driver.get(ConfigProvider.URL_BASE_PAGE);
        }catch (Exception e){
        System.out.println("Ошибка: некорректный URL");
    }
        PageFactory.initElements(driver,this);
    }

    public boolean ss (WebElement webElement){
        return webElement.isDisplayed();

    }


    public RegistrationPage openRegistrationPage(){
        if(ss(popUpRegion)){
            popUpRegionClose.click();
            logButton.click();
            regTab.click();
            return new RegistrationPage();
        }else {
            logButton.click();
            regTab.click();
            return new RegistrationPage();
        }
    }
    public LoginPage openLoginPage(){
        logButton.click();
        regLog.click();
        return new LoginPage();
    }

    public boolean isElementPresent(String popUp){
        try{
            driver.manage().timeouts()
                    .implicitlyWait(0, TimeUnit.SECONDS);
            return driver.findElement(By.xpath(popUp)).isDisplayed();

        }catch (NoSuchElementException e){
            return false;
        }finally {
            driver.manage().timeouts()
                    .implicitlyWait(30, TimeUnit.SECONDS);
        }
    }


}
