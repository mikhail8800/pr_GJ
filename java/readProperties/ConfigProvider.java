package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.load("applications.conf");
    }

    /*** URL pages */

    String URL_BASE_PAGE = readConfig().getString("urlBasePage");

    /*** Users */

    String ADMIN_LOGIN = readConfig().getString("usersParams.admin.login");
    String ADMIN_PASSWORD = readConfig().getString("usersParams.admin.password");

    String DEMO_USERS_LOGIN = readConfig().getString("usersParams.demo.login");
    String DEMO_USERS_PASSWORD = readConfig().getString("usersParams.demo.password");
    String DEMO_USERS_NAME = readConfig().getString("usersParams.demo.name");
    String DEMO_USERS_EMAIL = readConfig().getString("usersParams.demo.login");


}
