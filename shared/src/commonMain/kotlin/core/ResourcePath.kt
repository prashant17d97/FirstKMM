package core


class ResourcePath {
    object Drawable {
        const val composeMultiPlatform = "drawables/compose_multiplatform.xml"
        const val splashPattern = "drawables/splash_pattern.xml"
        const val logo = "drawables/main_logo.png"

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
        const val vigaRegularName = "VigaRegular"
        const val vigaRegularFont = "font/viga_regular.ttf"
    }


    object String {
        const val appName = "FoodNinja"
        const val appSlogan = "Deliver Favorite Food"
    }


}

