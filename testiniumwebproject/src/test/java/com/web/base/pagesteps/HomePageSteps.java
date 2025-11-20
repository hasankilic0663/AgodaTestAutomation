package com.web.base.pagesteps;

import com.thoughtworks.gauge.Step;
import com.web.base.pages.HomePage;
import com.web.base.utils.driver.Driver;

public class HomePageSteps  extends HomePage {
    @Step("Login sayfasına gideriz")
    public void loginGecis() {
        loginSet();

    }
    @Step("Sehir arama yapılır")
    public void sehirAramaYap() throws InterruptedException {
        searchSehirAramaSet();
    }

}
