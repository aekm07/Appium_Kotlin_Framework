package pages

interface VerificationPage {
    fun isOpen(): Boolean
    fun goBack()
    fun getTitleName(): String
}