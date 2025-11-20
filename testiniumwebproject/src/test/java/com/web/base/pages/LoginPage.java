package com.web.base.pages;

import com.web.base.pageElement.BeinButton;
import com.web.base.pageElement.BeinTextBox;
import com.web.base.pageElement.PageElementModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoginPage {
    private static final Log log = LogFactory.getLog(LoginPage.class);
    private static BeinButton girisButton = new BeinButton(PageElementModel.selectorNames.XPATH, "//span[@class='sc-iMTnTL sc-krNlru jJIpnB dPLHUX']");
    private static BeinTextBox inputEmailText = new BeinTextBox(PageElementModel.selectorNames.CLASS_NAME,
                    "input.sc-fvtFIE.sc-bBeLuv.hErCDO.sc-iEXKAA.cWKaZf");
    public static  String USER_EMAIL = System.getenv("USER_EMAIL");
    public static  String USER_PASSWORD = System.getenv("USER_PASSWORD");

    public void emailText() {
        log.info("loginSet Çalıştı");


        inputEmailText.type(USER_EMAIL);
        girisButton.click();


    }
}
