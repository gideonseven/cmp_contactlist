package com.gt.cmp_contactlist.core.presentation
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable

actual class ImagePicker(
    private val activity: ComponentActivity
) {
    private lateinit var getContent: ActivityResultLauncher<String>

    @Composable
    actual fun registerPicker(onImagePicked: (ByteArray) -> Unit) {
        getContent = activity.registerForActivityResult(
            contract = ActivityResultContracts.GetContent()
        ) { uri ->
            uri?.let {
                activity.contentResolver.openInputStream(uri)?.use { inputStream ->
                    onImagePicked(inputStream.readBytes())
                }
            }
        }
    }

    actual fun pickImage() {
        getContent.launch("image/*")
    }
}