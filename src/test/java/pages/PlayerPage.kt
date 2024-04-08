package pages

interface PlayerPage:VerificationPage {
    fun verifyPlayerName(playerName: String)
    fun goToInfoTab()
    fun verifyIfTabIsEnable(tab: String)
}