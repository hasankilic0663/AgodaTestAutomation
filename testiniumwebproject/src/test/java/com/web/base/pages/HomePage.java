package com.web.base.pages;

import com.web.base.pageElement.BeinButton;
import com.web.base.pageElement.BeinTextBox;
import com.web.base.pageElement.PageElementModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Keys;

public class HomePage {

    private static final Log log = LogFactory.getLog(HomePage.class);
    private static BeinButton loginButton = new BeinButton(PageElementModel.selectorNames.XPATH, "(//button[contains(@data-element-name,'sign-in-button')])[1]");
    public static  String sehirText = System.getenv("SEHIR");
    private static BeinTextBox searchSehirArama = new BeinTextBox(PageElementModel.selectorNames.XPATH,
            "//input[@id='textInput']");

    private static BeinButton firstCity =
            new BeinButton(PageElementModel.selectorNames.XPATH, "(//li[@aria-label='Destinasyon Antalya, Türkiye (Şehir)'])[1]");
    private static BeinButton july1 =
            new BeinButton(PageElementModel.selectorNames.XPATH, "//span[@data-selenium-date='2026-07-01']");
    private static BeinButton july6 =
            new BeinButton(PageElementModel.selectorNames.XPATH, "//span[@data-selenium-date='2026-07-06']");
    private static BeinButton nextMonth=
            new BeinButton(PageElementModel.selectorNames.XPATH, "//button[@aria-label='Next Month']");


    private static  BeinButton odaArttirma = new BeinButton(PageElementModel.selectorNames.XPATH, "//button[@data-selenium='plus']");
    public void loginSet() {
        log.info("loginSet Çalıştı");



        loginButton.click();
    }

    public void searchSehirAramaSet() throws InterruptedException {
        log.info("Şehir arama başladı.");
       searchSehirArama.waitUntilVisibleAndType(sehirText);

       firstCity.waitUntilVisibleAndClick();

       for (int i=0; i<7; i++) {
           nextMonth.waitUntilVisibleAndClick();
       }


        Thread.sleep(2000);
       //searchSehirArama.type(String.valueOf(Keys.TAB));
      // firstCity.click();
       july1.click();
       july6.click();
        odaArttirma.click();
        odaArttirma.click();


    }


}
