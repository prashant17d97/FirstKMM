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
        const val iconMessage = "drawable/icon_message.xml"
        const val iconResetOptionMail = "drawable/icon_reset_option_email.xml"
        const val iconSuccess = "drawable/icon_success.xml"


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
        const val forgetYourPassword = "Forgot Your Password?"
        const val facebook = "Facebook"
        const val google = "Google"
        const val continueWith = "Or continue with"
        const val password = "Password"
        const val confirmPassword = "Confirm Password"
        const val appName = "FoodNinja"
        const val appSlogan = "Deliver Favorite Food"
        const val welcomeHeadingFirst = "Find your Comfort Food here"
        const val welcomeLabelFirst =
            "Here You Can find a chef or dish for every taste and color. Enjoy!"
        const val welcomeHeadingSecond = "Food Ninja is Where Your Comfort Food Lives"
        const val welcomeLabelSecond = "Food Ninja is Where Your Comfort Food Lives"
        const val next = "Next"
        const val login = "Login"
        const val createAccount = "Create an Account"
        const val createAccountButton = "Create an account!"
        const val alreadyHaveAnAccount = "Already have an account!"
        const val loginToAccount = "Login To Your Account"
        const val signUpFree = "Sign Up For Free"
        const val name = "Name"
        const val emailSpecialPricing = "Email Me About Special Pricing"
        const val email = "Email"
        const val keepMeSignIn = "Email"

        //Forgot password Screen
        const val forgotPassword = "Forgot Password?"
        const val passwordResetOption =
            "Select which contact details should we\nuse to reset your password"

        //OTP verification
        const val enterFourCode = "Enter 4-digit\nVerification code"
        const val resendCodeIn = "Code send to +919282045**** . This code will\nexpired in 01:30"
        const val otp = "0000"

        //ResetPassword Screen
        const val resetPassword = "Reset your password\nhere"
        const val resetPasswordInstruction =
            "Select which contact details should we\nuse to reset your password"


        //Congrats Screen
        const val congrats = "Congrats"
        const val resetSuccessful = "Password reset successfully"
    }


}
