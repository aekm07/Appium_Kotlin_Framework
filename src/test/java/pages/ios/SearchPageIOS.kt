package pages.ios

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement
import core.utils.ElementHelpers
import org.openqa.selenium.By
import pages.SearchPage
import java.util.logging.Logger

class SearchPageIOS : SearchPage {
    private val log: Logger = Logger.getLogger(SearchPageIOS::class.java.name)

    override fun isOpen(): Boolean {
        TODO("Not yet implemented")
    }

    override fun typeSearchContent(searchText: String) {
        TODO("Not yet implemented")
    }

    override fun clickSearchContent(searchText: String) {
        TODO("Not yet implemented")
    }

    override fun searchAndGoTo(searchText: String) {
        TODO("Not yet implemented")
    }

    override fun goBack() {
        TODO("Not yet implemented")
    }
}