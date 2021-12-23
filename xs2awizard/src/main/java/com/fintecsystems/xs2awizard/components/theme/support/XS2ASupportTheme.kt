package com.fintecsystems.xs2awizard.components.theme.support

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.fintecsystems.xs2awizard.components.theme.IXS2ATheme
import com.fintecsystems.xs2awizard.components.theme.LogoVariation
import com.fintecsystems.xs2awizard.components.theme.PaddingMarginConfiguration
import com.fintecsystems.xs2awizard.components.theme.XS2AColors
import com.fintecsystems.xs2awizard.components.theme.styles.ButtonStyle
import com.fintecsystems.xs2awizard.components.theme.styles.ParagraphStyle

/**
 * Support class for [IXS2ATheme] to be used in non-compose projects.
 * The default constructor is the Light-Theme.
 */
class XS2ASupportTheme(
    tintColor: SupportColor = SupportColor(XS2AColors.primary),
    onTintColor: SupportColor = SupportColor(XS2AColors.textColorLight),
    fontFamily: SupportFontFamily = SupportFontFamily.Default,
    backgroundColor: SupportColor = SupportColor(XS2AColors.backgroundNone),
    surfaceColor: SupportColor = SupportColor(Color.White),
    textColor: SupportColor = SupportColor(XS2AColors.textColor),
    placeholderColor: SupportColor = SupportColor(XS2AColors.darkGrey),
    override val logoVariation: LogoVariation = LogoVariation.STANDARD,
    loadingIndicatorBackgroundColor: SupportColor = SupportColor(XS2AColors.backgroundTranslucent),
    inputTextColor: SupportColor = SupportColor(XS2AColors.textColor),
    inputBackgroundColor: SupportColor = SupportColor(XS2AColors.backgroundInput),
    inputShape: SupportShape = SupportShape(4.dp, SupportShape.ShapeType.ROUNDED),
    override val submitButtonStyle: ButtonStyle =
        ButtonStyle(XS2AColors.primary, XS2AColors.textColorLight),
    override val abortButtonStyle: ButtonStyle =
        ButtonStyle(XS2AColors.darkGrey, XS2AColors.textColorLight),
    override val backButtonStyle: ButtonStyle =
        ButtonStyle(XS2AColors.darkGrey, XS2AColors.textColorLight),
    override val restartButtonStyle: ButtonStyle =
        ButtonStyle(XS2AColors.darkGrey, XS2AColors.textColorLight),
    override val redirectButtonStyle: ButtonStyle =
        ButtonStyle(XS2AColors.primary, XS2AColors.textColorLight),
    buttonShape: SupportShape = SupportShape(4.dp, SupportShape.ShapeType.ROUNDED),
    override val errorParagraphStyle: ParagraphStyle =
        ParagraphStyle(XS2AColors.backgroundError, XS2AColors.textColorLight),
    override val infoParagraphStyle: ParagraphStyle =
        ParagraphStyle(XS2AColors.backgroundInfo, XS2AColors.textColorLight),
    override val warningParagraphStyle: ParagraphStyle =
        ParagraphStyle(XS2AColors.backgroundWarning, XS2AColors.textColor),
    paragraphShape: SupportShape = SupportShape(4.dp, SupportShape.ShapeType.ROUNDED),
    override val paragraphMargin: PaddingMarginConfiguration =
        PaddingMarginConfiguration(0.dp),
    override val paragraphPadding: PaddingMarginConfiguration =
        PaddingMarginConfiguration(4.dp, 8.dp),
    webViewIconColor: SupportColor = SupportColor(XS2AColors.textColor),
    webViewBackgroundColor: SupportColor = SupportColor(Color.White),
    webViewBorderColor: SupportColor = SupportColor(XS2AColors.darkGrey),
    webViewTextColor: SupportColor = SupportColor(XS2AColors.textColor),
) : IXS2ATheme {
    override val tintColor: Color = tintColor.colorValue
    override val onTintColor: Color = onTintColor.colorValue
    override val fontFamily: FontFamily = fontFamily.fontFamilyValue
    override val backgroundColor: Color = backgroundColor.colorValue
    override val surfaceColor: Color = surfaceColor.colorValue
    override val textColor: Color = textColor.colorValue
    override val placeholderColor: Color = placeholderColor.colorValue
    override val loadingIndicatorBackgroundColor: Color = loadingIndicatorBackgroundColor.colorValue

    override val inputTextColor: Color = inputTextColor.colorValue
    override val inputBackgroundColor: Color = inputBackgroundColor.colorValue
    override val inputShape: Shape = inputShape.shapeValue

    override val buttonShape: Shape = buttonShape.shapeValue

    override val paragraphShape: Shape = paragraphShape.shapeValue

    override val webViewIconColor: Color = webViewIconColor.colorValue
    override val webViewBackgroundColor: Color = webViewBackgroundColor.colorValue
    override val webViewBorderColor: Color = webViewBorderColor.colorValue
    override val webViewTextColor: Color = webViewTextColor.colorValue

    companion object {
        /**
         * Light version of the SupportTheme
         */
        val Light = XS2ASupportTheme()

        /**
         * Dark version of the SupportTheme
         */
        val Dark = XS2ASupportTheme(
            surfaceColor = SupportColor(Color.Black),
            textColor = SupportColor(XS2AColors.textColorLight),
            logoVariation = LogoVariation.WHITE,
            loadingIndicatorBackgroundColor = SupportColor(XS2AColors.backgroundTranslucentDark),
            inputTextColor = SupportColor(XS2AColors.textColorLight),
            webViewIconColor = SupportColor(XS2AColors.textColorLight),
            webViewBackgroundColor = SupportColor(Color.Black),
            webViewTextColor = SupportColor(XS2AColors.textColorLight)
        )
    }
}