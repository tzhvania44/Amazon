package Amazon.Utills;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {

    @BeforeTest
    public static void setUp() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "Files/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.amazon.ca/");



    }

   @AfterTest
    public static void afterT() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.close();

    }
}
