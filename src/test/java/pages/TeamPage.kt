package pages

interface TeamPage:VerificationPage {
    fun verifyTeamName(teamName: String)
    fun goToStatTab()
    fun verifyIfTabIsPresent(tab: String)
}