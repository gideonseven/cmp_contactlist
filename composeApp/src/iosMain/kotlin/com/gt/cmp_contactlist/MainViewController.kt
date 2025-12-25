package com.gt.cmp_contactlist

import androidx.compose.ui.window.ComposeUIViewController
import com.gt.cmp_contactlist.di.AppModule
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

fun MainViewController() = ComposeUIViewController {

    val isDarkTheme =
        UIScreen.mainScreen.traitCollection.userInterfaceStyle == UIUserInterfaceStyle.UIUserInterfaceStyleDark



    App(
        darkTheme = isDarkTheme,
        dynamicColor = false,
        appModule = AppModule()
    )
}