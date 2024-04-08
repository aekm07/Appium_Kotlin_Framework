package core.pageConfiguration

import com.google.inject.AbstractModule
import pages.*
import pages.android.*


class AndroidInit : AbstractModule() {
    override fun configure() {

        bind(SearchPage::class.java).to(SearchPageAndroid::class.java)
        bind(HomePage::class.java).to(HomePageAndroid::class.java)
        bind(TeamPage::class.java).to(TeamPageAndroid::class.java)
        bind(PlayerPage::class.java).to(PlayerPageAndroid::class.java)
        bind(LeaguePage::class.java).to(LeaguePageAndroid::class.java)

    }
}