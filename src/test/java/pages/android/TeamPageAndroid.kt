package pages.android

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.SelenideElement
import core.utils.ElementHelpers
import io.qameta.allure.Step
import org.assertj.core.api.Assertions
import org.openqa.selenium.By
import pages.TeamPage
import java.util.logging.Logger

class TeamPageAndroid : TeamPage {
    private val log: Logger = Logger.getLogger(TeamPageAndroid::class.java.name)
    private val lblStatTab: SelenideElement = `$`(By.xpath("//android.widget.TextView[@text=\"TEAM STATS\"]"))
    private val lblTeamName: SelenideElement = `$`(By.id("team_name"))
    private val btnBack: SelenideElement = `$`(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))
    private var teamStatTab = `$`(By.id("header_text"))

    @Step("Team page is opened")
    override fun isOpen(): Boolean {
        log.info("Team page is opened")
        return lblTeamName.shouldBe(Condition.visible).exists()
    }

    @Step("Go Back")
    override fun goBack() {
       ElementHelpers().tap(btnBack)
    }

    @Step("Get Title name")
    override fun getTitleName(): String {
        log.info("Getting Team Name text")
        return lblTeamName.text
    }

    @Step("Verify Team name")
    override  fun verifyTeamName(teamName: String){
        log.info("Assert Team Name")
        Assertions.assertThat(teamName==getTitleName())
    }

    @Step("Go To Stat tab")
    override fun goToStatTab(){
        ElementHelpers().tap(lblStatTab)
    }

    @Step("Verify If tab is present")
    override fun verifyIfTabIsPresent(tab: String){
        if(tab=="Stat"){
            Assertions.assertThat(teamStatTab.exists())
        }
    }

}