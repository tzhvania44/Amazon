package Amazon.PageObject;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement

            signInButton = $("#nav-link-accountList"),
            email = $("#ap_email"),
            continueButton = $("#continue"),
            password = $("#ap_password"),
            loginButton = $("#signInSubmit");



}
