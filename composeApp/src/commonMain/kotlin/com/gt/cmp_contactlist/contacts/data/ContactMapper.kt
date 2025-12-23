package com.gt.cmp_contactlist.contacts.data

import com.gt.cmp_contactlist.contacts.domain.Contact
import database.ContactEntity

fun ContactEntity.toContact(): Contact{
    return Contact(
        id = id,
        firstName = firstname,
        lastName = lastname,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = null
    )
}