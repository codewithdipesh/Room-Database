package com.example.flows

import androidx.room.Database
import androidx.room.RoomDatabase

//this is the main database
@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDatabase : RoomDatabase() {

    abstract val dao : ContactDao
}