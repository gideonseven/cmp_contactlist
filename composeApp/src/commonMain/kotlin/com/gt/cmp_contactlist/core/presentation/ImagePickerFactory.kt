package com.gt.cmp_contactlist.core.presentation

import androidx.compose.runtime.Composable

expect class ImagePickerFactory{
    @Composable
    fun createPicker(): ImagePicker
}