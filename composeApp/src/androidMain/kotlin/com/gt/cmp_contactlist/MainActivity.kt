package com.gt.cmp_contactlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.gt.cmp_contactlist.core.presentation.ImagePickerFactory
import com.gt.cmp_contactlist.di.AppModule

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = false,
                appModule = AppModule(LocalContext.current.applicationContext),
                imagePicker = ImagePickerFactory().createPicker()
            )
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App(
        darkTheme = true,
        dynamicColor = true,
        appModule = AppModule(LocalContext.current.applicationContext),
        imagePicker = ImagePickerFactory().createPicker()
    )
}