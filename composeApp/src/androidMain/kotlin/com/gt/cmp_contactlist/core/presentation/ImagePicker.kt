package com.gt.cmp_contactlist.core.presentation
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.activity.compose.rememberLauncherForActivityResult

actual class ImagePicker(
    private val activity: ComponentActivity
) {
    private lateinit var getContent: ActivityResultLauncher<String>

    @Composable
    actual fun registerPicker(onImagePicked: (ByteArray) -> Unit) {
        val latestCallback by rememberUpdatedState(onImagePicked)

        val launcher = rememberLauncherForActivityResult(
            contract = ActivityResultContracts.GetContent()
        ) { uri ->
            uri?.let {
                activity.contentResolver.openInputStream(uri)?.use { inputStream ->
                    latestCallback(inputStream.readBytes())
                }
            }
        }

        getContent = launcher
    }

    actual fun pickImage() {
        getContent.launch("image/*")
    }
}