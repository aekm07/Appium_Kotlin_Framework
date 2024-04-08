package pages.ios

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.SelenideElement
import core.utils.ElementHelpers
import io.qameta.allure.Step
import org.openqa.selenium.By
import pages.HomePage
import java.util.logging.Logger

class HomePageIOS : HomePage {
    private val log: Logger = Logger.getLogger(HomePageIOS::class.java.name)
    override fun isOpen(): Boolean {
        TODO("Not yet implemented")
    }
    override fun clickSearchBar() {
        TODO("Not yet implemented")
    }
}