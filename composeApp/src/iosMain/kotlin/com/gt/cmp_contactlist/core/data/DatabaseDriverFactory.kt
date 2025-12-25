package com.gt.cmp_contactlist.core.data

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.gt.cmp_contactlist.sqldelight.database.ContactDatabase

actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver{
        return NativeSqliteDriver(ContactDatabase.Schema, "contact.db")
    }
}