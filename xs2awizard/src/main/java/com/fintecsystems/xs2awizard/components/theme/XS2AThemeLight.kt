package com.fintecsystems.xs2awizard.components.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.fintecsystems.xs2awizard.components.theme.styles.ButtonStyle
import com.fintecsystems.xs2awizard.components.theme.styles.ParagraphStyle

object XS2AThemeLight : IXS2ATheme {
    override val tintColor: Color = XS2AColors.primary
    override val fontFamily: FontFamily = FontFamily.Default
    override val backgroundColor: Color = XS2AColors.backgroundNone
    override val textColor: Color = XS2AColors.textColor
    override val placeholderColor: Color = XS2AColors.darkGrey
    override val logoVariation: LogoVariation = LogoVariation.STANDARD

    override val inputTextColor: Color = XS2AColors.textColor
    override val inputBackgroundColor: Color = XS2AColors.backgroundInput
    override val inputShape: Shape = RoundedCornerShape(4.dp)

    override val submitButtonStyle: ButtonStyle =
        ButtonStyle(XS2AColors.primary, XS2AColors.textColorLight)
    override val abortButtonStyle: ButtonStyle =
        ButtonStyle(XS2AColors.darkGrey, XS2AColors.textColorLight)
    override val backButtonStyle: ButtonStyle =
        ButtonStyle(XS2AColors.darkGrey, XS2AColors.textColorLight)
    override val restartButtonStyle: ButtonStyle =
        ButtonStyle(XS2AColors.darkGrey, XS2AColors.textColorLight)
    override val redirectButtonStyle: ButtonStyle =
        ButtonStyle(XS2AColors.darkGrey, XS2AColors.textColorLight)
    override val buttonShape: Shape = RoundedCornerShape(4.dp)

    override val errorParagraphStyle =
        ParagraphStyle(XS2AColors.backgroundError, XS2AColors.textColorLight)
    override val infoParagraphStyle =
        ParagraphStyle(XS2AColors.backgroundInfo, XS2AColors.textColorLight)
    override val warningParagraphStyle =
        ParagraphStyle(XS2AColors.backgroundWarning, XS2AColors.textColor)
    override val paragraphShape: Shape = RoundedCornerShape(4.dp)

    override val webViewIconColor: Color = XS2AColors.textColor
    override val webViewBackgroundColor: Color = Color.White
    override val webViewBorderColor: Color = XS2AColors.darkGrey
    override val webViewTextColor: Color = XS2AColors.textColor
}