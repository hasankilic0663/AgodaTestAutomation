package com.web.base.pagesteps;

import com.web.base.pages.BaseMasterPage;
import com.web.base.pages.ExamplePage;
import com.thoughtworks.gauge.Step;
import com.web.base.utils.driver.Driver;

public class BaseSteps  extends BaseMasterPage {

    public static String APP_URL = System.getenv("APP_URL");
    private static ExamplePage denemetestPage = ExamplePage.getInstance();

    @Step("Verilen siteye gidilir")
    public void goURL() {
        Driver.webDriver.get(APP_URL);
        Driver.webDriver.manage().window().maximize();
    }
    @Step("Konum alanına stıkla ve konumu gir <adres>")
    public void konumGir(String adres) {

        clickKonum(adres);

        // BaseSteps zaten BaseMasterPage'ten extend ettiği için direkt çağır


    }


}

