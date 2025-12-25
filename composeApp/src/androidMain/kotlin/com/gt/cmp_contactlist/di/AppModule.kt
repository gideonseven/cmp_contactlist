package com.gt.cmp_contactlist.di

import android.content.Context
import com.gt.cmp_contactlist.contacts.data.SqlDelightContactDataSource
import com.gt.cmp_contactlist.contacts.domain.ContactDataSource
import com.gt.cmp_contactlist.core.data.DatabaseDriverFactory
import com.gt.cmp_contactlist.sqldelight.database.ContactDatabase

actual class AppModule(private val context: Context) {

    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory(context).create()
            )
        )
    }
}