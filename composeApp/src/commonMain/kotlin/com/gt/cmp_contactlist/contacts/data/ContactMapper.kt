package com.gt.cmp_contactlist.contacts.data

import com.gt.cmp_contactlist.contacts.domain.Contact
import com.gt.cmp_contactlist.core.data.ImageStorage
import com.gt.cmpcontactlist.database.ContactEntity

suspend fun ContactEntity.toContact(imageStorage: ImageStorage): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = imagePath?.let {
            imageStorage.getImage(it)
        }
    )
}