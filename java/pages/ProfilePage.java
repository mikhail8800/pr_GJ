package pages;

import config.BaseConfigPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseConfigPage {
    /**
     * локатор кнопки "Профиль"
     */
    @FindBy(xpath = "//span[@data-qa='account-link']")
    private WebElement profileButton;

//    /**
//     * определение локатора меню пользователя
//     */
//
//    /**
//     * определение локатора кнопки выхода из аккаунта
//     */

    /**
     * Локатор поля "Имя"
     */
        @FindBy (xpath = "//input[@class='text-zone js-text-input js-length-control js-dadata-name']")
    private WebElement fieldName;

    /**
     * Локатор поля "Фамилия"
     */
    @FindBy (xpath = "//input[@name='lastName']")
    private WebElement fieldLastname;

    /**
     * Локатор поля "Email"
     */
    @FindBy (xpath = "//p[contains(text(),'@')]")
    private WebElement fieldEmail;

    /**
     * Локатор поля "Телефон"
     */
    @FindBy (xpath = "//input[@name='phone']")
    private WebElement fieldPhone;

    /**
     * Локатор поля "День рождения"
     */

    @FindBy (xpath = "//input[@name='birthday']")
    private WebElement fieldBirthday;

    /**
     * Локатор выбора мужского пола
     */
    @FindBy (xpath = "//span[@class='block-switch__item']//*[text()='Мужчина']")
    private WebElement radioMale;

    /**
     *Локатор банера
     */
    @FindBy (xpath = "//button[@class='close']")
    private WebElement bannerClose;

    public String getEmail(){
        return fieldEmail.getAttribute("textContent");
    }

    public String getName(){
        return fieldName.getAttribute("firstName");
    }
    public String getName1(){
        return fieldName.getAttribute("text");
    }
    public String getName2(){
        return fieldName.getText();
    }
    public String getLastName(){
        return fieldLastname.getText();
    }
    public String getPhone(){
        return fieldPhone.getText();
    }
    public String getBirthday(){
        return fieldBirthday.getText();
    }



    public ProfilePage (){
        PageFactory.initElements(driver,this);
    }

    public ProfilePage openProfile(){
        profileButton.click();
        return openProfile();
    }

    public ProfilePage addInformation(){
        return addInformation();
    }


}
