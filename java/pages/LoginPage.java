package pages;

import config.BaseConfigPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseConfigPage {

    /**
     * определение локатора поля ввода логина
     */
    @FindBy(xpath = "//input[@data-qa='loginEmail']")
    private WebElement loginField;
    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "//button[@data-qa='loginSubmit']")
    private WebElement loginBtn;
    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(xpath = "//input[@data-qa='loginPassword']")
    private WebElement passwdField;

}
