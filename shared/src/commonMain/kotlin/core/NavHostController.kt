package core

import kotlinx.coroutines.flow.StateFlow
import navigation.Screens

interface NavHostController {
    val currentStack: StateFlow<Screens>
    val backStackEntry: StateFlow<List<Screens>>
    val isPushingUp: StateFlow<Boolean>
    val canExit: StateFlow<Boolean>

    fun navigate(
        route: Screens,
        popInclusive: Boolean = false,
        navigatingForward: Boolean = true
    )

    fun popUp()
}