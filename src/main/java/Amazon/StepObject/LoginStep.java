package Amazon.StepObject;

import Amazon.PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class LoginStep extends LoginPage {


    @Step("Sign In Page")
    public LoginStep goToSignInPage() {
        signInButton.doubleClick();
        return this;
    }


    @Step("Email is - {username}")
    public LoginStep setUsername(String username) {
        email.setValue(username);
     email.shouldNotBe(Condition.empty);


        return this;
    }

    public LoginStep continueClick() {
        continueButton.doubleClick();

        return this;
    }


    @Step("Password is - {ps}")
    public LoginStep setPassword(String ps) {
        password.setValue(ps);
        password.shouldNotBe(Condition.empty);

        return this;

    }

    @Step("Sign In")
    public LoginStep signIn() {
        loginButton.click();
        return this;
    }

}
