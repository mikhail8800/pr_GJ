package helpers;

import readProperties.ConfigProvider;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class StringModifier {

    public static String getUniqueString(String str) {
        return str + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    }

    public static void emailRandom() {
        Random random = new Random();
        String volume = ("alexandrivanov" + random.nextInt(10000) + "@gmail.com");
        TestValues.NEW_TEST_EMAIL = volume;
        System.out.println(volume);

    }
    public static void phoneRandom(){
        Random random = new Random();
        Integer volume = (random.nextInt(10000)+1000000000);
        TestValues.NEW_TEST_PHONE = String.valueOf(volume);
        System.out.println(volume);
    }
}
