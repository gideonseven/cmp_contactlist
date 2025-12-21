package com.gt.cmp_contactlist.core.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)