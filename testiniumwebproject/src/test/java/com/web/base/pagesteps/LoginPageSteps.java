package com.web.base.pagesteps;

import com.thoughtworks.gauge.Step;
import com.web.base.pages.LoginPage;

public class LoginPageSteps extends LoginPage {

    @Step("Login sayfasında email kısmına gidilir")
    public void loginGecis()  {

        emailText();

    }
}
