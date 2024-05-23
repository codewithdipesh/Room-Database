package com.example.flows

data class ContactState(
    val contacts : List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact : Boolean = false,
    val sortType: SortType = SortType.FIRSTNAME
)