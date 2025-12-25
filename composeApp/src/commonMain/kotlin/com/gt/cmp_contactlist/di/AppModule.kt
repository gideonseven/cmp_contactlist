package com.gt.cmp_contactlist.di

import com.gt.cmp_contactlist.contacts.domain.ContactDataSource

expect class AppModule  {
    val contactDataSource: ContactDataSource

}