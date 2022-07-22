package Test;

import config.BaseConfigPage;
import config.BaseConfigTest;
import helpers.StringModifier;
import helpers.TestValues;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ProfilePage;
import readProperties.ConfigProvider;

import static helpers.StringModifier.getUniqueString;

public class RegistrationTest extends BaseConfigTest {

    @Test
    public void registrationCheck(){
        //String title = getUniqueString(TestValues.TEST_TITLE);
//        StringModifier stringModifier = new StringModifier();
        StringModifier.emailRandom();
        StringModifier.phoneRandom();

        ProfilePage profilePage = new HomePage()
                .openRegistrationPage()
                .registrationUser(TestValues.NEW_TEST_NAME,TestValues.NEW_TEST_EMAIL,TestValues.NEW_TEST_PASSWORD)
                .openProfilePage();
        System.out.println(profilePage.getName()+"-----get");
        System.out.println(TestValues.NEW_TEST_NAME);
        System.out.println(profilePage.getName1()+"-----get");
        System.out.println(profilePage.getName2()+"-----get");
        Assert.assertEquals(profilePage.getEmail(),TestValues.NEW_TEST_EMAIL);
//        Assert.assertEquals(profilePage.getName(),TestValues.NEW_TEST_NAME);
        System.out.println("nice");

    }
}
