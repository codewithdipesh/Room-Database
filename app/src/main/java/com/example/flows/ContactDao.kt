package com.example.flows

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow


@Dao //data access Object
interface ContactDao {

     @Insert //mix of insert and update
     suspend fun insertContact(contact: Contact) //run in a corutine untill database call is finished

     @Delete
     suspend fun deleteContact(contact: Contact)

     @Query("SELECT * FROM contact ORDER BY firstName ASC")
     fun getContactOrderedByFirstName(): Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY lastName ASC")
    fun getContactOrderedByLastName(): Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY phoneNumber ASC")
    fun getContactOrderedByPhoneNumber(): Flow<List<Contact>>



}