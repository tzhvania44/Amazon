package Amazon.Utills;

import Amazon.PageObject.LoginPage;
import Amazon.StepObject.LoginStep;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static Amazon.DataObject.LoginData.password;
import static Amazon.DataObject.LoginData.username;

public class AmazonLogin extends ChromeRunner {

    LoginStep step = new LoginStep();

    @BeforeTest
    @Description("Login in Amazon")
    public void login() {
        step.goToSignInPage();
        step.setUsername(username)
                .continueClick()
                .setPassword(password)
                .signIn();

    }

}
