package com.gt.cmp_contactlist.contacts.data

import com.gt.cmp_contactlist.contacts.domain.Contact
import com.gt.cmpcontactlist.database.ContactEntity

fun ContactEntity.toContact(): Contact{
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = null
    )
}