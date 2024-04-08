package core.utils

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement
import core.constants.Constants
import core.constants.Constants.Companion.IS_ANDROID
import core.constants.Constants.Companion.WAIT_FIVE_SECOND
import core.constants.Constants.Companion.WAIT_TEN_SECOND
import org.openqa.selenium.By
import pages.android.HomePageAndroid
import java.lang.Exception
import java.util.logging.Logger

class InitialSetupUtils {
    private val log: Logger = Logger.getLogger(InitialSetupUtils::class.java.name)

    var btnGetStarted: SelenideElement = Selenide.`$`(By.id("action_button_text"))
    var btnContinue: SelenideElement = Selenide.`$`(By.id("action_button_text"))
    var lblRecommended: SelenideElement = Selenide.`$`(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/txt_name' and @text='Toronto FC']"))
    var btnContinuefav: SelenideElement = Selenide.`$`(By.id("action_button_text"))
    var btnMaybeLater: SelenideElement = Selenide.`$`(By.id("btn_disallow"))
    var btnDone: SelenideElement = Selenide.`$`(By.id("action_button_text"))
    var btnEmaillater: SelenideElement = Selenide.`$`(By.id("com.fivemobile.thescore:id/btn_secondary"))
    var btnAllow: SelenideElement = Selenide.`$`(By.xpath(".//android.widget.Button[@text='Allow']"))
    var btnClose: SelenideElement = Selenide.`$`(By.id("dismiss_modal"))


    fun firstTimeAppLaunchSetup(){
        if(IS_ANDROID) {
            ElementHelpers().tap(btnGetStarted)
            btnContinue.click()
            btnMaybeLater.click()
            lblRecommended.click()
            btnContinuefav.click()
            btnDone.click()
            ElementHelpers().tap(btnEmaillater)
            WAIT_TEN_SECOND
            if(btnAllow.isDisplayed) {
                btnAllow.click()
            }
            ElementHelpers().tap(btnClose)
        }

    }

}