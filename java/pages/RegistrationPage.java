package pages;

import config.BaseConfigPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseConfigPage {


    @FindBy(xpath = "//input[@data-qa='regFirstName']")
    private WebElement regNameField;

    @FindBy(xpath = "//input[@data-qa='regEmail']")
    private WebElement regEmailFiled;

    @FindBy(xpath = "//input[@data-qa='regPassword']")
    private WebElement regPasswordFiled;

    @FindBy(xpath = "//button[@data-qa='regSubmitBtn']")
    private WebElement regBtn;

    @FindBy(xpath ="//div[@class='suggestions-suggestion'][1]")
    private WebElement dropName;

    /**
     * локатор кнопки "Войти"
     */
    @FindBy(xpath = "//div[@class='modal-pop-up__close-button icon icon-tablet-size-16 icon--close js-close-button'][1]")
    private WebElement bannerOff;

    /**
     * локатор кнопки "Профиль"
     */
    @FindBy(xpath = "//span[@data-qa='account-link']")
    private WebElement profileButton;

    /**
     * доп кнопка
     */

    @FindBy(xpath = "//p[@class='captionII-v2 margin-bottom-8']")
    private WebElement exElement;


    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }

    public RegistrationPage registrationUser(String name,String email,String password){
        regNameField.sendKeys(name);
        regEmailFiled.sendKeys(email);
        regPasswordFiled.sendKeys(password);
//        dropName.click();
        regBtn.click();
        bannerOff.click();
        return this;
    }
    public ProfilePage openProfilePage (){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        profileButton.click();
        return new ProfilePage();
    }

}
