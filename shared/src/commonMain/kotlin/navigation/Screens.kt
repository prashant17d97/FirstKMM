package navigation


const val splash = "Splash"
const val welcome = "Welcome"
const val home = "Welcome"
const val onboarding = "Onboarding"
const val loginScreen = "LoginScreen"

sealed class Screens(
    var title: String,
    var icon: Int = 0,
    var route: String = title,
    var isNavigatingBack: Boolean = false
) {
    data object Splash : Screens(title = splash)
    data object Welcome : Screens(title = welcome)
    data object Home : Screens(title = home)
    data object Onboarding : Screens(title = onboarding)
    data object LoginScreen : Screens(title = loginScreen)
}
