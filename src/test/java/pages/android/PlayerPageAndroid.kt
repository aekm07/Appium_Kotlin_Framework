package pages.android

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.SelenideElement
import core.utils.ElementHelpers
import io.qameta.allure.Step
import org.assertj.core.api.Assertions
import org.openqa.selenium.By
import pages.PlayerPage
import java.util.logging.Logger

class PlayerPageAndroid : PlayerPage {
    private val log: Logger = Logger.getLogger(PlayerPageAndroid::class.java.name)
    private val lblInfoTab: SelenideElement = `$`(By.xpath("//android.widget.LinearLayout[@content-desc=\"Info\"]/android.widget.TextView"))
    private val lblPlayerName: SelenideElement = `$`(By.id("txt_player_name"))
    private val btnBack: SelenideElement = `$`(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))
    private var teamInfoTab: SelenideElement = `$`(By.xpath("//android.widget.TextView[@text=\"INFO\"]"))

    @Step("Team page is opened")
    override fun isOpen(): Boolean {
        log.info("Team page is opened")
        return lblPlayerName.shouldBe(Condition.visible).exists()
    }

    @Step("Go Back")
    override fun goBack() {
       ElementHelpers().tap(btnBack)
    }

    @Step("Get Player name")
    override fun getTitleName(): String {
        log.info("Getting Player Name text")
        return lblPlayerName.text
    }

    @Step("Verify Player name")
    override  fun verifyPlayerName(playerName: String){
        log.info("Assert Player Name")
        Assertions.assertThat(playerName==getTitleName())
    }

    @Step("Go to Info Tab")
    override fun goToInfoTab(){
        ElementHelpers().tap(lblInfoTab)
    }

    @Step("Verify if tab is enabled")
    override fun verifyIfTabIsEnable(tab: String){
        if(tab=="Info"){
            Assertions.assertThat(teamInfoTab.isEnabled)
        }
    }
}