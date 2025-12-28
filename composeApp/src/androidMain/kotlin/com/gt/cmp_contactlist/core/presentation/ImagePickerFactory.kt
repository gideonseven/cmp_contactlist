package com.gt.cmp_contactlist.core.presentation

import android.annotation.SuppressLint
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

actual class ImagePickerFactory {
    @SuppressLint("ContextCastToActivity")
    @Composable
    actual fun createPicker(): ImagePicker {
        val activity = LocalContext.current as ComponentActivity
        return remember(activity) {
            ImagePicker(activity)
        }
    }
}