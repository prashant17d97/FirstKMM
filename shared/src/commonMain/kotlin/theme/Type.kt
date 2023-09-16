package theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import core.ResourcePath.Font.vigaRegularFont
import core.ResourcePath.Font.vigaRegularName
import core.font



@Composable
fun fontFamily(): FontFamily {
    return FontFamily(
        font(
            name = vigaRegularName,
            res = vigaRegularFont,
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        ),
        font(
            name = vigaRegularName,
            res = vigaRegularFont,
            weight = FontWeight.Bold,
            style = FontStyle.Normal
        ),
        font(
            name = vigaRegularName,
            res = vigaRegularFont,
            weight = FontWeight.SemiBold,
            style = FontStyle.Normal
        ),
        font(
            name = vigaRegularName,
            res = vigaRegularFont,
            weight = FontWeight.ExtraBold,
            style = FontStyle.Normal
        ),
        font(
            name = vigaRegularName,
            res = vigaRegularFont,
            weight = FontWeight.Medium,
            style = FontStyle.Normal
        ),
        font(
            name = vigaRegularName,
            res = vigaRegularFont,
            weight = FontWeight.Light,
            style = FontStyle.Normal
        ),
        font(
            name = vigaRegularName,
            res = vigaRegularFont,
            weight = FontWeight.ExtraLight,
            style = FontStyle.Normal
        )
    )
}

@Composable
fun vigaRegular() = Typography(
    displayLarge = TextStyle(
        fontFamily = fontFamily(),
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)