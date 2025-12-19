package com.gt.cmp_contactlist

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform