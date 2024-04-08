package pages.ios

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.SelenideElement
import io.qameta.allure.Step
import org.assertj.core.api.Assertions
import org.openqa.selenium.By
import pages.TeamPage
import java.util.logging.Logger

class TeamPageIOS : TeamPage {
    private val log: Logger = Logger.getLogger(TeamPageIOS::class.java.name)

    override fun isOpen(): Boolean {
        TODO("Not yet implemented")
    }

    override fun goBack() {
        TODO("Not yet implemented")
    }

    override fun getTitleName(): String {
        return "test"
    }

    override  fun verifyTeamName(teamName: String){
        TODO("Not yet implemented")
    }

    override fun goToStatTab() {
        TODO("Not yet implemented")
    }

    override fun verifyIfTabIsPresent(tab: String) {
        TODO("Not yet implemented")
    }
}