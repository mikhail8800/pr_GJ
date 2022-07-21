package readProperties;

import org.junit.Test;

public class PropertiesTest {

    @Test
    public void readPropertiesConf(){
        System.out.println(ConfigProvider.DEMO_USERS_NAME);
        String a2 = ConfigProvider.ADMIN_LOGIN;
        System.out.println(a2);
    }

}
