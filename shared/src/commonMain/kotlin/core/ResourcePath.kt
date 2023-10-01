package core


class ResourcePath {
    object Drawable {
        const val composeMultiPlatform = "drawable/compose_multiplatform.xml"
        const val splashPattern = "drawable/splash_pattern.xml"
        const val logo = "drawable/main_logo.png"
        const val welcomeFirst = "drawable/welcome_first.xml"
        const val welcomeSecond = "drawable/welcome_second.xml"
        const val iconBack = "drawable/icon_back.xml"
        const val iconGoogle = "drawable/icon_google.xml"
        const val iconFacebook = "drawable/icon_facebook.xml"
        const val iconLock = "drawable/icon_lock.xml"
        const val iconVisibility = "drawable/icon_visibility.xml"
        const val iconVisibilityOff = "drawable/icon_visibility_off.xml"
        const val iconProfile = "drawable/icon_profile.xml"
        const val iconMail = "drawable/icon_mail.xml"
        const val loginLogo = "drawable/login_logo.png"

        val kotlin.String.contentDescription: kotlin.String
            get() = convertStringToTitleCase(this)

        private fun convertStringToTitleCase(input: kotlin.String): kotlin.String {
            val words = input.split("_", ".").map {
                it.replaceFirstChar { char ->
                    if (char.isLowerCase()) char.titlecase() else char.toString()
                }
            }
            return words.joinToString(" ")
        }
    }

    object Font {
        const val VigaRegularName = "VigaRegular"
        const val VigaRegularFont = "font/viga_regular.ttf"
    }


    object String {
        const val appName = "FoodNinja"
        const val appSlogan = "Deliver Favorite Food"
    }


}
