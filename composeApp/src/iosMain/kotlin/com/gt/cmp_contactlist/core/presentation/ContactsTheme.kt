package com.gt.cmp_contactlist.core.presentation


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.gt.cmp_contactlist.ui.theme.Typography
import com.gt.cmp_contactlist.ui.theme.darkScheme
import com.gt.cmp_contactlist.ui.theme.lightScheme


@Composable
actual fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = if (darkTheme) darkScheme else lightScheme,
        typography = Typography,
        content = content
    )
}