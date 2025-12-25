package com.gt.cmp_contactlist.contacts.domain

object ContactValidator {
    fun validateContract(contact: Contact): ValidationResult {

        var result = ValidationResult()

        if(contact.firstName.isBlank()){
            result = result.copy(firsNameError = "The First Name can't be empty.")
        }

        if(contact.lastName.isBlank()){
            result = result.copy(firsNameError = "The Last Name can't be empty.")
        }

        val emailRegex = Regex("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}\$")

        if(!emailRegex.matches(contact.email)){
            result = result.copy(emailError = "This is not a valid email.")
        }

        if(contact.phoneNumber.isBlank()){
            result = result.copy(phoneNumberError = "The Phone Number can't be empty.")
        }
        return result
    }

    data class ValidationResult(
        val firsNameError: String? = null,
        val lastNameError: String? = null,
        val emailError: String? = null,
        val phoneNumberError: String? = null,
    )
}
